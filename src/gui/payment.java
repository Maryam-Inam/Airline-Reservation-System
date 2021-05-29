/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package gui;
import ars.reservedPassengers;
import ars.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import java.util.Date;


public class payment extends javax.swing.JFrame {
    SimpleDateFormat sdf1;
    SimpleDateFormat sdf;
    String sql=null;
    Connection con=null;
    PreparedStatement pst=null;
    PreparedStatement pst1=null;
    ResultSet rs=null;
    String currdate="";
    String currtime="";
    String duedate="";
    String bankname="AIR_BANK";
    long accountno=0;
    String description="";
    String fname="";
    String lname="";
    int[] respassId;
    String current_user="";
    Date dt=null;
    Date current_date=null;
    user usr;
    reservedPassengers res;

    
    public payment(user u,reservedPassengers r) {
        initComponents();
        current_date=new Date();
        usr=u;
        res=r;
        setDate();
        setdata();
        try{Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ars_data","root","root");
            sdf= new SimpleDateFormat("dd-MM-yyyy");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void disableAccountfield()
    {
        if(jdescription.getSelectedItem().toString().equals("cash"))
        {
            jaccountno.setVisible(false);
            jlabelaccountno.setVisible(false);
        }
        else if(jdescription.getSelectedItem().toString().equals("credit card"))
        {
            jaccountno.setVisible(true);
            jlabelaccountno.setVisible(true);
        }
    }
    public final void setDate()
    {
        LocalTime curtime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        currtime=curtime.format(formatter);
        
         
        sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        currdate = (String) sdf1.format(current_date);
        dt=current_date;
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        cal.add(Calendar.DATE, 3);
        dt = cal.getTime();
        duedate = (String)sdf.format(dt);
    }
    public void setdata()
    {
        jdate.setText(currdate);
        jtime.setText(currtime);
        jduedate.setText(duedate);
        jtfare.setText(Double.toString(usr.tfare));
        jusrname.setText(usr.username);
    }
    public void selectquery()
    {
        if(jdescription.getSelectedItem().toString().equals("cash"))
        {
            sql="INSERT INTO `ars_data`.`payment`(description,amount,duedate,bank,userID)values ('"+description+"','"+usr.tfare+"','"+duedate+"','"+bankname+"','"+usr.userId+"')";
        }
        else if(jdescription.getSelectedItem().toString().equals("credit card"))
        {
        accountno=Long.valueOf (jaccountno.getText());
            sql="INSERT INTO `ars_data`.`payment`(description,amount,duedate,accountno,bank,userID)values ('"+description+"','"+usr.tfare+"','"+duedate+"','"+accountno+"','"+bankname+"','"+usr.userId+"')";
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlabelaccountno = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jdescription = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jtfare = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jaccountno = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jduedate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jusrname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jdate = new javax.swing.JTextField();
        jtime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Select payment method");

        jLabel3.setText("Total Amount: ");

        jlabelaccountno.setText("Account number: ");

        jLabel5.setText("bank name: ");

        jLabel1.setText("Pay by: ");

        jdescription.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "credit card", "cash" }));
        jdescription.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jdescriptionItemStateChanged(evt);
            }
        });

        jButton2.setText("Go back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jtfare.setEditable(false);
        jtfare.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtfare.setForeground(new java.awt.Color(255, 0, 0));
        jtfare.setBorder(null);
        jtfare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfareActionPerformed(evt);
            }
        });

        jButton1.setText("Book Flight");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jaccountno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaccountnoActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setText("AIR_BANK");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Due date");

        jduedate.setEditable(false);
        jduedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jduedateActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/air-bank-logo1.png"))); // NOI18N

        jLabel8.setText("User name: ");

        jusrname.setEditable(false);
        jusrname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusrnameActionPerformed(evt);
            }
        });

        jLabel9.setText("Time");

        jLabel10.setText("Date");

        jdate.setEditable(false);
        jdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdateActionPerformed(evt);
            }
        });

        jtime.setEditable(false);
        jtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jtime, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfare, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addGap(107, 107, 107)
                            .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jlabelaccountno)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel7)
                                    .addGap(28, 28, 28)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jduedate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jaccountno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jusrname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)
                        .addComponent(jtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jduedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jaccountno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelaccountno))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jusrname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfare, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        description=jdescription.getSelectedItem().toString();
        System.out.println("description data: "+description);
        
        try { 
            System.out.println("before query");   
            selectquery();
               System.out.println("after query");
                pst=con.prepareStatement(sql);
                        selectTicket h=new selectTicket(usr,res);
                        h.setVisible(true);
                        h.pack();
                        h.setLocationRelativeTo(null);
                        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
            }
        catch (SQLException e) {
                StackTraceElement[] ex = e.getStackTrace();
        System.err.println("Got error= " + ex + "\n"+
                           "in file "+ex[0].getFileName() +"\n"+
                           "in class "+ex[0].getClassName() +"\n"+
                           "in method "+ex[0].getMethodName() +"\n"+
                           "in line "+ex[0].getLineNumber());
        System.err.println("Full trace= ");
        e.printStackTrace(System.err);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        checkout h=new checkout(res);
            h.setVisible(true);
            h.pack();
            h.setLocationRelativeTo(null);
            h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jtfareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfareActionPerformed

    private void jaccountnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaccountnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jaccountnoActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jduedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jduedateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jduedateActionPerformed

    private void jusrnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusrnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jusrnameActionPerformed

    private void jdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdateActionPerformed

    private void jtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtimeActionPerformed

    private void jdescriptionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jdescriptionItemStateChanged
        // TODO add your handling code here:
        disableAccountfield();
    }//GEN-LAST:event_jdescriptionItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(selectTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selectTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selectTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selectTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jaccountno;
    private javax.swing.JTextField jdate;
    private javax.swing.JComboBox<String> jdescription;
    private javax.swing.JTextField jduedate;
    private javax.swing.JLabel jlabelaccountno;
    private javax.swing.JTextField jtfare;
    private javax.swing.JTextField jtime;
    private javax.swing.JTextField jusrname;
    // End of variables declaration//GEN-END:variables
}
