<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="a_header.jsp" %>
 <%@include file="a_slider.jsp" %> 
  <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">
    <br><br>
<h2 align="center">Delete Department Details</h2>
<table border="2" align="center">
    <th>Id<th>Name<th>No. Of Employees<th>Description<th>Delete
        <s:iterator id="beans" value="#request['list']">
        <tr>
            <td><s:property value="department_id"/></td>
            <td><s:property value="department_name"/></td>
            <td><s:property value="no_of_employees"/></td>
            <td><s:property value="description"/></td>
            <td>
                <s:url id="deleteurl" action="deldepartment1">
                    <s:param name="pid"><s:property value="department_id"/>
                    </s:param>
                </s:url>
                <s:a href="%{deleteurl}" onclick="return confirm('Do you want to delete?')">Delete
                </s:a>
            
            </td>
            </s:iterator>
            
            
</table>
</div>
 </div>
<%@include file="a_footer.jsp" %>