/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package gui;

import ars.reservedPassengers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class flightdetails extends javax.swing.JFrame {
    Connection con;
    SimpleDateFormat sdf;
    ResultSet rs;
    Statement st;
        String jourdate;
        String deptime;
        String flightno;
        String from;
        String too;
        String charges; 
        String cls;
        String name;
        int tot=0;
        String airline;
    public flightdetails() {
        initComponents();
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ars_data","root","root");
         
        }
        catch(Exception e)
        {
         System.out.println(e.getMessage());
        }
        sdf= new SimpleDateFormat("yyyy-MM-dd");
    }
    public void setdata(Date gd,Object fno, Object dtime,Object air,String frm,String to,String cl, String n, int t)
    {   
        jourdate=(String) sdf.format(gd);
        airline=air.toString();
        flightno=fno.toString();
        deptime=dtime.toString();
        from=frm;
        too=to;
        cls=cl;
        name=n;
        tot=t;
        System.out.println("value of tot in flight details set method: "+tot);
        String query=null;
        switch(cls)
        {
            case "Business": query="SELECT bfare FROM sector WHERE source LIKE '" + frm 
                                + "' AND destination LIKE '" + to +"'";
            System.out.println(query);
                             break;
            case "Executive": query="SELECT bfare FROM sector WHERE source LIKE '" + frm 
                                + "' AND destination LIKE '" + to +"'";
            System.out.println(query);
                             break;
            case "Economy": query="SELECT bfare FROM sector WHERE source LIKE '" + frm 
                                + "' AND destination LIKE '" + to +"'";
            System.out.println(query);
                             break;
        }
        try
        {
            st=con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next())
            {
            charges=Integer.toString(rs.getInt(1));
            }
            
        }
        catch(Exception exc)
        {
        exc.printStackTrace();
        }
        checkandsetData();
        
    }
    public void checkandsetData()
    {
        if(jourdate.equals("") && flightno.equals("")&& airline.equals("") && from.equals("") && too.equals("") && cls.equals(""))
        {
            jourd.setEditable(true);
            jairline.setEditable(true);
            fnd.setEditable(true);
            frd.setEditable(true);
            tod.setEditable(true);
            classd.setEditable(true);
            chard.setEditable(true);
        }
        else
        {
            jourd.setText(jourdate);
            jairline.setText(airline);
            fnd.setText(flightno);
            frd.setText(from);
            tod.setText(too);
            classd.setText(cls);
            chard.setText(charges);
            deptd.setText(deptime);
    
    }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        confirmd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jourd = new javax.swing.JTextField();
        deptd = new javax.swing.JTextField();
        fnd = new javax.swing.JTextField();
        frd = new javax.swing.JTextField();
        classd = new javax.swing.JTextField();
        chard = new javax.swing.JTextField();
        tod = new javax.swing.JTextField();
        change = new javax.swing.JButton();
        label0 = new javax.swing.JLabel();
        jairline = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Flight Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Journey Date");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Flight No.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("From");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("To");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("Class");

        confirmd.setText("Confirm");
        confirmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmdActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Charge");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 153));
        jLabel17.setText("Departure Time");

        jourd.setEditable(false);
        jourd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jourdActionPerformed(evt);
            }
        });

        deptd.setEditable(false);
        deptd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptdActionPerformed(evt);
            }
        });

        fnd.setEditable(false);
        fnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fndActionPerformed(evt);
            }
        });

        frd.setEditable(false);
        frd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frdActionPerformed(evt);
            }
        });

        classd.setEditable(false);
        classd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classdActionPerformed(evt);
            }
        });

        chard.setEditable(false);
        chard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chardActionPerformed(evt);
            }
        });

        tod.setEditable(false);
        tod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todActionPerformed(evt);
            }
        });

        change.setText("Change");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        label0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label0.setForeground(new java.awt.Color(0, 51, 153));
        label0.setText("Airline");

        jairline.setEditable(false);
        jairline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jairlineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deptd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jourd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jairline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(change)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirmd))
                            .addComponent(label0, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(90, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jourd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label0)
                    .addComponent(jairline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deptd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(frd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(classd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(chard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmd)
                    .addComponent(change))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmdActionPerformed
       if(jourdate.equals("") && flightno.equals("")&& airline.equals("") && from.equals("") && too.equals("") && cls.equals(""))
       {
            JOptionPane.showMessageDialog(this, "Please fill all the information","Error",JOptionPane.ERROR_MESSAGE);
       }
       else
       { 
           reservedPassengers.flightno=flightno;
           reservedPassengers r=new reservedPassengers(airline, jourdate, deptime, from, too, cls);
           booking f=new booking(r,charges,tot,name);
           System.out.println("flightdetails fno: "+flightno);
           System.out.println("flight to: "+too);
            f.setVisible(true);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
       }
    }//GEN-LAST:event_confirmdActionPerformed
        
    private void jourdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jourdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jourdActionPerformed

    private void deptdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptdActionPerformed

    private void fndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fndActionPerformed

    private void frdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frdActionPerformed

    private void classdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classdActionPerformed

    private void chardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chardActionPerformed

    private void todActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_todActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        // TODO add your handling code here:
        System.out.println(getName());
        Home2 f=new Home2();
            f.setVisible(true);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_changeActionPerformed

    private void jairlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jairlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jairlineActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(flightdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(flightdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(flightdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(flightdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change;
    private javax.swing.JTextField chard;
    private javax.swing.JTextField classd;
    private javax.swing.JButton confirmd;
    private javax.swing.JTextField deptd;
    private javax.swing.JTextField fnd;
    private javax.swing.JTextField frd;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jairline;
    private javax.swing.JTextField jourd;
    private javax.swing.JLabel label0;
    private javax.swing.JTextField tod;
    // End of variables declaration//GEN-END:variables
}
