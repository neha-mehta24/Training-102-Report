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
public class MedicineAction extends ActionSupport 
{
    private int med_id;
 private String abbrevation;
 private String medicine_name;
 private String salt;
 private String chemical_name;
 private String medicine_details;

    public int getMed_id() {
        return med_id;
    }

    public void setMed_id(int med_id) {
        this.med_id = med_id;
    }

    public String getAbbrevation() {
        return abbrevation;
    }

    public void setAbbrevation(String abbrevation) {
        this.abbrevation = abbrevation;
    }

    public String getChemical_name() {
        return chemical_name;
    }

    public void setChemical_name(String chemical_name) {
        this.chemical_name = chemical_name;
    }

    public String getMedicine_details() {
        return medicine_details;
    }

    public void setMedicine_details(String medicine_details) {
        this.medicine_details = medicine_details;
    }

    public String getMedicine_name() {
        return medicine_name;
    }

    public void setMedicine_name(String medicine_name) {
        this.medicine_name = medicine_name;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    public String execute()
{
   
    mypack.conn c1 = new mypack.conn();

  String q="insert into medicine_master values(?,?,?,?,?,?)";
  try{
  PreparedStatement ps= c1.con.prepareStatement(q);
   ps.setInt(1,med_id);
 ps.setString(2,abbrevation);
ps.setString(3,medicine_name);
ps.setString(4,salt);
ps.setString(5,chemical_name);
ps.setString(6,medicine_details);

  ps.executeUpdate();
  }catch(Exception e){}

  this.addActionMessage("Record Inserted Successfully");
med_id=0;
  abbrevation="";
  medicine_name="";
  salt="";
  chemical_name="";
  medicine_details="";
  
return(SUCCESS);





}




 
}
