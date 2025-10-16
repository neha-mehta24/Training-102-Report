 <%@page import="java.sql.*" %>
 
   <%
            mypack.conn  c1 = new mypack.conn();
    c1.stmt.executeUpdate("delete from appointment_master");
   
    response.sendRedirect("admin_home.jsp");
            
            %>