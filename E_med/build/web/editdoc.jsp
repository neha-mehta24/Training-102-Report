<%@ taglib uri="/struts-tags" prefix="s" %>
<%@include file="doc_header.jsp" %>
<div id="site_content">
      <div class="gallery">
        <img width="1050" height="250" src="images/2.jpg" />
      </div>
  <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">
   
<h2 align="center">Modify Doctor Details</h2>
<table border="2" align="center">
    <tr><td>


<s:actionmessage/>
<s:form action="editdoc" cssClass="form_settings">

  <s:textfield name="doctor_id" label="Doctor Id" size="15" />
  
  
  <s:textfield name="doctor_name" label="Doctor Name" size="15" />
  <s:textarea name="doctor_address" label="Address" rows="4" cols="20" />
   <s:textfield name="doc_contact_no" label="Contact No" size="15"/>

  <s:textfield name="doc_email" label="Email" size="15" />
  <s:textfield name="department_id" label="Department Id" size="25" />
  <s:textfield name="spacialization" label="Spacialization" size="15" />
  
 
    
  <s:submit value="submit" align="center" cssClass="submit"/>

</s:form>
</table>
</div></div>

  <%@include file="footer.jsp" %>