<%@ taglib uri="/struts-tags" prefix="s" %>
<%@include file="a_header.jsp" %>
 <%@include file="a_slider.jsp" %> 
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">

<h2 align="center">Modify Patient Details</h2>
<table border="2" align="center">
    <tr><td>


<s:actionmessage/>
<s:form action="modpatientAction" cssClass="form_settings">
  <s:textfield name="p_id" label="Patient Id" size="15" />
  <s:textfield name="p_name" label="Name" size="15" />
  <s:textfield name="age" label="Age" size="25" />
  <s:textfield name="sex" label="Sex" size="25" />

  <s:textarea name="address" label="Address" rows="4" cols="20"/> 
  <s:textfield name="p_cntry" label="Country" size="25" /> 
  <s:textfield name="p_sta" label="State" size="25" /> 
  <s:textfield name="p_cty" label="City" size="25" /> 
   <s:textfield name="p_contactno" label="Contact No" size="15"/>
   <s:textfield label="Email" name="email" size="25" />
    <s:textfield name="p_reg_date" label="Registration Date" size="15"/>
 <s:submit value="submit" align="center" cssClass="submit"/>
</s:form>
</table>
</div></div>
  <%@include file="a_footer.jsp" %>
       