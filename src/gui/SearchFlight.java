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

public class SearchFlight extends javax.swing.JFrame {
    String query=null;
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    DateFormat formatter;
    SimpleDateFormat sdf=null;
    Object obj1,obj2,obj3,obj4,obj5,obj6,obj7,obj8,obj9,obj10,obj11,obj12;
        Date pdt;
        String flightno = "", flightdate = "", deptime="",arrtime="",aircrafttypeid="",sectorid="",airlinecode="",status="";
                int bcsavailable=0, xcsavailable=0,ecsavailable=0,flightid=0;
    public SearchFlight() {
        initComponents();
        try{Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ars_data","root","root");
            jPanel6.setBackground(new Color(0,0,0,100));
            sdf= new SimpleDateFormat("dd-MM-yyyy");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        flights = new javax.swing.JLabel();
        contactUs = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logout = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        notifications = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        flights1 = new javax.swing.JLabel();
        contactUs1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        logout1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jsearch = new javax.swing.JButton();
        jnumorsector = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jenternumorsector = new javax.swing.JTextField();
        jok = new java.awt.Button();
        jLabel30 = new javax.swing.JLabel();

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

        jLabel10.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Airline Reservation System");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

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

        jPanel5.setLayout(null);

        jLabel11.setText("hfghtdfgkhvjhlbuhkvhbhjghjkbi");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(414, 1070, 148, 14);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.jpg"))); // NOI18N
        jPanel5.add(jLabel12);
        jLabel12.setBounds(200, 73, 1400, 933);

        jPanel9.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 1703, -1));

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

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 1420, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 1400, 170));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Flight");

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setTitle("FLIGHT INFO");
        jInternalFrame1.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrame1formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jInternalFrame1.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 140, 24));

        jLabel8.setText("Destination");
        jInternalFrame1.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 140, 30));

        jLabel9.setText("Arrival_TIME");
        jInternalFrame1.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 148, 30));
        jInternalFrame1.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 140, 30));
        jInternalFrame1.getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 43, 140, -1));

        jLabel6.setText("Flight_CHARGES");
        jInternalFrame1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel4.setText("Departure");
        jInternalFrame1.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel3.setText("Source");
        jInternalFrame1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel1.setText("Flight_ID");
        jInternalFrame1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 46, -1, -1));

        jLabel2.setText("Flight_NAME");
        jInternalFrame1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 20));

        jButton1.setText("SEARCH by ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 120, 30));
        jInternalFrame1.getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 160, 30));

        jLabel5.setText("Date Of Departure");
        jInternalFrame1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));
        jInternalFrame1.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 140, 30));
        jInternalFrame1.getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 140, 30));

        jButton2.setText("Search by Name");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 130, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FlightID", "FlightName", "Source", "Departure", "Flight Charges", "Destination", "Arrival time", "Date of Departure"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jInternalFrame1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 880, 150));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel7.setText("                                SEARCH BY NAME LIST");
        jInternalFrame1.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 604, 36));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        flights1.setBackground(new java.awt.Color(255, 255, 255));
        flights1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        flights1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flights1.setText("Flights");
        flights1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        flights1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flights1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                flights1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                flights1MouseExited(evt);
            }
        });
        jPanel10.add(flights1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 121, -1));

        contactUs1.setBackground(new java.awt.Color(255, 255, 255));
        contactUs1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        contactUs1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactUs1.setText("Contact Us");
        contactUs1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contactUs1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactUs1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contactUs1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contactUs1MouseExited(evt);
            }
        });
        jPanel10.add(contactUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 128, -1));

        jLabel13.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Airline Reservation System");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel10.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 1703, 10));

        logout1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logout1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout1.setText("Logout");
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout1MouseExited(evt);
            }
        });
        jPanel10.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 100, -1));

        jPanel11.setLayout(null);

        jLabel14.setText("hfghtdfgkhvjhlbuhkvhbhjghjkbi");
        jPanel11.add(jLabel14);
        jLabel14.setBounds(414, 1070, 148, 14);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.jpg"))); // NOI18N
        jPanel11.add(jLabel15);
        jLabel15.setBounds(200, 73, 1400, 933);

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 1703, -1));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1709, 0, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flightno", "Departure Time", "Arrival time", "Aircraft type ID", "Sector Id"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 723, 288));

        jsearch.setText("Search");
        jsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearchActionPerformed(evt);
            }
        });

        jnumorsector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnumorsectorActionPerformed(evt);
            }
        });
        jnumorsector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jnumorsectorKeyPressed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flight No", "Sector Id" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });

        jLabel19.setText("Search by: ");

        jenternumorsector.setEditable(false);
        jenternumorsector.setText("Enter Flight number:");
        jenternumorsector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenternumorsectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jenternumorsector, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jnumorsector, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jnumorsector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jenternumorsector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(3, 3, 3)
                        .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 720, -1));

        jok.setLabel("OK");
        jok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jokActionPerformed(evt);
            }
        });
        jPanel6.add(jok, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        jPanel7.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 800, 520));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
            .addGroup(layout.createSequentialGroup()
                .addGap(1068, 1068, 1068)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jInternalFrame1formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrame1formInternalFrameActivated
        jScrollPane1.setVisible(false);
        getContentPane().validate();
    }//GEN-LAST:event_jInternalFrame1formInternalFrameActivated
public void searchby()
{
    String numOrSector=jnumorsector.getText();
    if(jComboBox1.getSelectedItem().toString().equals("Flight No"))
        {
            query="SELECT * FROM ars_data.flights where flightno='" + numOrSector + "'";
        }
            else if(jComboBox1.getSelectedItem().toString().equals("Sector Id"))
        {
            query="SELECT * FROM ars_data.flights where sectorID='" + numOrSector + "'";
        }
}
    private void jsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearchActionPerformed
      
        final Object[] columnNames = new String[]{"Flight ID","Flightno","flight Date", "BC Seats Available", "XC Seats Available", "EC Seats Available", "Departure Time", "Arrival Time",
        "Aircraft","Sector","Airline","Status"};
        DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
         
         try { 
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                searchby();
                rs = st.executeQuery(query);
                int i = 0;
                boolean empty = true;
                while (rs.next()) {
                    empty = false;
                    flightid=rs.getInt(1);
                    flightno = rs.getString(2);
                    flightdate = (String) sdf.format(rs.getDate(3));
                    bcsavailable = rs.getInt(4);
                    xcsavailable = rs.getInt(5);
                    ecsavailable = rs.getInt(6);
                    deptime = rs.getString(7);
                    arrtime=rs.getString(8);
                    aircrafttypeid=rs.getString(9);
                    sectorid=rs.getString(10);
                    airlinecode=rs.getString(11);
                    status=rs.getString(12);
                    dtm.addRow(new Vector());
                    dtm.setValueAt(flightid, i, 0);
                    dtm.setValueAt(flightno, i, 1);
                    dtm.setValueAt(flightdate, i, 2);
                    dtm.setValueAt(bcsavailable, i, 3);
                    dtm.setValueAt(xcsavailable, i, 4);
                    dtm.setValueAt(ecsavailable, i, 5);
                    dtm.setValueAt(deptime, i, 6);
                    dtm.setValueAt(arrtime, i, 7);
                    dtm.setValueAt(aircrafttypeid, i, 8);
                    dtm.setValueAt(sectorid, i, 9);
                    dtm.setValueAt(airlinecode, i, 10);
                    dtm.setValueAt(status, i, 11);
                    System.out.println("running?");
                    i++;
                }
                 if (empty) {
                    JOptionPane.showMessageDialog(this,"No flight available for this "+jComboBox1.getSelectedItem().toString());
                }
                jTable3.setModel(dtm);
                TableColumnModel m = jTable3.getColumnModel();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
         
    }//GEN-LAST:event_jsearchActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jnumorsectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnumorsectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnumorsectorActionPerformed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jenternumorsectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenternumorsectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenternumorsectorActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
            if(jComboBox1.getSelectedItem().toString().equals("Flight No"))
        {
            jenternumorsector.setText("Enter Flight number");
        }
            else if(jComboBox1.getSelectedItem().toString().equals("Sector Id"))
        {
            jenternumorsector.setText("Enter Sector Id");
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jnumorsectorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jnumorsectorKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jnumorsectorKeyPressed

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
        // TODO add your handling code here:
        //        Font font = inbox.getFont();
        //        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        //        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        //        inbox.setFont(font.deriveFont(attributes));
        //        inbox.setForeground(Color.pink);
    }//GEN-LAST:event_notificationsMouseEntered

    private void notificationsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationsMouseExited
        // TODO add your handling code here:
        //        Font font = inbox.getFont();
        //        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        //        attributes.put(TextAttribute.UNDERLINE, -1);
        //        inbox.setFont(font.deriveFont(attributes));
        //        inbox.setForeground(Color.black);
    }//GEN-LAST:event_notificationsMouseExited

    private void flights1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flights1MouseClicked

    }//GEN-LAST:event_flights1MouseClicked

    private void flights1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flights1MouseEntered
        // TODO add your handling code here:

        Font font = flights.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        flights.setFont(font.deriveFont(attributes));
        flights.setForeground(Color.pink);
    }//GEN-LAST:event_flights1MouseEntered

    private void flights1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flights1MouseExited
        // TODO add your handling code here:
        Font font = flights.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        flights.setFont(font.deriveFont(attributes));
        flights.setForeground(Color.BLACK);
    }//GEN-LAST:event_flights1MouseExited

    private void contactUs1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactUs1MouseClicked

    }//GEN-LAST:event_contactUs1MouseClicked

    private void contactUs1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactUs1MouseEntered
        // TODO add your handling code here:

        Font font = contactUs.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        contactUs.setFont(font.deriveFont(attributes));
        contactUs.setForeground(Color.pink);
    }//GEN-LAST:event_contactUs1MouseEntered

    private void contactUs1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactUs1MouseExited
        // TODO add your handling code here:

        Font font = contactUs.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        contactUs.setFont(font.deriveFont(attributes));
        contactUs.setForeground(Color.BLACK);
    }//GEN-LAST:event_contactUs1MouseExited

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        // TODO add your handling code here:
        LoginPage r = new LoginPage();
        r.setVisible(true);
        r.pack();
        r.setLocationRelativeTo(null);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_logout1MouseClicked

    private void logout1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseEntered
        // TODO add your handling code here:
        Font font = logout.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        logout.setFont(font.deriveFont(attributes));
        logout.setForeground(Color.white);
    }//GEN-LAST:event_logout1MouseEntered

    private void logout1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseExited
        // TODO add your handling code here:
        Font font = logout.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        logout.setFont(font.deriveFont(attributes));
        logout.setForeground(Color.BLACK);
    }//GEN-LAST:event_logout1MouseExited

    private void jokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jokActionPerformed
        // TODO add your handling code here:
        this.dispose();
        viewFlights updt=new viewFlights();
                updt.setVisible(true);
                updt.pack();
                updt.setLocationRelativeTo(null);
                updt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jokActionPerformed

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
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contactUs;
    private javax.swing.JLabel contactUs1;
    private javax.swing.JLabel flights;
    private javax.swing.JLabel flights1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jenternumorsector;
    private javax.swing.JTextField jnumorsector;
    private java.awt.Button jok;
    private javax.swing.JButton jsearch;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel logout1;
    private javax.swing.JLabel notifications;
    // End of variables declaration//GEN-END:variables

}
