/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        jPanel1.setBackground(new Color(0,0,0,100));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        inbox = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jfname = new javax.swing.JTextField();
        jpassword2 = new javax.swing.JPasswordField();
        jcreate = new javax.swing.JButton();
        create = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jemail = new javax.swing.JTextField();
        jphoneno = new javax.swing.JTextField();
        jcity = new javax.swing.JTextField();
        jusername = new javax.swing.JTextField();
        jlname = new javax.swing.JTextField();
        jpassword1 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1709, 0, -1, -1));

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inbox.setBackground(new java.awt.Color(255, 255, 255));
        inbox.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        inbox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inbox.setText("Contact Us");
        inbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inboxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inboxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inboxMouseExited(evt);
            }
        });
        jPanel9.add(inbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 128, -1));

        jLabel8.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Airline Reservation System");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel9.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 1703, 10));

        jPanel5.setLayout(null);

        jLabel9.setText("hfghtdfgkhvjhlbuhkvhbhjghjkbi");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(414, 1070, 148, 14);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.jpg"))); // NOI18N
        jPanel5.add(jLabel10);
        jLabel10.setBounds(200, 73, 1400, 933);

        jPanel9.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 1703, -1));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 1380, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setText("Prepare for Takeoff.. on the Cheapest Flights Around ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 620, 60));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfnameActionPerformed(evt);
            }
        });
        jPanel1.add(jfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 170, -1));

        jpassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassword2ActionPerformed(evt);
            }
        });
        jPanel1.add(jpassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 170, -1));

        jcreate.setText("Create Account");
        jcreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcreateMouseClicked(evt);
            }
        });
        jPanel1.add(jcreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        create.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        create.setForeground(new java.awt.Color(153, 0, 0));
        create.setText("Already have an account?");
        create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createMouseExited(evt);
            }
        });
        jPanel1.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Re-enter pass:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Register Yourself");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 11, 229, -1));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone no");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 50, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("UserName");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Last Name");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jemailActionPerformed(evt);
            }
        });
        jPanel1.add(jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 170, -1));

        jphoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jphonenoActionPerformed(evt);
            }
        });
        jPanel1.add(jphoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 170, -1));

        jcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcityActionPerformed(evt);
            }
        });
        jPanel1.add(jcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 170, -1));

        jusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusernameActionPerformed(evt);
            }
        });
        jPanel1.add(jusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 170, -1));

        jlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlnameActionPerformed(evt);
            }
        });
        jPanel1.add(jlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 170, -1));

        jpassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassword1ActionPerformed(evt);
            }
        });
        jPanel1.add(jpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 170, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Password");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 470, 450));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1360, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1339, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 932, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inboxMouseClicked

    }//GEN-LAST:event_inboxMouseClicked

    private void inboxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inboxMouseEntered

    }//GEN-LAST:event_inboxMouseEntered

    private void inboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inboxMouseExited
        // TODO add your handling code here:

        Font font = inbox.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        inbox.setFont(font.deriveFont(attributes));
        inbox.setForeground(Color.BLACK);
    }//GEN-LAST:event_inboxMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseExited
        // TODO add your handling code here:
        Font font = create.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        create.setFont(font.deriveFont(attributes));
        create.setForeground(Color.WHITE);
    }//GEN-LAST:event_createMouseExited

    private void createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseEntered
        // TODO add your handling code here:
        Font font = create.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        create.setFont(font.deriveFont(attributes));
        create.setForeground(Color.PINK);
    }//GEN-LAST:event_createMouseEntered

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        LoginPage l=new LoginPage();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }//GEN-LAST:event_createMouseClicked
public boolean verifyFields()
{
    String fname = jfname.getText();
        String lname = jlname.getText();
        String usr=jusername.getText();
        String city=jcity.getText();
        String phoneno= jphoneno.getText();
        String email=jemail.getText();
        String pass1=jpassword1.getText();
        String pass2=jpassword2.getText();
        
    if(fname.trim().equals("")||lname.trim().equals("")||pass2.trim().equals("")||
            usr.trim().equals("")||city.trim().equals("")||phoneno.trim().equals("")||
            email.trim().equals("")||pass1.trim().equals(""))
    {
        JOptionPane.showMessageDialog(rootPane, "One or more field is empty");
        return false;
    }
    else if(!pass1.equals(pass2))
    {
         JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2); 
           return false;
    }
    else{
    return true;}
}
public boolean userExists(String usr)
{
    Connection con;
    PreparedStatement stat;
    ResultSet rs;
    
    boolean userExists=false;
          String query = "SELECT * FROM registered_passengers where username='"+usr+"'";
          try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ars_data","root","root");
            
            stat=con.prepareStatement(query);
            rs=stat.executeQuery(query);
            if(rs.next())
            {
                if(usr.equals(rs.getString("username")))
                {
                     JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed", 2);
                    userExists=true;
                }
            }
            else{
                userExists=false ;
            }
          }
          catch(SQLException ex)
          {
              System.out.println("error with connection");
          }
          
    return userExists;
    
}
    private void jcreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcreateMouseClicked
        Connection con;
        PreparedStatement pst;
        PreparedStatement cnt;
        ResultSet rs;
        String fname = jfname.getText();
        String lname = jlname.getText();
        String usr=jusername.getText();
        String city=jcity.getText();
        String phoneno= jphoneno.getText();
        String email=jemail.getText();
        String pass1=jpassword1.getText();
        String pass2=jpassword2.getText();
        if(verifyFields())
        {
            if(!userExists(usr))
            {
               try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ars_data","root","root");
                   System.out.println("connection successfully built");
                    
            String query="select count(userId) from registered_passengers";
            String query2="INSERT INTO registered_passengers(userId, fName, lName,email,phoneNo, city, password, username) VALUES (?,?,?,?,?,?,?,?)";
              cnt=con.prepareStatement(query);
              rs=cnt.executeQuery(query);
              if(rs.next())
              {
                  int count=rs.getInt(1);
              
            pst=con.prepareStatement(query2);
            pst.setInt(1, ++count);
            pst.setString(2, fname);
            pst.setString(3, lname);
            pst.setString(4, email);
            pst.setString(5, phoneno);
            pst.setString(6, city);
            pst.setString(7, pass1);
            pst.setString(8, usr);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registered Successfully!");
            con.close();
            
            LoginPage h=new LoginPage();
                    h.setVisible(true);
                    h.pack();
                    h.setLocationRelativeTo(null);
                    h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();
              }
            
        }
            
        catch(SQLException e)
        {
            System.out.println("connection error"+e);
        } 
            }
        }   
    }//GEN-LAST:event_jcreateMouseClicked

    private void jpassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassword2ActionPerformed

    private void jfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfnameActionPerformed

    private void jemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jemailActionPerformed

    private void jphonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jphonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jphonenoActionPerformed

    private void jcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcityActionPerformed

    private void jusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jusernameActionPerformed

    private void jlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlnameActionPerformed

    private void jpassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassword1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel create;
    private javax.swing.JLabel inbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jcity;
    private javax.swing.JButton jcreate;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jfname;
    private javax.swing.JTextField jlname;
    private javax.swing.JPasswordField jpassword1;
    private javax.swing.JPasswordField jpassword2;
    private javax.swing.JTextField jphoneno;
    private javax.swing.JTextField jusername;
    // End of variables declaration//GEN-END:variables
}
