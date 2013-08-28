/*
 * Document   : UserMetaData.java
 * Created on : 2013-7-18
 * Author     : sun
 */
package usermanager.db;

import java.util.regex.Pattern;

public class UserMetaData {

    public final static int AGE_MAX = 120;
    public final static int AGE_MIN = 0;
    public final static int SEX_MALE = 1;
    public final static int SEX_FEMALE = 2;
    public final static String NAME_PATTERN = "[\\s\\S]{2,20}";
    public final static String ADDR_PATTERN = "[\\s\\S]{2,50}";

    public static boolean validate(usermanager.entity.User user) {
        return Pattern.matches(NAME_PATTERN, user.getUName())
                && Pattern.matches(ADDR_PATTERN, user.getUAddr())
                && user.getUAge() >= AGE_MIN    
                && user.getUAge() <= AGE_MAX
                && (user.getUSex() == SEX_MALE || user.getUSex() == SEX_FEMALE);
    }
}
