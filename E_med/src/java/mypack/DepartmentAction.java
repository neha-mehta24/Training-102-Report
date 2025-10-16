/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

/**
 *
 * @author Nidhi Jain
 */
import java.sql.*;
    import com.opensymphony.xwork2.ActionSupport;
public class DepartmentAction extends ActionSupport 
{
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

  String q="insert into department values(?,?,?,?)";
  try{
  PreparedStatement ps= c1.con.prepareStatement(q);
  
 ps.setString(1,department_id);
ps.setString(2,department_name);
ps.setInt(3,no_of_employees);
ps.setString(4,description);
  ps.executeUpdate();
  }catch(Exception e){}

  this.addActionMessage("Record Inserted Successfully");

  department_id="";
  department_name="";
  no_of_employees=0;
  description="";
return(SUCCESS);
}


}
