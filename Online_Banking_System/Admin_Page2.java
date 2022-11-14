/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Online_Banking_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author subodh
 */
public class Admin_Page2 extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Page2
     */
    String dates,idd;
    public Admin_Page2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblnoofaccount = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lbltableheading = new javax.swing.JLabel();
        lblleft = new javax.swing.JLabel();
        lblbottom = new javax.swing.JLabel();
        lblright = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        searchpanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtsid = new javax.swing.JTextField();
        btngo = new javax.swing.JButton();
        userpanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        aname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        aaccountno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        adate = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        amobile = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        aactivestatus = new javax.swing.JTextField();
        btnaupdate = new javax.swing.JButton();
        btnadminlogout = new javax.swing.JButton();
        btnrequest = new javax.swing.JButton();
        lblrequest = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to XYZ Bank");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/profile.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 50));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 960, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bank (1).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 40, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Number Of Account Holder : - ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        lblnoofaccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnoofaccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnoofaccount.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblnoofaccountMouseMoved(evt);
            }
        });
        getContentPane().add(lblnoofaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 30, 20));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 810, 100));

        lbltableheading.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbltableheading.setForeground(new java.awt.Color(255, 0, 0));
        lbltableheading.setText("Account Holder Details ");
        getContentPane().add(lbltableheading, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        getContentPane().add(lblleft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));
        getContentPane().add(lblbottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 40, 10));
        getContentPane().add(lblright, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, 30, 10));

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        searchpanel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                searchpanelComponentAdded(evt);
            }
        });

        jLabel5.setText("ID :- ");

        btngo.setText("Go");
        btngo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchpanelLayout = new javax.swing.GroupLayout(searchpanel);
        searchpanel.setLayout(searchpanelLayout);
        searchpanelLayout.setHorizontalGroup(
            searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchpanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btngo)
                    .addComponent(txtsid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        searchpanelLayout.setVerticalGroup(
            searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btngo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(searchpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 130, 80));

        userpanel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                userpanelComponentAdded(evt);
            }
        });
        userpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Name :- ");
        userpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 14, -1, -1));
        userpanel.add(aname, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 11, 129, -1));

        jLabel7.setText("Account No :-");
        userpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 52, -1, -1));
        userpanel.add(aaccountno, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 49, 129, -1));

        jLabel8.setText("DOB :-");
        userpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 96, -1, -1));
        userpanel.add(adate, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 96, 129, -1));

        jLabel9.setText("Mobile No :-");
        userpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 147, -1, -1));
        userpanel.add(amobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 144, 129, -1));

        jLabel10.setText("Active Status");
        userpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 193, -1, -1));
        userpanel.add(aactivestatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 190, 129, -1));

        btnaupdate.setText("Update");
        btnaupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaupdateActionPerformed(evt);
            }
        });
        userpanel.add(btnaupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 228, -1, -1));

        getContentPane().add(userpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 380, 310));

        btnadminlogout.setBackground(new java.awt.Color(51, 102, 255));
        btnadminlogout.setText("Logout");
        btnadminlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnadminlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, -1, -1));

        btnrequest.setText("See Requests");
        btnrequest.setBorder(null);
        btnrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrequestActionPerformed(evt);
            }
        });
        getContentPane().add(btnrequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 90, 30));

        lblrequest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblrequest.setForeground(new java.awt.Color(255, 0, 0));
        lblrequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblrequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onbanking_system","root","");
           String sql = "select count(id) from userdetails";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                lblnoofaccount.setText(""+rs.getInt(1));
            }
            String sql2 = "Select * from userdetails";
            PreparedStatement pst2 = con.prepareCall(sql2);
            ResultSet rs2 = pst2.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs2));
            
            
          TableModel model=table.getModel();
          table.setBackground(java.awt.Color.red);
        int row =table.getSelectedRow();
        String status=(String)model.getValueAt(1,12);
        
        
        String sql3 = "select count(id) from update_mobilenumber";
            PreparedStatement pst3 = con.prepareStatement(sql3);
            ResultSet rs3 = pst3.executeQuery();
            if(rs3.next()){
                lblrequest.setText("No of Request : "+rs3.getInt(1));
            }
        
            
        }catch(Exception ex){
            
        }

    }//GEN-LAST:event_formWindowGainedFocus

    private void lblnoofaccountMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblnoofaccountMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblnoofaccountMouseMoved

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_formMouseClicked

    private void searchpanelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_searchpanelComponentAdded
        // TODO add your handling code here:
        searchpanel.setVisible(false);
    }//GEN-LAST:event_searchpanelComponentAdded

    private void userpanelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_userpanelComponentAdded
        // TODO add your handling code here:
        userpanel.setVisible(false);
    }//GEN-LAST:event_userpanelComponentAdded

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        searchpanel.setVisible(true);
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btngoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngoActionPerformed
        // TODO add your handling code here:
        userpanel.setVisible(true);
         idd = txtsid.getText();
         int status =0;
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onbanking_system","root","");
            String sql ="select * from userdetails where id='"+idd+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                status =1;
                aname.setText(rs.getString("uname"));
                aname.setEnabled(false);
                aaccountno.setText(rs.getString("AccountNumber"));
                aaccountno.setEnabled(false);
                
                dates = rs.getString("dob");
                Date date = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(dates);
                adate.setDate(date);
                adate.setEnabled(false);
                
                amobile.setText(rs.getString("umobile"));
                amobile.setEnabled(false);
                aactivestatus.setText(rs.getString("ActiveStatus"));
               
            }
            if(status==0){
                JOptionPane.showMessageDialog(null, "Id Not Present");
            }
            
        }catch(Exception ex){
            System.out.println("Exception"+ex.getMessage());
        }
    }//GEN-LAST:event_btngoActionPerformed

    private void btnaupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaupdateActionPerformed
        // TODO add your handling code here:
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con  =  DriverManager.getConnection("jdbc:mysql://localhost:3306/onbanking_system","root","");
            String sql ="update userdetails set ActiveStatus='"+aactivestatus.getText()+"' where id='"+idd+"' ";
            PreparedStatement pst = con.prepareStatement(sql);
            int i=pst.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "Verify Succesfully");
            }
            
        }catch(Exception ex){
            System.out.println("Exception"+ex.getMessage());
        }
    }//GEN-LAST:event_btnaupdateActionPerformed

    private void btnadminlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminlogoutActionPerformed
        // TODO add your handling code here:
        Login_Page lp2 = new Login_Page();
          lp2.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnadminlogoutActionPerformed

    private void btnrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrequestActionPerformed
        // TODO add your handling code here:
        Request_Page rp = new Request_Page();
        rp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnrequestActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Page2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aaccountno;
    private javax.swing.JTextField aactivestatus;
    private com.toedter.calendar.JDateChooser adate;
    private javax.swing.JTextField amobile;
    private javax.swing.JTextField aname;
    private javax.swing.JButton btnadminlogout;
    private javax.swing.JButton btnaupdate;
    private javax.swing.JButton btngo;
    private javax.swing.JButton btnrequest;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblbottom;
    private javax.swing.JLabel lblleft;
    private javax.swing.JLabel lblnoofaccount;
    private javax.swing.JLabel lblrequest;
    private javax.swing.JLabel lblright;
    private javax.swing.JLabel lbltableheading;
    private javax.swing.JPanel searchpanel;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtsid;
    private javax.swing.JPanel userpanel;
    // End of variables declaration//GEN-END:variables
}
