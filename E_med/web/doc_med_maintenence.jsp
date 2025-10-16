<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="doc_header.jsp" %>
 <%@include file="a_slider.jsp" %> 
  <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">
    <br><br>
<h2 align="center">Medicine Patient Details</h2>
<table border="2" align="center">



    <th>Patient Id<th>Patient Name<th>Edit Patient<th>View Patient<th>Add New Medicine
        <s:iterator id="beans" value="#request['list']">
        <tr>
            <td><s:property value="p_id"/></td>
            <td><s:property value="p_name"/></td>

          
             
           
            
            <td>
                <s:url id="modurl" action="modpat2">
                    <s:param name="pid"><s:property value="p_id"/>
                    </s:param>
                </s:url>
                <s:a href="%{modurl}" onclick="return confirm('Do you want to modify?')">Edit
                </s:a>
            
            </td>
            <td>
                 <s:url id="deleteurl" action="modpat8">
                    <s:param name="pid"><s:property value="p_id"/>
                    </s:param>
                </s:url>
                <s:a href="%{deleteurl}">View
                </s:a>
            </td>
            <td><a href="docadd_med.jsp">Add New Medicine</a> </td>
            </s:iterator>
        <tr> <td colspan="5"><a href="doctor_home.jsp"><center>cancel</center></a></td></tr>  
            
</table>

</div></div>
  <%@include file="a_footer.jsp" %>