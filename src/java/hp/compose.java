/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hp;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import java.sql.*;

/**
 *
 * @author Anshika Goel
 */
public class compose {
    private String to1,topic,text,msg,t4;
     private int i=0;
    public compose() {
  
    }
    
    public String execute() throws Exception {
       
        HttpServletRequest request= ServletActionContext.getRequest();
        HttpSession session=request.getSession();
       t4=(String)session.getAttribute("id");
        
       Class.forName("com.mysql.jdbc.Driver");
       
          Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root", "password");
          PreparedStatement pst=con.prepareStatement("select id from login");
          ResultSet rs=pst.executeQuery();
          while(rs.next())
          {
            String m=rs.getString(1);
            if(to1.equals(m))
            {          
             pst=con.prepareStatement("INSERT INTO COMPOSE VALUES(?,?,?,?)");
             pst.setString(1, to1);
             pst.setString(2, t4);
             pst.setString(3, topic);
             pst.setString(4, text);
             i=pst.executeUpdate();
             if(i>0)
             {
                 msg="Mail send successfully";
                 return "send";
             }
            
            }
          }
          if(i==0)
            {
                 pst=con.prepareStatement("INSERT INTO DRAFT VALUES(?,?,?,?)");
                 pst.setString(1, to1);
                 pst.setString(2, t4);
                 pst.setString(3, topic);
                 pst.setString(4, text);
                 i=pst.executeUpdate();
                 if(i>0)
                 {
                   msg="Invalid userID! Mail saved as a draft";
              
                 }
            }
          
          return "send";
                  
    }

    /**
     * @return the to1
     */
    public String getTo1() {
        return to1;
    }

    /**
     * @param to1 the to1 to set
     */
    public void setTo1(String to1) {
        this.to1 = to1;
    }


    /**
     * @return the topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * @param topic the topic to set
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
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

   
    
}
