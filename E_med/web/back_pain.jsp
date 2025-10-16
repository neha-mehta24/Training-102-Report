
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
          <img width="1050" height="250" src="images/backpain.jpg"  />
       
      </div>
     
<div class="content2">

<center>
 <h2 font-size="20">Spine Services</h2></center>
    <p>At Seven Hills Spine Center, we are dedicated to helping people of all ages,
    with a variety back, neck and spine conditions, lead pain free, healthy lives again. We provide comprehensive 
    spine & neck surgery and spine care, from initial diagnosis through post-treatment and rehabilitation. 
    If you are considering back or neck surgery, speak to one of our neurosurgery spine specialists first.</p>

<p>We treat all types of back, neck, spine and spine-related disorders ? from the more common to the most complex.
    We specialize in upper, mid and lower back pain , spinal deformity and scoliosis. We also have experts that treat
    spine fractures, spinal cord injuries, and tumors of the spine.</p>
<hr>
<h3 style="font-family:'MS Serif', 'New York', serif;">Recommended Doctors</h3>
<ul>
    <li><strong>Name: </strong> Dr. Ramesh Sobti<br>
        <strong>Specialities:</strong> Neuro-Spine Surgery, Spine Evaluation, Trauma- Neuro Critical Care  </li>

   </ul>

    </div>
    </div>
   <%@include file="footer.jsp" %>