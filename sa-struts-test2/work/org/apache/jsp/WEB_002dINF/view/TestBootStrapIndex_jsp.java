package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class TestBootStrapIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 65536, true);
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>test Bootstrap in the subject</title>\n");
      out.write("   <link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Optional theme -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css\">  \n");
      out.write("   \n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"theme.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <!-- Fixed navbar -->\n");
      out.write("    <div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">Author Info</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"navbar-collapse collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav\">\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Info Dropdown <b class=\"caret\"></b></a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"#\">Mail:zhixiang.sun@bric.jp</a></li>\n");
      out.write("                <li><a href=\"#\">Address: Ueno 3-16-2</a></li>\n");
      out.write("                <li><a href=\"#\">Tel: 09064826406</a></li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li class=\"dropdown-header\">Company</li>\n");
      out.write("                <li><a href=\"#\">Bricolage.jp</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div><!--/.nav-collapse -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container theme-showcase\">\n");
      out.write("\n");
      out.write("      <!-- Main jumbotron for a primary marketing message or call to action -->\n");
      out.write("      <div class=\"jumbotron\">\n");
      out.write("        <h1>Assignment課題</h1>\n");
      out.write("        <p>SA-Strutsを利用した簡単なWebアプリケーションの作成.</p>\n");
      out.write("        <p><a class=\"btn btn-primary btn-lg\"  href=\"userManager\">Get into the UserManager &raquo;</a></p>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"page-header\">\n");
      out.write("        <h1>Buttons</h1>\n");
      out.write("      </div>\n");
      out.write("      <p>\n");
      out.write("        <button type=\"button\" class=\"btn btn-lg btn-default\">Default</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-lg btn-primary\">Primary</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-lg btn-success\">Success</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-lg btn-info\">Info</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-lg btn-warning\">Warning</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-lg btn-danger\">Danger</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-lg btn-link\">Link</button>\n");
      out.write("      </p>\n");
      out.write("      <p>\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\">Default</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\">Primary</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-success\">Success</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-info\">Info</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-warning\">Warning</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-danger\">Danger</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-link\">Link</button>\n");
      out.write("      </p>\n");
      out.write("      <p>\n");
      out.write("        <button type=\"button\" class=\"btn btn-sm btn-default\">Default</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-sm btn-primary\">Primary</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-sm btn-success\">Success</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-sm btn-info\">Info</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-sm btn-warning\">Warning</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-sm btn-danger\">Danger</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-sm btn-link\">Link</button>\n");
      out.write("      </p>\n");
      out.write("      <p>\n");
      out.write("        <button type=\"button\" class=\"btn btn-xs btn-default\">Default</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-xs btn-primary\">Primary</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-xs btn-success\">Success</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-xs btn-info\">Info</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-xs btn-warning\">Warning</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-xs btn-danger\">Danger</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-xs btn-link\">Link</button>\n");
      out.write("      </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"page-header\">\n");
      out.write("        <h1>Thumbnails</h1>\n");
      out.write("      </div>\n");
      out.write("      <img data-src=\"holder.js/200x200\" src=\"data:image/png;base64,\" class=\"img-thumbnail\" alt=\"A generic square placeholder image with a white border around it, making it resemble a photograph taken with an old instant camera\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"page-header\">\n");
      out.write("        <h1>Dropdown menus</h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"dropdown theme-dropdown clearfix\">\n");
      out.write("        <a id=\"dropdownMenu1\" href=\"#\" role=\"button\" class=\"sr-only dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\n");
      out.write("        <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu1\">\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Action</a></li>\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Another action</a></li>\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Something else here</a></li>\n");
      out.write("          <li role=\"presentation\" class=\"divider\"></li>\n");
      out.write("          <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Separated link</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"page-header\">\n");
      out.write("        <h1>Navbars</h1>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"navbar navbar-default\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Project name</a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"navbar-collapse collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("              <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("              <li><a href=\"#about\">About</a></li>\n");
      out.write("              <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("              <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                  <li><a href=\"#\">Action</a></li>\n");
      out.write("                  <li><a href=\"#\">Another action</a></li>\n");
      out.write("                  <li><a href=\"#\">Something else here</a></li>\n");
      out.write("                  <li class=\"divider\"></li>\n");
      out.write("                  <li class=\"dropdown-header\">Nav header</li>\n");
      out.write("                  <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                  <li><a href=\"#\">One more separated link</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("              <li><a href=\"../navbar/\">Default</a></li>\n");
      out.write("              <li><a href=\"../navbar-static-top/\">Static top</a></li>\n");
      out.write("              <li class=\"active\"><a href=\"./\">Fixed top</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div><!--/.nav-collapse -->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"navbar navbar-inverse\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Project name</a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"navbar-collapse collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("              <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("              <li><a href=\"#about\">About</a></li>\n");
      out.write("              <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("              <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu\">\n");
      out.write("                  <li><a href=\"#\">Action</a></li>\n");
      out.write("                  <li><a href=\"#\">Another action</a></li>\n");
      out.write("                  <li><a href=\"#\">Something else here</a></li>\n");
      out.write("                  <li class=\"divider\"></li>\n");
      out.write("                  <li class=\"dropdown-header\">Nav header</li>\n");
      out.write("                  <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                  <li><a href=\"#\">One more separated link</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("              <li><a href=\"../navbar/\">Default</a></li>\n");
      out.write("              <li><a href=\"../navbar-static-top/\">Static top</a></li>\n");
      out.write("              <li class=\"active\"><a href=\"./\">Fixed top</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div><!--/.nav-collapse -->\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"page-header\">\n");
      out.write("        <h1>Alerts</h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"alert alert-success\">\n");
      out.write("        <strong>Well done!</strong> You successfully read this important alert message.\n");
      out.write("      </div>\n");
      out.write("      <div class=\"alert alert-info\">\n");
      out.write("        <strong>Heads up!</strong> This alert needs your attention, but it's not super important.\n");
      out.write("      </div>\n");
      out.write("      <div class=\"alert alert-warning\">\n");
      out.write("        <strong>Warning!</strong> Best check yo self, you're not looking too good.\n");
      out.write("      </div>\n");
      out.write("      <div class=\"alert alert-danger\">\n");
      out.write("        <strong>Oh snap!</strong> Change a few things up and try submitting again.\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"page-header\">\n");
      out.write("        <h1>Progress bars</h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"progress\">\n");
      out.write("        <div class=\"progress-bar\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%;\"><span class=\"sr-only\">60% Complete</span></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"progress\">\n");
      out.write("        <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 40%\"><span class=\"sr-only\">40% Complete (success)</span></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"progress\">\n");
      out.write("        <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 20%\"><span class=\"sr-only\">20% Complete</span></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"progress\">\n");
      out.write("        <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\"><span class=\"sr-only\">60% Complete (warning)</span></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"progress\">\n");
      out.write("        <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%\"><span class=\"sr-only\">80% Complete (danger)</span></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"progress\">\n");
      out.write("        <div class=\"progress-bar progress-bar-success\" style=\"width: 35%\"><span class=\"sr-only\">35% Complete (success)</span></div>\n");
      out.write("        <div class=\"progress-bar progress-bar-warning\" style=\"width: 20%\"><span class=\"sr-only\">20% Complete (warning)</span></div>\n");
      out.write("        <div class=\"progress-bar progress-bar-danger\" style=\"width: 10%\"><span class='sr-only'>10% Complete (danger)</span></div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"page-header\">\n");
      out.write("        <h1>List groups</h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("          <ul class=\"list-group\">\n");
      out.write("            <li class=\"list-group-item\">Cras justo odio</li>\n");
      out.write("            <li class=\"list-group-item\">Dapibus ac facilisis in</li>\n");
      out.write("            <li class=\"list-group-item\">Morbi leo risus</li>\n");
      out.write("            <li class=\"list-group-item\">Porta ac consectetur ac</li>\n");
      out.write("            <li class=\"list-group-item\">Vestibulum at eros</li>\n");
      out.write("          </ul>\n");
      out.write("        </div><!-- /.col-sm-4 -->\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("          <div class=\"list-group\">\n");
      out.write("            <a href=\"#\" class=\"list-group-item active\">\n");
      out.write("              Cras justo odio\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Dapibus ac facilisis in</a>\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Morbi leo risus</a>\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Porta ac consectetur ac</a>\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Vestibulum at eros</a>\n");
      out.write("          </div>\n");
      out.write("        </div><!-- /.col-sm-4 -->\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("          <div class=\"list-group\">\n");
      out.write("            <a href=\"#\" class=\"list-group-item active\">\n");
      out.write("              <h4 class=\"list-group-item-heading\">List group item heading</h4>\n");
      out.write("              <p class=\"list-group-item-text\">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">\n");
      out.write("              <h4 class=\"list-group-item-heading\">List group item heading</h4>\n");
      out.write("              <p class=\"list-group-item-text\">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">\n");
      out.write("              <h4 class=\"list-group-item-heading\">List group item heading</h4>\n");
      out.write("              <p class=\"list-group-item-text\">Donec id elit non mi porta gravida at eget metus. Maecenas sed diam eget risus varius blandit.</p>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("        </div><!-- /.col-sm-4 -->\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"page-header\">\n");
      out.write("        <h1>Panels</h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("          <div class=\"panel panel-default\">\n");
      out.write("            <div class=\"panel-heading\">\n");
      out.write("              <h3 class=\"panel-title\">Panel title</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("              Panel content\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"panel panel-primary\">\n");
      out.write("            <div class=\"panel-heading\">\n");
      out.write("              <h3 class=\"panel-title\">Panel title</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("              Panel content\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div><!-- /.col-sm-4 -->\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("          <div class=\"panel panel-success\">\n");
      out.write("            <div class=\"panel-heading\">\n");
      out.write("              <h3 class=\"panel-title\">Panel title</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("              Panel content\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"panel panel-info\">\n");
      out.write("            <div class=\"panel-heading\">\n");
      out.write("              <h3 class=\"panel-title\">Panel title</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("              Panel content\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div><!-- /.col-sm-4 -->\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("          <div class=\"panel panel-warning\">\n");
      out.write("            <div class=\"panel-heading\">\n");
      out.write("              <h3 class=\"panel-title\">Panel title</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("              Panel content\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"panel panel-danger\">\n");
      out.write("            <div class=\"panel-heading\">\n");
      out.write("              <h3 class=\"panel-title\">Panel title</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("              Panel content\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div><!-- /.col-sm-4 -->\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"page-header\">\n");
      out.write("        <h1>Wells</h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"well\">\n");
      out.write("        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sed diam eget risus varius blandit sit amet non magna. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Cras mattis consectetur purus sit amet fermentum. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Aenean lacinia bibendum nulla sed consectetur.</p>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div> <!-- /container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"../../assets/js/holder.js\"></script>\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"//code.jquery.com/jquery.js\"></script>\n");
      out.write("    <!-- Latest compiled and minified JavaScript -->\n");
      out.write("    <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("    <script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${initParam.webUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/holder.js\"></script>\n");
      out.write("    \n");
      out.write("     <script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${initParam.webUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/jquery/jquery-1.7.2.min.js\"></script>\n");
      out.write("\t <script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${initParam.webUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/all.js\"></script>\n");
      out.write("\t <script  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${initParam.webUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/metadata.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
