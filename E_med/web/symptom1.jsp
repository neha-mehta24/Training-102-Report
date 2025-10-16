 <%@taglib prefix="s" uri="/struts-tags"%>

<%@include file="pat_header.jsp" %>
<div id="site_content">
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">
   
<h2 align="center">Symptom Matches With this disease</h2>
<table border="2" align="center">
    <tr><td>

<s:actionmessage/>
<s:form cssClass="form_settings">

  <s:textfield name="diseaseid" disabled="true" label="Disease Id" size="15" />
  <s:textfield name="diseasename" disabled="true" label="Disease Name" size="15" />
<s:textfield name="diseasekname" disabled="true" label="Disease Known Name" size="15" />
 
  <s:textarea name="description" disabled="true" label="Description" rows="4" cols="20" />

  <s:textfield name="lowerage" disabled="true" label="Lower Age Limit" size="25" />

   <s:textfield name="Upperage" disabled="true" label="Upper Age Limit" size="15"/>

  <s:textarea name="symptoms" disabled="true" label="Symptoms" rows="4" cols="20" />
  <s:textarea name="testrecommended" disabled="true" label="Test Recommended" rows="4" cols="20" />
    


</s:form>
    <tr><td><center>
         
                <s:url id="modurl" action="checkmed">
                    <s:param name="pid"><s:property value="diseaseid"/>
                    </s:param>
                </s:url>
                <s:a href="%{modurl}">Required Medicines
                </s:a>
            
        &nbsp;&nbsp;<a href="patient_home.jsp">Cancel</a></center>
</table>
</div></div>
  <%@include file="footer.jsp" %>
       