<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="a_header.jsp" %>
 <div id="site_content">
      <div class="gallery">
          <img width="1050" height="250" src="images/7.jpg"  />
       
      </div>
  <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">
    
<h2 align="center">Modify Disease Details</h2>
<table border="2" align="center">


    <th>Id<th>Name<th>Disease Known Name<th>description<th>lower Age<th>Upper Age<th>Symptoms<th>Test Recommended<th>Modify
        <s:iterator id="beans" value="#request['list']">
        <tr>
            <td><s:property value="diseaseid"/></td>
            <td><s:property value="diseasename"/></td>
            <td><s:property value="diseasekname"/></td>
             <td><s:property value="description"/></td>
            <td><s:property value="lowerage"/></td>
            <td><s:property value="Upperage"/></td>
            <td><s:property value="symptoms"/></td>
            <td><s:property value="testrecommended"/></td>
           
           
            
            <td>
                <s:url id="modurl" action="moddis1">
                    <s:param name="pid"><s:property value="diseaseid"/>
                    </s:param>
                </s:url>
                <s:a href="%{modurl}" onclick="return confirm('Do you want to Modify?')">Modify
                </s:a>
            
            </td>
            </s:iterator>
            
            
</table>
</div></div>
  <%@include file="a_footer.jsp" %>