
<%@taglib prefix="s" uri="/struts-tags"%>
<title>Seven Hills Hospital</title>
 <link rel="stylesheet" type="text/css" href="mystyle.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<body>
  <div id="main">
    <header>
      <div id="logo">
     
      <img width=220 height="104" src="images/logo.png" alt="logo">
     
      </div>
      <nav>
        <ul class="sf-menu" id="nav">
          <li ><a href="index.html">Home</a></li>
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
          <li ><a href="contact_us.jsp" >Contact Us</a></li>
          <li><a href="signup.jsp">Register</a></li>
        </ul>
      </nav>
    </header>
 
<div id="site_content">
      <div class="gallery">
          <img width="1050" height="300" src="images/meetdoc.jpg"  />
       
      </div>
     
<div class="content2">

<s:head theme="simple"/></head>
<table>
    <tr><td>
             <img width="150" height="150" src="images/dr_avinash_date.png" />
        </td>
        <td><p><h2>Dr. Avinash Date</h2>

            <h1>Consultant in Orthopedic Surgery</h1>
MS

Dr. Avinash Date is a specialist in arthroscopy and Joint replacement. He did his Diplomate Exam of National Board after completing MS and during his stay in UK he also completed his Membership exam - MRCSEd and Fellowship exam in Orthopedics ?
FRCS (T & O).   </td>
        <tr><td>
             <img width="150" height="150" src="images/dr_hemalata.png" />
        </td>
        <td><p><h2>Dr. Hemalata Arora</h2>

            <h1>Consultant in Internal Medicine</h1>
MD, DNB, ABIM Certified

Dr Hemalata completed her graduation from Seth GS Medical College, Mumbai and MD (Internal Medicine) from University of Pune.
A Diplomate of the National Board- Medicine, India, she is also ECFMG certified and accredited by the American Board of Internal Medicine. A medical officer at Primary Health Centre, Khadakwasla-Maharashtra, she later worked as a senior resident at Nizam?s Institute of Medical Sciences-Hyderabad.

She has volunteered and actively participated as a Resident team leader at Migrant Farmer Clinic, Syracuse and as a Consultant- Internal Medicine, for a Volunteer clinic run by Sai Baba trust in Hyderabad, India.</td>
        <tr><td>
             <img width="150" height="150" src="images/dr_shweta_tyagi.png" />
        </td>
        <td><p><h2>Dr. Shweta Tyagi</h2>
            

            <h1>Consultant & Head Emergency Department</h1>
MBBS, FAEM

Dr Shweta Tyagi is a trained Emergency Physician from the prestigious Christian Medical College, Vellore. She completed her fellowship in 2010. Her clinical research includes a prospective study on 600 patients who presented to ER with acute chest pain, to determine the
  	  	 

sensitivity and specificity of serial ECGs VS serial cardiac enzymes as diagnostic of acute coronary syndrome.
        </td></table>
<h1>
<center>
   
   <s:url id="deleteurl" action="doctorlist"/>
         <s:a href="%{deleteurl}">List of doctors</s:a></center></h1>
    </div>
    </div>
   <%@include file="footer.jsp" %>