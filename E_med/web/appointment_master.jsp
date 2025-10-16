<%@taglib prefix="s" uri="/struts-tags"%>
<%@include file="a_header.html" %>
 <%@include file="a_slider.html" %> 
  <link rel="stylesheet" type="text/css" href="mystyle.css" />
  
<div class="content2">
    <center><h2>Add Appointment Details</h2></center>
    <table align="center" border="2"><tr><td>
<s:actionmessage/>

<s:form action="appointmentAction" cssClass="form_settings" align="center">

  <s:textfield name="appointment_id" label="Appointment Id" size="15" />
  
<s:textfield name="patient_id" label="Patient Id" size="15" />
<s:textfield name="disease" label="Disease" size="15" />

 <s:select name="emergency_level" label="Emergency Level" list="{'Emergent', 'Urgent', 'Less Urgent','Non Urgent'}"/>

  <s:textfield name="suit_date" label="Visit Date" size="25" />
   <s:submit value="submit" cssClass="submit" align="center"/>

</s:form>
    </table>
</div>
  
  </div>
  <%@include file="a_footer.html" %>