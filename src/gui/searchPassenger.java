package gui;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.*;
import javax.swing.*;
import java.text.SimpleDateFormat;  
public class searchPassenger extends javax.swing.JFrame {
    
    String query=null;
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    DateFormat formatter;
    SimpleDateFormat sdf=null;
 public searchPassenger() {
        initComponents();
        try{Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ars_data","root","root");
            sdf= new SimpleDateFormat("dd-MM-yyyy");
            jPanel5.setBackground(new Color(0,0,0,100));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jsearch = new javax.swing.JButton();
        jenter = new javax.swing.JTextField();
        jnameorpnr = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jfid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpnrno = new javax.swing.JTextField();
        jfname = new javax.swing.JTextField();
        jlname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jage = new javax.swing.JTextField();
        jclass = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jmealpref = new javax.swing.JTextField();
        jnoa = new javax.swing.JTextField();
        jgender = new javax.swing.JTextField();
        jresby = new javax.swing.JTextField();
        jlabelPass = new javax.swing.JLabel();
        jpassID = new javax.swing.JTextField();
        jok = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        flights = new javax.swing.JLabel();
        contactUs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logout = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        notifications = new javax.swing.JLabel();

        jLabel10.setText("flight number");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Passenger Details");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1709, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Passenger", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel19.setText("Search by: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Username", "pnrno", "passengerID" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jsearch.setText("Search");
        jsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearchActionPerformed(evt);
            }
        });

        jenter.setEditable(false);
        jenter.setText("Enter UserName: ");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, new java.awt.Color(255, 255, 255)));

        jLabel3.setText("Reserved By");

        jfid.setEditable(false);

        jLabel5.setText("Flight Id");

        jLabel4.setText("Gender");

        jpnrno.setEditable(false);

        jfname.setEditable(false);

        jlname.setEditable(false);

        jLabel6.setText("pnrno");

        jLabel7.setText("First Name");

        jLabel8.setText("Last Name");

        jLabel9.setText("Age");

        jLabel11.setText("Service class");

        jage.setEditable(false);
        jage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jageActionPerformed(evt);
            }
        });

        jclass.setEditable(false);
        jclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclassActionPerformed(evt);
            }
        });

        jLabel12.setText("Meal preference");

        jLabel13.setText("Number of Passengers");

        jmealpref.setEditable(false);

        jnoa.setEditable(false);

        jgender.setEditable(false);
        jgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgenderActionPerformed(evt);
            }
        });

        jresby.setEditable(false);

        jlabelPass.setText("passenger ID:");

        jpassID.setEditable(false);

        jok.setText("OK");
        jok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jokMouseClicked(evt);
            }
        });
        jok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jokActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jfid, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jpnrno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jfname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jclass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jmealpref, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jnoa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jgender, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jresby, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlabelPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jpassID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jok, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jfid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6)
                            .addComponent(jlabelPass)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jclass)
                            .addComponent(jmealpref, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jgender, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jage)
                            .addComponent(jfname)
                            .addComponent(jlname, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jpnrno)
                            .addComponent(jpassID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jnoa)
                            .addComponent(jresby))))
                .addGap(108, 108, 108))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jok)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelPass)
                    .addComponent(jpassID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpnrno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jmealpref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jnoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jresby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jok)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jenter, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(jsearch)
                                .addGap(169, 169, 169))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jnameorpnr, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jsearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jnameorpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 490));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 640, 550));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 620));

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

        jPanel4.setLayout(null);

        jLabel14.setText("hfghtdfgkhvjhlbuhkvhbhjghjkbi");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(414, 1070, 148, 14);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.jpg"))); // NOI18N
        jPanel4.add(jLabel15);
        jLabel15.setBounds(200, 73, 1400, 933);

        jPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 1703, -1));

        notifications.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        notifications.setText("Notifications");
        notifications.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notifications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notificationsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                notificationsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                notificationsMouseExited(evt);
            }
        });
        jPanel9.add(notifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(573, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void searchby()
{
    String nameOrpnr=jnameorpnr.getText();
    if(jComboBox1.getSelectedItem().toString().equals("Username"))
        {
            query="SELECT * FROM ars_data.reserved_passengers where username='" + nameOrpnr + "'";
        }
            else if(jComboBox1.getSelectedItem().toString().equals("pnrno"))
        {
            query="SELECT * FROM ars_data.reserved_passengers where pnrno='" + nameOrpnr + "'";
        }
        else if(jComboBox1.getSelectedItem().toString().equals("passengerID"))
        {
            query="SELECT * FROM ars_data.reserved_passengers where resPassID='" + nameOrpnr + "'";
        }
}
    private void jsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearchActionPerformed
        String fno,username,traveldate,fname,lname,cls,mealpref,gender;
        int numoftrav=0,pnrno=0, passID=0,reservedby,flightId,age;
         try { 
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                searchby();
                rs = st.executeQuery(query);
                boolean empty = true;
                while (rs.next()) {
                    empty = false;
                    passID=rs.getInt(1);
                    pnrno = rs.getInt(2);
                    fname = rs.getString(3);
                    lname = rs.getString(4);
                    username = rs.getString(5);
                    age = rs.getInt(6);
                    gender = rs.getString(7);
                    cls = rs.getString(8);
                    mealpref = rs.getString(9);
                    numoftrav=rs.getInt(10);
                    reservedby = rs.getInt(11);
                    flightId = rs.getInt(12);
                    
                    jpassID.setText(Integer.toString(passID));
                    jpnrno.setText(Integer.toString(pnrno));
                    jfname.setText(fname);
                    jlname.setText(lname);
                    jage.setText(Integer.toString(age));
                    jgender.setText(gender);
                    jclass.setText(cls);
                    jmealpref.setText(mealpref);
                    jfid.setText(Integer.toString(flightId));
                    jresby.setText(Integer.toString(reservedby));
                    jnoa.setText(Integer.toString(numoftrav));
                }
                 if (empty) {
                   JOptionPane.showMessageDialog(null,"No passenger for selected Id or name");
                }
               
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        
        
    }//GEN-LAST:event_jsearchActionPerformed

    private void jageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jageActionPerformed

    private void jclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jclassActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if(jComboBox1.getSelectedItem().toString().equals("Username"))
        {
            jenter.setText("Enter Username");
        }
            else if(jComboBox1.getSelectedItem().toString().equals("pnrno"))
        {
            jenter.setText("Enter pnr no");
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jgenderActionPerformed

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

    private void notificationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_notificationsMouseClicked

    private void notificationsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationsMouseEntered
//        // TODO add your handling code here:
//        Font font = inbox.getFont();
//        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
//        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
//        inbox.setFont(font.deriveFont(attributes));
//        inbox.setForeground(Color.pink);
    }//GEN-LAST:event_notificationsMouseEntered

    private void notificationsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationsMouseExited
//        // TODO add your handling code here:
//        Font font = inbox.getFont();
//        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
//        attributes.put(TextAttribute.UNDERLINE, -1);
//        inbox.setFont(font.deriveFont(attributes));
//        inbox.setForeground(Color.black);
    }//GEN-LAST:event_notificationsMouseExited

    private void jokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jokActionPerformed
        // TODO add your handling code here:
        this.dispose();
        viewPassengers updt=new viewPassengers();
                updt.setVisible(true);
                updt.pack();
                updt.setLocationRelativeTo(null);
                updt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jokActionPerformed

    private void jokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jokMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jokMouseClicked

    public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchPassenger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactUs;
    private javax.swing.JLabel flights;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jage;
    private javax.swing.JTextField jclass;
    private javax.swing.JTextField jenter;
    private javax.swing.JTextField jfid;
    private javax.swing.JTextField jfname;
    private javax.swing.JTextField jgender;
    private javax.swing.JLabel jlabelPass;
    private javax.swing.JTextField jlname;
    private javax.swing.JTextField jmealpref;
    private javax.swing.JTextField jnameorpnr;
    private javax.swing.JTextField jnoa;
    private javax.swing.JButton jok;
    private javax.swing.JTextField jpassID;
    private javax.swing.JTextField jpnrno;
    private javax.swing.JTextField jresby;
    private javax.swing.JButton jsearch;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel notifications;
    // End of variables declaration//GEN-END:variables

}
