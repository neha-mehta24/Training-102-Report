<%@ taglib uri="/struts-tags" prefix="s" %>
<%@include file="pat_header.jsp" %>
  <div id="site_content">
      
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
 
<div class="content2">
    <br>
<h2 align="center">Delete Appointment Details</h2>
<table border="2" align="center">
    <th>Id<th>Patient id<th>Doctor Id<th>Visit Date<th>Visit Time<th>Description Test<th>Result<th>Status
        <s:iterator id="beans" value="#request['list']">
        <tr>
            <td><s:property value="appointment_id"/></td>
            <td><s:property value="patient_id"/></td>
            <td><s:property value="doctor_id"/></td>
             <td><s:property value="visit_date"/></td>
            <td><s:property value="visit_time"/></td>
            <td><s:property value="description_test"/></td>
            <td><s:property value="result"/></td>
            <td><s:property value="status"/></td>
           
           
            
          
            </s:iterator>
            
            
</table>
</div></div>
 <%@include file="footer.jsp" %>
       
