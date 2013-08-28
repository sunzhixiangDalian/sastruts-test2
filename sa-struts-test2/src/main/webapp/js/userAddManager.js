
//theForm获取表单中的元素进行验证
function validate(theForm) {
       var  age = theForm.find('select[name=age] option:selected'),
            sex = theForm.find('select[name=sex] option:selected'),
            addr = theForm.find('input[name=addr]'),
            name = theForm.find('input[name=name]');
    if (name.val() == '') {
        return "Please input username！";
    }
    if (!metadata.name.test(name.val())) {
        return "username format error！";
    }
    if (sex.val() == null || !metadata.number.test(sex.val())) {
        return "please select gender！";
    }
    
    if (age.val() == null || !metadata.number.test(age.val())) {
        return "please select age！";
    }

    if (addr.val() == '') {
        return "please input address!";
    }
    if (!metadata.addr.test(addr.val())) {
        return "Address format error！";
    }
    return null;
}


/* 提交表单 */
$(document).ready(function() {
    var theForm = $('#the_form');
    window.addSubmit = function() {
        var validateResult = validate(theForm);
        if (validateResult != null) {
            hint(validateResult);
            return;
        }

        if (theForm.attr('submiting') != null
                && theForm.attr('submiting') == 'true')
            return;
        else
            theForm.attr('submiting', 'true');
        hint('submiting..');
        
        $.ajax({
        	url:'/sa-struts-test2/addUser/',
            data: {
                   "name":$("#name_id").val(),
                   "age": $("#age_id").val(),
                   "sex": $("#sex_id").val(),
                   "addr": $("#address_id").val()
        	},
            type: 'post',
            dataType: 'json',
            success: function(data) { // 请求成功后回调函数。
                    hint('Add OK！');
                    addReset();
                    setTimeout(function() {
                        $('body').trigger('addSuccess');
                        theForm.attr('submiting', 'false');
                    }, 500);
                    location.reload();
            },
            error: function() {
            	addReset();
            	location.reload();
            }
        });
    };
    window.addReset = function() {
        theForm.get(0).reset();       
    };
});  
        
   
/* 添加框 */
$(document).ready(function() {
    var addDialog = $("#add_dialog");
    window.callAddDialog = function() {
        hint();
        addDialog.dialog('open');
    };
    window.closeAddDialog = function() {
        addDialog.dialog('close');
    };
    addDialog.dialog({
        width: 380,
        modal: true, // 锁住屏幕
        buttonClass: 'ui-button-broad',
        autoOpen: false
    });

    $('body').bind('addSuccess', function() {
        closeAddDialog();
    });
    $("#add_submit_btn").click(function() {
        addSubmit();
    });
    $("#dialog_close_btn").click(function() {
        closeAddDialog();
    });
});
