<%@taglib prefix="s" uri="/struts-tags"%>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<body>
  <div id="main">
    <header>
      <div id="logo">
     
      
     <div id="logo_text">
          
         <h1 align="center">PATIENT HOME</h1>
         
        </div>
      </div>
      <nav>
        <ul class="sf-menu" id="nav">
         
          <li><s:a href="pat_viewpersonal_details.jsp">View Personal Details</s:a></li>
       <li><s:a href="pat_symptom_checker.jsp">Symptom Checker</s:a></li>
   <li><a href="#">Request Appointment</a>
              <ul>
       <li><s:a href="pat_req_appointment.jsp"> Request Appointment</s:a></li>
       <s:url id="modifyurl" action="cancelapp"/>
            <li><s:a href="viewapp_token.jsp">View Appointment & Token no</s:a></li> 
     
              
              
              </ul></li>

          
                   
         <li><s:a href="pat_change_password.jsp">Change Password</s:a></li>
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