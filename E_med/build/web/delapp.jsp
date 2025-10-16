<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="a_header.jsp" %>
 <%@include file="a_slider.jsp" %> 
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">
    <br>
<h2 align="center">Delete Appointment Details</h2>
<table border="2" align="center">
    <th>Id<th>Patient id<th>Doctor Id<th>Visit Date<th>Visit Time<th>Description Test<th>Result<th>Status<th>delete
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
           
           
            
            <td>
                <s:url id="deleteurl" action="delapp1">
                    <s:param name="pid"><s:property value="appointment_id"/>
                    </s:param>
                </s:url>
                <s:a href="%{deleteurl}" onclick="return confirm('Do you want to delete?')">Delete
                </s:a>
            
            </td>
            </s:iterator>
            
            
</table>
</div></div>
<%@include file="a_footer.jsp" %>