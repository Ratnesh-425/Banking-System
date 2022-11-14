/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Online_Banking_System;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author subodh
 */
public class Queries_Page extends javax.swing.JFrame {

    /**
     * Creates new form Queries_Page
     */
    String username,password,email,acc,accno,mobno;
    public Queries_Page() {
        initComponents();
    }
    
    public void getData(String username, String password,String email){
        this.username = username;
        this.password = password;
        this.email = email;
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
        jLabel2 = new javax.swing.JLabel();
        btnchangemobile = new javax.swing.JButton();
        btnsendfeedback = new javax.swing.JButton();
        changemobilepanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtaccno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmobilenumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        sendfeedbackpanel = new javax.swing.JPanel();
        lblfromemail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtfeedbacktext = new javax.swing.JTextArea();
        btnsend = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quesries");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-macos-close-30.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/queries.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnchangemobile.setText("Change Mobile Number");
        btnchangemobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchangemobileActionPerformed(evt);
            }
        });
        getContentPane().add(btnchangemobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        btnsendfeedback.setText("Send Feedback");
        btnsendfeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendfeedbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnsendfeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, -1));

        changemobilepanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        changemobilepanel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                changemobilepanelComponentAdded(evt);
            }
        });
        changemobilepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Enter Account number");
        changemobilepanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 10));

        txtaccno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaccnoActionPerformed(evt);
            }
        });
        changemobilepanel.add(txtaccno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, -1));

        jLabel4.setText("New Mobile Number");
        changemobilepanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        changemobilepanel.add(txtmobilenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, -1));

        jLabel5.setText("Enter Password");
        changemobilepanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        changemobilepanel.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        changemobilepanel.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        getContentPane().add(changemobilepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 160, 240));

        sendfeedbackpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sendfeedbackpanel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                sendfeedbackpanelComponentAdded(evt);
            }
        });
        sendfeedbackpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfromemail.setText("txtfromemail");
        sendfeedbackpanel.add(lblfromemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 190, 22));

        txtfeedbacktext.setColumns(20);
        txtfeedbacktext.setRows(5);
        jScrollPane1.setViewportView(txtfeedbacktext);

        sendfeedbackpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 190, 88));

        btnsend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/send.png"))); // NOI18N
        btnsend.setText("Send");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });
        sendfeedbackpanel.add(btnsend, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 30));

        getContentPane().add(sendfeedbackpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 210, 180));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 50, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login_Page lp = new Login_Page();
        lp.getCredential(username, password);
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtaccnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaccnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaccnoActionPerformed

    private void changemobilepanelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_changemobilepanelComponentAdded
        // TODO add your handling code here:
       changemobilepanel.setVisible(false);
    }//GEN-LAST:event_changemobilepanelComponentAdded

    private void sendfeedbackpanelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_sendfeedbackpanelComponentAdded
        // TODO add your handling code here:
        sendfeedbackpanel.setVisible(false);
    }//GEN-LAST:event_sendfeedbackpanelComponentAdded

    private void btnchangemobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchangemobileActionPerformed
        // TODO add your handling code here:
        changemobilepanel.setVisible(true);
        sendfeedbackpanel.setVisible(false);
    }//GEN-LAST:event_btnchangemobileActionPerformed

    private void btnsendfeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendfeedbackActionPerformed
        // TODO add your handling code here:
        sendfeedbackpanel.setVisible(true);
        changemobilepanel.setVisible(false);
        lblfromemail.setText("From: "+email);
        String text = txtfeedbacktext.getText();
        
        
   
    }//GEN-LAST:event_btnsendfeedbackActionPerformed

    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        // TODO add your handling code here:
        //Get properties object    
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(email,"jaqgvzciafqntytd");  
           }    
          });    
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress("ratneshsingh425@gmail.com"));    
           message.setSubject("Bank");    
           message.setText(txtfeedbacktext.getText());    
           //send message  
           Transport.send(message);    
             JOptionPane.showMessageDialog(null, "Thank You ..!");
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);}   
    }//GEN-LAST:event_btnsendActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
       try{
           String pass = new String(txtpassword.getPassword());
            accno = txtaccno.getText();
            mobno  =txtmobilenumber.getText();
           
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onbanking_system","root","");
           
           String sql="select *from userdetails where uemail='"+email+"'and password='"+pass+"'";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
                acc = rs.getString("AccountNumber");    
           }
           
           if(accno.equals(acc)){
           String sql2  = "insert into update_mobilenumber(Account_Number,Mobile_Number,Password) values('"+accno+"','"+mobno+"','"+pass+"')";
           PreparedStatement pst2 = con.prepareStatement(sql2);
           int i=pst2.executeUpdate();
           if(i>0){
               JOptionPane.showMessageDialog(null, "Submit Succesfully");
           }
           }else{
               JOptionPane.showMessageDialog(null, "Enter valid Account Number");
           }
           
       }catch(Exception ex){
           System.out.println(ex.getMessage());
       }
    }//GEN-LAST:event_btnsubmitActionPerformed

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
            java.util.logging.Logger.getLogger(Queries_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Queries_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Queries_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Queries_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Queries_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchangemobile;
    private javax.swing.JButton btnsend;
    private javax.swing.JButton btnsendfeedback;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JPanel changemobilepanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblfromemail;
    private javax.swing.JPanel sendfeedbackpanel;
    private javax.swing.JTextField txtaccno;
    private javax.swing.JTextArea txtfeedbacktext;
    private javax.swing.JTextField txtmobilenumber;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
