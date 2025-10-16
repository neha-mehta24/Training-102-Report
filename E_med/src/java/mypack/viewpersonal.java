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
public class viewpersonal extends ActionSupport implements ServletRequestAware
{
private HttpServletRequest request;
public void setServletRequest(HttpServletRequest request){
        this.request=request;
         }
    public String execute()
    {
        return(SUCCESS);
          }
  
     String p_id;
 String p_name;
String age;
 String sex;
String address;
 String p_cntry;
  String p_sta;

  String p_cty;
 String p_contactno;
  String Email;
String p_reg_date;

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

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

 
    public String mod2()
    {
        mypack.conn c1=new mypack.conn();
        try{
            HttpSession session = request.getSession();
            String u=(String)session.getAttribute("u_id");
            ResultSet rs=c1.execute("Select * from patient_master where patient_Id='"+u+"';");
            rs.next();
           this.setP_id(rs.getString("patient_id"));
          
                this.setP_name(rs.getString("patient_name"));
                this.setAge(rs.getString("patient_age"));
                 this.setSex(rs.getString("patient_sex"));
                this.setAddress(rs.getString("patient_address"));
                this.setP_cntry(rs.getString("patient_country"));
                 this.setP_sta(rs.getString("patient_state"));
                this.setP_cty(rs.getString("patient_city"));
               
               
               this.setP_contactno(rs.getString("patient_contact_no"));
                   this.setEmail(rs.getString("patient_email_id"));
                this.setP_reg_date(rs.getString("patient_registration_date"));
            
                
        }catch(Exception e){}
        return(SUCCESS);
    }
}