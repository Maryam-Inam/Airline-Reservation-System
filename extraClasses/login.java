/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    String query=null;
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    public static Home2 sf;
    public static flightdetails fldetails;
    String name=null;
    String password=null;
    
    public login() {
        initComponents();
         try{Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ars_data","root","root");
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        jPanel1.setBackground(new Color(0,0,0,100));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                                               
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
        jusername = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        jlogin = new javax.swing.JButton();
        create = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcancel = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusernameActionPerformed(evt);
            }
        });

        jpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasswordActionPerformed(evt);
            }
        });
        jpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpasswordKeyPressed(evt);
            }
        });

        jlogin.setText("login");
        jlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jloginMouseClicked(evt);
            }
        });
        jlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginActionPerformed(evt);
            }
        });

        create.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        create.setForeground(new java.awt.Color(153, 0, 0));
        create.setText("Create new account!");
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

        jLabel3.setText("Password");

        jLabel2.setText("UserName");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("LOGIN");

        jcancel.setText("Cancel");
        jcancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcancelMouseClicked(evt);
            }
        });
        jcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcancelActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "USER", "ADMIN" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel4.setText("You are");

        jButton2.setText("Search flights (Login NOT Required)");
        jButton2.setActionCommand("Inquire about  flights");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jcancel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jusername, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(create))
                            .addComponent(jButton2))
                        .addGap(6, 6, 6)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlogin)
                    .addComponent(jcancel))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(create)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 470, 460));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1360, 900));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 910));

        pack();
    }// </editor-fold>                        
    // Variables declaration - do not modify                     
    private void jcancelActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void createMouseExited(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        Font font = create.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        create.setFont(font.deriveFont(attributes));
        create.setForeground(Color.WHITE);
    }                                  

    private void createMouseEntered(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        Font font = create.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        create.setFont(font.deriveFont(attributes));
        create.setForeground(Color.PINK);
    }                                   

    private void createMouseClicked(java.awt.event.MouseEvent evt) {                                    
        Register l=new Register();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }                                   
    public void loginby()
{
     name=jusername.getText();
     password=jpassword.getText();
    if(jComboBox1.getSelectedItem().toString().equals("USER"))
        {
            query="SELECT * FROM ars_data.registered_passengers where username='" + name + "'and password='" + password + "'";
        }
            else if(jComboBox1.getSelectedItem().toString().equals("ADMIN"))
        {
            query="SELECT * FROM ars_data.staff where adminname='" + name + "'and password='" + password + "'";
        }
}
    public void loginNow()
{
     try{
             st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                loginby();
                rs = st.executeQuery(query);
                boolean empty = true;
                if (rs.next()) 
                {
                    empty = false;
                 
                if(name.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Enter Username/adminname!");
                }
                else if(password.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Enter Password!");
                }
                else
                {
                     if(jComboBox1.getSelectedItem().toString().equals("USER"))
                     {
                        Home2 h=new Home2();
                        h.setVisible(true);
                        h.pack();
                        h.setLocationRelativeTo(null);
                        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                     }
                     else if(jComboBox1.getSelectedItem().toString().equals("ADMIN"))
                     {
                        adminportal h=new adminportal(name);
                        h.setVisible(true);
                        h.pack();
                        h.setLocationRelativeTo(null);
                        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                     }
                }
            }
            else 
                    JOptionPane.showMessageDialog(null,"invalid username or password!");
        }
        catch(Exception e)
        {
            System.out.println("error with connection "+e);
        }
}
    private void jloginMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        loginNow();

    }                                   

    private void jpasswordActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jusernameActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void inboxMouseExited(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:

        Font font = inbox.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        inbox.setFont(font.deriveFont(attributes));
        inbox.setForeground(Color.BLACK);
    }                                 

    private void inboxMouseEntered(java.awt.event.MouseEvent evt) {                                   
       
    }                                  

    private void inboxMouseClicked(java.awt.event.MouseEvent evt) {                                   

    }                                  

    private void jcancelMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        System.exit(0);
    }                                    

    private void jpasswordKeyPressed(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
            loginNow();
    }                                    

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {                                            
        // TODO add your handling code here:
          if(jComboBox1.getSelectedItem().toString().equals("USER"))
        {
            jLabel2.setText("User name:");
        }
            else if(jComboBox1.getSelectedItem().toString().equals("ADMIN"))
        {
            jLabel2.setText("Admin name");
        }
    }                                           

    private void jloginActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        searchFlights sf = new searchFlights("null");
           sf.setVisible(true);
           sf.pack();
           sf.setLocationRelativeTo(null);
           sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.dispose();
    }                                        

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               login l= new login();
               l.setVisible(true);
               l.setLocationRelativeTo(null);
            l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel create;
    private javax.swing.JLabel inbox;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jcancel;
    private javax.swing.JButton jlogin;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jusername;
    // End of variables declaration                                     
}
