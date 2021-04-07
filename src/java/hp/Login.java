 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hp;
import java.util.Map;
import java.sql.*;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
/**
 *
 * @author Anshika Goel
 */
public class Login implements SessionAware{
    private String id,pass,user,msg;
    private SessionMap<String,Object> sessionMap;
    
    /**
     *
     * @param map
     */
    @Override
    public void setSession(Map<String,Object> map){
     sessionMap=(SessionMap)map;
    }
    public Login() {
    }
    
    public String execute() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","password");
        PreparedStatement pst=con.prepareStatement("select pass,ename from login where id=?");
        pst.setString(1, id);
        ResultSet rs=pst.executeQuery();
        while(rs.next())
        {
            String a=rs.getString(1);
            setUser(rs.getString(2));
            if(pass.equals(a))
            {
              sessionMap.put("user", user);
              sessionMap.put("id", id);
                return "success";
              
            }
        }
        msg="Oops! Wrong email-id or password";
       return "fail";
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
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
