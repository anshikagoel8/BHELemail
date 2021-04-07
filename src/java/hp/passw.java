/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hp;

import java.sql.*;

/**
 *
 * @author Anshika Goel
 */
public class passw {
    private String t1,t2,t3,msg;
    public passw() {
    }
    
    public String execute() throws Exception {
         Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","password");
            if(t3.equals(t2))
            {
              PreparedStatement ps=con.prepareStatement("UPDATE LOGIN SET PASS=? WHERE SECURITY=?");
              ps.setString(1, t2);
              ps.setString(2, t1);
              int i=ps.executeUpdate();
              if(i>0)
              {
                setMsg("Now you may login with new password");
                return "success";
              }
            }
            else
            {
                msg="Passwords don't match";
            }
            return "fail";
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
    
}
