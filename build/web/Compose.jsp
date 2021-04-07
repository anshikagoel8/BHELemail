<%-- 
    Document   : Compose
    Created on : May 24, 2015, 4:16:21 PM
    Author     : Anshika Goel
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>COMPOSE</title>
        
    </head>
    <body>
        <table width="850" border="0" cellpadding="0" cellspacing="0">
       <!--DWLayoutTable-->
       <tr>
        <td width="375" height="100">&nbsp;</td>
        <td width="221">&nbsp;</td>
        <td width="254">&nbsp;</td>
       </tr>
      </table>
      <div align="center">
        <h1>NEW MESSAGE</h1>
        <s:property value="msg"/><br/><br/>
        <s:form method="post" action="compose">
            <s:textfield label="TO" name="to1"/>
            <s:textfield label="SUBJECT" name="topic"/>
            <s:textarea label="MESSAGE" name="text"/>
            <s:submit value="SEND"/>
            <s:reset value="RESET"/>
        </s:form>
      </div>
    </body>
</html>
