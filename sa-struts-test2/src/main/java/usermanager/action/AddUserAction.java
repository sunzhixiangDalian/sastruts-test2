package usermanager.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.arnx.jsonic.JSON;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;
import org.seasar.extension.jdbc.JdbcManager;

import usermanager.service.UserService;
import usermanager.dto.UserDto;
import usermanager.entity.User;
import usermanager.form.AddUserForm;


public class AddUserAction {
    
    @ActionForm
    @Resource
    public AddUserForm addUserForm;
    
    @Resource
    protected UserService userService;
    
    @Resource
    protected HttpServletRequest request;

    @Resource
    protected HttpServletResponse response;
    
   
    //jdbcManger is access to the DataBase.
    @Resource
    public JdbcManager jdbcManager;
    /**
     * @throws Exception
     */
     
    @Execute(validator = true,input = "index.jsp")
    public String index() throws Exception {
        int age = Integer.parseInt(addUserForm.age);
        int sex =  Integer.parseInt(addUserForm.sex);
        String addr = addUserForm.addr;
        String name = addUserForm.name;
        userService.addUserTx(name, age, sex, addr);
        UserDto user = new UserDto();
        user.age = age;
        user.name = name;
        user.sex = sex;
        ResponseUtil.write(JSON.encode(user), "text/javascript");
        return null;
    }
    
  

}