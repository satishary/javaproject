

<%@page import="java.sql.ResultSet"%>
<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Todo new </title>
    </head>
    <body>

        <%

            String check = request.getParameter("check");
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            // System.out.println(ispostback);

            String option = "", sno = "", task = "", description = "", status = "", result = "";
            if (ispostback) {
                option = request.getParameter("option");
                if (option.equals("update")) {
                    out.println("update code");
                    task = request.getParameter("task");
                    description = request.getParameter("description");
                     status = request.getParameter("status");
                     sno=request.getParameter("sno");
                    PreparedStatement ps = DbConnect.connect().prepareStatement("update todo set task=?,description=?,status=? where sno=?");

                    ps.setString(1, task);
                     ps.setString(2, description);
                     ps.setString(3, status);
                     ps.setString(4, sno);
                    ps.executeUpdate();
                    

                }
            }


        %>
    <center>
        <%=result%>
        <h1>Todo new update</h1>
        <form>
            <input type="hidden" name="check"/>


            sno<input value="<%=sno%>"name="sno" type="number">
            <br>
            task<input value="<%=task%>"name="task" type="text">
            <br>
            description<input value="<%=description%>"name="description" type="text">
            <br>
            status<input value="<%=status%>"name="status" type="text">
            <br>
            <br>
            <input name="option" type="submit" value="update"/>
        </form>
    </center>
</body>
</html>
