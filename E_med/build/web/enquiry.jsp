
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
          <li  ><a href="aboutus.jsp">About Us</a></li>
          <li ><a href="meet_doc.jsp">Meet Our Doctor</a></li>
         
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
         
          <li class="selected"><a href="login.jsp">Log In</a></li>
          <li><a href="contact_us.jsp">Contact Us</a></li>
          <li><a href="signup.jsp">Register</a></li>
        </ul>
      </nav>
    </header>
      <div id="site_content">
      <div class="gallery">
        <img width="1050" height="250" src="images/enquiry.jpg" />
      </div> 
<div class="content2">
<br>
<s:head theme="simple"/></head>
<s:actionmessage/>
<table align="center"><tr><td><h1 align="center">Enquiry</h1>
    <tr><td><s:form action="enquiry" cssClass="form_settings">
    <s:textfield name="first_name" label="First Name" size="15"/>

  <s:textfield name="last_name" label="Last Name" size="15" />

  <s:textfield label="Email" name="email" size="25" />

  <s:textarea name="message" label="Message" rows="4" cols="20"/>

  <s:submit value="Send" cssClass="submit" align="center"/>
 
</s:form>
         
</table>
        
    </div>
    </div>
   <%@include file="footer.jsp" %>