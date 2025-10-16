<%@ taglib prefix="s" uri="/struts-tags" %>

<%@include file="doc_header.jsp" %>
 <%@include file="a_slider.jsp" %> 
  <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">
    <br><br>
<h2 align="center">Appointment Details</h2>
<table border="2" align="center">



    <th>Patient Id<th>Visit Date<th>Visit Time<th>Patient Name<th>View Appointment<th>View Patient Details
        <s:iterator id="beans" value="#request['list']">
        <tr>
            <td><s:property value="patient_id"/></td>
             <td><s:property value="visit_date"/></td>
            <td><s:property value="visit_time"/></td>
            <td><s:property value="p_name"/></td>
              <td>
                <s:url id="modurl" action="appcl">
                    <s:param name="pid"><s:property value="patient_id"/>
                    </s:param>
                </s:url>
                <s:a href="%{modurl}">View Appointment
                </s:a>
            
            </td>
              <td>
                <s:url id="deleteurl" action="appc2">
                    <s:param name="pid"><s:property value="patient_id"/>
                    </s:param>
                </s:url>
                <s:a href="%{deleteurl}">View Patient Details
                </s:a>
            
            </td>
             </s:iterator>
            
        </tr>
       <tr><td colspan="6"><a href="doctor_home.jsp" ><center>Cancel</center></a></td></tr>
</table>
</div></div>

<%@include file="a_footer.jsp" %>