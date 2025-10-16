<%@ taglib uri="/struts-tags" prefix="s" %>
<%@include file="header.jsp" %>
<div id="site_content">
      <div class="gallery">
        <img width="1050" height="250" src="images/fp.jpg" />
      </div> 
<br>
<div class="content2">
<table align="center"><tr><td>
            <h1 align="center">Forgot Password</h1>
    <tr><td>
<s:form action="SQ" cssClass="form_settings">
    <center>
    <s:textfield name="username" label="Username"/><br>
<s:iterator id="que" value="#request['que']">

    <h3>Your Security Question is: <s:property value="ques" /></h3?
    </s:iterator>
<br>
    <s:textfield name="answer" label="Security Answer"/>
    <s:submit align="center" cssClass="submit"/>
</s:form>
    </center>
</table>
 </div>
    </div>
<%@ include file="footer.jsp" %>