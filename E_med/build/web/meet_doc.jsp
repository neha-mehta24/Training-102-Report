
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
          <li class="selected"><a href="meet_doc.jsp">Meet Our Doctor</a></li>
         
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
          <img width="1050" height="250" src="images/meetdoc.jpg"  />
       
      </div>
     
<div class="content2">

<s:head theme="simple"/></head>
<table>
    <tr><td>
             <img width="150" height="150" src="images/dr-abraham-zachariah.png" />
        </td>
        <td><p><h2>Dr. Abraham Zachariah, FAACS</h2>

<h1>Head of the Department</h1>

He is a graduate of the prestigious Armed Forces Medical College in Pune. After graduating from medical college, Dr. Zachariah left for United States to pursue post-graduate surgical training.
He completed post graduate residency training at the State University of New York, and further on, he underwent two elite post-residency fellowships - one in Facial Plastic Surgery and the other one in Breast, Body, Extremity and General Cosmetic Surgery He is certified by the American Board of Cosmetic Surgery. He is also certified by the American Board of Otolaryngology & Head and Neck Surgery. In addition to American training he also has had post-graduate cosmetic surgery training in Brazil, Argentina and Europe. He is adept with all the most advanced techniques in cosmetic surgery.</p>
        </td>
        <tr><td>
             <img width="150" height="150" src="images/dr_amit_panjwani.png" />
        </td>
        <td><p><h2>Dr. Amit Panjwani</h2>

            <h1>Consultant in Pulmonary Medicine
MD, DNB, DM, European Diploma in Adult Respiratory Medicine</h1>

Dr Amit Panjwani a trained Pulmonologist has done his post graduation from the Armed Forces Medical College, Pune. He is also a Diplomate of National Board, New Delhi, in Respiratory Diseases.
He has done his DM in Pulmonary and Critical Care Medicine from the Post Graduate Institute of Medical Education and Research, Chandigarh. He has received training in the field of Interventional Pulmonology under the guidance of Professor Stefano Gasparini in Azienda Ospedaliero-Universitaria "Ospedali Riuniti" Ancona , Italy. He has obtained the European Diploma in Adult Respiratory Medicine, recently. He has also obtained the Fellowship of American College of Chest Physicians (FCCP), USA.</td>
 <tr><td>
             <img width="150" height="150" src="images/dr_atul_marwah.png" />
        </td>
        <td><p><h2>Dr. Atul Marwah</h2>

            <h1>Consultant in Nuclear Medicine
MD, Diplomate Certification Board of Nuclear Cardiology</h1>

Dr Atul Marwah is the Consultant in Nuclear Medicine and PET-CT. Prior to this assignment he was the Chief Consultant at department of Nuclear Medicine and Positron Emission Tomography (PET) at Bombay Hospital, Mumbai.
A post-graduate from All India Institute of Medical Sciences, New Delhi, he also holds the distinction of being one of the very few doctors in the country to have secured a Diplomate Certification Board of Nuclear Cardiology (ASNC,USA). He has received advanced training in PET-CT from Baptist Hospital, Miami, Florida, US. He has been awarded the ?Asia-Oceania Young Investigator? Award twice for his research paper presentations. </td>
</table>
<h1>
<center>
    <a href="seemore.jsp">See More......</a><br><br>
   <s:url id="deleteurl" action="doctorlist"/>
         <s:a href="%{deleteurl}">List of doctors</s:a></center></h1>
    </div>
    </div>
   <%@include file="footer.jsp" %>