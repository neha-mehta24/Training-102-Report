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
public class ModAction extends ActionSupport implements ServletRequestAware
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
        }catch(Exception e){}
        return(SUCCESS);
    }
   String department_id;
 String department_name;
 int no_of_employees;
String description;

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNo_of_employees() {
        return no_of_employees;
    }

    public void setNo_of_employees(int no_of_employees) {
        this.no_of_employees = no_of_employees;
    }

   

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }
    public String mod2()
    {
        mypack.conn c1=new mypack.conn();
        try{
            ResultSet rs=c1.execute("Select * from department where Department_Id=" +request.getParameter("pid"));
            rs.next();
           this.setDepartment_id(rs.getString("department_id"));
                this.setDepartment_name(rs.getString("department_name"));
                this.setNo_of_employees(rs.getInt("no_of_employees"));
                this.setDescription(rs.getString("description"));
            
        }catch(Exception e){}
        return(SUCCESS);
    }
    public String mod3()
    {
        String q="update department set Department_Name='" +department_name+"', No_of_employees=" +no_of_employees+",description='"+description+"' where Department_Id=" +department_id;
        mypack.conn c1=new mypack.conn();
        try{
            c1.update(q);
        }catch(Exception e){}
        this.addActionMessage("Department Details updated Successfully");
         department_id="";
  department_name="";
  no_of_employees=0;
  description="";
        return(SUCCESS);
    }}

