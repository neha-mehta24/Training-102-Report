/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;
import java.sql.*;
    import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author man
 */
public class apply extends ActionSupport implements ServletRequestAware
{
    private HttpServletRequest request;
    public void setServletRequest(HttpServletRequest request)
    {
        this.request=request;
    }
   private String appointment_id;
 private String patient_id;
 private String doctor_id;
 private String suit_date;
 private String visit_time;
 private String description_test;
 private String result;
 private String status;
 private String disease;

    public String getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(String appointment_id) {
        this.appointment_id = appointment_id;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

   

    public String getVisit_time() {
        return visit_time;
    }

    public void setVisit_time(String visit_time) {
        this.visit_time = visit_time;
    }

    public String getDescription_test() {
        return description_test;
    }

    public void setDescription_test(String description_test) {
        this.description_test = description_test;
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
 
    public String execute()
    {
        
        try{
            patient_id = request.getParameter("pid");
            mypack.conn c1=new mypack.conn();
            ResultSet rs=c1.execute("Select * from patient_medicine_disease where patient_id='"+patient_id+"'");
            rs.next();
           suit_date=rs.getString("suit_date");
          disease = rs.getString("disease");
          
         rs=c1.execute("Select max(appointment_id) from appointment_master");
            rs.next();
           appointment_id=Integer.parseInt(rs.getString(1))+1+""; 
          
          
          
        }catch(Exception e) 
        {
            this.addActionMessage("error"+e);
        }
        
        return(SUCCESS);
        
        
    }

    public String getSuit_date() {
        return suit_date;
    }

    public void setSuit_date(String suit_date) {
        this.suit_date = suit_date;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
    
    
    
    
    
}
