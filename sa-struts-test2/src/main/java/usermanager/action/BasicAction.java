/*
 * Document   : BasicAction.java
 * Created on : 2013-7-14, 8:46:55 
 * Author     : sun 
 */
package usermanager.action;

import javax.servlet.http.HttpServletRequest;

public class BasicAction {

    protected HttpServletRequest request;
    public void setServletRequest(HttpServletRequest hsr) {
        this.request = hsr;
    }
}
