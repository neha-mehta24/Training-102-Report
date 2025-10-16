<%@taglib prefix="s" uri="/struts-tags"%>
<%@include file="a_header.jsp" %>
<div id="site_content">
      <div class="gallery">
          <img width="1050" height="250" src="images/7.jpg"  />
       
      </div>
   <link rel="stylesheet" type="text/css" href="mystyle.css" />
 
<div class="content2">
<h2><center>Add Disease Details</center></h2>
<center><s:actionmessage/></center>
<table align="center" border="2">
    <tr><td>


<s:form action="diseaseAction" cssClass="form_settings">

  <s:textfield name="diseaseid" label="Disease Id" size="15" />
  <s:textfield name="diseasename" label="Disease Name" size="15" />
<s:textfield name="diseasekname" label="Disease Known Name" size="15" />
 
  <s:textarea name="description" label="Description" rows="4" cols="20" />

  <s:textfield name="lowerage" label="Lower Age Limit" size="25" />

   <s:textfield name="Upperage" label="Upper Age Limit" size="15"/>

  <s:textarea name="symptoms" label="Symptoms" rows="4" cols="20" />
  <s:textarea name="testrecommended" label="Test Recommended" rows="4" cols="20" />
    
  <s:submit value="submit" align="center" cssClass="submit"/>

</s:form>
</table>
</div>
 
</div>
  <%@include file="a_footer.jsp" %>
       