<%@taglib prefix="s" uri="/struts-tags"%>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<body>
  <div id="main">
    <header>
      <div id="logo">
     
      
     <div id="logo_text">
          
         <h1 align="center">ADMIN HOME</h1>
         
        </div>
      </div>
      <nav>
        <ul class="sf-menu" id="nav">
         
          <li><s:a href="#">Patients</s:a>
       <ul>
    <li><s:a href="patient_master.jsp">Add Patient Details</s:a></li>
   <s:url id="deleteurl" action="delPatient"/>
    <li><s:a href="%{deleteurl}">Delete Patient Details</s:a></li>
        <s:url id="modifyurl" action="modPatient"/>
        <li><s:a href="%{modifyurl}"> Edit Patient Details</s:a></li>
</ul>
       </li>
    
      
         <li><s:a href="#">Appointments</s:a>
  <ul>
         <li><s:a href="appointment_requests.jsp">Appointment Requests</s:a></li>
        <li><s:a href="displayboard.jsp">Display Board</s:a></li>
    <li><s:a href="appointment_master.jsp">Add Appointment Details</s:a></li>

</ul>      
              </li>
              
            
          <li><a href="#">Settings</a>
              <ul>
                   
         <li><s:a href="change_password.jsp">Change Password</s:a></li>
         <li><s:a href="signout.jsp">Logout</s:a></li> 
               <li><s:a href="reset.jsp">Reset</s:a></li>
          
          
          </ul></li>
     
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
    