/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package gui;
import ars.reservedPassengers;
import java.awt.font.TextAttribute;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class booking extends javax.swing.JFrame {
    String[] fnames=new String[6];
    String[] lnames=new String[6];
    String[] usrnames=new String[6];
    String[] ages=new String[6];
    String[] genders=new String[6];
    int tot=0;
    int numoftrav=0;
   
    String vmeal="";
    String nmeal="";
    String chrg="";
    reservedPassengers res;
    public booking(reservedPassengers r,String fare, int t, String n) {
        initComponents();
        jPanel4.setBackground(new Color(0,0,0,120));
        tot=t;
        numoftrav=tot;
        res=r;
        chrg=fare;
        setblank();
        jLabel6.setVisible(true);
    }
    public void setblank()
    { System.out.println("total value in setblank of booking: "+tot);
        noad.setText(Integer.toString(tot));
        fn1.setVisible(false);ln1.setVisible(false);age1.setVisible(false);gen1.setVisible(false);jusrname1.setVisible(false);
        fn2.setVisible(false);ln2.setVisible(false);age2.setVisible(false);gen2.setVisible(false);jusrname2.setVisible(false);
        fn3.setVisible(false);ln3.setVisible(false);age3.setVisible(false);gen3.setVisible(false);jusrname3.setVisible(false);
        fn4.setVisible(false);ln4.setVisible(false);age4.setVisible(false);gen4.setVisible(false);jusrname4.setVisible(false);
        fn5.setVisible(false);ln5.setVisible(false);age5.setVisible(false);gen5.setVisible(false);jusrname5.setVisible(false);
        fn6.setVisible(false);ln6.setVisible(false);age6.setVisible(false);gen6.setVisible(false);jusrname6.setVisible(false);
        fnlabel.setVisible(false);lnlabel.setVisible(false);agelabel.setVisible(false);genderlabel.setVisible(false);usrnamelabel.setVisible(false);
    }
    public void setunblank()
    {
        fn1.setVisible(true);ln1.setVisible(true);age1.setVisible(true);gen1.setVisible(true);jusrname1.setVisible(true);
                  fn2.setVisible(true);ln2.setVisible(true);age2.setVisible(true);gen2.setVisible(true);jusrname2.setVisible(true);
                  fn3.setVisible(true);ln3.setVisible(true);age3.setVisible(true);gen3.setVisible(true);jusrname3.setVisible(true);
                  fn4.setVisible(true);ln4.setVisible(true);age4.setVisible(true);gen4.setVisible(true);jusrname4.setVisible(true);
                  fn5.setVisible(true);ln5.setVisible(true);age5.setVisible(true);gen5.setVisible(true);jusrname5.setVisible(true);
                  fn6.setVisible(true);ln6.setVisible(true);age6.setVisible(true);gen6.setVisible(true);jusrname6.setVisible(true);
                  fnlabel.setVisible(true);lnlabel.setVisible(true);agelabel.setVisible(true);genderlabel.setVisible(true);usrnamelabel.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jhome = new javax.swing.JLabel();
        contactUs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logout = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        fnlabel = new javax.swing.JLabel();
        lnlabel = new javax.swing.JLabel();
        genderlabel = new javax.swing.JLabel();
        agelabel = new javax.swing.JLabel();
        fn1 = new javax.swing.JTextField();
        Proceed = new javax.swing.JButton();
        fn2 = new javax.swing.JTextField();
        fn3 = new javax.swing.JTextField();
        fn6 = new javax.swing.JTextField();
        fn4 = new javax.swing.JTextField();
        fn5 = new javax.swing.JTextField();
        ln1 = new javax.swing.JTextField();
        ln2 = new javax.swing.JTextField();
        ln3 = new javax.swing.JTextField();
        ln4 = new javax.swing.JTextField();
        ln5 = new javax.swing.JTextField();
        ln6 = new javax.swing.JTextField();
        age1 = new javax.swing.JTextField();
        age2 = new javax.swing.JTextField();
        age3 = new javax.swing.JTextField();
        age4 = new javax.swing.JTextField();
        age5 = new javax.swing.JTextField();
        age6 = new javax.swing.JTextField();
        vegd = new javax.swing.JCheckBox();
        vegd1 = new javax.swing.JCheckBox();
        Reset = new javax.swing.JButton();
        noad = new javax.swing.JTextField();
        gen1 = new javax.swing.JTextField();
        gen2 = new javax.swing.JTextField();
        gen3 = new javax.swing.JTextField();
        gen4 = new javax.swing.JTextField();
        gen5 = new javax.swing.JTextField();
        gen6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jusrname4 = new javax.swing.JTextField();
        jusrname3 = new javax.swing.JTextField();
        jusrname2 = new javax.swing.JTextField();
        jusrname1 = new javax.swing.JTextField();
        usrnamelabel = new javax.swing.JLabel();
        jusrname6 = new javax.swing.JTextField();
        jusrname5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jhome.setBackground(new java.awt.Color(255, 255, 255));
        jhome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jhome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jhome.setText("Home");
        jhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jhomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jhomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jhomeMouseExited(evt);
            }
        });
        jPanel9.add(jhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 121, -1));

        contactUs.setBackground(new java.awt.Color(255, 255, 255));
        contactUs.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        contactUs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactUs.setText("Contact Us");
        contactUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contactUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactUsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contactUsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contactUsMouseExited(evt);
            }
        });
        jPanel9.add(contactUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 128, -1));

        jLabel1.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Airline Reservation System");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

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
        jPanel9.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 20, 100, -1));

        jPanel3.setLayout(null);

        jLabel3.setText("hfghtdfgkhvjhlbuhkvhbhjghjkbi");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(414, 1070, 148, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.jpg"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(200, 73, 1400, 933);

        jPanel9.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 1703, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Passenger's Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 153));
        jLabel20.setText("<html><font color=\"blue\">No. of Travelors</font><font color=\"Red\">*</font></html>");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 153));
        jLabel22.setText("<html><font color=\"blue\">Meal</font><font color=\"Red\">*</font></html>");

        fnlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fnlabel.setForeground(new java.awt.Color(0, 51, 153));
        fnlabel.setText("First Name");

        lnlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lnlabel.setForeground(new java.awt.Color(0, 51, 153));
        lnlabel.setText("Last Name");

        genderlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderlabel.setForeground(new java.awt.Color(0, 51, 153));
        genderlabel.setText("Gender");

        agelabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        agelabel.setForeground(new java.awt.Color(0, 51, 153));
        agelabel.setText("Age");

        Proceed.setBackground(new java.awt.Color(153, 0, 51));
        Proceed.setText("Proceed");
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });

        ln1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ln1ActionPerformed(evt);
            }
        });

        ln2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ln2ActionPerformed(evt);
            }
        });

        ln3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ln3ActionPerformed(evt);
            }
        });

        ln4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ln4ActionPerformed(evt);
            }
        });

        ln5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ln5ActionPerformed(evt);
            }
        });

        ln6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ln6ActionPerformed(evt);
            }
        });

        age1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age1ActionPerformed(evt);
            }
        });

        age2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age2ActionPerformed(evt);
            }
        });

        age3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age3ActionPerformed(evt);
            }
        });

        age4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age4ActionPerformed(evt);
            }
        });

        age5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age5ActionPerformed(evt);
            }
        });

        age6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age6ActionPerformed(evt);
            }
        });

        vegd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vegd.setForeground(new java.awt.Color(51, 51, 51));
        vegd.setSelected(true);
        vegd.setText("Veg.");

        vegd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vegd1.setForeground(new java.awt.Color(51, 51, 51));
        vegd1.setSelected(true);
        vegd1.setText("Non Veg.");
        vegd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegd1ActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(153, 0, 51));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        noad.setEditable(false);

        gen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen1ActionPerformed(evt);
            }
        });

        gen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen2ActionPerformed(evt);
            }
        });

        gen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen3ActionPerformed(evt);
            }
        });

        gen4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen4ActionPerformed(evt);
            }
        });

        gen5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen5ActionPerformed(evt);
            }
        });

        gen6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Select this to enter passenger information");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jusrname4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusrname4ActionPerformed(evt);
            }
        });

        jusrname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusrname2ActionPerformed(evt);
            }
        });

        usrnamelabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usrnamelabel.setForeground(new java.awt.Color(0, 51, 153));
        usrnamelabel.setText("Username");

        jusrname6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jusrname6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(fn1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fn5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fn4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fn6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fn3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fn2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ln6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addGap(233, 233, 233)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(ln1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ln2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ln3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ln4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ln5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(54, 54, 54)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(age1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(age2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(age3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(age4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(age5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(age6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(agelabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(Reset)
                                    .addGap(27, 27, 27)
                                    .addComponent(Proceed)
                                    .addGap(50, 50, 50)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(fnlabel)
                                .addGap(128, 128, 128)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(lnlabel))
                                .addGap(69, 69, 69)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gen2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gen1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gen3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gen4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gen5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gen6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderlabel))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jusrname3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                        .addComponent(jusrname2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                        .addComponent(jusrname1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                        .addComponent(jusrname6)
                                        .addComponent(jusrname5, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jusrname4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(usrnamelabel)))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(noad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(vegd)
                        .addGap(18, 18, 18)
                        .addComponent(vegd1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vegd)
                    .addComponent(vegd1)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderlabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fnlabel)
                                .addComponent(lnlabel)
                                .addComponent(usrnamelabel))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agelabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(gen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(age1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ln1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jusrname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(ln2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jusrname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ln3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(age3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gen4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ln4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(age4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gen5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ln5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(age5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jusrname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jusrname4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jusrname5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ln6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Reset)
                            .addComponent(Proceed))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gen6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jusrname6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 390));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Instructions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(153, 0, 51))); // NOI18N

        jLabel16.setText("<html>\n<font size=\"4\">\n<ol>\n<li>Booking is allowed for maximum 6 (six) passengers including children per Ticket.</li>\n<li>Full charges will be applicable for childern more that 2 years age.</li>\n<li>Present the age proof for children less than or equal to 2 years age.</li>\n</ol>\n</font>\n</html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 810, 90));

        jPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 810, 510));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1360, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jhomeMouseClicked
        Home2 h=new Home2();
            h.setVisible(true);
            h.pack();
            h.setLocationRelativeTo(null);
            h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_jhomeMouseClicked

    private void jhomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jhomeMouseEntered
        // TODO add your handling code here:

        Font font = jhome.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        jhome.setFont(font.deriveFont(attributes));
        jhome.setForeground(Color.pink);
    }//GEN-LAST:event_jhomeMouseEntered

    private void jhomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jhomeMouseExited
        // TODO add your handling code here:
        Font font = jhome.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        jhome.setFont(font.deriveFont(attributes));
        jhome.setForeground(Color.BLACK);
    }//GEN-LAST:event_jhomeMouseExited

    private void contactUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactUsMouseClicked

    }//GEN-LAST:event_contactUsMouseClicked

    private void contactUsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactUsMouseEntered
        // TODO add your handling code here:

        Font font = contactUs.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        contactUs.setFont(font.deriveFont(attributes));
        contactUs.setForeground(Color.pink);
    }//GEN-LAST:event_contactUsMouseEntered

    private void contactUsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactUsMouseExited
        // TODO add your handling code here:

        Font font = contactUs.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        contactUs.setFont(font.deriveFont(attributes));
        contactUs.setForeground(Color.BLACK);
    }//GEN-LAST:event_contactUsMouseExited

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

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:'
        vegd.setSelected(true);
        vegd1.setSelected(true);
        fn1.setText(null);
        fn2.setText(null);
        fn3.setText(null);
        fn4.setText(null);
        fn5.setText(null);
        fn6.setText(null);
        ln1.setText(null);
        ln2.setText(null);
        ln3.setText(null);
        ln4.setText(null);
        ln5.setText(null);
        ln6.setText(null);
        jusrname1.setText(null);
        jusrname2.setText(null);
        jusrname3.setText(null);
        jusrname4.setText(null);
        jusrname5.setText(null);
        jusrname6.setText(null);
        age1.setText(null);
        age2.setText(null);
        age3.setText(null);
        age4.setText(null);
        age5.setText(null);
        age6.setText(null);
        gen1.setText(null);
        gen2.setText(null);
        gen3.setText(null);
        gen4.setText(null);
        gen5.setText(null);
        gen6.setText(null);
    }//GEN-LAST:event_ResetActionPerformed

    private void vegd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vegd1ActionPerformed

    private void age6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age6ActionPerformed

    private void age5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age5ActionPerformed

    private void age4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age4ActionPerformed

    private void age3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age3ActionPerformed

    private void age2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age2ActionPerformed

    private void age1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age1ActionPerformed

    private void ln6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ln6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ln6ActionPerformed

    private void ln5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ln5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ln5ActionPerformed

    private void ln4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ln4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ln4ActionPerformed

    private void ln3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ln3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ln3ActionPerformed

    private void ln2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ln2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ln2ActionPerformed

    private void ln1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ln1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ln1ActionPerformed
 
    public boolean checkGenders()
    {
        boolean correct=true;
        for(int i=0;i<tot;i++)
        {
            if(!genders[i].equals("Male")&&!genders[i].equals("Female"))
            {
                System.out.println("gender type: "+genders[i]);
                JOptionPane.showMessageDialog(this,"Incorrect Gender Type!!!");
                correct=false;
            }
            else{
                correct=true;
            }i++;
            
            }
        return correct;
    }
    public boolean userExists(String usr)
    {
    Connection con;
    PreparedStatement stat;
    ResultSet rs;
    
    boolean userExists=false;
          String query = "SELECT * FROM reserved_passengers where username='"+usr+"'";
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
    public boolean checkUsernames()
    {
        boolean unqiue=true;
        for(int i=0;i<tot;i++)
        {
            if(!usrnames[++i].equals("")){
            if(usrnames[--i].equals(usrnames[++i]))
            {
                JOptionPane.showMessageDialog(this,"usernames should be unqiue for each passenger! Rewrite them!");
                unqiue=false;
                i--;
            }
            else{
                unqiue=true;
            }
            }
        }
        return unqiue;
    }
    public boolean checkPassAmount()
    { System.out.println("checkpassamount tot: "+tot);
    boolean correct=false;
    for(int i=0;i<tot;i++)
    { 
        if(fnames[i].equals("")||lnames[i].equals("")||usrnames[i].equals("")||ages[i].equals("")||genders[i].equals(""))
    {
        JOptionPane.showMessageDialog(this,"You've selected "+tot+" passengers! Enter complete details");
        correct=false;
    }
       else
       {
           correct=true;
       }
    }
    return correct;
}
    private void ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedActionPerformed
                  
// TODO add your handling code here:
    fnames[0]=fn1.getText();
    fnames[1]=fn2.getText();
    fnames[2]=fn3.getText();
    fnames[3]=fn4.getText();
    fnames[4]=fn5.getText();
    fnames[5]=fn6.getText();
    
    lnames[0]=ln1.getText();
    lnames[1]=ln2.getText();
    lnames[2]=ln3.getText();
    lnames[3]=ln4.getText();
    lnames[4]=ln5.getText();
    lnames[5]=ln6.getText();
    
    usrnames[0]=jusrname1.getText();
    usrnames[1]=jusrname2.getText();
    usrnames[2]=jusrname3.getText();
    usrnames[3]=jusrname4.getText();
    usrnames[4]=jusrname5.getText();
    usrnames[5]=jusrname6.getText();
    
    ages[0]=age1.getText();
    ages[1]=age2.getText();
    ages[2]=age3.getText();
    ages[3]=age4.getText();
    ages[4]=age5.getText();
    ages[5]=age6.getText();
    
    genders[0]=gen1.getText();
    genders[1]=gen2.getText();
    genders[2]=gen3.getText();
    genders[3]=gen4.getText();
    genders[4]=gen5.getText();
    genders[5]=gen6.getText();
    for(int i=0;i<tot;i++){
    if(checkPassAmount()&&checkUsernames()&&checkGenders()&&!userExists(usrnames[i])){
        checkout h=new checkout(res);
            h.setdata(numoftrav,vmeal,nmeal,chrg,usrnames,fnames,lnames,ages,genders);
            h.setVisible(true);
            h.pack();
            h.setLocationRelativeTo(null);
            h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }   
    }//GEN-LAST:event_ProceedActionPerformed

    private void gen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gen1ActionPerformed

    private void gen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gen2ActionPerformed

    private void gen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gen3ActionPerformed

    private void gen4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gen4ActionPerformed

    private void gen5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gen5ActionPerformed

    private void gen6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gen6ActionPerformed
public void checks(int tot)
{ System.out.println("total: "+tot);
    switch(tot)
    {
        case 1: fn1.setEditable(true);ln1.setEditable(true);age1.setEditable(true);gen1.setEditable(true);jusrname1.setEditable(true);
                  fn2.setEditable(false);ln2.setEditable(false);age2.setEditable(false);gen2.setEditable(false);jusrname2.setEditable(false);
                  fn3.setEditable(false);ln3.setEditable(false);age3.setEditable(false);gen3.setEditable(false);jusrname3.setEditable(false);
                  fn4.setEditable(false);ln4.setEditable(false);age4.setEditable(false);gen4.setEditable(false);jusrname4.setEditable(false);
                  fn5.setEditable(false);ln5.setEditable(false);age5.setEditable(false);gen5.setEditable(false);jusrname5.setEditable(false);
                  fn6.setEditable(false);ln6.setEditable(false);age6.setEditable(false);gen6.setEditable(false);jusrname6.setEditable(false);
                  System.out.println("case 1 running");
                  break;
        case 2: fn1.setEditable(true);ln1.setEditable(true);age1.setEditable(true);gen1.setEditable(true);jusrname1.setEditable(true);
                  fn2.setEditable(true);ln2.setEditable(true);age2.setEditable(true);gen2.setEditable(true);jusrname2.setEditable(true);
                  fn3.setEditable(false);ln3.setEditable(false);age3.setEditable(false);gen3.setEditable(false);jusrname3.setEditable(false);
                  fn4.setEditable(false);ln4.setEditable(false);age4.setEditable(false);gen4.setEditable(false);jusrname4.setEditable(false);
                  fn5.setEditable(false);ln5.setEditable(false);age5.setEditable(false);gen5.setEditable(false);jusrname5.setEditable(false);
                  fn6.setEditable(false);ln6.setEditable(false);age6.setEditable(false);gen6.setEditable(false);jusrname6.setEditable(false);
                  System.out.println("case 2 running");
                  break;
        case 3: fn1.setEditable(true);ln1.setEditable(true);age1.setEditable(true);gen1.setEditable(true);jusrname1.setEditable(true);
                  fn2.setEditable(true);ln2.setEditable(true);age2.setEditable(true);gen2.setEditable(true);jusrname2.setEditable(true);
                  fn3.setEditable(true);ln3.setEditable(true);age3.setEditable(true);gen3.setEditable(true);jusrname3.setEditable(true);
                  fn4.setEditable(false);ln4.setEditable(false);age4.setEditable(false);gen4.setEditable(false);jusrname4.setEditable(false);
                  fn5.setEditable(false);ln5.setEditable(false);age5.setEditable(false);gen5.setEditable(false);jusrname5.setEditable(false);
                  fn6.setEditable(false);ln6.setEditable(false);age6.setEditable(false);gen6.setEditable(false);jusrname6.setEditable(false);
                  System.out.println("case 3 running");
                  break;
        case 4: fn1.setEditable(true);ln1.setEditable(true);age1.setEditable(true);gen1.setEditable(true);jusrname1.setEditable(true);
                  fn2.setEditable(true);ln2.setEditable(true);age2.setEditable(true);gen2.setEditable(true);jusrname2.setEditable(true);
                  fn3.setEditable(true);ln3.setEditable(true);age3.setEditable(true);gen3.setEditable(true);jusrname3.setEditable(true);
                  fn4.setEditable(true);ln4.setEditable(true);age4.setEditable(true);gen4.setEditable(true);jusrname4.setEditable(true);
                  fn5.setEditable(false);ln5.setEditable(false);age5.setEditable(false);gen5.setEditable(false);jusrname5.setEditable(false);
                  fn6.setEditable(false);ln6.setEditable(false);age6.setEditable(false);gen6.setEditable(false);jusrname6.setEditable(false);
                  System.out.println("case 4 running");
                  break;
        case 5: fn1.setEditable(true);ln1.setEditable(true);age1.setEditable(true);gen1.setEditable(true);jusrname1.setEditable(true);
                  fn2.setEditable(true);ln2.setEditable(true);age2.setEditable(true);gen2.setEditable(true);jusrname2.setEditable(true);
                  fn3.setEditable(true);ln3.setEditable(true);age3.setEditable(true);gen3.setEditable(true);jusrname3.setEditable(true);
                  fn4.setEditable(true);ln4.setEditable(true);age4.setEditable(true);gen4.setEditable(true);jusrname4.setEditable(true);
                  fn5.setEditable(true);ln5.setEditable(true);age5.setEditable(true);gen5.setEditable(true);jusrname5.setEditable(true);
                  fn6.setEditable(false);ln6.setEditable(false);age6.setEditable(false);gen6.setEditable(false);jusrname6.setEditable(false);
                  System.out.println("case 5 running");
                  break;
        default:  fn1.setEditable(true);ln1.setEditable(true);age1.setEditable(true);gen1.setEditable(true);jusrname1.setEditable(true);
                  fn2.setEditable(true);ln2.setEditable(true);age2.setEditable(true);gen2.setEditable(true);jusrname2.setEditable(true);
                  fn3.setEditable(true);ln3.setEditable(true);age3.setEditable(true);gen3.setEditable(true);jusrname3.setEditable(true);
                  fn4.setEditable(true);ln4.setEditable(true);age4.setEditable(true);gen4.setEditable(true);jusrname4.setEditable(true);
                  fn5.setEditable(true);ln5.setEditable(true);age5.setEditable(true);gen5.setEditable(true);jusrname5.setEditable(true);
                  fn6.setEditable(true);ln6.setEditable(true);age6.setEditable(true);gen6.setEditable(true);jusrname6.setEditable(true);
         System.out.println("default running");
    }
}
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        jLabel6.setVisible(false);
        setunblank();
        
//        numoftrav=Integer.parseInt(noad.getText());
        
        if(vegd.isSelected()&&!vegd1.isSelected())
        {
            vmeal="Veg";
        }
        else if(vegd1.isSelected()&&!vegd.isSelected())
        {
            nmeal="Non Veg";
        }
        else if(vegd1.isSelected()&&vegd.isSelected()){
            vmeal="Veg";
            nmeal="Non Veg";
        }
        else{
            JOptionPane.showMessageDialog(this,"kindly select meal type!");
        }
        tot=numoftrav;
        if(tot<=6 && tot>0)
        {
            checks(tot);
        }
        else{
            JOptionPane.showMessageDialog(this,"You can't register more than 6 passengers and minimum 1 passenger is necessory");
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jusrname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusrname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jusrname2ActionPerformed

    private void jusrname4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusrname4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jusrname4ActionPerformed

    private void jusrname6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jusrname6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jusrname6ActionPerformed

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
//            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton Proceed;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField age1;
    private javax.swing.JTextField age2;
    private javax.swing.JTextField age3;
    private javax.swing.JTextField age4;
    private javax.swing.JTextField age5;
    private javax.swing.JTextField age6;
    private javax.swing.JLabel agelabel;
    private javax.swing.JLabel contactUs;
    private javax.swing.JTextField fn1;
    private javax.swing.JTextField fn2;
    private javax.swing.JTextField fn3;
    private javax.swing.JTextField fn4;
    private javax.swing.JTextField fn5;
    private javax.swing.JTextField fn6;
    private javax.swing.JLabel fnlabel;
    private javax.swing.JTextField gen1;
    private javax.swing.JTextField gen2;
    private javax.swing.JTextField gen3;
    private javax.swing.JTextField gen4;
    private javax.swing.JTextField gen5;
    private javax.swing.JTextField gen6;
    private javax.swing.JLabel genderlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jhome;
    private javax.swing.JTextField jusrname1;
    private javax.swing.JTextField jusrname2;
    private javax.swing.JTextField jusrname3;
    private javax.swing.JTextField jusrname4;
    private javax.swing.JTextField jusrname5;
    private javax.swing.JTextField jusrname6;
    private javax.swing.JTextField ln1;
    private javax.swing.JTextField ln2;
    private javax.swing.JTextField ln3;
    private javax.swing.JTextField ln4;
    private javax.swing.JTextField ln5;
    private javax.swing.JTextField ln6;
    private javax.swing.JLabel lnlabel;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField noad;
    private javax.swing.JLabel usrnamelabel;
    private javax.swing.JCheckBox vegd;
    private javax.swing.JCheckBox vegd1;
    // End of variables declaration//GEN-END:variables
}
