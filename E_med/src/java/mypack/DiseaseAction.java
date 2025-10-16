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
public class DiseaseAction extends ActionSupport
{
private String diseaseid;
 private String diseasename;
 private String diseasekname;
 private String description;
 private String lowerage;
 private String Upperage;
 private String symptoms;
 private String testrecommended;

    public String getUpperage() {
        return Upperage;
    }

    public void setUpperage(String Upperage) {
        this.Upperage = Upperage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiseaseid() {
        return diseaseid;
    }

    public void setDiseaseid(String diseaseid) {
        this.diseaseid = diseaseid;
    }

    public String getDiseasekname() {
        return diseasekname;
    }

    public void setDiseasekname(String diseasekname) {
        this.diseasekname = diseasekname;
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename;
    }

    public String getLowerage() {
        return lowerage;
    }

    public void setLowerage(String lowerage) {
        this.lowerage = lowerage;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getTestrecommended() {
        return testrecommended;
    }

    public void setTestrecommended(String testrecommended) {
        this.testrecommended = testrecommended;
    }
  public String execute()
{
   
    mypack.conn c1 = new mypack.conn();

  String q="insert into disease_master values(?,?,?,?,?,?,?,?)";
  try{
  PreparedStatement ps= c1.con.prepareStatement(q);
  
 ps.setString(1,diseaseid);
ps.setString(2,diseasename);
ps.setString(3,diseasekname);
ps.setString(4,description);
ps.setString(5,lowerage);
ps.setString(6,Upperage);
ps.setString(7,symptoms);
ps.setString(8,testrecommended);

  ps.executeUpdate();
  }catch(Exception e){}

  this.addActionMessage("Record Inserted Successfully");

  diseaseid="";
  diseasename="";
  diseasekname="";
  description="";
  lowerage="";
  Upperage="";
  symptoms="";
  testrecommended="";
  
return(SUCCESS);





}




 

 
 
}
