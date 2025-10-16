<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="pat_header.jsp" %>
<div id="site_content"> 
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">
    <br>
<h2 align="center">View & Cancel your Appointment</h2>
<table border="2" align="center">
   <th>Patient id<th>Doctor Name<th>Disease Diagnosed<th>Medicine Already Taking<th>Suitable Date<th>Cancel
        <s:iterator id="beans" value="#request['list']">
        <tr>
        
            <td><s:property value="p_id"/></td>
            <td><s:property value="doctorname"/></td>
             <td><s:property value="disease"/></td>
            <td><s:property value="medicine"/></td>
            <td><s:property value="suit_date"/></td>
          
           
           
            
            <td>
                <s:url id="deleteurl" action="cancelapp1">
                    <s:param name="pid"><s:property value="patient_id"/>
                    </s:param>
                </s:url>
                <s:a href="%{deleteurl}" onclick="return confirm('Do you want to delete?')">Cancel
                </s:a>
            
            </td>
            </s:iterator>
            
            
</table>
</div></div>
<br><br><br><br><br><br><br><br><br>
 <%@include file="footer.jsp" %>