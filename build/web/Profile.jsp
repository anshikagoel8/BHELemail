<%-- 
    Document   : Profile
    Created on : May 24, 2015, 4:17:07 PM
    Author     : Anshika Goel
--%>

<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
        <h1>Adding New User</h1>
        <s:form method="post" action="adding">
            <s:textfield label=" email ID" name="id"/>
           <s:textfield label="default password" name="pass"/>
           <s:textfield label=" employee no." name="eno"/>
           <s:textfield label="employee name" name="ename"/>
           <s:textfield label="designation" name="design"/>
           <s:textfield label="department" name="dept"/>
           <s:textfield label="date of birth" name="dob"/>
           <s:textfield label="contact number" name="contact"/>
           <s:textfield label="security keyword" name="security"/>
           <s:submit value="ADD"/> 
        </s:form>
      </div>
    </body>
</html>
        
        
