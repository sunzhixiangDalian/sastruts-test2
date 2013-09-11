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
        
        
		<link rel="stylesheet" href="http://cdn.oesmith.co.uk/morris-0.4.3.min.css">
		<script src="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
		<script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
		<script src="http://cdn.oesmith.co.uk/morris-0.4.3.min.js"></script>
		
</head>
    <body>
        <h1>Assignment課題<br>
　                      SA-Strutsを利用した簡単なWebアプリケーションの作成</h1>
        <h3><a href="userManager">Enter into the Web APP</a></h3>
        <h4>Author : Sun zhixiang (Andy)</h4>
        <h4>Email  : sunzhixiang.dalian@gmail.com</h4>
        <div id="myfirstchart" style="height: 300px;width: 900px;"></div>
 <script>
   
                 new Morris.Bar({
                               element: 'myfirstchart',
                               data: [
                                      { y: '1', a: 100, b: 90,c: 70 },
                                      { y: '2', a: 75,  b: 65,c: 70 },
                                      { y: '3', a: 50,  b: 40,c: 70 },
                                      { y: '4', a: 75,  b: 65,c: 70 },
                                      { y: '5', a: 50,  b: 40,c: 70 },
                                      { y: '6', a: 75,  b: 65,c: 70 },
                                      { y: '7', a: 100, b: 90,c: 70 },
                                      { y: '8', a: 75,  b: 65,c: 70 },
                                      { y: '9', a: 50,  b: 40,c: 70 },
                                      { y: '10', a: 75,  b: 65,c: 70 },
                                      { y: '11', a: 50,  b: 40,c: 70 },
                                      { y: '12', a: 75,  b: 65,c: 70 },
                                      { y: '13', a: 50,  b: 40,c: 70 },
                                      { y: '14', a: 75,  b: 65,c: 70 },
                                      { y: '15', a: 50,  b: 40,c: 70 },
                                      { y: '16', a: 100, b: 90,c: 70 }
                                      ],
                               xkey: 'y',
                               ykeys: ['a', 'b','c'],
                               labels: ['Series A', 'Series B', 'Series C']
                               });
</script>
         </br>
         </br>
         <div id="linechart" style="height: 300px;width: 900px;"></div>
         <script>
         Morris.Line({
        	  element: 'linechart',
        	  data: [
        	    { y: '2006', a: 100, b: 90 },
        	    { y: '2007', a: 75,  b: 65 },
        	    { y: '2008', a: 50,  b: 40 },
        	    { y: '2009', a: 75,  b: 65 },
        	    { y: '2010', a: 50,  b: 40 },
        	    { y: '2011', a: 75,  b: 65 },
        	    { y: '2012', a: 100, b: 90 }
        	  ],
        	  xkey: 'y',
        	  ykeys: ['a', 'b'],
        	  labels: ['Series A', 'Series B']
        	});
         </script>
         
			         
			         <div id="graph"></div>
			<div id="reloadStatus">
			<pre id="code" class="prettyprint linenums">
			<script>
			var nReloads = 0;
			function data(offset) {
			  var ret = [];
			  for (var x = 0; x <= 360; x += 10) {
			    var v = (offset + x) % 360;
			    ret.push({
			      x: x,
			      y: Math.sin(Math.PI * v / 180).toFixed(4),
			      z: Math.cos(Math.PI * v / 180).toFixed(4)
			    });
			  }
			  return ret;
			}
			var graph = Morris.Line({
			    element: 'graph',
			    data: data(0),
			    xkey: 'x',
			    ykeys: ['y', 'z'],
			    labels: ['sin()', 'cos()'],
			    parseTime: false,
			    ymin: -1.0,
			    ymax: 1.0,
			    hideHover: true
			});
			function update() {
			  nReloads++;
			  graph.setData(data(5 * nReloads));
			  $('#reloadStatus').text(nReloads + ' reloads');
			}
			setInterval(update, 100);
			</script>
			</pre>
    </body>
</html>