

<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert</title>
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

            String option = "";

            String sno = "", task = "", description = "", status = "", result = "", delete = "";
            System.out.println(ispostback);

            if (ispostback) {
                try {
                    sno = request.getParameter("sno");
                    task = request.getParameter("task");
                    description = request.getParameter("description");
                    status = request.getParameter("status");

                    PreparedStatement ps = DbConnect.connect().prepareStatement("insert into todo values(?,?,?,?)");
                    ps.setString(1, sno);
                    ps.setString(2, task);
                    ps.setString(3, description);
                    ps.setString(4, status);
                    int n = ps.executeUpdate();
                    result = "Inserted " + n + " records";
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }

        %>
    <center>
        <%=result%>
        <form>
            <input type="hidden" name="check"/>
            <h1>TODO LIST</h1>
            sno<input name="sno" value="<%=sno%>" type="number">
            task<input name="task" value="<%=task%>" type="text">
            description<input name="description" value="<%=description%>" type="text">
            status<input name="status" value="<%=status%>" type="text">
            <br>
            <br>
            <input name="option" type="submit" value="submit"/>
            <input name="option" type="submit" value="delete"/>


        </form>
    </center>
</body>

</html>
