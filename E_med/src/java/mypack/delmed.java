/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.util.*;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.*;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;

public class delmed extends ActionSupport implements ServletRequestAware
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
            ResultSet rs=c1.execute("Select * from medicine_master");
            while(rs.next())
            {
                bean.project p1=new bean.project();
                 p1.setMed_id(rs.getInt("med_id"));
               p1.setAbbrevation(rs.getString("abbrevation"));
                p1.setMedicine_name(rs.getString("medicine_name"));
                p1.setSalt(rs.getString("salt"));
                p1.setChemical_name(rs.getString("chemical_name"));
                p1.setMedicine_details(rs.getString("medicine_details"));
                
                l1.add(p1);
            }
            request.setAttribute("list", l1);
        }
        catch(Exception e){}
        return(SUCCESS);
        
    }
    public String del2()
    {
        mypack.conn c1=new mypack.conn();
        try
        {
            c1.update("delete from medicine_master where med_id="+request.getParameter("pid"));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        del1();
        return(SUCCESS);
        
    }
}
