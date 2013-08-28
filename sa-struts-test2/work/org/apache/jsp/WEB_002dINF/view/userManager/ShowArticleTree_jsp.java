package org.apache.jsp.WEB_002dINF.view.userManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ShowArticleTree_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 //方法的定义和说明 递归方法(重点！)
String str = "";
boolean login = false;

private void tree(Connection conn, int id, int level) {
	Statement stmt = null;
	ResultSet rs = null;
	//定义一个前导字符串
	String preStr = "";
	for(int i=0; i<level; i++) {
		preStr += "----";
	}
	//从createStatement 到rs.close(), stmt.close() ,con.close()放在try{}catch(){}finally{} 
	try {
		stmt = conn.createStatement();
		//id 是方法传进来的参数
		String sql = "select * from article where pid = " + id;
		rs = stmt.executeQuery(sql);
		String strLogin = "";
		
		while(rs.next()) {
			//login = true的时候显示删除，false不显示
			if(login) {
				strLogin = "<td><a href='Delete.jsp?id=" + rs.getInt("id") + "&pid=" + rs.getInt("pid") + "'>删除</a>";
			} 
			//jsp中输出html tag.
			str += "<tr><td>" + rs.getInt("id") + "</td><td>" +
			       preStr + "<a href='ShowArticleDetail.jsp?id=" + rs.getInt("id") + "'>" +  
			       rs.getString("title") + "</a></td>" +
			       strLogin +
			       "</td></tr>";
			//飞叶子节点的递归方法
			if(rs.getInt("isleaf") != 0) {
				tree(conn, rs.getInt("id"), level+1);
			}
		}
		//先catch特殊的Exception
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			if(rs != null) {
				rs.close();
				rs = null;
			}
			if(stmt != null) {
				stmt.close();
				stmt = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/view/common/common.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");

String admin = (String)session.getAttribute("admin");
if(admin != null && admin.equals("true")) {
	//login = true的时候显示删除，false不显示
	login = true;
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

Class.forName("com.mysql.jdbc.Driver");
String url = "jdbc:mysql://localhost/bbs?user=root&passsword=";
Connection conn = DriverManager.getConnection(url);

Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("select * from article where pid = 0");
String strLogin = "";
while(rs.next()) {
	if(login) {
		strLogin = "<td><a href='Delete.jsp?id=" + rs.getInt("id") + "&pid=" + rs.getInt("pid") + "'>删除</a>";
	}
	str += "<tr><td>" + rs.getInt("id") + "</td><td>" +
    	   "<a href='ShowArticleDetail.jsp?id=" + rs.getInt("id") + "'>" + 
           rs.getString("title") + "</a></td>" +
           strLogin +
           "</td></tr>";
   	if(rs.getInt("isleaf") != 0) {
   		tree(conn, rs.getInt("id"), 1);
   	}
}
rs.close();
stmt.close();
conn.close();

      out.write("\r\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\r\n");
      out.write("<a href=\"Post.jsp\">发表新帖</a>\n");
      out.write("<table border=\"1\">\n");
      out.write("\r\n");
      out.print( str );
      out.write('\r');
      out.write('\n');
 
//防止String str 成员变量累积。
str = ""; 
//只有session 存在login才是true
login = false;

      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
