<%@ taglib uri="/struts-tags" prefix="s" %>
<%@include file="pat_header.jsp" %>

<div id="site_content">
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">

<h2 align="center">Personal Details</h2>
<table border="2" align="center">
    <tr><td>


<s:actionmessage/>
<s:form  cssClass="form_settings">
  <s:textfield name="p_id" label="Patient Id" size="15" />
  <s:textfield name="p_name" label="Name" size="15" />
  <s:textfield name="age" label="Age" size="25" />
  <s:textfield name="sex" label="Sex" size="25" />

  <s:textarea name="address" label="Address" rows="4" cols="20"/> 
  <s:textfield name="p_cntry" label="Country" size="25" /> 
  <s:textfield name="p_sta" label="State" size="25" /> 
  <s:textfield name="p_cty" label="City" size="25" /> 
   <s:textfield name="p_contactno" label="Contact No" size="15"/>
   <s:textfield label="Email" name="email" size="25" />
    <s:textfield name="p_reg_date" label="Registration Date" size="15"/>

</s:form>
<tr> <td colspan="5">
<center>
                <s:url id="modurl" action="editpat1">
                    <s:param name="pid"><s:property value="p_id"/>
                    </s:param>
                </s:url>
                <s:a href="%{modurl}">Edit Details
                </s:a>
                &nbsp;&nbsp;&nbsp;
            <a href="patient_home.jsp">cancel</a>
</center>
</td>
</tr> 
</table>

</div></div>

  <%@include file="a_footer.jsp" %>
       