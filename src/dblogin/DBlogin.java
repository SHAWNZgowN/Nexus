/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dblogin;
import java.sql.Connection;
import java.sql.DriverManager;


public class DBlogin {
    
    public static Connection mycon(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/loginregister" ,"root", "");
            
        } catch (Exception e){
            System.out.println(e);
        }
        
        return con;
    }
}
