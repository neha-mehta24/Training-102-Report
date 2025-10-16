package mypack;

import java.util.*;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.*;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;

public class cancelapp extends ActionSupport implements ServletRequestAware
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
              HttpSession session = request.getSession();
            String u=(String)session.getAttribute("u_id");
            ResultSet rs=c1.execute("Select * from patient_medicine_disease where patient_medicine_disease.patient_id='"+u+"';");
            while(rs.next())
            {
                bean.cancelapp p1=new bean.cancelapp();
               p1.setP_id(rs.getString("patient_id"));
                p1.setDoctorname(rs.getString("doctorname"));
                p1.setDisease(rs.getString("disease"));
                 p1.setMedicine(rs.getString("medicine"));
                p1.setSuit_date(rs.getString("suit_date"));
         
               
                
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
            c1.update("delete from patient_medicine_disease where patient_id="+request.getParameter("pid"));
        }
        catch(Exception e)
        {
            
        }
        del1();
        return(SUCCESS);
        
    }
}
