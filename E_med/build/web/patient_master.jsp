<%@ taglib uri="/struts-tags" prefix="s" %>
<%@include file="a_header.jsp" %>
  <div id="site_content">
      <div class="gallery">
          <img width="1050" height="250" src="images/3.jpg"  />
       
      </div>
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
 
<div class="content2">
<h2><center>Add Patient Details</center></h2>
<table align="center" border="2"><tr><td>
<s:actionmessage/>
<s:form action="patientAction" cssClass="form_settings">
    <s:textfield name="p_id" label="Patient Id" size="15" />
  <s:textfield name="p_name" label="Name" size="25" />
  <s:textfield name="age" label="Age" size="25" />
  <s:select name="sex" label="Sex" list="{'Male','Female'}"/>
<s:textarea name="address" label="Address" rows="4" cols="20"/> 
  <s:textfield name="p_cntry" label="Country" size="25" /> 
  <s:textfield name="p_sta" label="State" size="25" /> 
  <s:textfield name="p_cty" label="City" size="25" /> 
   <s:textfield name="p_contactno" label="Contact No" size="25"/>
   <s:textfield label="Email" name="email" size="25" />
    <s:textfield name="p_reg_date" label="Registration Date" size="15"/>
 <s:submit value="submit" cssClass="submit" align="center"/>
</s:form>
</table>
</div>

</div>
  <%@include file="a_footer.jsp" %>
       