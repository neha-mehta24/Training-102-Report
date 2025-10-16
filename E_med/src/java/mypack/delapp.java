package mypack;

import java.util.*;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.*;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;

public class delapp extends ActionSupport implements ServletRequestAware
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
            ResultSet rs=c1.execute("Select * from appointment_master");
            while(rs.next())
            {
                bean.appointment p1=new bean.appointment();
               p1.setAppointment_id(rs.getString("appointment_id"));
                p1.setDoctor_id(rs.getString("doctor_id"));
                p1.setPatient_id(rs.getString("patient_id"));
                 p1.setVisit_date(rs.getString("visit_date"));
                p1.setVisit_time(rs.getString("visit_time"));
                 p1.setDescription_test(rs.getString("description_test"));
                p1.setResult(rs.getString("result"));
                 p1.setStatus(rs.getString("status"));
               
                
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
            c1.update("delete from appointment_master where appointment_id="+request.getParameter("pid"));
        }
        catch(Exception e)
        {
            
        }
        del1();
        return(SUCCESS);
        
    }
    
    
    public String view1()
    {
        ArrayList l1=new ArrayList();
        try
        {
            mypack.conn c1=new mypack.conn();
            HttpSession hs = request.getSession(true);
            String pid = (String)hs.getAttribute("u_id");
   ResultSet rs=c1.execute("Select * from appointment_master where patient_id='"+pid+"'");
            while(rs.next())
            {
                bean.appointment p1=new bean.appointment();
               p1.setAppointment_id(rs.getString("appointment_id"));
                   p1.setPatient_id(rs.getString("patient_id"));
                 p1.setVisit_date(rs.getString("suit_date"));
                p1.setVisit_time(rs.getString("disease"));
                 p1.setDescription_test(rs.getString("token_no"));
                   p1.setStatus(rs.getString("status"));
               
                
                l1.add(p1);
            }
            request.setAttribute("list", l1);
        }
        catch(Exception e){
        e.printStackTrace();}
        return(SUCCESS);
        
    }
}
