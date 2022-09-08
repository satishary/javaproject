
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <center><title>Test JSP</title>
    </head>
    <body>
        <%
            String check = request.getParameter("check");
            //System.out.println(check);
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }
            int a = 0, b = 0, result = 0;
            String option = "";

            if (ispostback) {
                option = request.getParameter("option");
                a = (Integer.parseInt(request.getParameter("a")));
                b = (Integer.parseInt(request.getParameter("b")));
                if (option.equals("Addition")) {
                    result = a + b;
                }
                if (option.equals("Subtract")) {
                    result = a - b;
                }

                if (option.equals("Divide")) {
                    result = a % b;
                }
                if (option.equals("Multiplication")) {
                    result = a * b;
                }

            }


        %>
        <h1>Calculations</h1>
        <form>
            <input value="1" type="hidden" name="check">
            N1<input value="<%=a%>" name="a" type="number">
            N2<input  value="<%=b%>"  name="b" type="number">
            Result<input readonly  value="<%=result%>"  type="number">
            <br>
            <br>
            <br>
            <input name="option" type="submit" value="Addition"/>
            <input name="option" type="submit" value="Subtract"/>
            <input name="option" type="submit" value="Divide"/>
            <input name="option" type="submit" value="Multiplication"/>
        </form>
    </body>
</html>
