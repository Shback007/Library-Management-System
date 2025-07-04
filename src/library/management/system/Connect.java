/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SAGNI
 */
public class Connect {
    public static Connection COnnection(){
        String db = "jdbc:mysql://localhost:3306/library";
        String username = "root";
        String password="sagnik";
        Connection con=null;
        try {
            con = DriverManager.getConnection(db,username,password);
        } catch (SQLException ex) {
            System.getLogger(Connect.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return con;
    }
}
