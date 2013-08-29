package usermanager.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import net.arnx.jsonic.JSON;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;
import org.seasar.extension.jdbc.JdbcManager;
import usermanager.service.UserService;
import usermanager.dto.UserDto;
import usermanager.form.UserManagerForm;

public class UserManagerAction {
    
    @ActionForm
    @Resource
    protected UserManagerForm userManagerForm;
    
    @Resource
    protected UserService userService;
    
    @Resource
    protected HttpServletResponse response;
    
    protected JdbcManager jdbcManager;
    

    //jdbcManger is access to the DataBase.
    @Execute(validator = false)
    public String index() throws Exception {
        return "list_user.jsp";
    }
    @Execute(urlPattern = "saveOrUpdate",validator = true,input = "index.jsp")
    public String saveOrUpdate() throws Exception {
        int id =  Integer.parseInt(userManagerForm.id);
        int age = Integer.parseInt(userManagerForm.age);
        int sex =  Integer.parseInt(userManagerForm.sex);
        String addr = userManagerForm.addr;
        String name = userManagerForm.name;
        
        userService.updateUserTx(id, name, age, sex, addr);
        UserDto user = new UserDto();
        user.id = id;
        user.age = age;
        user.name = name;
        user.sex = sex;
        ResponseUtil.write(JSON.encode(user), "text/javascript");
        return null;
    }
    
    
    @Execute(urlPattern = "delete",validator = false) 
    public String delete() throws Exception{
        int id = Integer.parseInt(userManagerForm.id);
        UserDto user = new UserDto();
        user.id = id;
        userService.deleteTx(id);
        ResponseUtil.write(JSON.encode(user), "text/javascript");
        return null;
    }
    
   
}