<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
    
    <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>  
    <script type="text/javascript" src="js/myjs.js"></script>
    
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>  
    <h1>DNA Segments Input</h1>  
    <fieldset>  
    <legend>Input DNA Segment</legend>  
    <form>  
        <ul style="list-style-type: none;">  
        <li>DNA:<input type="text" name="seg" id="msgInput">   
        <li>  <input type="submit" value="Submit!"id="msg"> 
        </ul>  
    </form>  
    </fieldset>  
  </body>
</html>
