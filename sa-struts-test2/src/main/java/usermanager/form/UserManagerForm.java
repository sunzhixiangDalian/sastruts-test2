package usermanager.form;

import org.seasar.struts.annotation.IntRange;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Minlength;
import org.seasar.struts.annotation.Required;

public class UserManagerForm {
//    target要素が指定されていない場合、@Executeでvalidator=trueのすべての実行メソッドが対象になります。
   @Required
   @IntegerType
   public String id;
   
   @Required
   @Minlength(minlength = 2)
   @Maxlength(maxlength = 20)
   public String name;
   
   @Required
   @Minlength(minlength = 0)
   @Maxlength(maxlength = 50)
   public String addr;
   
   @IntRange(min = 1, max = 2)
   public String sex;
   
   @Required
   @IntRange(min =0 , max = 120)
   public String age;
}
