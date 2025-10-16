<%@ taglib prefix="s" uri="/struts-tags" %>
 <%@page import="java.sql.*" %>

 <%@include file="pat_header.jsp" %>
  

 <div class="content2">
    <br>
    <h2 align="center"><marquee>Display Board</marquee></h2>
<table border="2" align="center">
    <th>Appointment Id<th>Patient id<th>Disease<th>Token No<th>Process
        <%
            mypack.conn  c1 = new mypack.conn();
            ResultSet rs = c1.stmt.executeQuery("select * from appointment_master order by token_no");
            int i=1;
          while(rs.next())
          {
              String appid = rs.getString(1);
              String st = rs.getString(7);
              if(st.equals("processed"))
                  out.println("<tr style=background-color:red>");
              else
             out.println("<tr>");
              out.println("<td>"+appid);
                 out.println("<td>"+rs.getString(2));
                 out.println("<td>"+rs.getString(3));
                  out.println("<td>"+rs.getString(6));
                if(st.equals("processed"))
                  out.println("<td><font color=red>COMPLETED</font>");
        else    
                out.println("<td><a href=process.jsp?appid="+appid+">Process</a>");
            out.print("</tr>");
              
          }
            
            %>
            
            
</table>
</div></div>
<%@include file="a_footer.jsp" %>