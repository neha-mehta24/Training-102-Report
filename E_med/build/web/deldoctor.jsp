<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="a_header.jsp" %>
  <div id="site_content">
      <div class="gallery">
        <img width="1050" height="250" src="images/2.jpg" />
      </div>
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">
    <br><br>
<h2 align="center">Delete Doctor Details</h2>
<table border="2" align="center">

    <th>Id<th>Name<th>specialization<th>department id<th>address<th>contact no<th>email<th>Delete
        <s:iterator id="beans" value="#request['list']">
        <tr>
            <td><s:property value="doctor_id"/></td>
            <td><s:property value="doctor_name"/></td>
            <td><s:property value="spacialization"/></td>
             <td><s:property value="department_id"/></td>
            <td><s:property value="doctor_address"/></td>
            <td><s:property value="doc_contact_no"/></td>
            <td><s:property value="doc_email"/></td>
           
            
            <td>
                <s:url id="deleteurl" action="deldoctor1">
                    <s:param name="pid"><s:property value="doctor_id"/>
                    </s:param>
                </s:url>
                <s:a href="%{deleteurl}" onclick="return confirm('Do you want to delete?')">Delete
                </s:a>
            
            </td>
            </s:iterator>
            
            
</table>
</div></div>
<%@include file="a_footer.jsp" %>