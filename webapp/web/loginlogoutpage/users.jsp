

<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users</title>
    </head>
    <body>
    <center>
        <h1>Register User</h1>
        <%
            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }

            String username = "", name = "", password = "", result = "";
            System.out.println(ispostback);

            if (ispostback) {
                try {
                    username = request.getParameter("username");
                    name = request.getParameter("name");
                    password = request.getParameter("password");

                    PreparedStatement ps = DbConnect.connect().prepareStatement("insert into users values(?,?,?)");
                    ps.setString(1, username);
                    ps.setString(2, name);
                    ps.setString(3, password);
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

            name<input name="name" value="<%=name%>" type="text">
            password<input name="password" value="<%=password%>" type="number">
            <br>
            <br>
            <input type="submit">


        </form>
    </center>
</body>
</html>
