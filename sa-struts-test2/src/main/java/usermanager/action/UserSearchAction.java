package usermanager.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringEscapeUtils;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.extension.jdbc.JdbcManager;
import usermanager.service.UserService;
import usermanager.tools.PageManager;
import usermanager.entity.User;
import usermanager.form.UserSearchForm;


public class UserSearchAction extends BasicAction{
    
    @ActionForm
    @Resource
    public UserSearchForm userSearchForm;
    
    @Resource
    protected UserService userService;
   
    @Resource
    public JdbcManager jdbcManager;
    
    
    public List<User> data;
    public PageManager page = new PageManager();
    /*
     * search user information
     * start and maxShow is the parameter from the JSP, sent to the UserSearchForm
     */
    @Execute(urlPattern = "{start}/{maxShow}",validator = false )
    public String search() throws Exception {
        int start = userSearchForm.start;
        int maxShow = userSearchForm.maxShow;
        page.setItemStart(start);
        page.setShowMaxCount(maxShow);
        page.setItemCount((int) userService.getCount());
        
      if(userSearchForm.name == null||userSearchForm.name==""){
          data = userService.findAllOrderById(page.getItemStart(),page.getShowMaxCount());
      }
      else{
          
       String name = StringEscapeUtils.escapeEcmaScript(userSearchForm.name);
       String addr = StringEscapeUtils.escapeEcmaScript(userSearchForm.addr);
       data = userService.searchUser(page.getItemStart(),page.getShowMaxCount(),name, userSearchForm.sex, userSearchForm.age, addr);
       page.setItemCount(data.size());
       
      }
      return "search_result.jsp";
    }
    
    

}

