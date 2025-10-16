<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="a_header.jsp" %>
 <%@include file="a_slider.jsp" %> 
  <link rel="stylesheet" type="text/css" href="mystyle.css" />
<div class="content2">
    <br><br>
<h2 align="center">Modify Patient Details</h2>
<table border="2" align="center">



    <th>Id<th>Name<th>Age<th>Sex<th>Address<th>Country<th>State<th>City<th>Contact no<th>Email<th>Registeration Date<th>Modify
        <s:iterator id="beans" value="#request['list']">
        <tr>
            <td><s:property value="p_id"/></td>
            <td><s:property value="p_name"/></td>
            <td><s:property value="age"/></td>
             <td><s:property value="sex"/></td>
            <td><s:property value="address"/></td>
            <td><s:property value="p_cntry"/></td>
            <td><s:property value="p_sta"/></td>
            <td><s:property value="p_cty"/></td>
            <td><s:property value="p_contactno"/></td>
               <td><s:property value="Email"/></td>
             <td><s:property value="p_reg_date"/></td>
          
             
           
            
            <td>
                <s:url id="modurl" action="modpat1">
                    <s:param name="pid"><s:property value="p_id"/>
                    </s:param>
                </s:url>
                <s:a href="%{modurl}" onclick="return confirm('Do you want to modify?')">Modify
                </s:a>
            
            </td>
            </s:iterator>
            
            
</table>
</div></div>
  <%@include file="a_footer.jsp" %>