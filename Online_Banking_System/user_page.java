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
import javax.swing.JOptionPane;

/**
 *
 * @author subodh
 */
public class user_page extends javax.swing.JFrame {

    /**
     * Creates new form user_page
     */
    String username,password,email;
    
     String sendername,upiid,amount,pusername,pass,upitextamount,PhoneNumber;
    
     public void getData(String name,String balance,String username,String password){
         sendername = name;
         amount = balance;
         pusername = username;
         pass = password;
     }
     
     public void getMobile(String mobile){
    PhoneNumber = mobile;
}
     

     public void getEmail(String email){
         this.email = email;
     }
    public user_page() {
        initComponents();

    }
    
   

    

//    user_page(String name) {
//       usrname = name; 
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnaddbank = new javax.swing.JButton();
        btnhistory = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnsendmoney = new javax.swing.JButton();
        btnviewbalance2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        bottom = new javax.swing.JLabel();
        profile_panel = new javax.swing.JPanel();
        btnprofile = new javax.swing.JButton();
        btnqueries = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        balancearea = new javax.swing.JPanel();
        lbl_balance_heading = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        lblsavingacc = new javax.swing.JLabel();
        lblbank = new javax.swing.JLabel();
        lblaccountbalance = new javax.swing.JLabel();
        txtbalance = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 200));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
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
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                formWindowDeiconified(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnaddbank.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnaddbank.setText("Add Bank Account");
        btnaddbank.setToolTipText("Add Bank Account\n");
        btnaddbank.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.red, java.awt.Color.black));
        btnaddbank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddbankActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddbank, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 90, 50));

        btnhistory.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnhistory.setText("Transaction History"); // NOI18N
        btnhistory.setToolTipText("Transaction History");
        btnhistory.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.red, java.awt.Color.black));
        btnhistory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnhistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhistoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnhistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 90, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/profile.jpg"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bank (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to XYZ Bank");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 130, 20));

        btnsendmoney.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnsendmoney.setText("Send Money");
        btnsendmoney.setToolTipText("Send Money\n");
        btnsendmoney.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.red, java.awt.Color.black));
        btnsendmoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendmoneyActionPerformed(evt);
            }
        });
        getContentPane().add(btnsendmoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 90, 50));

        btnviewbalance2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnviewbalance2.setText("View Balance");
        btnviewbalance2.setToolTipText("View Balance");
        btnviewbalance2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.red, java.awt.Color.black));
        btnviewbalance2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnviewbalance2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewbalance2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnviewbalance2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 90, 50));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 650, 10));
        getContentPane().add(bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 40, 20));

        profile_panel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                profile_panelComponentAdded(evt);
            }
        });

        btnprofile.setText("Profile");
        btnprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprofileActionPerformed(evt);
            }
        });

        btnqueries.setText("Queries");
        btnqueries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnqueriesActionPerformed(evt);
            }
        });

        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profile_panelLayout = new javax.swing.GroupLayout(profile_panel);
        profile_panel.setLayout(profile_panelLayout);
        profile_panelLayout.setHorizontalGroup(
            profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_panelLayout.createSequentialGroup()
                .addGroup(profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profile_panelLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(btnqueries))
                    .addComponent(btnprofile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        profile_panelLayout.setVerticalGroup(
            profile_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_panelLayout.createSequentialGroup()
                .addComponent(btnprofile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnqueries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlogout)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(profile_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 80, 100));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 650, -1));

        balancearea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        balancearea.setEnabled(false);
        balancearea.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                balanceareaComponentAdded(evt);
            }
        });
        balancearea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                balanceareaFocusLost(evt);
            }
        });
        balancearea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_balance_heading.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_balance_heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_balance_heading.setText("View Balance");
        balancearea.add(lbl_balance_heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close_1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        balancearea.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 13, -1, -1));
        balancearea.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 46, 396, -1));

        lblsavingacc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblsavingacc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsavingacc.setText("Saving Account");
        balancearea.add(lblsavingacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 59, 123, -1));

        lblbank.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblbank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbank.setText("XYZ Bank 2539");
        balancearea.add(lblbank, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 87, 123, -1));

        lblaccountbalance.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblaccountbalance.setText(" Account Balance");
        balancearea.add(lblaccountbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 115, 113, -1));

        txtbalance.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        txtbalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balancearea.add(txtbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 113, 23));

        getContentPane().add(balancearea, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 400, 190));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton1ActionPerformed

   
    private void btnsendmoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendmoneyActionPerformed
        // TODO add your handling code here:
        if(balancearea.isVisible()){
            JOptionPane.showMessageDialog(null, "Please close \n below window first");
            
        }else{
        Send_Money_Page smp = new Send_Money_Page();
        smp.setVisible(true);
        smp.getData(sendername, amount, pusername, pass);
        this.dispose();
        }
    }//GEN-LAST:event_btnsendmoneyActionPerformed

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton1FocusGained

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        profile_panel.setVisible(true);
       
    }//GEN-LAST:event_jButton1MouseClicked
   
    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
         profile_panel.setVisible(false);
         
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1MouseReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        profile_panel.setVisible(false);
        
    }//GEN-LAST:event_formMouseClicked

    private void profile_panelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_profile_panelComponentAdded
        // TODO add your handling code here:
        profile_panel.setVisible(false);
    }//GEN-LAST:event_profile_panelComponentAdded

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        Login_Page lp = new Login_Page();
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

     
    private void btnprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprofileActionPerformed
        // TODO add your handling code here:
        
        Profile_Page pf = new Profile_Page();
        pf.setVisible(true);
        pf.getUsername(username, password);
        this.dispose();
          
        
    }//GEN-LAST:event_btnprofileActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        balancearea.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void balanceareaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_balanceareaComponentAdded
        // TODO add your handling code here:
        balancearea.setVisible(false);
    }//GEN-LAST:event_balanceareaComponentAdded

    private void btnviewbalance2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewbalance2ActionPerformed
        // TODO add your handling code here:
        balancearea.setVisible(true);
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onbanking_system","root","");
        String sql = "select *from userdetails where username='"+username+"' and password='"+password+"'";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs  = pst.executeQuery();
        while(rs.next()){
           String amount = rs.getString("Amount");
           int bal = Integer.parseInt(amount);
            txtbalance.setText("??? "+amount);
            
        
        }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnviewbalance2ActionPerformed

    private void balanceareaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_balanceareaFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_balanceareaFocusLost

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
         
    }//GEN-LAST:event_formFocusLost

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
         balancearea.setVisible(true);
    }//GEN-LAST:event_formWindowLostFocus

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
         balancearea.setVisible(true);
    }//GEN-LAST:event_formFocusGained
        public void getUsername(String name,String pass){
              username = name;
              password = pass;
          }
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        txtname.setText(username);
        
   
    }//GEN-LAST:event_formWindowGainedFocus
  
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         
    }//GEN-LAST:event_formWindowOpened

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        // TODO add your handling code here:
         
    }//GEN-LAST:event_formWindowIconified

    private void formWindowDeiconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeiconified
        // TODO add your handling code here:
         balancearea.setVisible(true);
    }//GEN-LAST:event_formWindowDeiconified

    private void btnhistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhistoryActionPerformed
        // TODO add your handling code here:
        Transaction_Page tp = new Transaction_Page();
        tp.setVisible(true);
        tp.getData(sendername, amount, username, password);
        tp.getEmail(email);
        this.dispose();
    }//GEN-LAST:event_btnhistoryActionPerformed

    private void btnqueriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnqueriesActionPerformed
        // TODO add your handling code here:
        Queries_Page qp = new Queries_Page();
        qp.setVisible(true);
        qp.getData(pusername,pass, email);
        this.dispose();
    }//GEN-LAST:event_btnqueriesActionPerformed

    private void btnaddbankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddbankActionPerformed
        // TODO add your handling code here:
        Add_BankAcoount_Page ad  =new Add_BankAcoount_Page();
        ad.getMobile(PhoneNumber);
        ad.getCred(pusername,pass);
        ad.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnaddbankActionPerformed

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
            java.util.logging.Logger.getLogger(user_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel balancearea;
    private javax.swing.JLabel bottom;
    private javax.swing.JButton btnaddbank;
    private javax.swing.JButton btnhistory;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnprofile;
    private javax.swing.JButton btnqueries;
    private javax.swing.JButton btnsendmoney;
    private javax.swing.JButton btnviewbalance2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_balance_heading;
    private javax.swing.JLabel lblaccountbalance;
    private javax.swing.JLabel lblbank;
    private javax.swing.JLabel lblsavingacc;
    private javax.swing.JPanel profile_panel;
    private javax.swing.JLabel txtbalance;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
