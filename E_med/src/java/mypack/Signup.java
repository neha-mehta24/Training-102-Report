/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.sql.*;
    import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Lenovo
 */
public class Signup extends ActionSupport {
private int u_id;
 private String username;
 private String password;
 private String cpassword;
 private String fullname;
 private String dob;
 private String Email;
 private String ques;
 private String answer;
 private String address;
 private String country;
 private String state;
 private String city;
 private String type;
String age,sex,contactno;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   
 public String execute()
{
    if(username.trim().length()<=0)
    {
        this.addActionError("Username is required");
        return(ERROR);
    }
    if(password.trim().length()<0)
    {
       this.addActionError("password is required");
        return(ERROR); 
    }
    mypack.conn c1 = new mypack.conn();

  String q="insert into login values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
  try{
  PreparedStatement ps= c1.con.prepareStatement(q);
  ps.setInt(1,u_id);
 ps.setString(2,username);
ps.setString(3,password);
ps.setString(4,type);
ps.setString(5,fullname);
ps.setString(6,dob);
ps.setString(7,Email);
ps.setString(8,ques);
ps.setString(9,answer);
ps.setString(10,address);
ps.setString(11,country);
ps.setString(12,city);
ps.setString(13,state);
 
  ps.executeUpdate();
  }catch(Exception e){}
  q="insert into patient_master values(?,?,?,?,?,?,?,?,?,?,?)";
  try{
  PreparedStatement ps= c1.con.prepareStatement(q);
  
 ps.setString(1,u_id+"");
 ps.setString(2, fullname);
ps.setString(3,age);
ps.setString(4,sex);
ps.setString(5,address);
ps.setString(6,country);
ps.setString(7,city);
ps.setString(8,state);
ps.setString(9,contactno);
String regdate= new java.util.Date().toString();
ps.setString(10,regdate);
ps.setString(11,Email);



  ps.executeUpdate();
  // this.addActionMessage("pat Inserted Successfully");

  }catch(Exception e){ e.printStackTrace();}

  
  
  
  
  
  
  
  this.addActionMessage("Record Inserted Successfully");
u_id=0;
  username="";
  password="";
  cpassword="";
  type="";
  fullname="";
  dob="";
  ques="";
  answer="";
  Email="";
  address="";
  country="";
  city="";
  state="";
  age="";
  sex="";
  
return(SUCCESS);





}




}

