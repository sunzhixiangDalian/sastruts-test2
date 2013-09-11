package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class TestMorris_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"keywords\" content=\"\" >       \n");
      out.write("        <title>index</title>        \n");
      out.write("        <style type=\"text/css\"></style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://cdn.oesmith.co.uk/morris-0.4.3.min.css\">\n");
      out.write("\t\t<script src=\"http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\n");
      out.write("\t\t<script src=\"http://code.jquery.com/jquery-1.8.2.min.js\"></script>\n");
      out.write("\t\t<script src=\"http://cdn.oesmith.co.uk/morris-0.4.3.min.js\"></script>\n");
      out.write("\t\t\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Assignment課題<br>\n");
      out.write("　                      SA-Strutsを利用した簡単なWebアプリケーションの作成</h1>\n");
      out.write("        <h3><a href=\"userManager\">Enter into the Web APP</a></h3>\n");
      out.write("        <h4>Author : Sun zhixiang (Andy)</h4>\n");
      out.write("        <h4>Email  : sunzhixiang.dalian@gmail.com</h4>\n");
      out.write("        <div id=\"myfirstchart\" style=\"height: 300px;width: 900px;\"></div>\n");
      out.write(" <script>\n");
      out.write("   \n");
      out.write("                 new Morris.Bar({\n");
      out.write("                               element: 'myfirstchart',\n");
      out.write("                               data: [\n");
      out.write("                                      { y: '1', a: 100, b: 90,c: 70 },\n");
      out.write("                                      { y: '2', a: 75,  b: 65,c: 70 },\n");
      out.write("                                      { y: '3', a: 50,  b: 40,c: 70 },\n");
      out.write("                                      { y: '4', a: 75,  b: 65,c: 70 },\n");
      out.write("                                      { y: '5', a: 50,  b: 40,c: 70 },\n");
      out.write("                                      { y: '6', a: 75,  b: 65,c: 70 },\n");
      out.write("                                      { y: '7', a: 100, b: 90,c: 70 },\n");
      out.write("                                      { y: '8', a: 75,  b: 65,c: 70 },\n");
      out.write("                                      { y: '9', a: 50,  b: 40,c: 70 },\n");
      out.write("                                      { y: '10', a: 75,  b: 65,c: 70 },\n");
      out.write("                                      { y: '11', a: 50,  b: 40,c: 70 },\n");
      out.write("                                      { y: '12', a: 75,  b: 65,c: 70 },\n");
      out.write("                                      { y: '13', a: 50,  b: 40,c: 70 },\n");
      out.write("                                      { y: '14', a: 75,  b: 65,c: 70 },\n");
      out.write("                                      { y: '15', a: 50,  b: 40,c: 70 },\n");
      out.write("                                      { y: '16', a: 100, b: 90,c: 70 }\n");
      out.write("                                      ],\n");
      out.write("                               xkey: 'y',\n");
      out.write("                               ykeys: ['a', 'b','c'],\n");
      out.write("                               labels: ['Series A', 'Series B', 'Series C']\n");
      out.write("                               });\n");
      out.write("</script>\n");
      out.write("         </br>\n");
      out.write("         </br>\n");
      out.write("         <div id=\"linechart\" style=\"height: 300px;width: 900px;\"></div>\n");
      out.write("         <script>\n");
      out.write("         Morris.Line({\n");
      out.write("        \t  element: 'linechart',\n");
      out.write("        \t  data: [\n");
      out.write("        \t    { y: '2006', a: 100, b: 90 },\n");
      out.write("        \t    { y: '2007', a: 75,  b: 65 },\n");
      out.write("        \t    { y: '2008', a: 50,  b: 40 },\n");
      out.write("        \t    { y: '2009', a: 75,  b: 65 },\n");
      out.write("        \t    { y: '2010', a: 50,  b: 40 },\n");
      out.write("        \t    { y: '2011', a: 75,  b: 65 },\n");
      out.write("        \t    { y: '2012', a: 100, b: 90 }\n");
      out.write("        \t  ],\n");
      out.write("        \t  xkey: 'y',\n");
      out.write("        \t  ykeys: ['a', 'b'],\n");
      out.write("        \t  labels: ['Series A', 'Series B']\n");
      out.write("        \t});\n");
      out.write("         </script>\n");
      out.write("         \n");
      out.write("\t\t\t         \n");
      out.write("\t\t\t         <div id=\"graph\"></div>\n");
      out.write("\t\t\t<div id=\"reloadStatus\">\n");
      out.write("\t\t\t<pre id=\"code\" class=\"prettyprint linenums\">\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\tvar nReloads = 0;\n");
      out.write("\t\t\tfunction data(offset) {\n");
      out.write("\t\t\t  var ret = [];\n");
      out.write("\t\t\t  for (var x = 0; x <= 360; x += 10) {\n");
      out.write("\t\t\t    var v = (offset + x) % 360;\n");
      out.write("\t\t\t    ret.push({\n");
      out.write("\t\t\t      x: x,\n");
      out.write("\t\t\t      y: Math.sin(Math.PI * v / 180).toFixed(4),\n");
      out.write("\t\t\t      z: Math.cos(Math.PI * v / 180).toFixed(4)\n");
      out.write("\t\t\t    });\n");
      out.write("\t\t\t  }\n");
      out.write("\t\t\t  return ret;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tvar graph = Morris.Line({\n");
      out.write("\t\t\t    element: 'graph',\n");
      out.write("\t\t\t    data: data(0),\n");
      out.write("\t\t\t    xkey: 'x',\n");
      out.write("\t\t\t    ykeys: ['y', 'z'],\n");
      out.write("\t\t\t    labels: ['sin()', 'cos()'],\n");
      out.write("\t\t\t    parseTime: false,\n");
      out.write("\t\t\t    ymin: -1.0,\n");
      out.write("\t\t\t    ymax: 1.0,\n");
      out.write("\t\t\t    hideHover: true\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\tfunction update() {\n");
      out.write("\t\t\t  nReloads++;\n");
      out.write("\t\t\t  graph.setData(data(5 * nReloads));\n");
      out.write("\t\t\t  $('#reloadStatus').text(nReloads + ' reloads');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tsetInterval(update, 100);\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\t\t</pre>\n");
      out.write("    </body>\n");
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
