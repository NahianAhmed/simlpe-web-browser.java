/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nahian
 */
public class gggNewClass {
    static String x;
    public gggNewClass(String a){
        x = a;
    }
     

    public  void m() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    //get current date time with Date()
    Date date = new Date();
    String a = (dateFormat.format(date));

        
       
       //String a="07-04-16";
       
        
        
        try {
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            try (Connection con = DriverManager.getConnection("jdbc:odbc:Database2")) {
                PreparedStatement ps = con.prepareStatement("insert into Table1 (id,Address)values(?,?)");

                ps.setString(1, a);
                ps.setString(2, x);

                ps.executeUpdate();
                System.out.println("inserted");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
    
