
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
              <li><a href="alzheimer.jsp">Alzheimer Disease</a>

              </li>
              <li><a href="back_pain.jsp">Back Pain</a></li>
               <li><a href="breast_cancer.jsp">Breast cancer</a></li>
              <li><a href="cardiology.jsp">Cardiology</a></li>
               <li class="selected"><a href="diabetes.jsp">Diabetes</a></li>
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
          <img width="1050" height="250" src="images/diabities.jpg"  />
       
      </div>
     
<div class="content2">

<center>
 <h2 font-size="20">Diabetic Diseases</h2></center>
     <p>
The Seven Hills Diabetic center was established to improve the quality of life for people with
diabetes, reduce complications and sufferings related to the diabetes, and contribute to the ultimate prevention
and cure. Our unique services helps make the struggle easier for those who live with diabetes and its complications.
The Seven Hills provides tailored diabetes care to patients of all ages and is the only facility for comprehensive and
continuous diabetes care.</p>
 <hr>
<h3 style="font-family:'MS Serif', 'New York', serif;">Recommended Doctors</h3>
<ul>
    <li><strong>Name: </strong> Dr. NarinderPal Singh<br>
        <strong>Specialities: Diabetes, Endocrine Surgery, Parathyroid </strong> </li>

    <li><strong>Name: </strong> Dr. Deepak jain<br>
        <strong>Specialities:</strong> Endocrinology and Metabolism, Internal Medicine, Nurse Practitioner  </li>

 <li><strong>Name: </strong> Dr. Anil Kumar<br>
        <strong>Specialities:</strong>  Endocrinology and Metabolism, Thyroid Disorder, Pituitary </li>

</ul>
    </div>
    </div>
   <%@include file="footer.jsp" %>