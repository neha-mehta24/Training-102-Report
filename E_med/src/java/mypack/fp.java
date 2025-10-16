/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;
 import com.opensymphony.xwork2.ActionSupport;
 import java.sql.*;
import java.util.ArrayList;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.*;
/**
 *
 * @author Nidhi
 */
public class fp extends ActionSupport implements ServletRequestAware
{
private HttpServletRequest request;
     public void setServletRequest(HttpServletRequest request) {
		this.request = request;}

private String username;
private String ques;

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
public String execute()
{
    mypack.conn c1=new mypack.conn();
    try{
     ResultSet rs = c1.execute("select s_ques from login where username='"+request.getParameter("username")+"'");
      ArrayList l2 = new ArrayList();
      while(rs.next())
      {
                bean.login p1 = new bean.login();
        String p=rs.getString("s_ques");
        p1.setQues(p);
        System.out.println(p);
        System.out.println(p1);

       
 // this.sque=p1.getSque();
l2.add(p1);
      }

      request.setAttribute("que", l2);
      return(SUCCESS);
   }catch(Exception e){e.printStackTrace();return ERROR;}

}
}

