

<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
    <center>
        <form>
        <h1>Login page</h1>
          <%
            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }

            String username = "",  password = "", result = "";
            System.out.println(ispostback);

            if (ispostback) {
                try {
                    username = request.getParameter("username");
                    password = request.getParameter("password");

                    PreparedStatement ps = DbConnect.connect().prepareStatement("insert into users values(?,?)");
                    ps.setString(1, username);
                    ps.setString(2, password);
                    int n = ps.executeUpdate();
                    result = "Inserted " + n + " records";
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }

        %>
        <%=result%>
        <form method="post">
            <input type="hidden" name="check" value="1">

            username<input name="username" value="<%=username%>" type="text">
            <br>
            <br>
            password<input name="password" value="<%=password%>" type="number">
            <br>
        <input type="submit" value="login">
        </form>
    </center>
    
</body>
</html>
