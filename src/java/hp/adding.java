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
public class adding {
     private String id,pass,ename,design,dept,dob,msg,security;
      private int eno,contact;
    public adding() {
    }
    
    public String execute() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","password");
            PreparedStatement pst=con.prepareStatement("INSERT INTO login VALUES(?,?,?,?,?,?,?,?,?)" );
            pst.setString(1, id);
            pst.setString(2, pass);
            pst.setInt(3, getEno());
            pst.setString(4, getEname());
            pst.setString(5, getDesign());
            pst.setString(6, getDept());
            pst.setString(7, getDob());
            pst.setInt(8, getContact());
            pst.setString(9, getSecurity());
            int i=pst.executeUpdate();
            if(i>0)
            {
             setMsg("Successfully added");
            }
            else
            {
              setMsg("Error occurred!");
            }
            return "success";
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
     * @return the security
     */
    public String getSecurity() {
        return security;
    }

    /**
     * @param security the security to set
     */
    public void setSecurity(String security) {
        this.security = security;
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
