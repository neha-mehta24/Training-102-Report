<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="header.jsp" %>
 <%@include file="slider.jsp" %> 
  
<div class="content">
  
<h2 align="center">Doctor List</h2>
<table border="2" align="center">


    <th>Doctor Name<th>Specialization<th>Contact no<th>Email<th>Request Appointment
        <s:iterator id="beans" value="#request['list']">
        <tr>
           
            <td><s:property value="doctor_name"/></td>
            <td><s:property value="spacialization"/></td>        
            <td><s:property value="doc_contact_no"/></td>
            <td><s:property value="doc_email"/></td>
           
            
            <td>
                <a href="login.jsp">Request Appointment</a>
            </td>
            </s:iterator>
            
            
</table>
</div></div>
  <%@include file="footer.jsp" %>