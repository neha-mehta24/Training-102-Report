
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
          <li><a href="meet_doc.jsp">Meet Our Doctor</a></li>
         
         <li ><a href="#">Medical Services</a>
            <ul>
              <li><a href="skin_allergy.jsp">Allergic Skin Diseases</a></li>
              <li ><a href="alzheimer.jsp">Alzheimer Disease</a>

              </li>
              <li><a href="back_pain.jsp">Back Pain</a></li>
               <li><a href="breast_cancer.jsp">Breast cancer</a></li>
              <li class="selected"><a href="cardiology.jsp">Cardiology</a></li>
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
          <img width="1050" height="250" src="images/cardio.jpg"  />
       
      </div>
     
<div class="content2">

<center>
 <h2 font-size="20">Cardiological Services</h2></center>
    <p>Our doctors in general cardiology give you the basics you need to know about heart care. If you are experiencing chest
    pain or heart attack symptoms, our cardiologists and other specialists will help you find the diagnosis for your condition.
    Our specialists also work with patients to prevent future heart disease problems and concerns from past problems.</p>

<p>If you have any concerns about symptoms that may be related to a heart attack?pain or pressure in the chest,
    shortness of breath, nausea or vomiting, sweating and clammy skin, dizziness or fainting, unexplained weakness or
    fatigue, rapid or irregular pulse?make an appointment with a general cardiologist by contacting us. We will not
    hesitate to get you the care you need and find you the right specialist if necessary.</p>
<hr>
<h3 style="font-family:'MS Serif', 'New York', serif;">Recommended Doctors</h3>
<ul>
    <li><strong>Name: </strong> Dr. Ambrish Dutta<br>
        <strong>Specialities:</strong>Cardiology, Body Imaging, Cardiac Imaging, Cardiology, Echocardiography  </li>
 <li><strong>Name: </strong> Dr. Tejbeer Singh<br>
        <strong>Specialities:</strong>Cardiology, Nuclear Medicine, Preventive Cardiology, Heart Transplant, General Cardiology  </li>

   </ul>
    </div>
    </div>
   <%@include file="footer.jsp" %>