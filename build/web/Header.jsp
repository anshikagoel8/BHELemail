<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
<style type="text/css">
<!--
.style2 {
	color: #ffcc33;
	font-weight: bold;
	font-family: "arial", Times, serif;
	font-size: 30px;
        }
.style1 {color: #C6E0DC}
-->

</style>
</head>

<body
 
    <!-- 
      String uid=request.getParameter("id");
      session.setAttribute("userid", uid);
      String username=request.getParameter("user");
      session.setAttribute("uname",username);
    -->
    <table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#000055">
  <!--DWLayoutTable-->
  <tr>
      <td width="100%" height="55" valign="middle" align="center"> 
          <div align="center">
                 <span class="style2">Bharat Heavy Electricals Limited</span>
          </div>
      </td>
  </tr>
  <tr>
      <td width="100%" height="10" valign="middle" align="center"> 
          <div align="center">
                 <span class="style1"> Welcome   <s:property value="#session.user"/> !</span>
          </div>
      </td>
  </tr>
  <tr>
      <td align="right" >
          <span class="style1">
              <form action="logout.jsp">
                  <input type="submit" value="logout"/>&nbsp;&nbsp;&nbsp;<br/>
              </form>
          </span>
      </td>
  </tr>
</table>

</body>
</html>

