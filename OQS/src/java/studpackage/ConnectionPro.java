/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studpackage;
import java.sql.*;

public class ConnectionPro {
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            
            if(con==null){
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/oqs_database", "root", "Kaajal@20");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}