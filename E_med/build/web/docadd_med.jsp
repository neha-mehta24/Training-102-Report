<%@ taglib uri="/struts-tags" prefix="s" %>
<%@include file="doc_header.jsp" %>
 <%@include file="a_slider.jsp" %> 
  <link rel="stylesheet" type="text/css" href="mystyle.css" />
 
<div class="content2">


    <center><h2>Add Medicines</h2></center>

<table align="center" border="2"><tr><td>
<s:actionmessage/>
<s:form action="medicineAction" cssClass="form_settings">
<s:textfield name="med_id" label="Med Id" size="15" />
  <s:textfield name="abbrevation" label="Abbrevation" size="15" />
  <s:textfield name="medicine_name" label="Medicine Name" size="15" />
<s:textfield name="salt" label="Salt" size="15" />
  <s:textfield name="chemical_name" label="Chemical Name" size="25" />
 <s:textarea name="medicine_details" label="Medicine Details" rows="4" cols="20" />
 <s:submit value="submit" cssClass="submit" align="center"/>
</s:form>
</table>
</div>

  </div>
  <%@include file="a_footer.jsp" %>