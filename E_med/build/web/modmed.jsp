<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="a_header.jsp" %>
 <%@include file="a_slider.jsp" %> 
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">
   
<h2 align="center">Modify Medicine Details</h2>
<table border="2" align="center">


    <th>Id<th>Abbrevation<th>Medicine Name<th>Salt<th>Chemical Name<th>Medicine Details<th>Modify
        <s:iterator id="beans" value="#request['list']">
        <tr>
           <td><s:property value="med_id"/></td>
            <td><s:property value="abbrevation"/></td>
            <td><s:property value="medicine_name"/></td>
            <td><s:property value="salt"/></td>
            <td><s:property value="chemical_name"/></td>
            <td><s:property value="medicine_details"/></td>
            <td>
                <s:url id="modurl" action="modmedicine1">
                    <s:param name="pid"><s:property value="med_id"/>
                    </s:param>
                </s:url>
                <s:a href="%{modurl}" onclick="return confirm('Do you want to modify?')">modify
                </s:a>
            
            </td>
            </s:iterator>
            
            
</table>
</div></div>
  <%@include file="a_footer.jsp" %>