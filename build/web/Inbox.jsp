<%-- 
    Document   : index
    Created on : May 20, 2015, 1:45:25 AM
    Author     : Anshika Goel
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INBOX</title>
        <style type="text/css">
           <!-- .sty1{
              border: 1px solid #000055;
     
            }

           .sty2{
               background-color: #000055;
               color: #ffcc33;
            
            }
            -->
       </style>
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
        <h1>INBOX</h1>
        <table class="sty1" align="center" border="1">
            <tr>
                <th class="sty2" width="100">FROM</th>
                <th class="sty2" width="100">SUBJECT</th>
                <th class="sty2" width="800">MESSAGE</th>
            </tr>
        <s:iterator value="obj" >
        
            
            <tr>
                <td width="100"><s:property value="id"/></td>
                <td width="100"><s:property value="topic"/></td>
                <td width="800"><s:property value="text"/></td>
            </tr>
        
        </s:iterator>
        </table>
    </body>
</html>
