<%@ taglib uri="/struts-tags" prefix="s" %>
<%@include file="header.jsp" %>
<%@include file="slider.jsp" %>
<br><br><br>

   
<s:iterator id="plse" value="#request['plse']">

    <h1>Your Password Is: <s:property value="password" /></h1>
    </s:iterator>
<br>
<s:a href="login.jsp">Login Now</s:a>

</div>
</div>
<%@ include file="footer.jsp" %>