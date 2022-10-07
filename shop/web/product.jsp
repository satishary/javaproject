

<%@page import="java.sql.PreparedStatement"%>
<%@page import="database.DbConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Management</title>
    </head>
    <body>
    <center>
        <h1>Products</h1>
        <%

            String check = request.getParameter("check");
            String option = "";
            boolean ispostback;
            if (check == null) {
                ispostback = false;
            } else {
                ispostback = true;
            }

            String productid = "", productname = "", price = "", description = "", discount = "", measurement = "", productcategory = "", result = "";
            System.out.println(ispostback);

            if (ispostback) {
                try {
                    option = request.getParameter("option");
                    if (option.equals("Submit")) {
                        productid = request.getParameter("productid");
                        productname = request.getParameter("productname");
                        price = request.getParameter("price");
                        description = request.getParameter("description");
                        discount = request.getParameter("discount");
                        measurement = request.getParameter("measurement");
                        productcategory = request.getParameter("productcategory");

                        PreparedStatement ps = DbConnect.connect().prepareStatement("insert into products values(?,?,?,?,?,?,?)");
                        ps.setString(1, productid);
                        ps.setString(2, productname);
                        ps.setString(3, price);
                        ps.setString(4, description);
                        ps.setString(5, discount);
                        ps.setString(6, measurement);
                        ps.setString(7, productcategory);

                        int n = ps.executeUpdate();
                        result = "Inserted " + n + " records";
                    }
                } catch (Exception ex) {
                    System.out.println(ex);
                    result = ex.getMessage();
                }
            }

        %>
        <%=result%>
        <form method="post">
            <input type="hidden" name="check" value="1">

            productid<input name="productid" value="<%=productid%>" type="text">
            <br>
            <br>
            productname<input name="productname" value="<%=productname%>" type="text">
            <br>
            <br>
            price<input name="price" value="<%=price%>" type="number">
            <br>
            <br>
            description<input name="description" value="<%=description%>" type="text">
            <br>
            <br>
            discount<input name="discount"value="<%=discount%>" type="number">
            <br>
            <br>
            Measurement<input name="measurement" value="<%=measurement%>" type="text">
            <br>
            <br>
            Product Category<input name="productcategory" value="<%=productcategory%>" type="text">
            <br>
            <br>
            <input name="option" type="submit">

            <input name="option" type="submit" value="Clear">


        </form>
    </center>
</body>
</html>
