/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpppackage;
import java.sql.*;

/**
 *
 * @author Kommal Kaushal
 */
public class cppcon {
    
    private Connection con;

    public cppcon(Connection con) {
        this.con = con;
    }
    
    public boolean saveUser(cppentities cpp)
    {
        boolean f=false;
        try{
            String query = "insert into cppqb(op1, op2, op3, op4, ans, ques) values (?,?,?,?,?,?)";
            
            PreparedStatement pstmt = this.con.prepareStatement(query);
            pstmt.setString(1, cpp.getOpn1());
            pstmt.setString(2, cpp.getOpn2());
            pstmt.setString(3, cpp.getOpn3());
            pstmt.setString(4, cpp.getOpn4());
            pstmt.setString(5, cpp.getAns());
            pstmt.setString(6, cpp.getQuest());
            
            pstmt.executeUpdate();
            f=true;
                    
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
}
    
//    public facentities getUserByEmailAndPassword(String tuname, String tpass){
//        facentities fac = null;
//        
//        try{
//            
//            String query = "select * from facdetails where username=? and password=?";
//            PreparedStatement pstmt = con.prepareStatement(query);
//            pstmt.setString(1, tuname);
//            pstmt.setString(2, tpass);
//            
//            ResultSet set = pstmt.executeQuery();
//            
//            if(set.next()){
//                
//                fac = new facentities();
//                String name = set.getString("username");
//                fac.setTuname(name);
//                
//                fac.setTemail(set.getString("email"));
//                fac.setTpass(set.getString("password"));
//                fac.setTedu(set.getString("qualification"));
//                fac.setTmob(set.getString("mobno"));
//                fac.setTdob(set.getString("dateofbirth"));
//                
//                
//                
//            }
//            
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        
//        return fac;
//    }
//    
    
    
//}
