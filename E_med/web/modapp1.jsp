<%@taglib prefix="s" uri="/struts-tags"%>

<%@include file="a_header.jsp" %>
 <%@include file="a_slider.jsp" %> 
  <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">
    
<h2 align="center">Modify Appointment Details</h2>
<table border="2" align="center">
    <tr><td>


<s:actionmessage/>

<s:form action="modappointmentAction" cssClass="form_settings">

  <s:textfield name="appointment_id" label="Appointment Id" size="15" />
  
<s:textfield name="patient_id" label="Patient Id" size="15" />

<s:textfield name="doctor_id" label="Doctor Id" size="15" />
 
 

  <s:textfield name="visit_date" label="Visit Date" size="25" />

   <s:textfield name="visit_time" label="Visit Time" size="15"/>
    <s:textarea name="description_test" label="Description Test" rows="4" cols="20" />

  <s:textarea name="result" label="Result" rows="4" cols="20" />
   <s:textfield name="status" label="Status" size="25" />
   <s:submit value="submit" cssClass="submit" align="center"/>

</s:form>
</table>
</div></div>
  <%@include file="a_footer.jsp" %>