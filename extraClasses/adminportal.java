/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package gui;

import gui1.changeEmail;
import gui1.changePassword;
import gui1.changeUsername;
import gui1.changephoneno;
import javax.swing.JFrame;

public class adminportal extends javax.swing.JFrame {
    String name=null;
 public adminportal(String n) {
        initComponents();
        name=n;
        nameLabel.setText(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        changepas = new javax.swing.JMenuItem();
        changeusrname = new javax.swing.JMenuItem();
        changeemail = new javax.swing.JMenuItem();
        changephone = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        viewstaff = new javax.swing.JMenuItem();
        viewaircraft = new javax.swing.JMenuItem();
        viewsector = new javax.swing.JMenuItem();
        viewflights = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        searchadmin = new javax.swing.JMenuItem();
        searchpass = new javax.swing.JMenuItem();
        searchflight = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        updatepass = new javax.swing.JMenuItem();
        updateflight = new javax.swing.JMenuItem();
        addflight = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        deletepass = new javax.swing.JMenuItem();
        delflight = new javax.swing.JMenuItem();
        deluser = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/startPagedemo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 40, 190, 138));

        nameLabel.setBackground(new java.awt.Color(204, 255, 204));
        nameLabel.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Admin name");
        nameLabel.setToolTipText("");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 200, 210, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 660));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Settings");

        jMenu2.setText("Manage profile");

        changepas.setText("ChangePassword");
        changepas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepasActionPerformed(evt);
            }
        });
        jMenu2.add(changepas);

        changeusrname.setText("Change username");
        changeusrname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeusrnameActionPerformed(evt);
            }
        });
        jMenu2.add(changeusrname);

        changeemail.setText("Change email");
        changeemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeemailActionPerformed(evt);
            }
        });
        jMenu2.add(changeemail);

        changephone.setText("Change phoneno");
        changephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changephoneActionPerformed(evt);
            }
        });
        jMenu2.add(changephone);

        fileMenu.add(jMenu2);

        jMenu4.setText("View");

        viewstaff.setText("Other staff members");
        jMenu4.add(viewstaff);

        viewaircraft.setText("Available Aircrafts");
        jMenu4.add(viewaircraft);

        viewsector.setText("Sector details");
        jMenu4.add(viewsector);

        viewflights.setText("Available flights");
        jMenu4.add(viewflights);

        fileMenu.add(jMenu4);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Operation");

        jMenu5.setText("Search");

        searchadmin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        searchadmin.setText("Admin");
        searchadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchadminActionPerformed(evt);
            }
        });
        jMenu5.add(searchadmin);

        searchpass.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        searchpass.setText("Passenger");
        searchpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchpassMouseClicked(evt);
            }
        });
        searchpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchpassActionPerformed(evt);
            }
        });
        jMenu5.add(searchpass);

        searchflight.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        searchflight.setText("Flight");
        searchflight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchflightMouseClicked(evt);
            }
        });
        searchflight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchflightActionPerformed(evt);
            }
        });
        jMenu5.add(searchflight);

        editMenu.add(jMenu5);

        jMenu6.setText("Update");

        updatepass.setText("Passenger details");
        updatepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatepassActionPerformed(evt);
            }
        });
        jMenu6.add(updatepass);

        updateflight.setText("Flight details");
        jMenu6.add(updateflight);

        editMenu.add(jMenu6);

        addflight.setText("Add flight");
        editMenu.add(addflight);

        jMenu7.setText("Delete");

        deletepass.setText("Passenger");
        jMenu7.add(deletepass);

        delflight.setText("Flight");
        jMenu7.add(delflight);

        deluser.setText("User account");
        jMenu7.add(deluser);

        editMenu.add(jMenu7);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        jMenu1.setText("Logout");
        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchflightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchflightMouseClicked
        SearchFlight s=new SearchFlight();
            s.setVisible(true);
            s.pack();
            s.setLocationRelativeTo(null);
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_searchflightMouseClicked

    private void searchpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchpassMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchpassMouseClicked

    private void searchpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchpassActionPerformed
        // TODO add your handling code here:
        searchPassenger s=new searchPassenger();
            s.setVisible(true);
            s.pack();
            s.setLocationRelativeTo(null);
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_searchpassActionPerformed

    private void searchflightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchflightActionPerformed
        // TODO add your handling code here:
        SearchFlight s=new SearchFlight();
            s.setVisible(true);
            s.pack();
            s.setLocationRelativeTo(null);
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_searchflightActionPerformed

    private void searchadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchadminActionPerformed
        // TODO add your handling code here:
        searchAdmin s=new searchAdmin();
            s.setVisible(true);
            s.pack();
            s.setLocationRelativeTo(null);
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_searchadminActionPerformed

    private void changepasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepasActionPerformed
        // TODO add your handling code here:
        changePassword s=new changePassword();
            s.setVisible(true);
            s.pack();
            s.setLocationRelativeTo(null);
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_changepasActionPerformed

    private void changeusrnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeusrnameActionPerformed
        // TODO add your handling code here:
        changeUsername s=new changeUsername();
            s.setVisible(true);
            s.pack();
            s.setLocationRelativeTo(null);
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_changeusrnameActionPerformed

    private void changeemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeemailActionPerformed
        // TODO add your handling code here:
        changeEmail s=new changeEmail();
            s.setVisible(true);
            s.pack();
            s.setLocationRelativeTo(null);
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_changeemailActionPerformed

    private void changephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changephoneActionPerformed
        // TODO add your handling code here:
        changephoneno s=new changephoneno();
            s.setVisible(true);
            s.pack();
            s.setLocationRelativeTo(null);
            s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_changephoneActionPerformed

    private void updatepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatepassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatepassActionPerformed

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
            java.util.logging.Logger.getLogger(adminportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new adminportal().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem addflight;
    private javax.swing.JMenuItem changeemail;
    private javax.swing.JMenuItem changepas;
    private javax.swing.JMenuItem changephone;
    private javax.swing.JMenuItem changeusrname;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem deletepass;
    private javax.swing.JMenuItem delflight;
    private javax.swing.JMenuItem deluser;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JMenuItem searchadmin;
    private javax.swing.JMenuItem searchflight;
    private javax.swing.JMenuItem searchpass;
    private javax.swing.JMenuItem updateflight;
    private javax.swing.JMenuItem updatepass;
    private javax.swing.JMenuItem viewaircraft;
    private javax.swing.JMenuItem viewflights;
    private javax.swing.JMenuItem viewsector;
    private javax.swing.JMenuItem viewstaff;
    // End of variables declaration//GEN-END:variables

}
