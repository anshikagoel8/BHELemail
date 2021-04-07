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
public class check {
    private String t1,t2,id,msg;
    public check() {
    }
    
    public String execute() throws Exception {
        id="administrator@bhel.com";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","password");
        PreparedStatement pst=con.prepareStatement("select pass,security from login where id=?");
        pst.setString(1, id);
        ResultSet rs=pst.executeQuery();
        while(rs.next())
        {
            String a=rs.getString(1);
            String b=rs.getString(2);
            if((t2.equals(a))&&(t1.equals(b)))
            {
                return "success";
              
            }
        }
        setMsg("Oops! Wrong Inputs");
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
