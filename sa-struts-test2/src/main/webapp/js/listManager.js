$(document).ready(function() {
    /* 禁用的链接 */
    $('.a_disable').live("click", function(e) {
        e.preventDefault();
    });    
    /* select 的初值 */
    $('select').each(function() {
        var v = $(this).attr('selected_v');
        if (v == null || v == '')
            return;
        $(this).find('option').each(function() {
            if ($(this).val() == v) {
                $(this).parent().get(0).selectedIndex = $(this).prevAll('*').length;
            }
        });
    });

    $('.edit_prepare').click(function() {
        var currTr = $(this).closest('tr'),
                preTr = currTr.prev('tr');
        currTr.hide();
        preTr.show();
    });
    $('.edit_cancel').click(function() {
        var currTr = $(this).closest('tr'),
                nextTr = currTr.next('tr');
        currTr.hide();
        nextTr.show();
    });
    $('.edit_delete').click(function() {
        var btn = $(this);
        var tr = $(this).closest("tr"),
                id = tr.attr('item_id'),
                name = tr.attr('item_name');
        if (!confirm('你确定delete：' + name + " ?"))
            return;

        if (btn.attr('submiting') != null && btn.attr('submiting') == 'true')
            return;
        else
            btn.attr('submiting', 'true');

        btn.html('Wait....');
        var url=btn.attr('url');
        $.ajax({
            url : '/sa-struts-test2/userManager/delete/',
            data: {"id":id}, 
            type: 'post',
            dataType: 'json',
            success: function(data) {
                    alert('OK！delete！');
                    location.reload();
            },
            error: function() {
                alert('Net error');
                btn.html('delete');
                btn.attr('submiting', 'false');
            }
        });
    });
    
    $('.edit_submit').click(function() {
        var btn = $(this);
        if (btn.attr('submiting') != null && btn.attr('submiting') == 'true')
            return;
        else
            btn.attr('submiting', 'true');
        btn.html('Wait....');
       var theForm = $('#edit_form');
       var id = $(this).closest('tr').find("input[name='id']").val();
       var name = $(this).closest('tr').find("input[name='name']").val();
       var age = $(this).closest('tr').find("select[name='age'] option:selected").val();
       var sex = $(this).closest('tr').find("select[name='sex'] option:selected").val();
       var addr = $(this).closest('tr').find("input[name='addr']").val();
        $.ajax({
        	url:'/sa-struts-test2/userManager/saveOrUpdate/',
            data:{
            	"id":id,           	
            	"name":name,
                "age": age,
                "sex": sex,
                "addr":addr
                },
            type: 'post',
            dataType: 'json',
            success: function(data) {
                    alert('修改OK！！');
                    location.reload();
                },
            error: function() {
                alert('input format error!');
                btn.html('submit');
                btn.attr('submiting', 'false');
            }
        });
    });
});

