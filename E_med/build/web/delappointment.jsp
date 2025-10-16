 <%@page import="java.sql.*" %>
 
   <%
            mypack.conn  c1 = new mypack.conn();
    c1.stmt.executeUpdate("delete from patient_medicine_disease where patient_id="+request.getParameter("pid"));
    response.sendRedirect("appointment_requests.jsp");
            
            %>