<%@ taglib uri="/struts-tags" prefix="s" %>

<%@include file="a_header.jsp" %>
 <div id="site_content">
      <div class="gallery">
        <img width="1050" height="250" src="images/2.jpg" />
      </div>
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
  
<div class="content2">

<h2><center>Add Doctor Details</center></h2>
<table align="center" border="2"><tr><td>
<s:actionmessage/>
<s:form action="doctorAction" cssClass="form_settings" align="center">

  <s:textfield name="doctor_id" label="Doctor Id" size="15" />
  
  
  <s:textfield name="doctor_name" label="Doctor Name" size="15" />
  <s:textarea name="doctor_address" label="Address" rows="4" cols="20" />
   <s:textfield name="doc_contact_no" label="Contact No" size="15"/>

  <s:textfield name="doc_email" label="Email" size="15" />
  <s:textfield name="department_id" label="Department Id" size="25" />
  <s:textfield name="spacialization" label="Spacialization" size="15" />
  
 
    
  <s:submit value="submit" cssClass="submit" align="center"/>

    </s:form></table>
</div>

</div>
  <%@include file="a_footer.jsp" %>