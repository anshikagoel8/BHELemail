<%-- 
    Document   : Profile1
    Created on : Jun 13, 2015, 2:46:44 PM
    Author     : Anshika Goel
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table width="850" border="0" cellpadding="0" cellspacing="0">
       <!--DWLayoutTable-->
       <tr>
        <td width="375" height="80">&nbsp;</td>
        <td width="221">&nbsp;</td>
        <td width="254">&nbsp;</td>
       </tr>
      </table>
      <div align="center">
         <h1>PROFILE</h1>
        <h2>To edit profile make changes in the fields and then click 'SAVE CHANGES'</h2>
        <strong> <s:property value="msg"/></strong>
        <p></p>
        <s:form method="post" action="edit">
           <s:textfield label="EMPLOYEE NUMBER" name="eno"/>
           <s:textfield label="EMPLOYEE NAME" name="ename"/>
           <s:textfield label="DESIGNATION" name="design"/>
           <s:textfield label="DEPARTMENT" name="dept"/>
           <s:textfield label="DATE OF BIRTH" name="dob"/>
           <s:textfield label="CONTACT NUMBER" name="contact"/>
           <s:submit value="SAVE CHANGES" /> 
        </s:form>   
      </div>
    </body>
</html>
