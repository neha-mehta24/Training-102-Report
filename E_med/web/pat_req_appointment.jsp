<%@ taglib uri="/struts-tags" prefix="s" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>

<sx:head/>

<%@include file="pat_header.jsp" %>
  

<div id="site_content">
      
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
 
<div class="content2">
<h2><center>Request Appointment For Surgery</center></h2>
<table align="center" border="2"><tr><td>
<s:actionmessage/>


<s:form action="apaction" cssClass="form_settings">
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  Welcome <s:property value="#session['user']" default="unknown"/>!
   Your  Patient Id <s:property value="#session['u_id']" />
    
   <s:textfield name="disease" label="Disease" size="25" /> 
<s:textfield name="medicine" label="Medicine Already Taking" size="25" />

    <sx:datetimepicker name="suit_date" 
     label="Appointment" adjustWeeks="true" 
     displayFormat="dd-MM-yyyy" 
     toggleType="wipe"/>

 <s:submit value="Request App." cssClass="submit" align="center"/>
</s:form>
</table>
</div>

</div>
  <%@include file="footer.jsp" %>
       
