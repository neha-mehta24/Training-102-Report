<%@taglib prefix="s" uri="/struts-tags"%>
<%@include file="a_header.jsp" %>
 <%@include file="a_slider.jsp" %> 
  <div id="sidebar_container">
        <div class="sidebar">
        <img width="850" height="600" src="images/7.jpg" alt="photo_six" />  
        </div></div>
<div class="content" align="center">

<h2>Modify Department Details</h2>
<s:actionmessage/>
<table>
    <tr><td><s:form action="moddepartmentAction" cssClass="form_settings">
<s:textfield name="department_id" label="Department Id" size="15" />
<s:textfield name="department_name" label="Department Name" size="15" />
<s:textfield name="no_of_employees" label="No Of Employees" size="15" />
<s:textarea name="description" label="Description" rows="4" cols="20" />
    <tr><td><s:submit value="Submit" align="center" cssClass="submit"/>
    <tr>  <td> <s:a href="admin_home.jsp">Admin Home</s:a><s:a href="login.jsp">Login</s:a></td>        
</s:form>
    
</table>
</div></div>
  <%@include file="a_footer.jsp" %>