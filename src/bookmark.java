
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nahian
 */
public class bookmark extends javax.swing.JFrame {
String name;
    /**
     * Creates new form bookmark
     */
    public bookmark() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ta0 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ta1 = new javax.swing.JTextField();
        ta2 = new javax.swing.JTextField();
        ta3 = new javax.swing.JTextField();
        ta4 = new javax.swing.JTextField();
        ta5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        ak2 = new javax.swing.JButton();
        ak1 = new javax.swing.JButton();
        ak4 = new javax.swing.JButton();
        ak5 = new javax.swing.JButton();
        ak3 = new javax.swing.JButton();
        d1 = new javax.swing.JButton();
        d2 = new javax.swing.JButton();
        d3 = new javax.swing.JButton();
        d4 = new javax.swing.JButton();
        d5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ta0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ta0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta0ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Add bookmark");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta4ActionPerformed(evt);
            }
        });

        jButton2.setText("View All bookmarks");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ak2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ak2.setText("Visit");
        ak2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ak2ActionPerformed(evt);
            }
        });

        ak1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ak1.setText("Visit");
        ak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ak1ActionPerformed(evt);
            }
        });

        ak4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ak4.setText("Visit");
        ak4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ak4ActionPerformed(evt);
            }
        });

        ak5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ak5.setText("Visit");
        ak5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ak5ActionPerformed(evt);
            }
        });

        ak3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ak3.setText("Visit");
        ak3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ak3ActionPerformed(evt);
            }
        });

        d1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        d1.setText("delete");
        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });

        d2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        d2.setText("delete");
        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });

        d3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        d3.setText("delete");
        d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ActionPerformed(evt);
            }
        });

        d4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        d4.setText("delete");
        d4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4ActionPerformed(evt);
            }
        });

        d5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        d5.setText("delete");
        d5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(ta0, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(d2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ta2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(d3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ta3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(d4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ta4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(d5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ta5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(d1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ta1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ak5)
                            .addComponent(ak4)
                            .addComponent(ak3)
                            .addComponent(ak2)
                            .addComponent(ak1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ta0, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ta1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ak1)
                    .addComponent(d1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ta2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ak2)
                    .addComponent(d2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ta3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ak3)
                    .addComponent(d3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ta4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ak4)
                    .addComponent(d4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ta5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ak5)
                    .addComponent(d5))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ta0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ta0ActionPerformed

    private void ta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ta4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String x = ta0.getText();
        ggg2NewClass ob = new ggg2NewClass(x);
             ob.m();
             ta0.setText("");
                     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            Connection conn = DriverManager.getConnection("jdbc:odbc:Database22");
            java.sql.Statement st = conn.createStatement();
            String sql = "Select * from Table1";
            ResultSet rs = st.executeQuery(sql);
            
            rs.next(); {
//                ta0.setText(rs.getString(1)+"\t"+rs.getString(2));
//                ta1.setText(rs.getString(1)+"\t"+rs.getString(2));
//                ta2.setText(rs.getString(1)+"\t"+rs.getString(2));
                
                //id = rs.getString("id");
                name = rs.getString("Address");
                ta1.setText( name);
                

            }
            rs.next(); {

                
                name = rs.getString("Address");
                ta2.setText( name);
                

            }
            rs.next(); {
                
                
                
                name = rs.getString("Address");
                ta3.setText( name);
                

            }
            rs.next(); {
                
                
                
                name = rs.getString("Address");
                ta4.setText( name);
                

            }
            rs.next(); {
                
                
                
                name = rs.getString("Address");
                ta5.setText(name);
                

            } 
       }
            catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ak1ActionPerformed
      String x = ta1.getText();
        
        SimpleWebBrowser ob = new SimpleWebBrowser(x);
         
         ob.main();        
    }//GEN-LAST:event_ak1ActionPerformed

    private void ak2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ak2ActionPerformed
        String x = ta2.getText();
        
        SimpleWebBrowser ob = new SimpleWebBrowser(x);
         
         ob.main(); 
    }//GEN-LAST:event_ak2ActionPerformed

    private void ak3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ak3ActionPerformed
        String x = ta3.getText();
        SimpleWebBrowser ob = new SimpleWebBrowser(x);
         ob.main(); 
    }//GEN-LAST:event_ak3ActionPerformed

    private void ak4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ak4ActionPerformed
        String x = ta4.getText();
        SimpleWebBrowser ob = new SimpleWebBrowser(x);
         ob.main(); 
    }//GEN-LAST:event_ak4ActionPerformed

    private void ak5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ak5ActionPerformed
        String x = ta5.getText();
        SimpleWebBrowser ob = new SimpleWebBrowser(x);
         ob.main(); 
    }//GEN-LAST:event_ak5ActionPerformed

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        Connection con;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:Database22");
			String sql = "delete from Table1 where Address = '"+ta1.getText()+"'";
			Statement statement = con.createStatement();
			statement.execute(sql);
                        ta1.setText("");
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			
		}
    }//GEN-LAST:event_d1ActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        Connection con;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:Database22");
			String sql = "delete from Table1 where Address = '"+ta2.getText()+"'";
			Statement statement = con.createStatement();
			statement.execute(sql);
                        ta2.setText("");
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			
		}
    }//GEN-LAST:event_d2ActionPerformed

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
        Connection con;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:Database22");
			String sql = "delete from Table1 where Address = '"+ta3.getText()+"'";
			Statement statement = con.createStatement();
			statement.execute(sql);
                        ta3.setText("");
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			
		}
    }//GEN-LAST:event_d3ActionPerformed

    private void d4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4ActionPerformed
        Connection con;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:Database22");
			String sql = "delete from Table1 where Address = '"+ta4.getText()+"'";
			Statement statement = con.createStatement();
			statement.execute(sql);
                        ta4.setText("");
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			
		}
    }//GEN-LAST:event_d4ActionPerformed

    private void d5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5ActionPerformed
        Connection con;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:Database22");
			String sql = "delete from Table1 where Address = '"+ta5.getText()+"'";
			Statement statement = con.createStatement();
			statement.execute(sql);
                        ta5.setText("");
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			
		}
    }//GEN-LAST:event_d5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bookmark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookmark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookmark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookmark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookmark().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ak1;
    private javax.swing.JButton ak2;
    private javax.swing.JButton ak3;
    private javax.swing.JButton ak4;
    private javax.swing.JButton ak5;
    private javax.swing.JButton d1;
    private javax.swing.JButton d2;
    private javax.swing.JButton d3;
    private javax.swing.JButton d4;
    private javax.swing.JButton d5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField ta0;
    private javax.swing.JTextField ta1;
    private javax.swing.JTextField ta2;
    private javax.swing.JTextField ta3;
    private javax.swing.JTextField ta4;
    private javax.swing.JTextField ta5;
    // End of variables declaration//GEN-END:variables
}
