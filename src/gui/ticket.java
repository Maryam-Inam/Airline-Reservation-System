package gui;
import ars.reservedPassengers;
import ars.user;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ticket extends javax.swing.JFrame {
SimpleDateFormat sdf1;
    SimpleDateFormat sdf;
    String sql=null;
    Connection con=null;
    PreparedStatement pst=null;
    Statement st=null;
    PreparedStatement pst1=null;
    ResultSet rs=null;
    int respassid=0;
    long ticketno=0;
    String seatno="";
    String issuetime="";
    int totseats=0;
    String[] seatnos= new String[100];
    
    String fname="";
    String lname="";
    String age="";
    String gender="";
    String mealpref="";
    String status="";
    String DateOfdeparture="";
    String flightno="";
    String airline="";
    String source="";
    String destination="";
    String Sclass="";
    String deptime="";
    String arrTime="";
    String duration="";
    int pnrno=0;
    String reserved_by="";
    String aircraftid="";
    String airportname="";
    String airlinename="";
    String selectedPassUsrName="";
    user usr;
 public ticket(user u,String p) {
        initComponents();
        try{Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ars_data","root","root");
            sdf= new SimpleDateFormat("dd-MM-yyyy");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e.getMessage());
        }
        usr=u;
        selectedPassUsrName=p;
        setSeatnos();
        setticketdata();
        updateseats();
        
    }
 public void setSeatnos() {
        System.out.println("seat nos:");
        System.out.println("seatno length: "+seatnos.length);
        for(int i=0;i<seatnos.length;i++)
        {
            seatnos[i] = "E1"+i;
            System.out.println(seatnos[i]);
        }
        
    }
 public static String getRandom(String[] seatnos) {
    int rndSeat = new Random().nextInt(seatnos.length);
    return seatnos[rndSeat];
}
 public void setticketdata()
 {
     LocalTime curtime = LocalTime.now();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
     issuetime=curtime.format(formatter);
     seatno=getRandom(seatnos);
     ticketno=new Random().nextInt(900000) + 100000;
     System.out.println("ticketno: "+ticketno);
     System.out.println("seatno: "+seatno);
     System.out.println("issuetime: "+issuetime);
 }
 public void setdata()
 {
     jfrom.setText(source);
     jto.setText(destination);
     jfno.setText(flightno);
     jdepartureTime.setText(deptime);
     jarrivalTime.setText(arrTime);
     jticketno.setText(Long.toString(ticketno));
     jpnrno.setText(Integer.toString(pnrno));
     jpassname.setText(selectedPassUsrName);
     jissuetime.setText(issuetime);
     jfname.setText(fname);
     jlname.setText(lname);
     jgender.setText(gender);
     jage.setText(age);
     jairline.setText(airline);
     jclass.setText(Sclass);
     jstatus.setText(status);
     jseatno.setText(seatno);
     jdepdate.setText(DateOfdeparture);
     jduration.setText(duration);
     jmealpref.setText(mealpref);
     jresby.setText(reserved_by);
     jaircraft.setText(aircraftid);
     jbaggage.setText("2PC");
     jdepairport.setText(airportname);
     jairlineName.setText(airlinename);
     
 }
    public void updateseats()
    { 
        try {
            System.out.println("selected pass name: "+selectedPassUsrName);
            String query3="select resPassID from reserved_passengers where username='"+selectedPassUsrName+"'";
               st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                rs=st.executeQuery(query3);
                boolean empty = true;
                if(rs.next())
                { 
                    respassid=rs.getInt(1);
                    System.out.println("respassId in ticket: "+respassid);
                    String query1="INSERT INTO `ars_data`.`ticket` (`ticketno`, `seatno`, `issueTime`, `resPassID`) VALUES (?,?,?,?);";
                    pst=con.prepareStatement(query1);
                    System.out.println("problem at query 1");
                    pst.setInt(1, (int)ticketno);
                    pst.setString(2, seatno);
                    pst.setString(3, issuetime);
                    pst.setInt(4, respassid);
                    pst.execute();
                    System.out.println("problem at end");
                }
        } catch (Exception e) {
            System.out.println("what the "+e.getMessage());
                e.printStackTrace();
        }
        try {
            String query2="select a.fname,a.lname,a.age,a.gender,a.class,a.mealpref,a.pnrno,"
                    + "b.flightno,b.flightdate,b.status,b.deptime,b.arrtime,b.airlineCode,b.aircraftTypeID,"
                    + "c.source,c.destination,d.airportName,e.airlineName"
                    + " from reserved_passengers a,flights b,sector c,airport d,airline e "
                    + "where d.airportCode in(select airportCode from aircraft where aircraftNo=b.aircrafttypeID)"
                    + "and a.resPassID='"+respassid+"'and b.airlineCode=e.airlineCode and a.flightID=b.flightID"
                    + " and b.sectorID=c.sectorID;";
            String query4="select TIMEDIFF(arrtime,deptime) from flights a,reserved_passengers b where a.flightID=b.flightID and b.username='"+selectedPassUsrName+"'";
            pst1=con.prepareStatement(query4);
                rs=pst1.executeQuery(query4);
                boolean empty = true;
                System.out.println("outside if");
                if(rs.next())
                {
                    duration=rs.getString(1);
                    pst1=con.prepareStatement(query2);
                    rs=pst1.executeQuery(query2);
                    if(rs.next()){
                    fname=rs.getString(1);
                    lname=rs.getString(2);
                    age=rs.getString(3);
                    gender=rs.getString(4);
                    Sclass =rs.getString(5);
                    mealpref=rs.getString(6);
                    pnrno=rs.getInt(7);
                    flightno=rs.getString(8);
                    DateOfdeparture=rs.getString(9);
                    status=rs.getString(10);
                    deptime=rs.getString(11);
                    arrTime=rs.getString(12);
                    airline=rs.getString(13);
                    aircraftid=rs.getString(14);
                    source=rs.getString(15);
                    destination=rs.getString(16);
                    airportname=rs.getString(17);
                    airlinename=rs.getString(18);
                    reserved_by=user.username;
                        System.out.println("username in ticket: "+user.username);
                    }
            sql="UPDATE flights SET bcsavailable = bcsavailable-'"+usr.tot+"' WHERE aircrafttypeID='"+aircraftid+"'";
            pst = con.prepareStatement(sql);
            pst.executeUpdate(sql);
            setdata();
                }
      
        } catch (Exception e) {
            System.out.println("problem here?"+e.getMessage());
                e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        print = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        contactUs6 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        logout6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel37 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jduration = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jlname = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jage = new javax.swing.JTextField();
        jgender = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        printTicket = new javax.swing.JButton();
        jclass = new javax.swing.JTextField();
        gdate1 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jstatus = new javax.swing.JTextField();
        jbaggage = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jfname = new javax.swing.JTextField();
        jdepdate = new javax.swing.JTextField();
        jPanel36 = new javax.swing.JPanel();
        jdepairport = new javax.swing.JLabel();
        jflightno = new javax.swing.JLabel();
        jdeptime = new javax.swing.JLabel();
        jarrtime = new javax.swing.JLabel();
        jairlineName = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jairline = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jmealpref = new javax.swing.JTextField();
        jresby = new javax.swing.JTextField();
        gdate2 = new javax.swing.JLabel();
        gdate3 = new javax.swing.JLabel();
        jaircraft = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jseatno = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel39 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jfrom = new javax.swing.JLabel();
        jfno = new javax.swing.JLabel();
        jdepartureTime = new javax.swing.JLabel();
        jarrivalTime = new javax.swing.JLabel();
        jto = new javax.swing.JLabel();
        jissuetime = new javax.swing.JTextField();
        gdate4 = new javax.swing.JLabel();
        jpnrno = new javax.swing.JLabel();
        jfrom2 = new javax.swing.JLabel();
        jticketno = new javax.swing.JLabel();
        jfrom4 = new javax.swing.JLabel();
        jpassname = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jhome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ticket details");

        print.setText("Print ticket");

        jPanel33.setBackground(new java.awt.Color(102, 102, 102));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contactUs6.setBackground(new java.awt.Color(255, 255, 255));
        contactUs6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        contactUs6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactUs6.setText("Contact Us");
        contactUs6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contactUs6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactUs6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contactUs6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contactUs6MouseExited(evt);
            }
        });
        jPanel33.add(contactUs6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 128, -1));

        jLabel73.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Airline Reservation System");
        jLabel73.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel33.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(255, 204, 204));
        jPanel33.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 1703, 10));

        logout6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logout6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout6.setText("Logout");
        logout6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout6MouseExited(evt);
            }
        });
        jPanel33.add(logout6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 20, 100, -1));

        jPanel6.setLayout(null);

        jLabel74.setText("hfghtdfgkhvjhlbuhkvhbhjghjkbi");
        jPanel6.add(jLabel74);
        jLabel74.setBounds(414, 1070, 148, 14);

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.jpg"))); // NOI18N
        jPanel6.add(jLabel75);
        jLabel75.setBounds(200, 73, 1400, 933);

        jPanel33.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 1703, -1));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 51));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel37.setBackground(new java.awt.Color(255, 204, 204));
        jPanel37.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel86.setText("Duration:");

        jduration.setEditable(false);
        jduration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdurationActionPerformed(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel87.setText("First name:");

        jlname.setEditable(false);
        jlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlnameActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel88.setText("Gender:");

        jage.setEditable(false);
        jage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jageActionPerformed(evt);
            }
        });

        jgender.setEditable(false);
        jgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgenderActionPerformed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel89.setText("Age:");

        printTicket.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        printTicket.setText("Print Ticket");
        printTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTicketActionPerformed(evt);
            }
        });

        jclass.setEditable(false);
        jclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclassActionPerformed(evt);
            }
        });

        gdate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gdate1.setText("Going date:");

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel90.setText("Service class:");

        jstatus.setEditable(false);
        jstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstatusActionPerformed(evt);
            }
        });

        jbaggage.setEditable(false);
        jbaggage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaggageActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel91.setText("Baggage (4):");

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel92.setText("Status: ");

        jfname.setEditable(false);
        jfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfnameActionPerformed(evt);
            }
        });

        jdepdate.setEditable(false);

        jPanel36.setBackground(new java.awt.Color(204, 204, 204));
        jPanel36.setMaximumSize(new java.awt.Dimension(32767, 3276));

        jdepairport.setForeground(new java.awt.Color(102, 0, 153));

        jairlineName.setForeground(new java.awt.Color(102, 0, 102));

        jLabel115.setBackground(new java.awt.Color(0, 0, 0));
        jLabel115.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel115.setText("Airline Name");

        jLabel116.setBackground(new java.awt.Color(0, 0, 0));
        jLabel116.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel116.setText("Departure Airport");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel85.setText("Airline:");

        jairline.setForeground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdepairport, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jairlineName, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jairline, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(696, 696, 696)
                .addComponent(jflightno, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdeptime, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jarrtime, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdeptime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jarrtime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jflightno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdepairport, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jairlineName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jairline, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel93.setText("Last name:");

        jmealpref.setEditable(false);

        jresby.setEditable(false);

        gdate2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gdate2.setText("Meal preference:");

        gdate3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gdate3.setText("Reserved by:");

        jaircraft.setEditable(false);

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel94.setText("Aircraft no:");

        jseatno.setEditable(false);
        jseatno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jseatnoActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel95.setText("Seat no: ");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(gdate2)
                        .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(gdate1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdepdate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfname, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmealpref, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel90)
                    .addComponent(jLabel86)
                    .addComponent(jLabel93)
                    .addComponent(gdate3))
                .addGap(40, 40, 40)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlname, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jduration)
                    .addComponent(jclass)
                    .addComponent(jresby))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91)
                    .addComponent(jLabel88)
                    .addComponent(jLabel92)
                    .addComponent(jLabel94))
                .addGap(43, 43, 43)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jaircraft)
                    .addComponent(jgender, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jbaggage)
                    .addComponent(jstatus))
                .addGap(21, 21, 21)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel89)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel95)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jseatno)
                    .addComponent(jage, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(printTicket)
                .addGap(459, 459, 459))
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel89)
                        .addComponent(jLabel88))
                    .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jseatno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel95))
                    .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel90)))
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jduration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel86)
                            .addComponent(jdepdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gdate1)))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel91))
                            .addComponent(jbaggage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmealpref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jresby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gdate2)
                    .addComponent(gdate3)
                    .addComponent(jaircraft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94))
                .addGap(33, 33, 33)
                .addComponent(printTicket)
                .addGap(27, 27, 27))
        );

        jLayeredPane1.setLayer(jPanel37, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel35.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 1060, 280));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(51, 51, 51));
        jPanel35.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1120, 12));

        jPanel39.setBackground(new java.awt.Color(216, 146, 168));
        jPanel39.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel102.setBackground(new java.awt.Color(0, 0, 0));
        jLabel102.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel102.setText("Electronic Ticket Reciept");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(755, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel35.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1060, 50));

        jLabel107.setBackground(new java.awt.Color(0, 0, 0));
        jLabel107.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel107.setText("Ticket no:");
        jPanel35.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 69, 90, 20));

        jLabel108.setBackground(new java.awt.Color(0, 0, 0));
        jLabel108.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel108.setText("Passenger username:");
        jPanel35.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        jLabel109.setBackground(new java.awt.Color(0, 0, 0));
        jLabel109.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel109.setText("Booking ref:");
        jPanel35.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, -1));

        jPanel40.setBackground(new java.awt.Color(153, 153, 153));
        jPanel40.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel110.setBackground(new java.awt.Color(0, 0, 0));
        jLabel110.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel110.setText("From");

        jLabel111.setBackground(new java.awt.Color(0, 0, 0));
        jLabel111.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel111.setText("To");

        jLabel112.setBackground(new java.awt.Color(0, 0, 0));
        jLabel112.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel112.setText("Flight");

        jLabel113.setBackground(new java.awt.Color(0, 0, 0));
        jLabel113.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel113.setText("Departure");

        jLabel114.setBackground(new java.awt.Color(0, 0, 0));
        jLabel114.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel114.setText("Arrival");

        jfrom.setForeground(new java.awt.Color(102, 0, 102));

        jfno.setForeground(new java.awt.Color(102, 0, 102));

        jdepartureTime.setForeground(new java.awt.Color(102, 0, 102));

        jarrivalTime.setForeground(new java.awt.Color(102, 0, 102));

        jto.setForeground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfno, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jarrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jarrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel35.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, 1060, -1));

        jissuetime.setEditable(false);
        jPanel35.add(jissuetime, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, 134, -1));

        gdate4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gdate4.setText("Issue time:");
        jPanel35.add(gdate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, -1, -1));
        jPanel35.add(jpnrno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 170, 20));
        jPanel35.add(jfrom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 40, 170, 20));
        jPanel35.add(jticketno, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 70, 170, 20));
        jPanel35.add(jfrom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 70, 170, 20));
        jPanel35.add(jpassname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 170, 20));

        jPanel34.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 560));

        jPanel33.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, 560));

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N
        jPanel33.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1360, 790));

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
        jPanel33.add(jhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 121, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(print)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 1359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(print)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactUs6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactUs6MouseClicked

    }//GEN-LAST:event_contactUs6MouseClicked

    private void contactUs6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactUs6MouseEntered
        // TODO add your handling code here:

//        Font font = contactUs.getFont();
//        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
//        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
//        contactUs.setFont(font.deriveFont(attributes));
//        contactUs.setForeground(Color.pink);
    }//GEN-LAST:event_contactUs6MouseEntered

    private void contactUs6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactUs6MouseExited
        // TODO add your handling code here:
//
//        Font font = contactUs.getFont();
//        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
//        attributes.put(TextAttribute.UNDERLINE, -1);
//        contactUs.setFont(font.deriveFont(attributes));
//        contactUs.setForeground(Color.BLACK);
    }//GEN-LAST:event_contactUs6MouseExited

    private void logout6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout6MouseClicked
        // TODO add your handling code here:
        LoginPage r = new LoginPage();
        r.setVisible(true);
        r.pack();
        r.setLocationRelativeTo(null);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_logout6MouseClicked

    private void logout6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout6MouseEntered
        // TODO add your handling code here:
//        Font font = logout.getFont();
//        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
//        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
//        logout.setFont(font.deriveFont(attributes));
//        logout.setForeground(Color.white);
    }//GEN-LAST:event_logout6MouseEntered

    private void logout6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout6MouseExited
        // TODO add your handling code here:
//        Font font = logout.getFont();
//        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
//        attributes.put(TextAttribute.UNDERLINE, -1);
//        logout.setFont(font.deriveFont(attributes));
//        logout.setForeground(Color.BLACK);
    }//GEN-LAST:event_logout6MouseExited

    private void jdurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdurationActionPerformed

    private void jlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlnameActionPerformed

    private void jageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jageActionPerformed

    private void jgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jgenderActionPerformed

    private void printTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTicketActionPerformed
       JOptionPane.showMessageDialog(null,"Ticket has been downloaded!");
       this.dispose();
    }//GEN-LAST:event_printTicketActionPerformed

    private void jclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jclassActionPerformed

    private void jstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstatusActionPerformed

    private void jbaggageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaggageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbaggageActionPerformed

    private void jfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfnameActionPerformed

    private void jseatnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jseatnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jseatnoActionPerformed

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
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel contactUs6;
    private javax.swing.JLabel gdate1;
    private javax.swing.JLabel gdate2;
    private javax.swing.JLabel gdate3;
    private javax.swing.JLabel gdate4;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator7;
    public static javax.swing.JTextField jage;
    public static javax.swing.JTextField jaircraft;
    private javax.swing.JLabel jairline;
    private javax.swing.JLabel jairlineName;
    private javax.swing.JLabel jarrivalTime;
    private javax.swing.JLabel jarrtime;
    public static javax.swing.JTextField jbaggage;
    public static javax.swing.JTextField jclass;
    private javax.swing.JLabel jdepairport;
    private javax.swing.JLabel jdepartureTime;
    public static javax.swing.JTextField jdepdate;
    private javax.swing.JLabel jdeptime;
    public static javax.swing.JTextField jduration;
    private javax.swing.JLabel jflightno;
    public static javax.swing.JTextField jfname;
    private javax.swing.JLabel jfno;
    private javax.swing.JLabel jfrom;
    private javax.swing.JLabel jfrom2;
    private javax.swing.JLabel jfrom4;
    public static javax.swing.JTextField jgender;
    private javax.swing.JLabel jhome;
    public static javax.swing.JTextField jissuetime;
    public static javax.swing.JTextField jlname;
    public static javax.swing.JTextField jmealpref;
    private javax.swing.JLabel jpassname;
    private javax.swing.JLabel jpnrno;
    public static javax.swing.JTextField jresby;
    public static javax.swing.JTextField jseatno;
    public static javax.swing.JTextField jstatus;
    private javax.swing.JLabel jticketno;
    private javax.swing.JLabel jto;
    private javax.swing.JLabel logout6;
    private javax.swing.JButton print;
    public javax.swing.JButton printTicket;
    // End of variables declaration//GEN-END:variables
}
