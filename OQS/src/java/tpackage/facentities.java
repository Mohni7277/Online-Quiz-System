/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpackage;
import java.sql.*;

/**
 *
 * @author Kommal Kaushal
 */
public class facentities {
    
    private String tuname;
    private String temail;
    private String tpass;
    private String tmob;
    private String tdob;
    private String tedu;

    public facentities(String tuname, String temail, String tpass, String tmob, String tdob, String tedu) {
        this.tuname = tuname;
        this.temail = temail;
        this.tpass = tpass;
        this.tmob = tmob;
        this.tdob = tdob;
        this.tedu = tedu;
    }

    public facentities() {
    }

    public String getTuname() {
        return tuname;
    }

    public void setTuname(String tuname) {
        this.tuname = tuname;
    }

    public String getTemail() {
        return temail;
    }

    public void setTemail(String temail) {
        this.temail = temail;
    }

    public String getTpass() {
        return tpass;
    }

    public void setTpass(String tpass) {
        this.tpass = tpass;
    }

    public String getTmob() {
        return tmob;
    }

    public void setTmob(String tmob) {
        this.tmob = tmob;
    }

    public String getTdob() {
        return tdob;
    }

    public void setTdob(String tdob) {
        this.tdob = tdob;
    }

    public String getTedu() {
        return tedu;
    }

    public void setTedu(String tedu) {
        this.tedu = tedu;
    }


    
}
