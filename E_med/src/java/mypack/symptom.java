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
public class symptom extends ActionSupport implements ServletRequestAware
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
            ResultSet rs=c1.execute("Select * from disease_master");
            while(rs.next())
            {
                bean.disease p1=new bean.disease();
             p1.setDiseaseid(rs.getString("disease_id"));
                p1.setSymptoms(rs.getString("symptoms"));
           
               
                
                l1.add(p1);
            }
            request.setAttribute("list", l1);
        }catch(Exception e){}
        return(SUCCESS);
    }
     String diseaseid;
 String diseasename;
 String diseasekname;
 String description;
 String lowerage;
  String Upperage;
  String symptoms;
  String testrecommended;

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

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
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

   
    public String mod2()
    {
        mypack.conn c1=new mypack.conn();
        try{
            ResultSet rs=c1.execute("Select * from disease_master where Disease_Id=" +request.getParameter("pid"));
            rs.next();
           this.setDiseaseid(rs.getString("disease_id"));
                this.setDiseasename(rs.getString("disease_name"));
                 this.setDiseasekname(rs.getString("disease_known_name"));
                 this.setDescription(rs.getString("description"));
                this.setLowerage(rs.getString("lower_age_limit"));
                 this.setUpperage(rs.getString("upper_age_limit"));
                this.setSymptoms(rs.getString("symptoms"));
                this.setTestrecommended(rs.getString("test_recommended"));
               
        }catch(Exception e){}
        return(SUCCESS);
    }
   }



