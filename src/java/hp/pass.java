/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import java.sql.*;

/**
 *
 * @author Anshika Goel
 */
public class pass {
    private String t1,t2,t3,t5;
    private String msg,t4;

    public pass(String t1, String t2, String t3, String t4, String t5) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t5 = t5;
    }
    public pass() {
    }
    
    public String execute() throws Exception {
        HttpServletRequest request= ServletActionContext.getRequest();
        HttpSession session=request.getSession();
       t4=(String)session.getAttribute("id");
       
       Class.forName("com.mysql.jdbc.Driver");
       
          Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root", "password");
          PreparedStatement pst=con.prepareStatement("Select pass from login where id=?");
          pst.setString(1, t4);
          ResultSet rs=pst.executeQuery();
          while(rs.next())
          {
            String a=rs.getString(1);
            if(a.equals(t1))
            {
              if(t2.equals(t3))
              {
                pst=con.prepareStatement("update login set pass=?,SECURITY=? where id=?");
                pst.setString(1, t2);
                pst.setString(2, t5);
                pst.setString(3, t4);
                int i=pst.executeUpdate();
                if(i>0)
                {
                        setMsg("Password changed successfully");
                     
                }
              }
              else
              {
                    setMsg("Retype new passwords as they don't match");
              }
            }
             else
            {
                setMsg("Incorrect password");
            }
                    
          }
          
         return "result";
    }

    /**
     * @return the t1
     */
    public String getT1() {
        return t1;
    }

    /**
     * @param t1 the t1 to set
     */
    public void setT1(String t1) {
        this.t1 = t1;
    }

    /**
     * @return the t2
     */
    public String getT2() {
        return t2;
    }

    /**
     * @param t2 the t2 to set
     */
    public void setT2(String t2) {
        this.t2 = t2;
    }

    /**
     * @return the t3
     */
    public String getT3() {
        return t3;
    }

    /**
     * @param t3 the t3 to set
     */
    public void setT3(String t3) {
        this.t3 = t3;
    }

    /**
     * @return the t4
     */
    public String getT4() {
        return t4;
    }

    /**
     * @param t4 the t4 to set
     */
    public void setT4(String t4) {
        this.t4 = t4;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the t5
     */
    public String getT5() {
        return t5;
    }

    /**
     * @param t5 the t5 to set
     */
    public void setT5(String t5) {
        this.t5 = t5;
    }
    
}
