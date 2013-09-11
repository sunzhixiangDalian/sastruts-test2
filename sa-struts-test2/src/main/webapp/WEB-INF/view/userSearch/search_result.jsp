
<%@page import="usermanager.db.UserMetaData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  buffer="64kb" %>
<%@page  import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="keywords" content="" >      
        <title>List</title> 
        <%@include  file="/common/srcRefs.jsp" %>
        <script src="${initParam.webUrl}/js/listManager.js"></script>
        <link href="${initParam.webUrl}/css/console_context.css" rel="stylesheet" />
        <style type="text/css">

        </style>
          <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

    <!-- Optional theme -->
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css">  
   
    <!-- Custom styles for this template -->
    <link href="theme.css" rel="stylesheet">
    </head>
    <body>        
        <c:set var="sexMale" value="<%= UserMetaData.SEX_MALE%>"/>
        
        <div id="list_container"> 
        
            
            <table class="data_table" width="100%" cellspacing="0" cellpadding="0">
                <thead>
                    <tr>
                        <td width="70">NUMBER</td>
                        <td width="150">NAME</td>
                        <td width="70">GENDER</td>
                        <td width="70">AGE</td>
                        <td >ADDRESS</td>                       
                        <td width="130">OPERATION</td>
                    </tr>
                </thead>
                <tbody>
                    <c:if test="${page.itemCount==0}">
                        <tr>
                            <td colspan="6">no data</td>
                        </tr>
                    </c:if>
                <form style="display: none; id="edit_form"  action="../userManager/saveOrUpdate/">
                    <c:forEach items="${data}" var="item" varStatus="status">                   
                    
                      <!--这个tr是用来edit and update user information是数据前标号，不是id-->
   
					<tr class="edit_row" style="display: none;" ">
						<td>${status.index+page.itemStart+1}</td>
						<td> 
						<input type="hidden" name="id" value="${f:h(item.UId)}" />
                        <input type="text" name="name"  class="ui-input-basic" value="${f:h(item.UName)}" />
					    </td>
								
						<td><select name="sex" 
							selected_v="${f:h(item.USex)}">
								<option value="1">male</option>
								<option value="2">female</option>
							</select>
						</td>
						<td><select name="age" 
							selected_v="${f:h(item.UAge)}"></select></td>
						<td>
						<input type="text" name="addr" class="ui-input-basic" value="${f:h(item.UAddr)}" />
						</td>
						<td>
							<button type="button" class="ui-button-narrowest edit_submit">Submit</button>
							<button type="button" class="ui-button-narrowest edit_cancel">Cancel</button>
						</td>
					</tr>
                        </form>
					<tr item_id="${f:h(item.UId)}" item_name="${f:h(item.UName)}">                           
                            <td>${status.index+page.itemStart+1}
                            <input type="hidden" id="userid" name="id" value="${f:h(item.UId)}" />
                            </td>
                            <td>${item.UName}</td>
                            <td>
                                <c:choose>
                                    <c:when test="${item.USex==sexMale}">male</c:when>
                                    <c:otherwise>female</c:otherwise>
                                </c:choose>                                
                            </td>
                            <td>${f:h(item.UAge)}</td>
                            <td>${f:h(item.UAddr)}</td>                          
                            <td>
                                <button type="button" class="btn btn-primary">更新</button>
                                <button type="button" class="btn btn-danger" >削除</button>
                            </td>
                        </tr>
                    </c:forEach> 
                     </form>
                </tbody>
            </table>
        </div>
        
        <div id="page_cmds_container">          
            <div id="page_manager">
                Total<span>${page.pageCount}</span>Page
                <span>${page.itemCount}</span>items
                <select class="page_max_show" selected_v="${page.showMaxCount}"> 
                    <option value="2">per page2items</option>
                    <option value="10">per page10items</option>
                    <option value="20">per page20items</option>
                    <option value="50">per page50items</option>
                    <option value="100">per page100items</option>
                </select>
                &nbsp;<a href="${f:url('/userSearch/')}0/${page.showMaxCount}" 
                         class="${page.prevPageStart!=-1?'':'a_disable'}">First</a>
                &nbsp;<a href="${f:url('/userSearch/')}${page.prevPageStart}/${page.showMaxCount}"
                         class="${page.prevPageStart!=-1?'':'a_disable'}">Previous</a>
                &nbsp;<a href="${f:url('/userSearch/')}${page.nextPageStart}/${page.showMaxCount}" 
                         class="${page.nextPageStart!=-1?'':'a_disable'}">Next</a>
                &nbsp;<a href="${f:url('/userSearch/')}${(page.pageCount-1)*page.showMaxCount}/${page.showMaxCount}"
                         class="${page.nextPageStart!=-1?'':'a_disable'}">Last</a>
            </div>   
            <div class="clear"></div>
        </div>
        <script>
            $(document).ready(function() {
                /* 更改了每页显示的条数 SAStruts中全部url需要${f:url('')} 标签*/
                $('.page_max_show').change(function() {
                	location.href = "${f:url('/userSearch/')}/0/" + $(this).find('option:selected').val();
                });
               
            });
        </script>
        
        
         <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="../../assets/js/holder.js"></script>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="//code.jquery.com/jquery.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    <script  src="${initParam.webUrl}/js/holder.js"></script>
    
     <script  src="${initParam.webUrl}/jquery/jquery-1.7.2.min.js"></script>
	 <script  src="${initParam.webUrl}/js/all.js"></script>
	 <script  src="${initParam.webUrl}/js/metadata.js"></script>
    </body>
</html>
