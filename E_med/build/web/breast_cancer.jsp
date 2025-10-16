
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
              <li class="selected"><a href="back_pain.jsp">Back Pain</a></li>
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
          <img width="1050" height="250" src="images/breast-cancer.jpg"  />
       
      </div>
     
<div class="content2">

<center>
 <h2 font-size="20">Breast Cancer</h2></center>
   <p> We serve cancer patients and provide academic and clinical training for future physicians and researchers.</p>

<p><strong> Hope through Research: </strong> Our scientists focus on understanding cancer from its beginnings to create safer,
    more effective treatments. Researchers also study how genes function to look for ways to prevent or even reverse genetic
    changes that cause cancer.</p>

<p><strong> Hope through Education: </strong> We provide free, expert and accurate information about cancers,
    risk factors, screening, prevention, and treatments to patients, family members, caregivers, physicians, and the public.</p>

<p><strong> Hope through Patient Care: </strong> Our teams of doctors and health care professionals work together
    to provide compassionate, state-of-the-art care.</p>
<hr>
<h3 style="font-family:'MS Serif', 'New York', serif;">Recommended Doctors</h3>
<ul>
    <li><strong>Name: </strong> Dr. rajan khurana<br>
        <strong>Specialities:</strong> Cancer specialist </li>

   </ul>

    </div>
    </div>
   <%@include file="footer.jsp" %>