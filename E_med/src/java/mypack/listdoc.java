/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

/**
 *
 * @author Nidhi Jain
 */
import java.util.ArrayList;
import java.util.Map;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.*;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
public class listdoc extends ActionSupport implements ServletRequestAware
{
private HttpServletRequest request;
public void setServletRequest(HttpServletRequest request){
        this.request=request;
         }
    public String execute()
    {
        return(SUCCESS);
          }
    public String mod1()
    {
        ArrayList l1=new ArrayList();
        try{
             mypack.conn c1=new mypack.conn();
            ResultSet rs=c1.execute("Select * from doctor_master");
            while(rs.next())
            {
                bean.doctor p1=new bean.doctor();
             
                p1.setDoctor_name(rs.getString("doctor_name"));
                p1.setSpacialization(rs.getString("spacialization"));
             
                 p1.setDoc_contact_no(rs.getString("doctor_contact_no"));
                p1.setDoc_email(rs.getString("doctor_email_id"));
               
                
                l1.add(p1);
            }
            request.setAttribute("list", l1);
        }catch(Exception e){}
        return(SUCCESS);
    }
   }


