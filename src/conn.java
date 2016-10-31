

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conn {
 String id,name,bday;
    public void show(){ 
      try 
      { Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  
   Connection conn = DriverManager.getConnection("jdbc:odbc:Database22");
          java.sql.Statement st = conn.createStatement(); 
  String sql = "Select * from Table1"; 
  ResultSet rs = st.executeQuery(sql);
  while(rs.next())
  { 
      //System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
   //id = rs.getString("id");
   name = rs.getString("Address");
 
  
     System.out.println("\t"+name);
 
  
  }
      
   }
catch (ClassNotFoundException | SQLException e) 
{ System.out.println(e.getMessage()); }   
}

    void setValue(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
