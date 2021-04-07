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
public class drafts {
     private String t4;
     private ArrayList<NewClass> obj=new ArrayList<NewClass>();
    
    public drafts() {
    }
    
    public String execute() throws Exception {
        HttpServletRequest request= ServletActionContext.getRequest();
        HttpSession session=request.getSession();
        setT4((String)session.getAttribute("id"));
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","password");
        PreparedStatement pst=con.prepareStatement("select topic,text from draft where id=?");
        pst.setString(1, getT4());
        ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
              NewClass nc=new NewClass();
               nc.setTopic(rs.getString(1));
               nc.setText(rs.getString(2));
               getObj().add(nc);
            }
            return "draft";
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
