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
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author subodh
 */
public class Request_Page extends javax.swing.JFrame {

    /**
     * Creates new form Request_Page
     */
    String mobileno,acc;
    public Request_Page() {
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
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requesttable = new javax.swing.JTable();
        serachpanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtaccnumber = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        requestpanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdob = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtgender = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtmobilenumber = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnmobupdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 100));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Requests");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 560, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-macos-close-30.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 30));

        requesttable.setModel(new javax.swing.table.DefaultTableModel(
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
        requesttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requesttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(requesttable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 120));

        serachpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        serachpanel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                serachpanelComponentAdded(evt);
            }
        });
        serachpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Account Number");
        serachpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        serachpanel.add(txtaccnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, -1));

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        serachpanel.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        getContentPane().add(serachpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 110));

        requestpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        requestpanel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                requestpanelComponentAdded(evt);
            }
        });
        requestpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Name :- ");
        requestpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 14, -1, -1));
        requestpanel.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 129, -1));

        jLabel7.setText("Email:-");
        requestpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 52, -1, -1));
        requestpanel.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 129, -1));

        jLabel8.setText("DOB :-");
        requestpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 96, -1, -1));
        requestpanel.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 129, -1));

        jLabel9.setText("Gender");
        requestpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        requestpanel.add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 129, -1));

        jLabel10.setText("Mobile No.");
        requestpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 193, -1, -1));
        requestpanel.add(txtmobilenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 129, 30));

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        requestpanel.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        btnmobupdate.setText("Update");
        btnmobupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmobupdateActionPerformed(evt);
            }
        });
        requestpanel.add(btnmobupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("* Change Mob_No.");
        requestpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));
        requestpanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 314, 40, 20));

        getContentPane().add(requestpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 290, 340));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 30, 10));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 30, 10));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 30, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login_Page lp = new Login_Page();
        lp.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onbanking_system","root","");
          
            String sql2 = "Select * from update_mobilenumber";
            PreparedStatement pst2 = con.prepareCall(sql2);
            ResultSet rs2 = pst2.executeQuery();
            requesttable.setModel(DbUtils.resultSetToTableModel(rs2));
            
            
          TableModel model=requesttable.getModel(); 
          int row =requesttable.getSelectedRow();  
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
         
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con  =  DriverManager.getConnection("jdbc:mysql://localhost:3306/onbanking_system","root","");
            String sql ="update userdetails set umobile='"+mobileno+"' where AccountNumber='"+acc+"' ";
            PreparedStatement pst = con.prepareStatement(sql);
            int i=pst.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "Mobile Number Change");
            }
            
        }catch(Exception ex){
            System.out.println("Exception"+ex.getMessage());
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void requestpanelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_requestpanelComponentAdded
        // TODO add your handling code here:
        requestpanel.setVisible(false);
    }//GEN-LAST:event_requestpanelComponentAdded

    private void serachpanelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_serachpanelComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_serachpanelComponentAdded

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        requestpanel.setVisible(true);
        acc = txtaccnumber.getText();
            int status =0;
        try{
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onbanking_system","root","");
            String sql ="select * from userdetails where AccountNumber='"+acc+"'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                status=1;
                txtname.setText(rs.getString("uname"));
                txtemail.setText(rs.getString("uemail"));
                txtgender.setText(rs.getString("ugender"));
                txtmobilenumber.setText(rs.getString("umobile"));
                
                String date = rs.getString("dob");
                Date dates = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(date);
                txtdob.setDate(dates);
                
                
               
            }
            if(status==0){
                JOptionPane.showMessageDialog(null, "Account Number Not Present");
            }
            
       
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void requesttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requesttableMouseClicked
        // TODO add your handling code here:
        TableModel model=requesttable.getModel();
        int row =requesttable.getSelectedRow();
        String accno=(String)model.getValueAt(row,1);
        txtaccnumber.setText(accno);
        
        mobileno = (String)model.getValueAt(row,2);
        
        String name = (String)model.getValueAt(row, 1);
        JOptionPane.showMessageDialog(null,"Account Number:\n"+accno+"\nMobile No :"+mobileno);
    }//GEN-LAST:event_requesttableMouseClicked

    private void btnmobupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmobupdateActionPerformed
        // TODO add your handling code here:
        txtmobilenumber.setText(mobileno);
    }//GEN-LAST:event_btnmobupdateActionPerformed

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
            java.util.logging.Logger.getLogger(Request_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Request_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Request_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Request_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Request_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmobupdate;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel requestpanel;
    private javax.swing.JTable requesttable;
    private javax.swing.JPanel serachpanel;
    private javax.swing.JTextField txtaccnumber;
    private com.toedter.calendar.JDateChooser txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtmobilenumber;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
