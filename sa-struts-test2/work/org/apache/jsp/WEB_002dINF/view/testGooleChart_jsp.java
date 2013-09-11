package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class testGooleChart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<script src=\"http://code.jquery.com/jquery-1.8.2.min.js\"></script>\n");
      out.write("\t\t <script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("      google.load('visualization', '1', {packages: ['corechart']});\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    /*You cannot load both corechart and the barchart, linechart, mapchart, areachart,\n");
      out.write("    piechart, or scatterchart packages at the same time on the same page.  */\n");
      out.write("    function drawVisualization() {\n");
      out.write("        // Some raw data (not necessarily accurate)\n");
      out.write("        // 数组的格式 必须保证数据和字段相对应，缩进 retract must the same \n");
      out.write("        var data = google.visualization.arrayToDataTable([\n");
      out.write("          ['Month', 'インストール回数', '利用回数', '削除回数', '端末数'],\n");
      out.write("          ['1', \t\t522,             998,           450,      614.6],\n");
      out.write("          ['2',\t \t\t599,             1268,          288,      682],\n");
      out.write("          ['3', \t\t587,             807,           397,      623],\n");
      out.write("          ['4', \t\t629,             1026,          366,      769.6],\n");
      out.write("          ['5', \t\t522,             998,           450,      814.6],\n");
      out.write("          ['6', \t\t599,             1268,          288,      982],\n");
      out.write("          ['7', \t\t587,             807,           397,      1023],\n");
      out.write("          ['8', \t\t629,             1026,          366,      1469.6],\n");
      out.write("          ['9', \t\t522,             998,           450,      1814.6],\n");
      out.write("          ['10', \t\t599,             1268,          288,      1982],\n");
      out.write("          ['11', \t\t587,             807,           397,      2623]\n");
      out.write("        ]);\n");
      out.write("/* chart 的基本信息，标题，vertical and horizon 标题，图形的类型is bar ，平均值对应的 5 设为 line\n");
      out.write(" * options 变量中设置图表的属性，json type 数据格式\n");
      out.write(" */\n");
      out.write("        var options = {\n");
      out.write("          title : '集計情報',\n");
      out.write("          //vAxis: {title: \"Cups\"},\n");
      out.write("          //hAxis: {title: \"Month\"},\n");
      out.write("          seriesType: \"bars\",\n");
      out.write("         \n");
      out.write("          //number from 0 of the series.\n");
      out.write("          series: {3: {type: \"line\",poinSize: 2},\n");
      out.write("        \t  \t   0: {color: \"CornflowerBlue\"},\n");
      out.write("        \t  \t   1: {color: \"MediumPurple\"},\n");
      out.write("        \t  \t   2: {color: \"IndianRed\"},\n");
      out.write("          \t\t }\n");
      out.write("          \n");
      out.write("         /*  // Allow multiple simultaneous selections.\n");
      out.write("          selectionMode: 'multiple',\n");
      out.write("          // Trigger tooltips on selections.\n");
      out.write("          tooltip: { trigger: 'selection' },\n");
      out.write("          // Group selections by x-value.\n");
      out.write("          aggregationTarget: 'category', */\n");
      out.write("          \n");
      out.write("        };\n");
      out.write("\n");
      out.write("        var chart = new google.visualization.ComboChart(document.getElementById('chart_div'));\n");
      out.write("        chart.draw(data, options);\n");
      out.write("      }\n");
      out.write("      google.setOnLoadCallback(drawVisualization);\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Assignment課題<br>\n");
      out.write("　                      SA-Strutsを利用した簡単なWebアプリケーションの作成</h1>\n");
      out.write("        <h3><a href=\"userManager\">Enter into the Web APP</a></h3>\n");
      out.write("        <h4>Author : Sun zhixiang (Andy)</h4>\n");
      out.write("        <h4>Email  : sunzhixiang.dalian@gmail.com</h4>\n");
      out.write("         <div id=\"chart_div\" style=\"width: 900px; height: 500px;\"></div>\n");
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
