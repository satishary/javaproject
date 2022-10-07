

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
            
            String option="";
            
            
             
            String sno = "", task = "", description = "", status = "",result ="",delete ="";
            System.out.println(ispostback);


           if(ispostback)
               
        {
            try
            {
            sno=request.getParameter("sno");
          

            PreparedStatement ps=DbConnect.connect().prepareStatement("delete from todo where sno=?");
            ps.setString(1, sno);
          
                    int n=ps.executeUpdate();
                    result="Inserted " + n + " records";
            }
            catch(Exception ex)
            {
                System.out.println(ex);
                result=ex.getMessage();
            }
        }

        %>
    <center>
        <%=result%>
        <form>
            <input type="hidden" name="check"/>
            <h1>TODO LIST</h1>
            sno<input name="sno" value="<%=sno%>" type="number">
            <br>
            <br>
           <input name="option" type="submit" value="delete"/>

            
        </form>
    </center>
</body>

</html>
