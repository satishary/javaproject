

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
    </head>
    <body>
        <h1>Home</h1>
        <a herf="logout.jsp">Logout</a>
        <%
            if (session.getAttribute("username") == null) {
                response.sendRedirect("check.jsp");
                return;

            }
            String username = "" + session.getAttribute("username");
            out.println(username);
        %>
    </body>
</html>
