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
public class vipatient extends ActionSupport implements ServletRequestAware
{
private HttpServletRequest request;
public void setServletRequest(HttpServletRequest request){
        this.request=request;
         }
    public String execute()
    {
        return(SUCCESS);
          }
   String doctor_name;
   String appointment_id;
 String p_id;
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
  String medicinename;
  String disease;

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getMedicinename() {
        return medicinename;
    }

    public void setMedicinename(String medicinename) {
        this.medicinename = medicinename;
    }

  
    

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

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
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
            ResultSet rs=c1.execute("Select * from appointment_master,patient_medicine_disease,patient_master where appointment_master.patient_id = patient_medicine_disease.patient_id && appointment_master.patient_id =patient_master.patient_id && patient_medicine_disease.patient_id='" +request.getParameter("pid")+"'");
            rs.next();
          
                this.setP_id(rs.getString("Patient_Id"));
                this.setP_name(rs.getString("Patient_Name"));
                 this.setVisit_date(rs.getString("visit_date"));
                this.setVisit_time(rs.getString("visit_time"));
       
            this.setP_reg_date(rs.getString("patient_registration_date"));
           this.setMedicinename(rs.getString("medicine"));
                  this.setAge(rs.getString("Patient_Age"));
                 this.setSex(rs.getString("Patient_Sex"));
                  this.setDisease(rs.getString("disease"));
                   this.setDoctor_name(rs.getString("doctorname"));
                       
        }catch(Exception e){
        e.printStackTrace();
        }
        return(SUCCESS);
    }
   }


