<%@ taglib uri="/struts-tags" prefix="s" %>
<%@include file="doc_header.jsp" %>
 <%@include file="a_slider.jsp" %> 
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">

<h2 align="center">View Patient</h2>
<table border="2" align="center">
    <tr><td>


<s:actionmessage/>
<s:form cssClass="form_settings">
  <s:textfield name="p_id" label="Patient Id" size="15" />
  <s:textfield name="p_name" label="Name" size="15" />
  <s:textfield name="age" label="Age" size="25" />
  <s:textfield name="sex" label="Sex" size="25" />
  <s:textfield name="p_reg_date" label="Registration Date" size="15"/>
   <s:textfield name="disease" label="Disease Name" size="15" />
    <s:textfield name="doctor_name" label="Doctor Name" size="15" />
  <s:textfield name="visit_date" label="Visit Date" size="25" />

   <s:textfield name="visit_time" label="Visit Time" size="15"/>
  <s:textarea name="medicinename" label="Medicine Name" rows="4" cols="20" />
</s:form>
    <tr><td><center><a href="doctor_home.jsp">Cancel</a></center></td></tr>
</table>
</div></div>
  <%@include file="a_footer.jsp" %>
       
  