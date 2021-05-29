
package gui;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Date;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class updateAircraft extends javax.swing.JFrame {
Connection con;
    SimpleDateFormat sdf,sdf1;
    ResultSet rs;
    Statement st;
    DateFormat timeFormat;
    String aircraftid = "", name="",airportCode="";
    String expirydate="";
    int bseats=0, xseats=0,eseats=0;
    public updateAircraft() {
        initComponents();
        try{Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ars_data","root","root");
            sdf= new SimpleDateFormat("dd-MM-yyyy");
            sdf1= new SimpleDateFormat("yyyy-MM-dd");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void setdata(Object id,Object nm,Object code,Object bs,Object xs, Object es,Object exp )
    {
    
        aircraftid=id.toString();
        name=nm.toString();
        airportCode=code.toString();
        this.bseats=(Integer)bs;
        this.xseats=(Integer)xs;
        this.eseats=(Integer)es;
        expirydate=exp.toString();
        displaydata();
    }
    public void getAirportCode()
    {
        String query1="select airportCode from airport";
        try{ 
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                rs = st.executeQuery(query1);
                boolean empty = true;
                while (rs.next()) {
                int i=1;
                    empty = false;
                    jaircode.addItem(rs.getString(i));
                    i++;
                }
                jaircode.setSelectedItem(airportCode);
                    }
           catch (SQLException ex) {
               System.out.println(ex.getMessage());
                }
    
    }
    public void displaydata()
    { 
        jbseats.setText(Integer.toString(bseats));
        jxseats.setText(Integer.toString(xseats));
        jeseats.setText(Integer.toString(eseats));
        jaircraftno.setText(aircraftid);
        jname.setText(name);
        jexpirydate.setText(expirydate);
        getAirportCode();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        flights = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logout = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBack = new javax.swing.JButton();
        jaircraftno = new javax.swing.JTextField();
        jbseats = new javax.swing.JTextField();
        jexpirydate = new javax.swing.JTextField();
        jreset = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jxseats = new javax.swing.JTextField();
        jaircode = new javax.swing.JComboBox<>();
        jeseats = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1709, 0, -1, -1));

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        flights.setBackground(new java.awt.Color(255, 255, 255));
        flights.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        flights.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flights.setText("Flights");
        flights.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        flights.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flightsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                flightsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                flightsMouseExited(evt);
            }
        });
        jPanel9.add(flights, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 121, -1));

        jLabel12.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Airline Reservation System");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel9.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 1703, 10));

        logout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        jPanel9.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, 100, -1));

        jPanel5.setLayout(null);

        jLabel13.setText("hfghtdfgkhvjhlbuhkvhbhjghjkbi");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(414, 1070, 148, 14);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.jpg"))); // NOI18N
        jPanel5.add(jLabel14);
        jLabel14.setBounds(200, 73, 1400, 933);

        jPanel9.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 1703, -1));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Aircraft Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Aircraft Number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Business Class seats");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Airport Code");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 90, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Expiry Date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, -1));

        jBack.setText("Go Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });
        jPanel1.add(jBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 96, 30));

        jaircraftno.setEditable(false);
        jaircraftno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaircraftnoActionPerformed(evt);
            }
        });
        jPanel1.add(jaircraftno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 60, -1));

        jbseats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbseatsActionPerformed(evt);
            }
        });
        jPanel1.add(jbseats, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 190, -1));
        jPanel1.add(jexpirydate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 190, -1));

        jreset.setBackground(new java.awt.Color(204, 204, 204));
        jreset.setText("Reset");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });
        jPanel1.add(jreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 90, 30));

        jupdate.setText("Update");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });
        jPanel1.add(jupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 96, 30));

        jname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnameActionPerformed(evt);
            }
        });
        jPanel1.add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 190, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("Aircraft Name");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, 20));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("Executive Class seats");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("Economy Class seats");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, -1));
        jPanel1.add(jxseats, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 190, -1));

        jPanel1.add(jaircode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 190, -1));
        jPanel1.add(jeseats, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 190, -1));

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 470, 390));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 570, 460));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1090, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void flightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightsMouseClicked

    }//GEN-LAST:event_flightsMouseClicked

    private void flightsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightsMouseEntered
        // TODO add your handling code here:

        Font font = flights.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        flights.setFont(font.deriveFont(attributes));
        flights.setForeground(Color.pink);
    }//GEN-LAST:event_flightsMouseEntered

    private void flightsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightsMouseExited
        // TODO add your handling code here:
        Font font = flights.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        flights.setFont(font.deriveFont(attributes));
        flights.setForeground(Color.BLACK);
    }//GEN-LAST:event_flightsMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        LoginPage r = new LoginPage();
        r.setVisible(true);
        r.pack();
        r.setLocationRelativeTo(null);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
        Font font = logout.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        logout.setFont(font.deriveFont(attributes));
        logout.setForeground(Color.white);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        // TODO add your handling code here:
        Font font = logout.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        logout.setFont(font.deriveFont(attributes));
        logout.setForeground(Color.BLACK);
    }//GEN-LAST:event_logoutMouseExited

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        // TODO add your handling code here:
        viewAircrafts updt=new viewAircrafts();
        updt.setVisible(true);
        updt.pack();
        updt.setLocationRelativeTo(null);
        updt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jBackActionPerformed

    private void jaircraftnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaircraftnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jaircraftnoActionPerformed

    private void jbseatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbseatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbseatsActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
        // TODO add your handling code here:
        displaydata();
    }//GEN-LAST:event_jresetActionPerformed

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
        // TODO add your handling code here:
        try{
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String query = "update aircraft set name='"+jname.getText()+"',bseats='"+jbseats.getText()+"',"
                    + "xseats='"+jxseats.getText()+"',eseats='"+jeseats.getText()+"',"
                    + "airportCode='"+jaircode.getSelectedItem()+"',"
                    + "expiryDate='"+jexpirydate.getText()+"'"
                    + " where aircraftNo='"+jaircraftno.getText()+"';";
            st.executeUpdate(query);

            JOptionPane.showMessageDialog(this,"Information Updated Successfully");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(this,"Failed: " + ex.getMessage());

        }
    }//GEN-LAST:event_jupdateActionPerformed

    private void jnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnameActionPerformed

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
            java.util.logging.Logger.getLogger(updateAircraft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateAircraft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateAircraft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateAircraft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateAircraft().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel flights;
    private javax.swing.JButton jBack;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jaircode;
    private javax.swing.JTextField jaircraftno;
    private javax.swing.JTextField jbseats;
    private javax.swing.JTextField jeseats;
    private javax.swing.JTextField jexpirydate;
    private javax.swing.JTextField jname;
    private javax.swing.JButton jreset;
    private javax.swing.JButton jupdate;
    private javax.swing.JTextField jxseats;
    private javax.swing.JLabel logout;
    // End of variables declaration//GEN-END:variables
}