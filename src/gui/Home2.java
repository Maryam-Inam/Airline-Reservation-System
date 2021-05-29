package gui;
import ars.reservedPassengers;
import ars.user;
import java.util.Date;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.*;
import javax.swing.*;
import java.text.SimpleDateFormat;  
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class Home2 extends javax.swing.JFrame {
    user u;reservedPassengers r;
    String sql=null;
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    SimpleDateFormat sdf=null;
    Date dt,dt1;
    DateFormat formatter;
    int numofadults=0;
    int numofchilds=0;
    int numofinfants=0;
    int tot=0;
    String Sclass=null;
    String target=null;
    String origin=null;
    String stdate1=null;
    String stdate2=null;
    String stdate3;
    String search="";
    String name=null;
    public Object obj1,obj2,obj3,obj4,obj5,obj6;
    public Home2() {
        initComponents();
        toplabel.setText("hey "+user.username);
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
    {String status="Confirmed";
        if(CheckBox7days.isSelected())
        {
            sql="SELECT flightno,flightdate,bcsavailable,xcsavailable,ecsavailable,deptime, airlineCode FROM new_view WHERE source like'"+origin+"' AND destination LIKE '"+target+"' "+search+Integer.toString(tot)+" AND status='"+status+"' AND flightdate BETWEEN '"+stdate1+"' AND '"+stdate2+"' ORDER BY flightdate";
//    sql="SELECT  flightno,flightdate,bcsavailable,xcsavailable,ecsavailable,deptime, airlineCode FROM flights"
//            + "  WHERE sectorID =(SELECT sectorID FROM sector WHERE source LIKE '"+origin
//    + "' AND destination LIKE '" + target + "') "+search+Integer.toString(tot)+" AND status='"+status+"'"
//            + " AND flightdate BETWEEN '"+stdate1+"' AND '"+stdate2+"' ORDER BY flightdate";
      
        }
        else
        {
            sql="SELECT flightno,flightdate,bcsavailable,xcsavailable,ecsavailable,deptime,airlineCode FROM flights  WHERE sectorID =(SELECT sectorID FROM sector WHERE source LIKE '"+origin
                    + "' AND destination LIKE '" + target + "') "+search+Integer.toString(tot)+" AND status='"+status+"' AND DATE(flightdate) = '" + stdate1 + "'";  
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
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        num3 = new javax.swing.JComboBox<>();
        num1 = new javax.swing.JComboBox<>();
        num2 = new javax.swing.JComboBox<>();
        proceed = new javax.swing.JLabel();
        serviceclass = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        toplabel = new javax.swing.JLabel();
        adult = new javax.swing.JLabel();
        child = new javax.swing.JLabel();
        infant = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jcancel = new javax.swing.JButton();
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
        flights.setText("Profile");
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

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Travelors: ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Service Class:");

        num3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6" }));

        num1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "0" }));

        num2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6" }));

        proceed.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        proceed.setForeground(new java.awt.Color(153, 0, 0));
        proceed.setText("Proceed !");
        proceed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proceedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                proceedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proceedMouseExited(evt);
            }
        });

        serviceclass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Business", "Executive", "Economy" }));

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Airline", "Flight No", "Departure Time", "BC Seats Available", "EX Seats Available", "EC Seats Available"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Select Flight from search list for booking process");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        toplabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        toplabel.setText("hey...");

        adult.setText("Adult (12+)");

        child.setText("Child (2-11)");

        infant.setText("Infant (under 2)");

        jButton1.setText("Check Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jcancel.setText("Cancel Reservation");
        jcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcancelActionPerformed(evt);
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel14))
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(adult)
                                                    .addComponent(child)
                                                    .addComponent(infant))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(serviceclass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jcancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6)
                                                .addGap(271, 271, 271))))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(proceed))))
                                .addGap(83, 83, 83))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(toplabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(368, 368, 368))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(toplabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(proceed))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adult)
                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(child))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infant))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(serviceclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jcancel)))
                .addGap(29, 29, 29))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 1140, 520));

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
        
        numofadults=Integer.parseInt(num1.getSelectedItem().toString());
            numofchilds=Integer.parseInt(num2.getSelectedItem().toString());
            numofinfants=Integer.parseInt(num3.getSelectedItem().toString());
        tot=numofadults+numofchilds+numofinfants;
        System.out.println("total passengers: "+tot);
        final Object[] columnNames = new String[]{"Date","Airline", "Flight No", "Departure Time", "BC Seats Available", "XC Seats Available", "EC Seats Available"};
        DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
        origin = comboboxfrom.getSelectedItem().toString();
        target = comboboxto.getSelectedItem().toString();
        Sclass = serviceclass.getSelectedItem().toString();
        
        dt = jDateChooser2.getDate();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        stdate1 = (String) sdf1.format(dt);
       
        dt1 = jDateChooser2.getDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt1);
        cal.add(Calendar.DATE, 7);
        dt1 = cal.getTime();
        stdate2 = (String) sdf1.format(dt1);
        System.out.println("strdtver2 "+ stdate2);
        sql = null;
      
        if (Sclass.equals("Business")) {
            search = "AND bcsavailable>=";
            System.out.println("vale of tot here: "+tot);
            System.out.println("checking sql stat where search=bseats>tot: "+sql);
            try {
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                check7days();
                rs = st.executeQuery(sql);
                int i = 0;
                boolean empty = true;
                String var1 = "", var2 = "", var3 = "", var4 = "", var5 = "",var6="";
                while (rs.next()) {
                    empty = false;
                    var1 = rs.getString(1);
                    stdate3 = (String) sdf.format(rs.getDate(2));
                    var2 = Integer.toString(rs.getInt(3));
                    var3 = Integer.toString(rs.getInt(4));
                    var4 = Integer.toString(rs.getInt(5));
                    var5 = rs.getString(6);
                    var6=rs.getString(7);
                    
                    dtm.addRow(new Vector());
                    
                    dtm.setValueAt(stdate3, i, 0);
                    dtm.setValueAt(var6, i, 1);
                    dtm.setValueAt(var1, i, 2);
                    dtm.setValueAt(var5, i, 3);
                    dtm.setValueAt(var2, i, 4);
                    dtm.setValueAt(var3, i, 5);
                    dtm.setValueAt(var4, i, 6);
                    i++;

                }
                if (empty) {
                    JOptionPane.showMessageDialog(null,"No flight Available for selected date");

                    jLabel6.setVisible(false);
                }
                else
                {
                    jLabel6.setVisible(true);
                    
                }
                jTable1.setModel(dtm);
                TableColumnModel m = jTable1.getColumnModel();
                TableColumn col = m.getColumn(5);
                TableColumn col1 = m.getColumn(6);
                m.removeColumn(col);
                m.removeColumn(col1);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
       
        if (Sclass.equals("Executive")) {
            search = "AND xcsavailable>=";
            try {
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                check7days();
                rs = st.executeQuery(sql);
                int i = 0;
                boolean empty = true;
                String var1 = "", var2 = "", var3 = "", var4 = "", var5 = "",var6="";
                while (rs.next()) {
                   empty = false;
                    var1 = rs.getString(1);
                    stdate3 = (String) sdf.format(rs.getDate(2));
                    var2 = Integer.toString(rs.getInt(3));
                    var3 = Integer.toString(rs.getInt(4));
                    var4 = Integer.toString(rs.getInt(5));
                    var5 = rs.getString(6);
                    var6=rs.getString(7);
                    
                    dtm.addRow(new Vector());
                    
                    dtm.setValueAt(stdate3, i, 0);
                    dtm.setValueAt(var6, i, 1);
                    dtm.setValueAt(var1, i, 2);
                    dtm.setValueAt(var5, i, 3);
                    dtm.setValueAt(var2, i, 4);
                    dtm.setValueAt(var3, i, 5);
                    dtm.setValueAt(var4, i, 6);
                    i++;
                }
                if (empty) {
                    JOptionPane.showMessageDialog(null,"No flight Available for selected date");

                    jLabel6.setVisible(false);
                }
                else
                {
                    jLabel6.setVisible(true);
                }
                jTable1.setModel(dtm);
                TableColumnModel m = jTable1.getColumnModel();
                TableColumn col = m.getColumn(4);
                TableColumn col1 = m.getColumn(6);
                m.removeColumn(col);
                m.removeColumn(col1);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }

        if (Sclass.equals("Economy")) {
            search = "AND ecsavailable>=";


            System.out.println(sql);
            try {
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                check7days();
                rs = st.executeQuery(sql);
                int i = 0;
                boolean empty = true;
                String var1 = "", var2 = "", var3 = "", var4 = "", var5 = "",var6="";
                while (rs.next()) {
                    empty = false;
                    var1 = rs.getString(1);
                    stdate3 = (String) sdf.format(rs.getDate(2));
                    var2 = Integer.toString(rs.getInt(3));
                    var3 = Integer.toString(rs.getInt(4));
                    var4 = Integer.toString(rs.getInt(5));
                    var5 = rs.getString(6);
                    var6=rs.getString(7);
                    
                    dtm.addRow(new Vector());
                    
                    dtm.setValueAt(stdate3, i, 0);
                    dtm.setValueAt(var6, i, 1);
                    dtm.setValueAt(var1, i, 2);
                    dtm.setValueAt(var5, i, 3);
                    dtm.setValueAt(var2, i, 4);
                    dtm.setValueAt(var3, i, 5);
                    dtm.setValueAt(var4, i, 6);
                    i++;
                }
                if (empty) {
                    JOptionPane.showMessageDialog(null,"No flight Available for selected date");
                    jLabel6.setVisible(false);
                }
                else
                {
                    jLabel6.setVisible(true);
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
    }//GEN-LAST:event_jsearchActionPerformed
    public Object GetData(JTable jTable1, int row_index, int col_index){
		return jTable1.getModel().getValueAt(row_index, col_index);
	}
   
    
    private void proceedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceedMouseExited
        // TODO add your handling code here:
        Font font = jsearch.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        jsearch.setFont(font.deriveFont(attributes));
        jsearch.setForeground(Color.WHITE);
    }//GEN-LAST:event_proceedMouseExited

    private void proceedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceedMouseEntered
        // TODO add your handling code here:
        Font font = jsearch.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        jsearch.setFont(font.deriveFont(attributes));
        jsearch.setForeground(Color.PINK);
    }//GEN-LAST:event_proceedMouseEntered
    
    private void proceedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceedMouseClicked

    try
        {
            if(pdt==null || obj2==null || obj3 == null || porigin == null || ptarget==null || pfclass==null)
            {
                JOptionPane.showMessageDialog(this, "Please Select flight from List");
            }
            else if(tot==0)
            {
                JOptionPane.showMessageDialog(this, "Please select minimum 1 passenger");
            }
            else
            {
                flightdetails h=new flightdetails();
                h.setdata(pdt, obj2, obj3,obj4, porigin, ptarget, pfclass, name, tot);
                h.pack();
                h.setLocationRelativeTo(null);
                h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                h.setVisible(true);
                this.setVisible(false);
            }
        }
        catch(NullPointerException nexc)
        {
            
        }
    }//GEN-LAST:event_proceedMouseClicked
    String porigin;
    String ptarget;
    String pfclass;
    Date pdt;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{  
                int rno=jTable1.getSelectedRow(); 
                obj1 = GetData(jTable1, rno, 0);
                obj2 = GetData(jTable1, rno, 2); 
                obj3 = GetData(jTable1, rno, 3);
                obj4 = GetData(jTable1, rno, 1);
                porigin = comboboxfrom.getSelectedItem().toString();
                ptarget = comboboxto.getSelectedItem().toString();
                pfclass = serviceclass.getSelectedItem().toString();
                System.out.println(obj1);
                System.out.println(obj2);
                System.out.println(obj3);
                System.out.println(porigin);
                System.out.println(ptarget);
                System.out.println(pfclass);
                String strDate=obj1.toString();
                pdt=sdf.parse(strDate);
        }
        catch(Exception pex){}
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

    }//GEN-LAST:event_jLabel6MouseClicked

    private void notificationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationsMouseClicked

    }//GEN-LAST:event_notificationsMouseClicked

    private void notificationsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationsMouseEntered
      
    }//GEN-LAST:event_notificationsMouseEntered

    private void notificationsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationsMouseExited
  
    }//GEN-LAST:event_notificationsMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
                checkstatus h=new checkstatus();
                          h.setVisible(true);
                          h.pack();
                          h.setLocationRelativeTo(null);                   
                          h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                           
                          this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcancelActionPerformed

        cancelReservation h=new cancelReservation();
                          h.setVisible(true);
                          h.pack();
                          h.setLocationRelativeTo(null);                   
                          h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                           
                          this.dispose();
    }//GEN-LAST:event_jcancelActionPerformed
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
    private javax.swing.JLabel adult;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel child;
    public javax.swing.JComboBox<String> comboboxfrom;
    public javax.swing.JComboBox<String> comboboxto;
    private javax.swing.JLabel contactUs;
    private javax.swing.JLabel flights;
    private javax.swing.JLabel infant;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JButton jcancel;
    private javax.swing.JButton jsearch;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel notifications;
    public javax.swing.JComboBox<String> num1;
    public javax.swing.JComboBox<String> num2;
    public javax.swing.JComboBox<String> num3;
    private javax.swing.JLabel proceed;
    private javax.swing.JComboBox serviceclass;
    private javax.swing.JLabel toplabel;
    // End of variables declaration//GEN-END:variables
}
