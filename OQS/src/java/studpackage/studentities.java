/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studpackage;
import java.sql.*;

public class studentities {
    private String uname;
    private String email;
    private String pass;
    private String mob;
    private String dob;
    private String edu;

    public studentities(String uname, String email, String pass, String mob, String dob, String edu) {
        this.uname = uname;
        this.email = email;
        this.pass = pass;
        this.mob = mob;
        this.dob = dob;
        this.edu = edu;
    }

    public studentities() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

}
