<%
    session.removeAttribute("username");
    response.sendRedirect("check.jsp");
%>