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
public class callapp extends ActionSupport implements ServletRequestAware
{
private HttpServletRequest request;
public void setServletRequest(HttpServletRequest request){
        this.request=request;
         }
    public String execute()
    {
        return(SUCCESS);
          }
   
   String appointment_id;
 String patient_id;
 String doctor_id;
String visit_date;
String visit_time;
 String description_test;
 String result;
  String status;
   String p_name;
   String age;
 String sex;
 String p_reg_date;

    public String getP_reg_date() {
        return p_reg_date;
    }

    public void setP_reg_date(String p_reg_date) {
        this.p_reg_date = p_reg_date;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(String appointment_id) {
        this.appointment_id = appointment_id;
    }

    public String getDescription_test() {
        return description_test;
    }

    public void setDescription_test(String description_test) {
        this.description_test = description_test;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVisit_date() {
        return visit_date;
    }

    public void setVisit_date(String visit_date) {
        this.visit_date = visit_date;
    }

    public String getVisit_time() {
        return visit_time;
    }

    public void setVisit_time(String visit_time) {
        this.visit_time = visit_time;
    }


  
 
    public String mod2()
    {
        mypack.conn c1=new mypack.conn();
        try{
            ResultSet rs=c1.execute("Select * from appointment_master,patient_master where appointment_master.patient_id = patient_master.patient_id && patient_master.patient_id='" +request.getParameter("pid")+"'");
            rs.next();
          
                this.setAppointment_id(rs.getString("appointment_id"));
                this.setPatient_id(rs.getString("Patient_Id"));
                this.setP_name(rs.getString("Patient_Name"));
                 this.setVisit_date(rs.getString("visit_date"));
                this.setVisit_time(rs.getString("visit_time"));
                this.setDescription_test(rs.getString("description_test"));
                this.setResult(rs.getString("result"));
         
                  this.setAge(rs.getString("Patient_Age"));
                 this.setSex(rs.getString("Patient_Sex"));
                       
        }catch(Exception e){
        e.printStackTrace();
        }
        return(SUCCESS);
    }
   }


