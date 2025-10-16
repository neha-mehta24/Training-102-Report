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

public class DelAction extends ActionSupport implements ServletRequestAware
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
            ResultSet rs=c1.execute("Select * from department");
            while(rs.next())
            {
                bean.project p1=new bean.project();
               p1.setDepartment_id(rs.getString("department_id"));
                p1.setDepartment_name(rs.getString("department_name"));
                p1.setNo_of_employees(rs.getInt("no_of_employees"));
                p1.setDescription(rs.getString("description"));
                
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
            c1.update("delete from department where Department_Id="+request.getParameter("pid"));
        }
        catch(Exception e)
        {
            
        }
        del1();
        return(SUCCESS);
        
    }
}
