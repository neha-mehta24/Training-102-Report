package com.action;
import java.sql.*;
import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.ServletRequestAware;

public class LoginAction extends ActionSupport implements ServletRequestAware
{


	private HttpServletRequest request;

	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}
String username;
String password;
String u_id;
String fullname;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String execute()throws Exception
    {
        
        HttpSession session = request.getSession();
        session.setAttribute("user",username);
   
        try{ 
  mypack.conn c1=new mypack.conn();

                String q="select * from login where username='"+username+"'  and   password='"+password+"'" ;
                        ResultSet rs=c1.execute(q);
                       if( rs.next())
                       {
                        String p=rs.getString("password");
                            String j=rs.getString("fullname");
                        String t=rs.getString("type");
                        
                        String g=rs.getString("u_id");
                     
                   session.setAttribute("u_id",g);
                   
                           if(t.equals("admin"))
                        return SUCCESS;
                        if(t.equals("doctor"))
                            return LOGIN;
                          if(t.equals("patient"))
                              return ERROR;
                    }
                     else
                        {   this.addActionMessage("Invalid User");
                            return INPUT;
                        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return ERROR;
        }

return ERROR;
    }

}

