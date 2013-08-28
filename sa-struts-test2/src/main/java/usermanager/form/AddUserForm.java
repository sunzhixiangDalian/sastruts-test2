package usermanager.form;

import org.seasar.struts.annotation.IntRange;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Minlength;
import org.seasar.struts.annotation.Required;

public class AddUserForm {
    
    @Required
    @Minlength(minlength = 2)
    @Maxlength(maxlength = 20)
    public String name;

    @Required
    @IntRange(min = 0, max = 120)
    public String age;
    
    @Required
    @Minlength(minlength = 0)
    @Maxlength(maxlength = 50)
    public String addr;
    public String sex;
    
}
