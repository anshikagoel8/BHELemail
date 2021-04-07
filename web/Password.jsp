<%-- 
    Document   : Password
    Created on : May 24, 2015, 4:17:43 PM
    Author     : Anshika Goel
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CHANGE PASSWORD</title>
        
    </head>
    <body>
      <table width="850" border="0" cellpadding="0" cellspacing="0">
       <!--DWLayoutTable-->
       <tr>
        <td width="375" height="130">&nbsp;</td>
        <td width="221">&nbsp;</td>
        <td width="254">&nbsp;</td>
       </tr>
      </table>
      <div align="center">
            <h1>CHANGE PASSWORD</h1>
            <strong><s:property value="msg"/></strong>
            <p></p>
            <s:form action="pass" method="post"  >
              <s:password label="OLD PASSWORD" name="t1"/>
              <s:password label="NEW PASSWORD" name="t2"/>
              <s:password label="RETYPE NEW PASSWORD" name="t3"/>
              <s:textfield label="NEW SECURITY KEYWORD" name="t5"/>
              <s:submit value="Change"/>
              <s:reset value="Reset"/>
              </s:form>
        </div>
    </body>
</html>
