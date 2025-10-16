/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.*;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class SQu extends ActionSupport implements ServletRequestAware{
private HttpServletRequest request;
     public void setServletRequest(HttpServletRequest request) {

         this.request = request;}
     private String answer;
     private String username;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
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
      try
      {
          ResultSet rs=c1.execute("select * from login where username='"+username+"' and s_ans='"+answer+"'");
        ArrayList l1=new ArrayList();
        while(rs.next())
        {
           bean.login p1 = new bean.login();
           p1.setPassword(rs.getString("password"));
           l1.add(p1);
        }
     request.setAttribute("plse", l1);
     return SUCCESS;
}
      catch(Exception e){e.printStackTrace();
      return ERROR;
      }}
      }
