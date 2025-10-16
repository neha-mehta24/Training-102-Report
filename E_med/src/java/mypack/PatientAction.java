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
public class PatientAction extends ActionSupport
{
private String p_id;
 private String p_name;
 private String age;
 private String sex;
 private String address;
 private String p_cntry;
 private String p_sta;

 private String p_cty;
 private String p_contactno;
 private String Email;
 private String p_reg_date;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getP_cntry() {
        return p_cntry;
    }

    public void setP_cntry(String p_cntry) {
        this.p_cntry = p_cntry;
    }

    public String getP_contactno() {
        return p_contactno;
    }

    public void setP_contactno(String p_contactno) {
        this.p_contactno = p_contactno;
    }

    public String getP_cty() {
        return p_cty;
    }

    public void setP_cty(String p_cty) {
        this.p_cty = p_cty;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_reg_date() {
        return p_reg_date;
    }

    public void setP_reg_date(String p_reg_date) {
        this.p_reg_date = p_reg_date;
    }

    public String getP_sta() {
        return p_sta;
    }

    public void setP_sta(String p_sta) {
        this.p_sta = p_sta;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    
   
  public String execute()
{
   
    mypack.conn c1 = new mypack.conn();

  String q="insert into patient_master values(?,?,?,?,?,?,?,?,?,?,?)";
  try{
  PreparedStatement ps= c1.con.prepareStatement(q);
  
 ps.setString(1,p_id);
ps.setString(2,p_name);
ps.setString(3,age);
ps.setString(4,sex);
ps.setString(5,address);
ps.setString(6,p_cntry);
ps.setString(7,p_cty);
ps.setString(8,p_sta);
ps.setString(9,p_contactno);
ps.setString(10,p_reg_date);
ps.setString(11,Email);



  ps.executeUpdate();
  }catch(Exception e){ e.printStackTrace();}

  this.addActionMessage("Record Inserted Successfully");

  p_id="";
  p_name="";
  age="";
  sex="";
  address="";
  p_cntry="";
  p_cty="";

 p_sta="";
  p_contactno="";
  p_reg_date="";
  Email="";

  
return(SUCCESS);

}
 
}
