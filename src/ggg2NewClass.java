
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nahian
 */
public class ggg2NewClass {
   static String x;
    public ggg2NewClass(String a){
        x = a;
    }
     

    public  void m() {
     
       
        
        
        try {
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            try (Connection con = DriverManager.getConnection("jdbc:odbc:Database22")) {
                PreparedStatement ps = con.prepareStatement("insert into Table1 (Address)values(?)");

                //ps.setString(1, a);
                ps.setString(1, x);
//                ps.setInt(4,101);
//                ps.setString(3, "brd");

                ps.executeUpdate();
                System.out.println("inserted");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
} 

