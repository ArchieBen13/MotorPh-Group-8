/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Archie
 */
public class dbConnection {
    public static Connection con() {
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
    
}
