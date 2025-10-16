package mypack;

import java.util.*;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.*;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;

public class delpat extends ActionSupport implements ServletRequestAware
{
    private HttpServletRequest request;
    public void setServletRequest(HttpServletRequest request)
    {
        this.request=request;
    }
    public String execute()
    {
        return(SUCCESS);
    }
    public String del1()
    {
        ArrayList l1=new ArrayList();
        try
        {
            mypack.conn c1=new mypack.conn();
            ResultSet rs=c1.execute("Select * from patient_master");
            while(rs.next())
            {
                bean.patient p1=new bean.patient();
               p1.setP_id(rs.getString("patient_id"));
                p1.setP_name(rs.getString("patient_name"));
                p1.setAge(rs.getString("patient_age"));
                 p1.setSex(rs.getString("patient_sex"));
                p1.setAddress(rs.getString("patient_address"));
                 p1.setP_cntry(rs.getString("patient_country"));
                   p1.setP_sta(rs.getString("patient_state"));
                p1.setP_cty(rs.getString("patient_city"));
               
               
                p1.setP_contactno(rs.getString("patient_contact_no"));
                p1.setP_reg_date(rs.getString("patient_registration_date"));
                 p1.setEmail(rs.getString("patient_email_id"));
               
                
                l1.add(p1);
            }
            request.setAttribute("list", l1);
        }
        catch(Exception e){
        e.printStackTrace();}
        return(SUCCESS);
        
    }
    public String del2()
    {
        mypack.conn c1=new mypack.conn();
        try
        {
            c1.update("delete from patient_master where patient_id="+request.getParameter("pid"));
        }
        catch(Exception e)
        {
            
        }
        del1();
        return(SUCCESS);
        
    }
}
