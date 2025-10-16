
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
              <li><a href="cardiology.jsp">Cardiology</a></li>
               <li><a href="diabetes.jsp">Diabetes</a></li>
              <li class="selected"><a href="ent.jsp">ENT</a></li>
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
          <img width="1050" height="250" src="images/ent.jpg"  />
       
      </div>
     
<div class="content2">

<center>
 <h2 font-size="20">ENT Diseases</h2></center>
     <p>The expertise of ear, nose, and throat specialists (or otolaryngologists) is used to
    diagnose and treat conditions of the ear, nose, sinuses, larynx (voice box), mouth, throat, head, and neck. Our doctors
    treat patients through both medical and surgical means providing facial plastic and reconstructive surgery, pediatric ENT,
    cochlear implants, and hearing aids as well as treatment for balance disorders, inhalant allergies, sinus and snoring
    disorders, voice and swallowing problems, and cancer of the head and neck.</p>
<hr>
<h3 style="font-family:'MS Serif', 'New York', serif;">Recommended Doctors</h3>
<ul>
    <li><strong>Name: </strong> Dr. Gitesh Goyal<br>
        <strong>Specialities:  </strong>  Acoustic Tumors, Cochlear Implantation, Facial Nerve Disorders, Neuro-Otology,
            Otolaryngology, Head & Neck Surgery, Otology, Skull Base Surgery</li>

    <li><strong>Name: </strong> Dr. Falak Dhawan<br>
        <strong>Specialities:</strong> General Otolaryngology ENT, Head and Neck Surgical Oncology, Otolaryngology,
        Head & Neck Surgery, Sleep Apnea, Obstructive, Sleep Medicine </li>
</ul>
    </div>
    </div>
   <%@include file="footer.jsp" %>