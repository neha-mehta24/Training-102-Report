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
public class modapp extends ActionSupport implements ServletRequestAware
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
            ResultSet rs=c1.execute("Select * from appointment_master");
            while(rs.next())
            {
                bean.appointment p1=new bean.appointment();
               p1.setAppointment_id(rs.getString("appointment_id"));
                p1.setDoctor_id(rs.getString("doctor_id"));
                p1.setPatient_id(rs.getString("patient_id"));
                 p1.setVisit_date(rs.getString("visit_date"));
                p1.setVisit_time(rs.getString("visit_time"));
                 p1.setDescription_test(rs.getString("description_test"));
                p1.setResult(rs.getString("result"));
                 p1.setStatus(rs.getString("status"));
               
                
                l1.add(p1);
            }
            request.setAttribute("list", l1);
        }catch(Exception e){}
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
            ResultSet rs=c1.execute("Select * from appointment_master where appointment_Id=" +request.getParameter("pid"));
            rs.next();
          this.setAppointment_id(rs.getString("appointment_id"));
                this.setDoctor_id(rs.getString("doctor_id"));
                this.setPatient_id(rs.getString("patient_id"));
                 this.setVisit_date(rs.getString("visit_date"));
                this.setVisit_time(rs.getString("visit_time"));
                this.setDescription_test(rs.getString("description_test"));
                this.setResult(rs.getString("result"));
                 this.setStatus(rs.getString("status"));  
        }catch(Exception e){}
        return(SUCCESS);
    }
    public String mod3()
    {
        String q="update appointment_master set doctor_id='" +doctor_id+"', patient_id='" +patient_id+"',visit_date='"+visit_date+"',visit_time='"+visit_time+"',description_test='"+description_test+"',result='"+result+"',status='"+status+"' where appointment_Id=" +appointment_id;
        mypack.conn c1=new mypack.conn();
        try{
            c1.update(q);
        }catch(Exception e){}
        this.addActionMessage("appointment Details updated Successfully");
        doctor_id="";
  patient_id="";
  visit_date="";
  visit_time="";
  description_test="";
  result="";
  status="";
 appointment_id="";

        return(SUCCESS);
    }}


