/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aayush Kasera
 */
public class database {
    PreparedStatement stmt=null;
    
    public void addmember(String Name,String id,String Address,String Mobile){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://sql201.epizy.com:3306/epiz_27241891_Library","epiz_27241891","9549Atrangi")) {
                String sql="INSERT INTO members(id,name,address,mobile)"
                        + "VALUES(?,?,?,?);";
                stmt=con.prepareStatement(sql);
                stmt.setInt(1,Integer.parseInt(id));
                stmt.setString(2,Name);
                stmt.setString(3,Address);
                stmt.setString(4,Mobile);
                stmt.executeUpdate();
            }
            stmt.close();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void addbook(String Name,String id,String Address,String Mobile){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://sql201.epizy.com:3306/epiz_27241891_Library","epiz_27241891","9549Atrangi");
            String sql="INSERT INTO books(id,name,author,publisher)"
                    + "VALUES(?,?,?,?);";
            stmt=con.prepareStatement(sql);
            stmt.setInt(1,Integer.parseInt(id));
            stmt.setString(2,Name);
            stmt.setString(3,Address);
            stmt.setString(4,Mobile);
            stmt.executeUpdate();
            con.close();
            stmt.close();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void issue(String bookid,String memberid){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://sql201.epizy.com:3306/epiz_27241891_Library","epiz_27241891","9549Atrangi");
            String sql="update members set issue=? where id=?";
            stmt=con.prepareStatement(sql);
            stmt.setInt(1,Integer.parseInt(bookid));
            stmt.setInt(2,Integer.parseInt(memberid));
            
            stmt.executeUpdate();
            sql="update books set issue=? where id=?";
            stmt=null;
            stmt=con.prepareStatement(sql);
            stmt.setInt(1,Integer.parseInt(memberid));
            stmt.setInt(2,Integer.parseInt(bookid));
            stmt.executeUpdate();
            con.close();
            stmt.close();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
