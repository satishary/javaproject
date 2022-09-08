

<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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

            //String result="";
            int a = 0, b = 0, c = 0, result = 0;
            String option = "";

            if (ispostback) {
                option = request.getParameter("option");
                a = (Integer.parseInt(request.getParameter("a")));
                b = (Integer.parseInt(request.getParameter("b")));
                c = (Integer.parseInt(request.getParameter("c")));

                if (option.equals("max")) {
                    if (a >= b && a >= c) {
                        result = a;
                    } else if (b >= c) {
                        result = b;
                    } else {
                        result = c;
                    }
                }
                if (option.equals("min")) {
                    if (a <= b && a <= c) {
                        result = a;
                    } else if (b <= c) {
                        result = b;
                    } else {
                        result = c;
                    }

                }

            }


        %>
    <center>

        <form>
            <input type="hidden" name="check"/>
            <h1>Max and Min Number</h1>
            number 1 <input value="<%=a%>" name="a" type="number">
            number 2 <input value="<%=b%>" name="b" type="number">
            number 3 <input value="<%=c%>" name="c" type="number">
            Result<input readonly  value="<%=result%>"  type="number">

            <br>
            <br>
            <button name="option" value="max">max</button>
            <button name="option" value="min">min</button>

    </center>
</form>
</body>
</html>
