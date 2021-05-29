package gui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
public class viewAircrafts extends javax.swing.JFrame {
Connection con=null;
    Statement st=null;
    ResultSet rs=null;    
    SimpleDateFormat sdf=null;
    Object obj1,obj2,obj3,obj4,obj5,obj6,obj7;
    String aircraftid = "", name="",airportCode="",expirydate="";
    int bseats=0, xseats=0,eseats=0;
    public viewAircrafts() {
        initComponents();
        try{Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ars_data","root","root");
            sdf= new SimpleDateFormat("dd-MM-yyyy");
            setData();
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        setData();
    }
    public Object GetData(JTable jTable1, int row_index, int col_index){
		return jTable1.getModel().getValueAt(row_index, col_index);
	}
    public void setData()
    {
        final Object[] columnNames = new String[]{"Aircraft ID","Aircraft Name","Airport Code", "Business Seats", "Executive Seats", "Economy Seats", "Expiry Date"};
        DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
        try {
            String sql="select * from aircraft";
                st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                rs = st.executeQuery(sql);
                boolean empty = true;
                System.out.println("inside setdata");
                    int i=0;
                while (rs.next()) {
                    empty = false;
                    aircraftid=rs.getString(1);
                    name = rs.getString(2);
                    bseats = rs.getInt(3);
                    xseats = rs.getInt(4);
                    eseats = rs.getInt(5);
                    airportCode = rs.getString(6);
                    expirydate = rs.getString(7);
                    
                    dtm.addRow(new Vector());
                    
                    dtm.setValueAt(aircraftid, i, 0);
                    dtm.setValueAt(name, i, 1);
                    dtm.setValueAt(airportCode, i, 2);
                    dtm.setValueAt(bseats, i, 3);
                    dtm.setValueAt(xseats, i, 4);
                    dtm.setValueAt(eseats, i, 5);
                    dtm.setValueAt(expirydate, i, 6);
                    
                    i++;}
                if (empty) {
                    JOptionPane.showMessageDialog(null,"no Passenger to show");
                }
                jTable1.setModel(dtm);
                TableColumnModel m = jTable1.getColumnModel();
            } catch (Exception ex) {
                System.out.println("failed"+ex.getMessage());
                ex.printStackTrace();
            
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jupdate = new javax.swing.JButton();
        jback = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1020, 270));

        jupdate.setText("Update");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });
        jPanel1.add(jupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, -1, -1));

        jback.setText("Go Back");
        jback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbackActionPerformed(evt);
            }
        });
        jPanel1.add(jback, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        try{
            int rno=jTable1.getSelectedRow();
            obj1 = GetData(jTable1, rno, 0);
            obj2 = GetData(jTable1, rno, 1);
            obj3 = GetData(jTable1, rno, 2);
            obj4 = GetData(jTable1, rno, 3);
            obj5 = GetData(jTable1, rno, 4);
            obj6 = GetData(jTable1, rno, 5);
            obj7 = GetData(jTable1, rno, 6);
        }
        catch(Exception pex){}
    }//GEN-LAST:event_jTable1MouseClicked

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
        // TODO add your handling code here:

        try
        {
            if(obj1==null && obj2==null && obj3 == null && obj4 == null && obj5==null && obj6==null&& obj7==null)
            {
                JOptionPane.showMessageDialog(this, "Please Select Aircraft from List");
            }
            else
            {
                updateAircraft updt=new updateAircraft();
                updt.setdata(obj1, obj2, obj3,obj4, obj5, obj6, obj7);
                updt.setVisible(true);
                updt.pack();
                updt.setLocationRelativeTo(null);
                updt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();

            }
        }
        catch(NullPointerException ex)
        {
            System.out.println("failed"+ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jupdateActionPerformed

    private void jbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbackActionPerformed
        // TODO add your handling code here:
        adminConsole updt=new adminConsole();
        updt.setVisible(true);
        updt.pack();
        updt.setLocationRelativeTo(null);
        updt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jbackActionPerformed

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
            java.util.logging.Logger.getLogger(viewAircrafts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewAircrafts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewAircrafts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewAircrafts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewAircrafts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JButton jback;
    private javax.swing.JButton jupdate;
    // End of variables declaration//GEN-END:variables
}