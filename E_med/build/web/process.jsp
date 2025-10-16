 <%@page import="java.sql.*" %>
 
   <%
            mypack.conn  c1 = new mypack.conn();
    c1.stmt.executeUpdate("update appointment_master set status='processed' where appointment_id="+request.getParameter("appid"));
    response.sendRedirect("displayboard.jsp");
            
            %>