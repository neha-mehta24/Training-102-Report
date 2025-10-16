package mypack;
import java.sql.*;
public class conn 
{
public Connection con;
ResultSet rs;
public Statement stmt;

public conn()
{
 try {
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql:///med_diagnose", "root", "");
stmt = con.createStatement();
}catch(Exception e)
 {
   System.out.println(e.getMessage());
  }
}
public ResultSet  execute(String s) throws Exception
{
rs = stmt.executeQuery(s);
return(rs);
}
public int update(String s) 
{
    try {
stmt.executeUpdate(s);
    }catch(Exception e){e.printStackTrace(); }
    return(1);
}
public Connection get()
{
return(con);
}
}


