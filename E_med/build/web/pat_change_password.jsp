
<%@taglib prefix="s" uri="/struts-tags"%>
<%@include file="pat_header.jsp" %>
 <div id="site_content"> 
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
  
<div class="content2">
    <center><h2>Change Password</h2></center>
<table border="2" align="center">
    <tr><td>

<s:actionmessage/>
<s:form action="changepasswordAction" cssClass="form_settings">
 
    <s:textfield name="username" label="Username" size="15"/>
    <s:password name="password" label="Old Password" size="15"/>
    <s:password name="npass" label="New Password" size="15"/>
    <s:password name="c_password" label="Confirm Password" size="15"/>
    <s:submit value="Change Password" align="center" cssClass="submit"/>
</s:form>
</table>
</div>
 
 </div>
  <%@include file="footer.jsp" %>