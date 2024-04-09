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
public class faccon {
    
    private Connection con;

    public faccon(Connection con) {
        this.con = con;
    }
    
    public boolean saveUser(facentities fac)
    {
        boolean f=false;
        try{
            String query = "insert into facdetails(username,email,password,mobno,dateofbirth,qualification) values (?,?,?,?,?,?)";
            
            PreparedStatement pstmt = this.con.prepareStatement(query);
            pstmt.setString(1, fac.getTuname());
            pstmt.setString(2, fac.getTemail());
            pstmt.setString(3, fac.getTpass());
            pstmt.setString(5, fac.getTmob());
            pstmt.setString(4, fac.getTdob());
            pstmt.setString(6, fac.getTedu());
            
            pstmt.executeUpdate();
            f=true;
                    
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    public facentities getUserByEmailAndPassword(String tuname, String tpass){
        facentities fac = null;
        
        try{
            
            String query = "select * from facdetails where username=? and password=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, tuname);
            pstmt.setString(2, tpass);
            
            ResultSet set = pstmt.executeQuery();
            
            if(set.next()){
                
                fac = new facentities();
                String name = set.getString("username");
                fac.setTuname(name);
                
                fac.setTemail(set.getString("email"));
                fac.setTpass(set.getString("password"));
                fac.setTedu(set.getString("qualification"));
                fac.setTmob(set.getString("mobno"));
                fac.setTdob(set.getString("dateofbirth"));
                
                
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return fac;
    }
    
    
}
