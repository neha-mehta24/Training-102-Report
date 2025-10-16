<%@ taglib uri="/struts-tags" prefix="s" %>
<%@include file="a_header.jsp" %>
 <%@include file="a_slider.jsp" %> 
  <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">
  
<h2 align="center">Modify Medicine Details</h2>
<h3 align="center"><s:actionmessage/></h3>
<table border="2" align="center">
    <tr><td>



<s:form action="modmedicineAction" cssClass="form_settings">
<s:textfield name="med_id" label="Med Id" size="15" />
  <s:textfield name="abbrevation" label="Abbrevation" size="15" />
  <s:textfield name="medicine_name" label="Medicine Name" size="15" />
<s:textfield name="salt" label="Salt" size="15" />
  <s:textfield name="chemical_name" label="Chemical Name" size="25" />
 <s:textarea name="medicine_details" label="Medicine Details" rows="4" cols="20" />
  <s:submit value="submit" align="center" cssClass="submit"/>
          

</s:form>
   
</table>
</div></div>
  <%@include file="a_footer.jsp" %>