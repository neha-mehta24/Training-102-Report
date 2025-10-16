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
public class AppointmentAction extends ActionSupport
{
private String appointment_id;
 private String patient_id;
 private String emergency_level;
  private String disease;

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getSuit_date() {
        return suit_date;
    }

    public void setSuit_date(String suit_date) {
        this.suit_date = suit_date;
    }

    public String getVisit_date() {
        return visit_date;
    }

    public void setVisit_date(String visit_date) {
        this.visit_date = visit_date;
    }

 private String suit_date;

    public String getEmergency_level() {
        return emergency_level;
    }

    public void setEmergency_level(String emergency_level) {
        this.emergency_level = emergency_level;
    }
  private String visit_date;

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

    


    
  public String execute()
{
   int level=0;
   int token_no=120;
   if(emergency_level.equals("Emergent"))
   {level=4;
   token_no=1;
   }
else if(emergency_level.equals("Urgent"))
{    level=3;
token_no=30;
}
else if(emergency_level.equals("Less Urgent"))
{  level=2;
token_no=60;
}
else if(emergency_level.equals("Non Urgent"))
{   level=1;
token_no=90;
}
   
   System.out.println("level = "+level);
   System.out.println("token="+token_no);
    mypack.conn c1 = new mypack.conn();
 try{
    ResultSet rs = c1.stmt.executeQuery("select max(token_no)  from appointment_master where level="+level);
   if(rs.next())
   {
       int n = rs.getInt(1);
       if(n!=0)
       token_no=n+1;
   }
  System.out.println("clevel = "+level);
   System.out.println("ctoken="+token_no);
   
    
    
  String q="insert into appointment_master values(?,?,?,?,?,?,'pending')";
 
  PreparedStatement ps= c1.con.prepareStatement(q);
  
 ps.setString(1,appointment_id);
ps.setString(2,patient_id);
ps.setString(3,disease);

System.out.println("=========================");
System.out.println(emergency_level);

ps.setInt(4,level);


ps.setString(5,suit_date);
ps.setInt(6,token_no);


  ps.executeUpdate();
  }catch(Exception e){
  e.printStackTrace();
  
  }

  this.addActionMessage("Record Inserted Successfully");

  patient_id="";
  suit_date="";
  emergency_level="";
  disease="";
 appointment_id="";

  
return(SUCCESS);

}
 
}
