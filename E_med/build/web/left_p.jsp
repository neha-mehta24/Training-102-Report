
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="row">
    <div class="span3">
        <div class="well" style="padding: 12px 0;">
            <ul class="nav nav-list">
                <h3><li class="nav-header">Project Management</li></h3>
                <li><s:url id="fillostechdb" action="FillOSTechDB"/>
<s:a href="%{fillostechdb}">Add Project</s:a></li>
                <li><s:url id="fillproject" action="editproject"/>
<s:a href="%{fillproject}">Edit Project</s:a></li>
 <li><s:url id="fillproject" action="fillproject"/>
<s:a href="%{fillproject}">View Project</s:a></li>
 <li><s:url id="fillprofile" action="Fillprofile"/>
<s:a href="%{fillprofile}">Edit Profile</s:a></li>
 <li><s:url id="fillbidding" action="fillbidding"/>
<s:a href="%{fillbidding}">View Bidding</s:a></li>

            </ul>
        </div>
    </div>
    <div class="span9">