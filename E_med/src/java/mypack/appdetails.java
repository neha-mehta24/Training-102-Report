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
public class appdetails extends ActionSupport implements ServletRequestAware
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
               HttpSession session = request.getSession();
            String u=(String)session.getAttribute("u_id");
            ResultSet rs=c1.execute("Select * from appointment_master,patient_master where appointment_master.patient_id=patient_master.patient_id && appointment_master.doctor_id='"+u+"';");
          
            while(rs.next())
            {
                bean.appointment p1=new bean.appointment();
            
               p1.setPatient_id(rs.getString("patient_id"));
                p1.setP_name(rs.getString("patient_name"));
                 p1.setVisit_date(rs.getString("visit_date"));
                p1.setVisit_time(rs.getString("visit_time"));
              
               
                
                l1.add(p1);
               
              
                
            }
            request.setAttribute("list", l1);
        }catch(Exception e){}
        return(SUCCESS);
    }
}