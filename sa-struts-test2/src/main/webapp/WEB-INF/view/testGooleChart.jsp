<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  buffer="64kb" %>
<%@page  import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="keywords" content="" >       
        <title>index</title>        
        <style type="text/css"></style>
        
        
		<script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
		 <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript">
      google.load('visualization', '1', {packages: ['corechart']});
    </script>
    
    <script type="text/javascript">
    /*You cannot load both corechart and the barchart, linechart, mapchart, areachart,
    piechart, or scatterchart packages at the same time on the same page.  */
    function drawVisualization() {
        // Some raw data (not necessarily accurate)
        // 数组的格式 必须保证数据和字段相对应，缩进 retract must the same 
        var data = google.visualization.arrayToDataTable([
          ['Month', 'インストール回数', '利用回数', '削除回数', '端末数'],
          ['1', 		522,             998,           450,      614.6],
          ['2',	 		599,             1268,          288,      682],
          ['3', 		587,             807,           397,      623],
          ['4', 		629,             1026,          366,      769.6],
          ['5', 		522,             998,           450,      814.6],
          ['6', 		799,             1268,          288,      982],
          ['7', 		887,             807,           397,      1023],
          ['8', 		929,             1026,          366,      1469.6],
          ['9', 		1022,             998,           450,      1814.6],
          ['10', 		1299,             1268,          288,      1982],
          ['11', 		2087,             1807,           397,      2623]
        ]);
        
/* chart 的基本信息，标题，vertical and horizon 标题，图形的类型is bar ，平均值对应的 5 设为 line
 * options 变量中设置图表的属性，json type 数据格式
	vAxis: {title: "Cups"},
	hAxis: {title: "Month"},
 */
        var options = {
          title : '集計情報',
          seriesType: "bars",
          //number from 0 of the series.
          series: {3: {type: "line",poinSize: 2},
        	  	   0: {color: "CornflowerBlue"},
        	  	   1: {color: "MediumPurple"},
        	  	   2: {color: "IndianRed"},
          		 }
          
         /*   Allow multiple simultaneous selections.
          selectionMode: 'multiple',
          Trigger tooltips on selections.
          tooltip: { trigger: 'selection' },
          Group selections by x-value.
          aggregationTarget: 'category', */
          
        };

        var chart = new google.visualization.ComboChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      }
      google.setOnLoadCallback(drawVisualization);
    </script>
</head>
    <body>
        <h1>Assignment課題<br>
　                      SA-Strutsを利用した簡単なWebアプリケーションの作成</h1>
        <h3><a href="userManager">Enter into the Web APP</a></h3>
        <h4>Author : Sun zhixiang (Andy)</h4>
        <h4>Email  : sunzhixiang.dalian@gmail.com</h4>
         <div id="chart_div" style="width: 900px; height: 500px;"></div>
    </body>
</html>