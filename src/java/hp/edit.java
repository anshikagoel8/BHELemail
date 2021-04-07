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
public class edit {
     private String t4,ename,design,dept,dob,msg;
     private int eno,contact;
    public edit() {
    }
    
    public String execute() throws Exception {
        HttpServletRequest request= ServletActionContext.getRequest();
        HttpSession session=request.getSession();
        t4=(String)session.getAttribute("id");
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","password");
            PreparedStatement pst=con.prepareStatement("update login set eno=?,ename=?,design=?,dept=?,dob=?,contact=? where id=?");
            pst.setInt(1, eno);
            pst.setString(2, ename);
            pst.setString(3, design);
            pst.setString(4, dept);
            pst.setString(5, dob);
            pst.setInt(6, contact);
            pst.setString(7, t4);
            int i=pst.executeUpdate();
            if(i>0)
            {
             setMsg("Successfully edited");
            }
            else
            {
              setMsg("Error occurred!");
            }
            return "edit";
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
     * @return the ename
     */
    public String getEname() {
        return ename;
    }

    /**
     * @param ename the ename to set
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    /**
     * @return the design
     */
    public String getDesign() {
        return design;
    }

    /**
     * @param design the design to set
     */
    public void setDesign(String design) {
        this.design = design;
    }

    /**
     * @return the dept
     */
    public String getDept() {
        return dept;
    }

    /**
     * @param dept the dept to set
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
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
     * @return the eno
     */
    public int getEno() {
        return eno;
    }

    /**
     * @param eno the eno to set
     */
    public void setEno(int eno) {
        this.eno = eno;
    }

    /**
     * @return the contact
     */
    public int getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(int contact) {
        this.contact = contact;
    }
    
}
