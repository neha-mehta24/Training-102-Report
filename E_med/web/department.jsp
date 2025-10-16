<%@taglib prefix="s" uri="/struts-tags"%>
<%@include file="a_header.jsp" %>
 <%@include file="a_slider.jsp" %> 
  <link rel="stylesheet" type="text/css" href="mystyle.css" />
 
<div class="content2">
    <center><h2>Add Department Details</h2>
<s:actionmessage/></center>
<table align="center" border="2">
    <tr><td>
            <s:form action="departmentAction" cssClass="form_settings">
<s:textfield name="department_id" label="Department Id" size="15" />
<s:textfield name="department_name" label="Department Name" size="15" />
<s:textfield name="no_of_employees" label="No Of Employees" size="15" />
<s:textarea name="description" label="Description" rows="4" cols="20" />
<s:submit value="Submit" align="center" cssClass="submit"/>
</s:form>
</table>
</div>

</div>
  <%@include file="a_footer.jsp" %>