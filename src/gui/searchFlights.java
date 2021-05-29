package gui;
import java.util.Date;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.*;
import java.text.SimpleDateFormat;  
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class searchFlights extends javax.swing.JFrame {
    String sql=null;
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    DateFormat formatter;
    Date dt,dt1;
    SimpleDateFormat sdf=null;
    String Sclass=null;
    String target=null;
    String origin=null;
    String stdate1=null;
    String stdate2=null;
    String stdate3;
    String search="";
    String name=null;
    public Object obj1,obj2,obj3,obj4,obj5,obj6;
    public searchFlights()
    {
        
    }
    public searchFlights(String n) {
        initComponents();
        name=n;
        jPanel4.setBackground(new Color(0,0,0,120));
        
        try{Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ars_data","root","root");
            jDateChooser2.setDate(Calendar.getInstance().getTime());
            sdf= new SimpleDateFormat("dd-MM-yyyy");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void check7days()
    {
        if(CheckBox7days.isSelected())
        {
    sql="SELECT  flightno,flightdate,bcsavailable,xcsavailable,ecsavailable,deptime, airlineCode FROM flights  WHERE sectorID =(SELECT sectorID FROM sector WHERE source LIKE '"+origin
    + "' AND destination LIKE '" + target + "') "+search+" AND flightdate BETWEEN '"+stdate1+"' AND '"+stdate2+"' ORDER BY flightdate";
      
        }
        else
        {
            sql="SELECT flightno,flightdate,bcsavailable,xcsavailable,ecsavailable,deptime,airlineCode FROM flights  WHERE sectorID =(SELECT sectorID FROM sector WHERE source LIKE '"+origin
                    + "' AND destination LIKE '" + target + "') "+search+" AND DATE(flightdate) = '" + stdate1 + "'";  
        
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        flights = new javax.swing.JLabel();
        contactUs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logout = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        notifications = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        comboboxfrom = new javax.swing.JComboBox<>();
        comboboxto = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        CheckBox7days = new javax.swing.JCheckBox();
        jsearch = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        serviceclass = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1709, 0, -1, -1));

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

        jPanel3.setLayout(null);

        jLabel3.setText("hfghtdfgkhvjhlbuhkvhbhjghjkbi");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(414, 1070, 148, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.jpg"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(200, 73, 1400, 933);

        jPanel9.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 1703, -1));

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

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 1420, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Prepare for Takeoff.. on the Cheapest Flights Around ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 620, 60));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setText("Schedule Your Flight Here");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Location and Dates: ");

        jLayeredPane1.setBackground(new java.awt.Color(255, 204, 204));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        comboboxfrom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboboxfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lahore", "Karachi", "Islamabad", "Quetta", "Multan", "Dubai", "Doha" }));
        comboboxfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxfromActionPerformed(evt);
            }
        });

        comboboxto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboboxto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Karachi", "Islamabad", "Quetta", "Multan", "Dubai", "Doha", "Lahore" }));
        comboboxto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxtoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("To:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("From: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Journey Date:");

        CheckBox7days.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CheckBox7days.setText("Also show next 7 days schedule");

        jsearch.setText("Search");
        jsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearchActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(comboboxfrom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(comboboxto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jDateChooser2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(CheckBox7days, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jsearch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(CheckBox7days)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(comboboxfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboboxto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addComponent(jsearch)
                .addGap(34, 34, 34))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel18)
                    .addContainerGap(733, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(comboboxto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(comboboxfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(CheckBox7days)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel18)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Service Class:");

        serviceclass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Business", "Executive", "Economy" }));

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Flight No", "Departure Time", "BC Seats Available", "EC Seats Available", "EX Seats Available"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("Please login for booking process...Click here for Login Window");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(63, 63, 63))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                        .addComponent(serviceclass, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(32, 32, 32)))
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jScrollPane1)
                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                        .addGap(184, 184, 184)
                                                        .addComponent(jLabel10)
                                                        .addGap(0, 0, Short.MAX_VALUE))))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(83, 83, 83))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(396, 396, 396))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel10)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serviceclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 1140, 520));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1280, 610));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1400, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1709, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setBackground(Color bgColor) {
        super.setBackground(bgColor); //To change body of generated methods, choose Tools | Templates.
    
    }

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
    
    private void comboboxfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxfromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxfromActionPerformed

    private void comboboxtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxtoActionPerformed

    private void jsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearchActionPerformed
 
        final Object[] columnNames = new String[]{"Date", "Flight No", "Departure Time", "BC Seats Available", "XC Seats Available", "EC Seats Available"};
        DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
        origin = comboboxfrom.getSelectedItem().toString();
        target = comboboxto.getSelectedItem().toString();
        Sclass = serviceclass.getSelectedItem().toString();
        
        dt = jDateChooser2.getDate();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        stdate1 = (String) sdf1.format(jDateChooser2.getDate());
       
        dt1 = jDateChooser2.getDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt1);
        cal.add(Calendar.DATE, 7);
        dt1 = cal.getTime();
        stdate2 = (String) sdf1.format(dt1);
        System.out.println("strdtver3 "+ stdate2);
        sql = null;
      
        if (Sclass.equals("Business")) {
            search = "AND bcsavailable>0";
            System.out.println(sql);
            try {
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                check7days();
                rs = st.executeQuery(sql);
                int i = 0;
                boolean empty = true;
                String var1 = "", var2 = "", var3 = "", var4 = "", var5 = "";
                while (rs.next()) {
                    empty = false;
                    var1 = rs.getString(1);
                    stdate3 = (String) sdf.format(rs.getDate(2));
                    var2 = Integer.toString(rs.getInt(3));
                    var3 = Integer.toString(rs.getInt(4));
                    var4 = Integer.toString(rs.getInt(5));
                    var5 = rs.getString(6);
                    dtm.addRow(new Vector());
                    dtm.setValueAt(stdate3, i, 0);
                    dtm.setValueAt(var1, i, 1);
                    dtm.setValueAt(var5, i, 2);
                    dtm.setValueAt(var2, i, 3);
                    dtm.setValueAt(var3, i, 4);
                    dtm.setValueAt(var4, i, 5);
                    i++;

                }
                if (empty) {
                    dtm.addRow(new Vector());
                    stdate1 = (String) sdf.format(jDateChooser2.getDate());
                    dtm.setValueAt(stdate1, i, 0);
                    dtm.setValueAt("No Flights", i, 1);
                    dtm.setValueAt("No Flights", i, 2);
                    dtm.setValueAt("0", i, 3);
                    dtm.setValueAt("0", i, 4);
                    dtm.setValueAt("0", i, 5);
                }
                jTable1.setModel(dtm);
                TableColumnModel m = jTable1.getColumnModel();
                TableColumn col = m.getColumn(4);
                TableColumn col1 = m.getColumn(5);
                m.removeColumn(col);
                m.removeColumn(col1);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
       
        if (Sclass.equals("Executive")) {
            search = "AND xcsavailable>0";
            try {
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                check7days();
                rs = st.executeQuery(sql);
                int i = 0;
                boolean empty = true;
                String var1 = "", var2 = "", var3 = "", var4 = "", var5 = "";
                while (rs.next()) {
                    empty = false;
                    var1 = rs.getString(1);
                    stdate3 = (String) sdf.format(rs.getDate(2));
                    var2 = Integer.toString(rs.getInt(3));
                    var3 = Integer.toString(rs.getInt(4));
                    var4 = Integer.toString(rs.getInt(5));
                    var5 = rs.getString(6);
                    dtm.addRow(new Vector());
                    dtm.setValueAt(stdate3, i, 0);
                    dtm.setValueAt(var1, i, 1);
                    dtm.setValueAt(var5, i, 2);
                    dtm.setValueAt(var2, i, 3);
                    dtm.setValueAt(var3, i, 4);
                    dtm.setValueAt(var4, i, 5);
                    i++;
                }
                if (empty) {
                    dtm.addRow(new Vector());
                    stdate1 = (String) sdf.format(jDateChooser2.getDate());
                    dtm.setValueAt(stdate1, i, 0);
                    dtm.setValueAt("No Flights", i, 1);
                    dtm.setValueAt("No Flights", i, 2);
                    dtm.setValueAt("0", i, 3);
                    dtm.setValueAt("0", i, 4);
                    dtm.setValueAt("0", i, 5);
                }
                jTable1.setModel(dtm);
                TableColumnModel m = jTable1.getColumnModel();
                TableColumn col = m.getColumn(3);
                TableColumn col1 = m.getColumn(5);
                m.removeColumn(col);
                m.removeColumn(col1);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }

        if (Sclass.equals("Economy")) 
            { search = "AND ecsavailable>0";
            System.out.println(sql);
            try {
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                check7days();
                rs = st.executeQuery(sql);
                int i = 0;
                boolean empty = true;
                String var1 = "", var2 = "", var3 = "", var4 = "", var5 = "";
                while (rs.next()) {
                    empty = false;
                    var1 = rs.getString(1);
                    stdate3 = (String) sdf.format(rs.getDate(2));
                    var2 = Integer.toString(rs.getInt(3));
                    var3 = Integer.toString(rs.getInt(4));
                    var4 = Integer.toString(rs.getInt(5));
                    var5 = rs.getString(6);
                    dtm.addRow(new Vector());
                    dtm.setValueAt(stdate3, i, 0);
                    dtm.setValueAt(var1, i, 1);
                    dtm.setValueAt(var5, i, 2);
                    dtm.setValueAt(var2, i, 3);
                    dtm.setValueAt(var3, i, 4);
                    dtm.setValueAt(var4, i, 5);
                    i++;
                }
                if (empty) {
                    dtm.addRow(new Vector());
                    stdate1 = (String) sdf.format(jDateChooser2.getDate());
                    dtm.setValueAt(stdate1, i, 0);
                    dtm.setValueAt("No Flights", i, 1);
                    dtm.setValueAt("No Flights", i, 2);
                    dtm.setValueAt("0", i, 3);
                    dtm.setValueAt("0", i, 4);
                    dtm.setValueAt("0", i, 5);
                }
                jTable1.setModel(dtm);
                TableColumnModel m = jTable1.getColumnModel();
                TableColumn col = m.getColumn(3);
                TableColumn col1 = m.getColumn(4);
                m.removeColumn(col);
                m.removeColumn(col1);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jsearchActionPerformed
//    public Object GetData(JTable jTable1, int row_index, int col_index){
//		return jTable1.getModel().getValueAt(row_index, col_index);
//	}
//   
         
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     
    }//GEN-LAST:event_jTable1MouseClicked

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

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        LoginPage sf = new LoginPage();
           sf.setVisible(true);
           sf.pack();
           sf.setLocationRelativeTo(null);
           sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked
    public static void main(String args[]) {
//       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox7days;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    public javax.swing.JComboBox<String> comboboxfrom;
    public javax.swing.JComboBox<String> comboboxto;
    private javax.swing.JLabel contactUs;
    private javax.swing.JLabel flights;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jsearch;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel notifications;
    private javax.swing.JComboBox serviceclass;
    // End of variables declaration//GEN-END:variables
}
