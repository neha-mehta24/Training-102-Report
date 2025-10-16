package mypack;

import java.util.*;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.*;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;

public class deldis extends ActionSupport implements ServletRequestAware
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
            ResultSet rs=c1.execute("Select * from disease_master");
            while(rs.next())
            {
                bean.disease p1=new bean.disease();
               p1.setDiseaseid(rs.getString("disease_id"));
                p1.setDiseasename(rs.getString("disease_name"));
                p1.setDiseasekname(rs.getString("disease_known_name"));
                 p1.setDescription(rs.getString("description"));
                p1.setLowerage(rs.getString("lower_age_limit"));
                 p1.setUpperage(rs.getString("upper_age_limit"));
                p1.setSymptoms(rs.getString("symptoms"));
                p1.setTestrecommended(rs.getString("test_recommended"));
               
                
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
            c1.update("delete from disease_master where disease_id="+request.getParameter("pid"));
        }
        catch(Exception e)
        {
            
        }
        del1();
        return(SUCCESS);
        
    }
}
