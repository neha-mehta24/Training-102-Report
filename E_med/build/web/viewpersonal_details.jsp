<%@ taglib uri="/struts-tags" prefix="s" %>
<%@include file="doc_header.jsp" %>
 <div id="site_content">
      <div class="gallery">
        <img width="1050" height="250" src="images/2.jpg" />
      </div>
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">

<h2 align="center">View Personal Details</h2>
<table border="2" align="center">
    <tr><td>


<s:actionmessage/>


<s:form  cssClass="form_settings">

  <s:textfield name="doctor_id" disabled="true"  label="Doctor Id" size="15" />
 <s:textfield name="doctor_name" disabled="true"  label="Name" size="15" />
  <s:textarea name="doctor_address" disabled="true"  label="Address" rows="4" cols="20" />
   <s:textfield name="doc_contact_no" disabled="true"  label="Contact No" size="15"/>
  <s:textfield name="doc_email" disabled="true" label="Email" size="15" />
 <s:textfield name="department_id" disabled="true" label="Department Id" size="25" />
<s:textfield name="spacialization" disabled="true" label="Spacialization" size="15" />


</s:form>
    <tr><td><center>
                <s:url id="modurl" action="editdoc1">
                    <s:param name="pid"><s:property value="doctor_id"/>
                    </s:param>
                </s:url>
                <s:a href="%{modurl}">Edit Details
                </s:a>
            
                &nbsp;&nbsp;       
        <a href="doctor_home.jsp">Cancel</a>
    </center></td>
     
    </tr>
</table>
</div></div>
  <%@include file="footer.jsp" %>
       