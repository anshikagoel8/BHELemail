<%-- 
    Document   : index
    Created on : May 20, 2015, 1:45:03 AM
    Author     : Anshika Goel
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="/struts-tags" prefix="p" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<!-- DW6 -->
<head>
<!-- Copyright 2005 Macromedia, Inc. All rights reserved. -->
<title>Home Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="mm_lodging1.css" type="text/css" />
</head>
<body bgcolor="#999966">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
	<td width="15" nowrap="nowrap"><img src="mm_spacer.gif" alt="" width="15" height="1" border="0" /></td>
	<td height="60" colspan="3" class="logo" nowrap="nowrap"><br />
	  BHARAT HEAVY ELECTRICALS LIMITED  </td>
	<td width="40">&nbsp;</td>
	<td width="100%">&nbsp;</td>
	</tr>

	<tr bgcolor="#ffffff">
	<td colspan="6"><img src="mm_spacer.gif" alt="" width="1" height="1" border="0" /></td>
	</tr>

	<tr bgcolor="#a4c2c2">
	<td width="15" nowrap="nowrap">&nbsp;</td>
	<td height="36" colspan="3" id="navigation" class="navText">&nbsp;
      <a href="aboutus.jsp">ABOUT US</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="vision.jsp">VISION, MISSION AND VALUES</a>&nbsp;
      &nbsp;&nbsp;&nbsp; <a href="research.jsp;">RESEARCH AND DEVELOPMENT</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <a href="contactus.jsp">CONTACT US</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	<td width="40">&nbsp;</td>
	<td width="100%">&nbsp;</td>
	</tr>

	<tr bgcolor="#ffffff">
	<td colspan="6"><img src="mm_spacer.gif" alt="" width="1" height="1" border="0" /></td>
	</tr>

	<tr bgcolor="#ffffff">
	<td width="230" colspan="2" valign="top" bgcolor="#a4c2c2"><img src="BHEL-Haridwar.jpg" alt="Home Page Image" width="300" height="250" border="0" />
	<table border="0" cellspacing="0" cellpadding="0" width="230">
	  <!--DWLayoutTable-->
		<tr>
		<td height="58" colspan="3" valign="top"><img src="wh.jpg" alt="Home Page Image" width="300" height="200" border="0" /></td>
		<td width="22"></td>
		</tr>
		<tr>
		  <td width="230" height="1"></td>
		  <td></td>
		  <td width="230"></td>
	      <td></td>
		</tr>
	</table>	</td>
	<td width="50" valign="top"><img src="mm_spacer.gif" alt="" width="50" height="1" border="0" /></td>
	<td width="440" valign="top"><br />
	<br />
	<table border="0" cellspacing="0" cellpadding="0" width="440">
	  <!--DWLayoutTable-->
		<tr>
                    <td class="pageName"><div align="center"><marquee>Welcome to BHEL_EMAILING SYSTEM</marquee></div></td>
		</tr><tr>
		<td class="bodyText">
		  <h6 align="center">kindly enter your account details to login.</h6>
                  <br/>
                </td>
                </tr> 
		
           
		<p:form action="log" method="post" >
                    <tr ><td class="sidebarText"><strong> <p:property value="msg"/></strong> </td></tr>
		<tr>
                    <th><p:textfield name="id" label="EMAIL ID" ></p:textfield></th>
		</tr>
                <tr>
                    <th><p:password name="pass" label="PASSWORD"></p:password></th>
		</tr>
                <tr>
                    <th><p:submit value="LOGIN"> </p:submit></th>        
                </tr>
                </p:form>
                   <th>&nbsp;</th>
                   <td>
                       NEW USER? :<a href="newuser.jsp">click here</a><br/><br/>
		    FORGOT PASSWORD? :<a href="forgot.jsp">click here</a>
                    </td>
          
		     <td height="130"></td>
	    </tr>
	</table>
        <table>
        <tr>
	 <td width="40">&nbsp;</td>
	 <td width="100%">&nbsp;</td>
	</tr>

	<tr bgcolor="#ffffff">
	 <td colspan="6"><img src="mm_spacer.gif" alt="" width="1" height="1" border="0" /></td>
	</tr>

	<tr>
	<td width="15">&nbsp;</td>
	<td width="215">&nbsp;</td>
	<td width="50">&nbsp;</td>
	<td width="440">&nbsp;</td>
	<td width="40">&nbsp;</td>
	<td width="100%">&nbsp;</td>
	</tr>
</table>
</body>
</html>



