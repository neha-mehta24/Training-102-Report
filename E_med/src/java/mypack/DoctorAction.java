/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;
import java.sql.*;
    import com.opensymphony.xwork2.ActionSupport;
/**
 *
 * @author Nidhi Jain
 */
public class DoctorAction extends ActionSupport
{
private String doctor_id;
 private String doctor_name;
 private String doctor_address;
 private String doc_contact_no;
 private String doc_email;
 private String department_id;
 private String spacialization;

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

    public String getSpacialization() {
        return spacialization;
    }

    public void setSpacialization(String spacialization) {
        this.spacialization = spacialization;
    }


   
  public String execute()
{
   
    mypack.conn c1 = new mypack.conn();

  String q="insert into doctor_master values(?,?,?,?,?,?,?)";
  try{
  PreparedStatement ps= c1.con.prepareStatement(q);
  
 ps.setString(1,doctor_id);
ps.setString(2,doctor_name);
ps.setString(3,spacialization);
ps.setString(4,department_id);
ps.setString(5,doctor_address);
ps.setString(6,doc_contact_no);
ps.setString(7,doc_email);


  ps.executeUpdate();
  }catch(Exception e){}

  this.addActionMessage("Record Inserted Successfully");

  doctor_id="";
  doctor_name="";
  spacialization="";
  department_id="";
  doctor_address="";
  doc_contact_no="";
  doc_email="";

  
return(SUCCESS);

}
 
}
