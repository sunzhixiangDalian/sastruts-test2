package usermanager.form;

import java.util.List;


import org.seasar.struts.annotation.IntRange;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Minlength;
import usermanager.entity.User;
import usermanager.tools.PageManager;


public class UserSearchForm {
    public PageManager page;
    public int start;
    public int maxShow;
    
    @Minlength(minlength = 2)
    @Maxlength(maxlength = 20)
    public String name;

   
    @IntRange(min = 0, max = 120)
    public String addr;
    
    public int sex;
    
    @IntRange(min = 0, max = 120)
    public int age;
   
    public List<User> data;
    
    
}
