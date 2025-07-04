/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author SAGNI
 */
public class Utils {
    public static String hashPassword(String password){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            
            StringBuilder sb = new StringBuilder();
            
            for(byte b:hashedBytes){
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            System.getLogger(Utils.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            throw new RuntimeException("Error hashing password", ex);
        }
    }
    
}
