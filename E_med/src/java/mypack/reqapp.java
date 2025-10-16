/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;
import java.sql.*;
    import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.ServletRequestAware;
/**
 *
 * @author Nidhi Jain
 */
public class reqapp extends ActionSupport implements ServletRequestAware
{


	private HttpServletRequest request;

	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}
private String p_id;
String disease;
String medicine;
String  suit_date;

   

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

  

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }



    
   
  public String execute()
{
   
    mypack.conn c1 = new mypack.conn();

  String q="insert into patient_medicine_disease values(?,?,?,?,?)";
  try{
  PreparedStatement ps= c1.con.prepareStatement(q);
  HttpSession hs = request.getSession(true);
  p_id = (String)hs.getAttribute("u_id");
 ps.setString(1,p_id);
ps.setString(2,disease);
ps.setString(3,medicine);
ps.setString(4,"none");
suit_date = suit_date.substring(0,10);
ps.setString(5,suit_date);




  ps.executeUpdate();
  }catch(Exception e){ e.printStackTrace();}

  this.addActionMessage("Appointment Request Sent");

  p_id="";
disease="";
suit_date="";
medicine="";

       
  
return(SUCCESS);

}
 
}
