<%@taglib prefix="s" uri="/struts-tags"%>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<body>
  <div id="main">
    <header>
      <div id="logo">
     
      
     <div id="logo_text">
          
         <h1 align="center">DOCTOR HOME</h1>
         
        </div>
      </div>
      <nav>
        <ul class="sf-menu" id="nav">
         
          <li><s:a href="viewpersonal_details.jsp">View Personal Details</s:a></li>
       <li><s:a href="doc_med_maintenence">Medicine Maintenence</s:a></li>
       <li><s:a href="doc_appointment_maintenence">Appointment Maintenence</s:a></li>
          
                   
         <li><s:a href="doc_change_password.jsp">Change Password</s:a></li>
         <li><s:a href="signout.jsp">Logout</s:a></li>
        </ul>
        
      </nav>
    </header>
<script type="text/javascript" src="js/jquery.js"></script>
  <script type="text/javascript" src="js/jquery.easing-sooper.js"></script>
  <script type="text/javascript" src="js/jquery.sooperfish.js"></script>
  <script type="text/javascript" src="js/image_fade.js"></script>
  <script type="text/javascript">
    $(document).ready(function() {
      $('ul.sf-menu').sooperfish();
    });
  </script>