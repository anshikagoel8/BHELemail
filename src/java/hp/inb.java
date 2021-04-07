/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hp;

import java.sql.*;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Anshika Goel
 */
public class inb {
    private String t4;
    private ArrayList<NewClass> obj=new ArrayList<NewClass>();
    
    public inb() {
    }
    
    public String execute() throws Exception {
        HttpServletRequest request= ServletActionContext.getRequest();
        HttpSession session=request.getSession();
        setT4((String)session.getAttribute("id"));
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","password");
        PreparedStatement pst=con.prepareStatement("select id,topic,text from compose where to1=?");
        pst.setString(1, getT4());
        ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
              NewClass nc=new NewClass();
               nc.setId(rs.getString(1));
               nc.setTopic(rs.getString(2));
               nc.setText(rs.getString(3));
               getObj().add(nc);
            }
            return "inbox";
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
     * @return the obj
     */
    public ArrayList<NewClass> getObj() {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(ArrayList<NewClass> obj) {
        this.obj = obj;
    }

}  