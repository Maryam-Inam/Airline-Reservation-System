/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package gui;
import ars.reservedPassengers;
import ars.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.awt.Font;
import java.awt.Color;
import java.awt.font.TextAttribute;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class checkout extends javax.swing.JFrame {
    DateFormat formatter;
    SimpleDateFormat sdf=null;
    String sql=null;
    Connection con=null;
    PreparedStatement pst=null;
    PreparedStatement pst1=null;
    PreparedStatement pst2=null;
    ResultSet rs=null;
    String[] fnames=new String[6];
    String[] usrnames;
    String[] lnames=new String[6];
    String[] ages=new String[6];
    String[] genders=new String[6];
    String mealpref="";
    String status="confirmed";
    String goingDate="";
    String flno="";
    String airline="";
    String frm="";
    String to="";
    String cls="";
    String chrg="";
    String dt="";
    int numoftrav=0;
    int tot=0;
    String vmeal;
    String nmeal;
    double servicetax=0.0;
    int fc=200;
    int vegmc=150;
    int nvegmc=200;
    double tfare=0.0;
    long pnr;
    int last=0;
    int fl_id=0;
    int userId=0;
    reservedPassengers res;
    public checkout(reservedPassengers r) {
       initComponents();
       res=r;
       jPanel4.setBackground(new Color(0,0,0,120));
        try{Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ars_data","root","root");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    public void setdata(int num,String vm,String nm,String fare,String[] usrn,String[] fn,String[] ln,String[] ages,String[] gend)
    {
        usrnames=usrn;
        fnames=fn;
        lnames=ln;
        this.ages=ages;
        genders=gend;
        
        numoftrav=num;
       vmeal=vm;
       nmeal=nm;
       this.frm=res.from;
       to=res.to;
       cls=res.Sclass;
       chrg=fare;
       setDisplay();
    }
    public void setDisplay()
    { 
        final long MAX_NUMBER_PNR = 999;
        final long MIN_NUMBER_PNR = 100;
        pnr=new Random().nextInt(900000) + 100000;;
//        pnr=Long.valueOf(new Random().nextInt()*(MAX_NUMBER_PNR - MIN_NUMBER_PNR));
        System.out.println("pnr si: "+pnr);
        pnrd.setText(Long.toString(pnr));
       jourd.setText(res.journeyDate);
        depTd.setText(res.deptime);
        flnod.setText(reservedPassengers.flightno);
        frmd.setText(frm);
        destd.setText(to);
        classd.setText(cls);
        fared.setText(chrg);
        servicetax=(double)(Integer.parseInt(chrg)*12.36/100);
        servtaxd.setText(Double.toString(servicetax));
        jfname1.setText(fnames[0]);
        jfname2.setText(fnames[1]);
        jfname3.setText(fnames[2]);
        jfname4.setText(fnames[3]);
        jfname5.setText(fnames[4]);
        jfname6.setText(fnames[5]);
        jlname1.setText(lnames[0]);
        jlname2.setText(lnames[1]);
        jlname3.setText(lnames[2]);
        jlname4.setText(lnames[3]);
        jlname5.setText(lnames[4]);
        jlname6.setText(lnames[5]);
        jage1.setText(ages[0]);
        jage2.setText(ages[1]);
        jage3.setText(ages[2]);
        jage4.setText(ages[3]);
        jage5.setText(ages[4]);
        jage6.setText(ages[5]);
        jgen1.setText(genders[0]);
        jgen2.setText(genders[1]);
        jgen3.setText(genders[2]);
        jgen4.setText(genders[3]);
        jgen5.setText(genders[4]);
        jgen6.setText(genders[5]);
        
        fuelchd.setText(Integer.toString(fc));
        int mc1=0;
        int mc2=0;
        int mc3=0;
        if(vmeal.equals("Veg")&&nmeal.equals(""))
        {
            jmealc.setText(Integer.toString(vegmc));
            mealpref="Vegitarian";
            mc1=vegmc;
        }
        else if(nmeal.equals("Non Veg")&&vmeal.equals(""))
        {
            jmealc.setText(Integer.toString(nvegmc));
            mealpref="Non-vegitarian";
            mc2=nvegmc;
        }
        else
        {
            mc3=vegmc+nvegmc;
            jmealc.setText(Integer.toString(mc3));
            mealpref="Both veg and non-veg";
            System.out.println("meal cost: "+mc3);
        }
        tfare= (double)((numoftrav)*Integer.parseInt(chrg))+servicetax+(mc3*(numoftrav))+(fc*(numoftrav));
        jtfare.setText(Double.toString(tfare));
        jtfare1.setText(Double.toString(tfare));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPanel9 = new javax.swing.JPanel();
        contactUs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logout = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jourd = new javax.swing.JTextField();
        destd = new javax.swing.JTextField();
        depTd = new javax.swing.JTextField();
        pnrd = new javax.swing.JTextField();
        flnod = new javax.swing.JTextField();
        classd = new javax.swing.JTextField();
        frmd = new javax.swing.JTextField();
        checkout = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jfname1 = new javax.swing.JTextField();
        jlname1 = new javax.swing.JTextField();
        jfname2 = new javax.swing.JTextField();
        jlname2 = new javax.swing.JTextField();
        jfname3 = new javax.swing.JTextField();
        jlname3 = new javax.swing.JTextField();
        jfname4 = new javax.swing.JTextField();
        jlname4 = new javax.swing.JTextField();
        jfname5 = new javax.swing.JTextField();
        jlname5 = new javax.swing.JTextField();
        jfname6 = new javax.swing.JTextField();
        jlname6 = new javax.swing.JTextField();
        jage1 = new javax.swing.JTextField();
        jage2 = new javax.swing.JTextField();
        jage3 = new javax.swing.JTextField();
        jage4 = new javax.swing.JTextField();
        jage5 = new javax.swing.JTextField();
        jage6 = new javax.swing.JTextField();
        jgen1 = new javax.swing.JTextField();
        jgen2 = new javax.swing.JTextField();
        jgen3 = new javax.swing.JTextField();
        jgen4 = new javax.swing.JTextField();
        jgen5 = new javax.swing.JTextField();
        jgen6 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        fuelchd = new javax.swing.JTextField();
        servtaxd = new javax.swing.JTextField();
        jmealc = new javax.swing.JTextField();
        fared = new javax.swing.JTextField();
        jtfare = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jtfare1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jback = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jhome = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenuItem1.setText("jMenuItem1");

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        jMenu11.setText("jMenu11");

        jMenuItem2.setText("jMenuItem2");

        jMenu12.setText("File");
        jMenuBar6.add(jMenu12);

        jMenu13.setText("Edit");
        jMenuBar6.add(jMenu13);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Prepare for Takeoff.. on the Cheapest Flights Around ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 60));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Checkout", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Journey Date");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Flight No.");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("From");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Class");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        jButton1.setText("Change");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 568, -1, -1));

        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 568, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 153));
        jLabel17.setText("Departure Time");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setText("Destination");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 153));
        jLabel13.setText("PNR no.");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 153));
        jLabel18.setText("Total Fare");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 528, -1, 34));

        jourd.setEditable(false);
        jPanel2.add(jourd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 103, -1));

        destd.setEditable(false);
        destd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destdActionPerformed(evt);
            }
        });
        jPanel2.add(destd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 100, -1));

        depTd.setEditable(false);
        depTd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depTdActionPerformed(evt);
            }
        });
        jPanel2.add(depTd, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 102, -1));

        pnrd.setEditable(false);
        pnrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnrdActionPerformed(evt);
            }
        });
        jPanel2.add(pnrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, -1));

        flnod.setEditable(false);
        jPanel2.add(flnod, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 102, -1));

        classd.setEditable(false);
        classd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classdActionPerformed(evt);
            }
        });
        jPanel2.add(classd, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 100, -1));

        frmd.setEditable(false);
        jPanel2.add(frmd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 102, -1));

        checkout.setLabel("Checkout and Pay");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });
        jPanel2.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Passenger Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        jfname1.setEditable(false);
        jfname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfname1ActionPerformed(evt);
            }
        });

        jlname1.setEditable(false);

        jfname2.setEditable(false);

        jlname2.setEditable(false);

        jfname3.setEditable(false);

        jlname3.setEditable(false);
        jlname3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlname3ActionPerformed(evt);
            }
        });

        jfname4.setEditable(false);

        jlname4.setEditable(false);

        jfname5.setEditable(false);
        jfname5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfname5ActionPerformed(evt);
            }
        });

        jlname5.setEditable(false);

        jfname6.setEditable(false);
        jfname6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfname6ActionPerformed(evt);
            }
        });

        jlname6.setEditable(false);

        jage1.setEditable(false);

        jage2.setEditable(false);
        jage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jage2ActionPerformed(evt);
            }
        });

        jage3.setEditable(false);

        jage4.setEditable(false);

        jage5.setEditable(false);

        jage6.setEditable(false);

        jgen1.setEditable(false);

        jgen2.setEditable(false);

        jgen3.setEditable(false);

        jgen4.setEditable(false);

        jgen5.setEditable(false);

        jgen6.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jfname1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(372, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jfname2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfname3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfname4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfname5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfname6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlname1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlname2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlname3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlname4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlname5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlname6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jage1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jage2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jage3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jage4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jage5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jage6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jgen1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jgen2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jgen3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jgen4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jgen5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jgen6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(76, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jfname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jgen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jfname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jgen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jfname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jgen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jfname4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlname4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jgen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jfname5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlname5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jage5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jgen5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jfname6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlname6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jage6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jgen6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 630, 320));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Price Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 153));
        jLabel14.setText("Fare");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 153));
        jLabel15.setText("Grand Total");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 153));
        jLabel16.setText("Meal Cost");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 153));
        jLabel19.setText("Service tax (12.36%)");

        fuelchd.setEditable(false);
        fuelchd.setBorder(null);

        servtaxd.setEditable(false);
        servtaxd.setBorder(null);
        servtaxd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servtaxdActionPerformed(evt);
            }
        });

        jmealc.setEditable(false);
        jmealc.setBorder(null);
        jmealc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmealcActionPerformed(evt);
            }
        });

        fared.setEditable(false);
        fared.setBorder(null);
        fared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faredActionPerformed(evt);
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

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 153));
        jLabel20.setText("Total Fare");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 153));
        jLabel21.setText("Fuel Charge");

        jtfare1.setEditable(false);
        jtfare1.setBorder(null);
        jtfare1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfare1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jtfare1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel16)
                            .addComponent(jLabel21)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fuelchd)
                            .addComponent(jmealc)
                            .addComponent(servtaxd)
                            .addComponent(fared))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jtfare, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jSeparator3))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfare, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuelchd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmealc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(servtaxd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(fared, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfare1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 330, 320));

        jback.setText("Go back");
        jback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbackMouseClicked(evt);
            }
        });
        jback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbackActionPerformed(evt);
            }
        });
        jPanel2.add(jback, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1010, 510));
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        jPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 1090, 590));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1360, 650));

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

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1373, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        try { 
            System.out.println("flight no in checkout: "+reservedPassengers.flightno);
            System.out.println("username in checkout: "+user.username);
                String query2="select resPassID from reserved_passengers order by resPassID asc";
                String query1="select a.userId, b.flightID from flights b,registered_passengers a where b.flightno='"+reservedPassengers.flightno+"' and a.username='"+user.username+"'";
                sql="INSERT INTO `ars_data`.`reserved_passengers`(resPassID,pnrno,fname,lname,username,age,gender,class,mealpref,numoftravelors,reservedby,flightID)values(?,?,?,?,?,?,?,?,?,?,?,?)";
                pst1=con.prepareStatement(query1);
                rs=pst1.executeQuery(query1);
                boolean empty = true;
                System.out.println("outside if");
                ArrayList<Integer> respassid = new ArrayList<Integer>();
                ArrayList<String> respassnames = new ArrayList<String>();
                if(rs.next())
                {
                    userId=rs.getInt(1);
                    fl_id=rs.getInt(2);
                    System.out.println("flight id: "+fl_id);
                    System.out.println("user id: "+userId);
                    int tot=numoftrav;
                    pst1 = con.prepareStatement(query2);
                    rs=pst1.executeQuery(query2);
                    rs.last();
                        last=rs.getInt(1);
                        System.out.println("last value: "+last);
                        for(int i=0;i<tot;i++){
                            System.out.println("inside for loop");
                                pst = con.prepareStatement(sql);
                                empty = false;
                                pst.setInt(1,           ++last);
                                System.out.println("respassid: "+last);
                                respassid.add(last);
                                pst.setString(2, Long.toString(pnr));
                                pst.setString(3, fnames[i]);
                                pst.setString(4, lnames[i]);
                                pst.setString(5, usrnames[i]);
                                respassnames.add(usrnames[i]);
                                pst.setString(6, ages[i]);
                                pst.setString(7, genders[i]);
                                pst.setString(8, cls);
                                pst.setString(9, mealpref);
                                pst.setString(10, Integer.toString(numoftrav));
                                pst.setInt(11, userId);
                                pst.setInt(12, fl_id);
                                pst.execute();
                            
                    }
                            if (empty) 
                                {
                                    JOptionPane.showMessageDialog(null,"No passenger registered");
                                }  
                       JOptionPane.showMessageDialog(null, "Registered Successfully!");
                       user u=new user(tot,tfare,respassid,respassnames);
                       for(int i=0;i<respassnames.size();i++){
                           System.out.println("respassnames in checkout: "+respassnames);
                       }
                       System.out.println("size of respassnames: "+respassnames.size());
                         payment h=new payment(u,res);
                          h.setVisible(true);
                          h.pack();
                          h.setLocationRelativeTo(null);                   
                          h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                           
                          this.dispose();
                }
            } 
            catch (Exception ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
    }//GEN-LAST:event_checkoutActionPerformed

    private void faredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faredActionPerformed

    private void classdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classdActionPerformed

    private void pnrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnrdActionPerformed

    private void depTdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depTdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depTdActionPerformed

    private void jtfareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfareActionPerformed

    private void jmealcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmealcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmealcActionPerformed

    private void servtaxdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servtaxdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servtaxdActionPerformed

    private void destdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfare1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfare1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfare1ActionPerformed

    private void jlname3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlname3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlname3ActionPerformed

    private void jfname5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfname5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfname5ActionPerformed

    private void jfname6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfname6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfname6ActionPerformed

    private void jage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jage2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jage2ActionPerformed

    private void jfname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfname1ActionPerformed

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

    private void jbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbackActionPerformed

    private void jbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbackMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbackMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton checkout;
    private javax.swing.JTextField classd;
    private javax.swing.JLabel contactUs;
    private javax.swing.JTextField depTd;
    private javax.swing.JTextField destd;
    private javax.swing.JTextField fared;
    private javax.swing.JTextField flnod;
    private javax.swing.JTextField frmd;
    private javax.swing.JTextField fuelchd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jage1;
    private javax.swing.JTextField jage2;
    private javax.swing.JTextField jage3;
    private javax.swing.JTextField jage4;
    private javax.swing.JTextField jage5;
    private javax.swing.JTextField jage6;
    private javax.swing.JButton jback;
    private javax.swing.JTextField jfname1;
    private javax.swing.JTextField jfname2;
    private javax.swing.JTextField jfname3;
    private javax.swing.JTextField jfname4;
    private javax.swing.JTextField jfname5;
    private javax.swing.JTextField jfname6;
    private javax.swing.JTextField jgen1;
    private javax.swing.JTextField jgen2;
    private javax.swing.JTextField jgen3;
    private javax.swing.JTextField jgen4;
    private javax.swing.JTextField jgen5;
    private javax.swing.JTextField jgen6;
    private javax.swing.JLabel jhome;
    private javax.swing.JTextField jlname1;
    private javax.swing.JTextField jlname2;
    private javax.swing.JTextField jlname3;
    private javax.swing.JTextField jlname4;
    private javax.swing.JTextField jlname5;
    private javax.swing.JTextField jlname6;
    private javax.swing.JTextField jmealc;
    private javax.swing.JTextField jourd;
    private javax.swing.JTextField jtfare;
    private javax.swing.JTextField jtfare1;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField pnrd;
    private javax.swing.JTextField servtaxd;
    // End of variables declaration//GEN-END:variables
}
