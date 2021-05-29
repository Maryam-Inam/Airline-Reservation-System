
package gui;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
public class updateTicket extends javax.swing.JFrame {
Connection con;
    SimpleDateFormat sdf;
    ResultSet rs;
    Statement st;
    DateFormat timeFormat;
    String seatno = "", issueTime="";
    long ticketno=0; int respassid=0;
    public updateTicket() {
        initComponents();
        try{Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ars_data","root","root");
            sdf= new SimpleDateFormat("yyyy-MM-dd");
            timeFormat = new SimpleDateFormat("hh:mm:ss");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void setdata(Object tno,Object sno,Object pid)
    {
        ticketno=(Long.parseLong(tno.toString()));
        seatno=sno.toString();
        respassid=(Integer)pid;
        displaydata();
    }
//    public void getPassId()
//    {
//        String query1="select resPassID from reserved_passengers";
//        try{ 
//                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//                rs = st.executeQuery(query1);
//                boolean empty = true;
//                while (rs.next()) {
//                int i=1;
//                    empty = false;
//                    jrespassid.addItem(rs.getString(i));
//                    i++;
//                }
//                jrespassid.setSelectedItem(Integer.toString(respassid));
//                    }
//           catch (SQLException ex) {
//               System.out.println(ex.getMessage());
//                }
//    
//    }
    public void displaydata()
    { 
        jticketno.setText(Long.toString(ticketno));
        jseatno.setText(seatno);
        jpassid.setText(Integer.toString(respassid));
        
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
        jLabel8 = new javax.swing.JLabel();
        jBack = new javax.swing.JButton();
        jticketno = new javax.swing.JTextField();
        jreset = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jseatno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jpassid = new javax.swing.JTextField();
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Update Ticket Details"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Ticket no");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Passenger ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, -1));

        jBack.setText("Go Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });
        jPanel1.add(jBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 96, 30));

        jticketno.setEditable(false);
        jticketno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jticketnoActionPerformed(evt);
            }
        });
        jPanel1.add(jticketno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 60, -1));

        jreset.setBackground(new java.awt.Color(204, 204, 204));
        jreset.setText("Reset");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });
        jPanel1.add(jreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 90, 30));

        jupdate.setText("Update");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });
        jPanel1.add(jupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 96, 30));

        jseatno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jseatnoActionPerformed(evt);
            }
        });
        jPanel1.add(jseatno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 190, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("Seat no.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, 20));

        jpassid.setEditable(false);
        jPanel1.add(jpassid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 60, -1));

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 470, 280));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 570, 340));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1090, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        viewTickets updt=new viewTickets();
        updt.setVisible(true);
        updt.pack();
        updt.setLocationRelativeTo(null);
        updt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jBackActionPerformed

    private void jticketnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jticketnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jticketnoActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
        // TODO add your handling code here:
        displaydata();
    }//GEN-LAST:event_jresetActionPerformed
//    public boolean passmatches()
//    {
//        boolean matches=false;
//        if(jrespassid.getSelectedItem().toString().equals(respassid))
//        {
//            matches=false;
//            System.out.println("Both equal!");
//        }
//        else if(userExists())
//        {
//         JOptionPane.showMessageDialog(null, "This passenger has already assigned ticket, Choose Another One");
//         matches=true;
//        }
//        else{
//            matches=false;
//        }
//        return matches;
//    }
    public boolean seatExists()
    {
    Connection con;
    PreparedStatement stat;
    ResultSet rs;
    
    boolean seatExist=false;
          String query = "select seatno from ticket";
          try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ars_data","root","root");
            
            stat=con.prepareStatement(query);
            rs=stat.executeQuery(query);
            while(rs.next()&&seatExist!=true)
            {
                if(jseatno.getText().equals(rs.getString("seatno")))
                {
                    System.out.println("seats are now equal");
                    JOptionPane.showMessageDialog(this,"this seat is already booked. Select another!");
                    seatExist=true;
                }
                else{
                seatExist=false ;
            }
            }
          }
          catch(SQLException ex)
          {
              System.out.println("error with connection");
          }
          
    return seatExist;
    
}
    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
        // TODO add your handling code here:
        try{
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String query = "update ticket set seatno='"+jseatno.getText()+"' where ticketno='"+jticketno.getText()+"'";
            if(!seatExists())
        {
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this,"Information Updated Successfully");
        }
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(this,"Failed: " + ex.getMessage());

        }
    }//GEN-LAST:event_jupdateActionPerformed

    private void jseatnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jseatnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jseatnoActionPerformed

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
            java.util.logging.Logger.getLogger(updateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel flights;
    private javax.swing.JButton jBack;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jpassid;
    private javax.swing.JButton jreset;
    private javax.swing.JTextField jseatno;
    private javax.swing.JTextField jticketno;
    private javax.swing.JButton jupdate;
    private javax.swing.JLabel logout;
    // End of variables declaration//GEN-END:variables
}
