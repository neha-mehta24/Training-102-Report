<link rel="stylesheet" type="text/css" href="css/style.css" />
<%
session.removeAttribute("username");
session.removeAttribute("password");
session.invalidate();
%>

<a href="login.jsp"><h1 align="center">Back to Login</h1></a>
<script language="javascript">
 window.location="./login.jsp";
 </script>