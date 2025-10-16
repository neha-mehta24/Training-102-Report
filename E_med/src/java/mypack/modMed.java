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
public class modMed extends ActionSupport implements ServletRequestAware
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
        try
        {
            mypack.conn c1=new mypack.conn();
            ResultSet rs=c1.execute("Select * from medicine_master");
            while(rs.next())
            {
                bean.project p1=new bean.project();
                p1.setMed_id(rs.getInt("med_id"));
               p1.setAbbrevation(rs.getString("abbrevation"));
                p1.setMedicine_name(rs.getString("medicine_name"));
                p1.setSalt(rs.getString("salt"));
                p1.setChemical_name(rs.getString("chemical_name"));
                p1.setMedicine_details(rs.getString("medicine_details"));
                
                l1.add(p1);
            }
            request.setAttribute("list", l1);
        }
        catch(Exception e){}
        return(SUCCESS);
        
    }
    int med_id;
           
  String abbrevation;
 String medicine_name;
  String salt;
 String chemical_name;
 String medicine_details;

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

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    
    public String mod2()
    {
        ArrayList l1=new ArrayList();
        try
        {
            mypack.conn c1=new mypack.conn();
            ResultSet rs=c1.execute("Select * from medicine_master where med_id=" +request.getParameter("pid"));
            while(rs.next())
            {
                bean.project p1=new bean.project();
                this.setMed_id(rs.getInt("med_id"));
               this.setAbbrevation(rs.getString("abbrevation"));
               this.setMedicine_name(rs.getString("medicine_name"));
               this.setSalt(rs.getString("salt"));
               this.setChemical_name(rs.getString("chemical_name"));
                this.setMedicine_details(rs.getString("medicine_details"));
                
                l1.add(p1);
            }
            request.setAttribute("list", l1);
        }
        catch(Exception e){}
        return(SUCCESS);
        
    }
    public String mod3()
    {
        String q="update medicine_master set abbrevation='" +abbrevation+"', medicine_name='" +medicine_name+"', salt='"+salt+"',chemical_name='"+chemical_name+"',medicine_details='"+medicine_details+"' where med_id='"+request.getParameter("med_id")+"'";
        mypack.conn c1=new mypack.conn();
        try{
            c1.update(q);
        }catch(Exception e){e.printStackTrace();}
        this.addActionMessage("Medicine Details updated Successfully");
        med_id=0;
  abbrevation="";
  medicine_name="";
  salt="";
  chemical_name="";
  medicine_details="";
        return(SUCCESS);
    }}
