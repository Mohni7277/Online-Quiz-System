/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studpackage;
import java.sql.*;
/**
 *
 * @author Kommal Kaushal
 */
public class studcon {
    private Connection con;

    public studcon(Connection con) {
        this.con = con;
    }
    
    public boolean saveUser(studentities stud)
    {
        boolean f=false;
        try{
            String query = "insert into studdetails(username,email,password,education,mobno,dateofbirth) values (?,?,?,?,?,?)";
            
            PreparedStatement pstmt = this.con.prepareStatement(query);
            pstmt.setString(1, stud.getUname());
            pstmt.setString(2, stud.getEmail());
            pstmt.setString(3, stud.getPass());
            pstmt.setString(6, stud.getEdu());
            pstmt.setString(5, stud.getMob());
            pstmt.setString(4, stud.getDob());
            
            pstmt.executeUpdate();
            f=true;
                    
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    public studentities getUserByEmailAndPassword(String uname, String pass){
        studentities stud = null;
        
        try{
            
            String query = "select * from studdetails where username=? and password=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, uname);
            pstmt.setString(2, pass);
            
            ResultSet set = pstmt.executeQuery();
            
            if(set.next()){
                
                stud = new studentities();
                String name = set.getString("username");
                stud.setUname(name);
                
                stud.setEmail(set.getString("email"));
                stud.setPass(set.getString("password"));
                stud.setEdu(set.getString("education"));
                stud.setMob(set.getString("mobno"));
                stud.setDob(set.getString("dateofbirth"));
                
                
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return stud;
    }
    
}
