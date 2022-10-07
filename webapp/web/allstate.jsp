

<%@page import="java.sql.ResultSet"%>
<%@page import="database.DbConnect"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All States</title>
    </head>
    <body>
    <center>
        <h1>All States</h1>
        <%
            PreparedStatement ps = DbConnect.connect().prepareStatement("select * from State order by Statename desc");
            ResultSet rs = ps.executeQuery();

        %>
        <table border="1">
            <tr><th>State Name</th><th>Show District</th></tr>
                    <%                        while (rs.next()) {
                            String Stateno = "" + rs.getObject("Stateno");
                            String Statename = "" + rs.getObject("Statename");
                    %>
            <tr><td><%=Statename%></td><td><a href="showdistrict.jsp?Stateno=<%=Stateno%>" target="District">Show</a></td></tr>

            <%
                }
            %>
        </table>
    </center>
</body>
</html>
