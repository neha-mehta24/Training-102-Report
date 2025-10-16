
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
              <li><a href="ent.jsp">ENT</a></li>
               <li><a href="gynacology.jsp">Gynecology</a></li>
              <li><a href="heart.jsp">Heart Surgery</a></li>
             <li class="selected"><a href="kidney_transplant.jsp">Kidney Transplant</a></li>
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
          <img width="1050" height="250" src="images/kidney.jpg"  />
       
      </div>
     
<div class="content2">

<center>
 <h2 font-size="20">Kidney Transplant</h2></center>
     <p> The Seven Hills Kidney Transplant Program is a comprehensive program that has been caring for
         patients with end-stage renal disease since 1965. In 1977, the program became a Medicare-approved center.
         The program has consistently maintained a high volume of adult and pediatric kidney transplants while achieving
         graft and survival rates higher than the national average.</p>

<p>Our Kidney Transplant Program takes a multidisciplinary approach, providing patients access to a team of health
care professionals who are experienced in all medical and surgical aspects of transplantation. The team consists
of board-certified adult and pediatric transplant nephrologists.</p>
<hr>
<h3 style="font-family:'MS Serif', 'New York', serif;">Recommended Doctors</h3>
<ul>
    <li><strong>Name: </strong> Dr. Shikha Garg<br>
        <strong>Specialities: </strong> Dialysis, Kidney Transplant, Nephrology and Hypertension  </li>

    <li><strong>Name: </strong> Dr. Taranjeet Singh<br>
        <strong>Specialities:</strong> Kidney Transplant, Pancreas Transplant, Vasculitis </li>

     <li><strong>Name: </strong> Dr. Manoj Wilson<br>
        <strong>Specialities:</strong> Kidney Transplant, Nephrology and Hypertension, Pancreas Transplant </li>

</ul>

    </div>
    </div>
   <%@include file="footer.jsp" %>