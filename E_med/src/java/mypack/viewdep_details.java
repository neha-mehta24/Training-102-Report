/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.util.ArrayList;
import java.util.Map;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.*;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;

public class viewdep_details extends ActionSupport implements ServletRequestAware
{
    private HttpServletRequest request;
     public void setServletRequest(HttpServletRequest request) {
		this.request = request;}
     private String department_id;
 private String department_name;
 private int no_of_employees;
 private String description;

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

    public String execute()
{
   
    mypack.conn c1 = new mypack.conn();
try {

       ResultSet rs = c1.execute("select * from department where Department_Id='"+department_id+"'");
      ArrayList l1 = new ArrayList();
      while(rs.next())
      {
        bean.project p1 = new bean.project();
        p1.setDepartment_id(rs.getString("department_id"));
        p1.setDepartment_name(rs.getString("department_name"));
        p1.setNo_of_employees(rs.getInt("no_of_employees"));
        p1.setDescription(rs.getString("description"));
    
        l1.add(p1);
      }

      request.setAttribute("beans", l1);
      return(SUCCESS);
   }catch(Exception e){}
   return(ERROR);
      }




}