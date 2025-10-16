<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="pat_header.jsp" %>
<div id="site_content"> 
  <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">
    
<h2 align="center">What Symptoms do you have?</h2>
<table border="2" align="center">


    <th>Id<th>Symptoms<th>Select your Symptoms
        <s:iterator id="beans" value="#request['list']">
        <tr>
           <td><s:property value="diseaseid"/></td>
            <td><s:property value="symptoms"/></td>
       <td>
                <s:url id="modurl" action="selectdis">
                    <s:param name="pid"><s:property value="diseaseid"/>
                    </s:param>
                </s:url>
                <s:a href="%{modurl}" onclick="return confirm('Are you sure these symptoms you have?')">Select
                </s:a>
            
            </td>
            </s:iterator>
            
            
</table>
</div></div>
  <%@include file="footer.jsp" %>