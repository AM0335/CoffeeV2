<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
    <head>
        <title>Coffee View</title>
        <script type="text/javascript" src="myscript.js"></script>
        <link rel="stylesheet" type="text/css" href="styles.css" />
    </head>

    <body>
        <h1>Coffee View</h1>
        <div>
        <%
        List styles = (List) request.getAttribute("styles");
        Iterator it = styles.iterator();
            while(it.hasNext()) {
                out.print("<h3>try: " + it.next() + "</h3>");
                //out.print("<img src='" + request.getContextPath() + "/images/+it.next() alt='image' />");
                out.print("<img src='" + it.next() + "' alt='image' width='128' height='128'><hr>");
            }
        %>
        <input id="button" type=button onClick="location.href='./'" value='New Choice'>
        </div>
    </body>
</html>
