<%@taglib prefix="s" uri="/struts-tags"%>
<title>Seven Hills Hospital</title>

<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="mystyle.css" />
<body>
  <div id="main">
    <header>
      <div id="logo">
     
      <img width=220 height="104" src="images/logo.png" alt="logo">
     
      </div>
      <nav>
        <ul class="sf-menu" id="nav">
          <li><a href="index.html">Home</a></li>
          <li><a href="aboutus.jsp">About Us</a></li>
          <li><a href="meet_doc.jsp">Meet Our Doctor</a></li>
         
         <li><a href="#">Medical Services</a>
            <ul>
              <li><a href="skin_allergy.jsp">Allergic Skin Diseases</a></li>
              <li><a href="alzheimer.jsp">Alzheimer Disease</a>

              </li>
              <li><a href="back_pain.jsp">Back Pain</a></li>
               <li><a href="breast_cancer.jsp">Breast cancer</a></li>
              <li><a href="cardiology.jsp">Cardiology</a></li>
               <li><a href="diabetes.jsp">Diabetes</a></li>
              <li><a href="ent.jsp">ENT</a></li>
               <li><a href="gynacology.jsp">Gynecology</a></li>
              <li><a href="heart.jsp">Heart Surgery</a></li>
             <li><a href="kidney_transplant.jsp">Kidney Transplant</a></li>
            </ul>
          </li>
         
          <li><a href="login.jsp">Log In</a></li>
          <li><a href="contact_us.jsp">Contact Us</a></li>
          <li><a href="signup.jsp">Register</a></li>
        </ul>
      </nav>
    </header>
 <div id="site_content">
      <div class="gallery">
        <img width="1050" height="250" src="images/fp.jpg" />
      </div> 
<div class="content2">
<br><br>
<s:head theme="simple"/></head>
<s:actionmessage/>
<table align="center"><tr><td><h1 align="center">Forgot Password</h1>
    <tr><td>
<s:form action="forgetpasswordAction" cssClass="form_settings">
  
    <s:textfield name="username" label="Username" size="15"/>
    
   <s:submit value="Submit" cssClass="submit" align="center"/>
</s:form>
            </table>
         
    </div>
    </div>
<br><br><br>
   <%@include file="footer.jsp" %>