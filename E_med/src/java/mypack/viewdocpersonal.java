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
public class viewdocpersonal extends ActionSupport implements ServletRequestAware
{
private HttpServletRequest request;
public void setServletRequest(HttpServletRequest request){
        this.request=request;
         }
    public String execute()
    {
        return(SUCCESS);
          }
  
    String doctor_id;
 String doctor_name;
 String doctor_address;
 String doc_contact_no;
 String doc_email;
 String department_id;
 String spacialization;

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public String getDoc_contact_no() {
        return doc_contact_no;
    }

    public void setDoc_contact_no(String doc_contact_no) {
        this.doc_contact_no = doc_contact_no;
    }

    public String getDoc_email() {
        return doc_email;
    }

    public void setDoc_email(String doc_email) {
        this.doc_email = doc_email;
    }

    public String getDoctor_address() {
        return doctor_address;
    }

    public void setDoctor_address(String doctor_address) {
        this.doctor_address = doctor_address;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String getSpacialization() {
        return spacialization;
    }

    public void setSpacialization(String spacialization) {
        this.spacialization = spacialization;
    }
 
 
    public String mod2()
    {
        mypack.conn c1=new mypack.conn();
        try{
            HttpSession session = request.getSession();
            String u=(String)session.getAttribute("u_id");
            ResultSet rs=c1.execute("Select * from doctor_master where Doctor_Id='"+u+"';");
            rs.next();
           this.setDoctor_id(rs.getString("doctor_id"));
                this.setDoctor_name(rs.getString("doctor_name"));
                this.setSpacialization(rs.getString("spacialization"));
                 this.setDepartment_id(rs.getString("department_id"));
                this.setDoctor_address(rs.getString("doctor_address"));
                 this.setDoc_contact_no(rs.getString("doctor_contact_no"));
                this.setDoc_email(rs.getString("doctor_email_id"));    
        }catch(Exception e){}
        return(SUCCESS);
    }
}