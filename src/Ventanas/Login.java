/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Connection;
import java.sql.Statement;
import conexion.conexionMysql;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Login extends javax.swing.JFrame {
     conexionMysql con = new conexionMysql();
     Connection cn = con.conectar();
    
    public Sistema st; 
    public Registro rg;
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../Img/apple-logo-png-black.png")).getImage());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGreyPanel = new javax.swing.JPanel();
        applelgo = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnGoToRegister = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backGreyPanel.setBackground(new java.awt.Color(51, 51, 51));

        applelgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/apple-logo-png-black.png"))); // NOI18N

        lblUser.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Username");

        txtUsername.setBackground(new java.awt.Color(35, 35, 35));
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setText(" ");
        txtUsername.setCaretColor(new java.awt.Color(51, 51, 51));

        lblPassword.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");

        txtPassword.setBackground(new java.awt.Color(38, 36, 36));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setCaretColor(new java.awt.Color(51, 51, 51));

        btnLogin.setBackground(new java.awt.Color(51, 0, 51));
        btnLogin.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No tienes un usuario?");

        btnGoToRegister.setBackground(new java.awt.Color(51, 51, 51));
        btnGoToRegister.setForeground(new java.awt.Color(0, 102, 204));
        btnGoToRegister.setText("Registrarse");
        btnGoToRegister.setBorder(null);
        btnGoToRegister.setBorderPainted(false);
        btnGoToRegister.setContentAreaFilled(false);
        btnGoToRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoToRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToRegisterActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(51, 0, 51));
        btnExit.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backGreyPanelLayout = new javax.swing.GroupLayout(backGreyPanel);
        backGreyPanel.setLayout(backGreyPanelLayout);
        backGreyPanelLayout.setHorizontalGroup(
            backGreyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGreyPanelLayout.createSequentialGroup()
                .addGroup(backGreyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGreyPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(backGreyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser)
                            .addGroup(backGreyPanelLayout.createSequentialGroup()
                                .addComponent(applelgo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(btnExit))))
                    .addGroup(backGreyPanelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblPassword)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGreyPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(backGreyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGreyPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGoToRegister)
                        .addContainerGap())
                    .addGroup(backGreyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backGreyPanelLayout.createSequentialGroup()
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGreyPanelLayout.createSequentialGroup()
                            .addGroup(backGreyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addComponent(txtUsername))
                            .addGap(17, 17, 17)))))
        );
        backGreyPanelLayout.setVerticalGroup(
            backGreyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGreyPanelLayout.createSequentialGroup()
                .addGroup(backGreyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGreyPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(applelgo))
                    .addGroup(backGreyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit)))
                .addGap(34, 34, 34)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backGreyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnGoToRegister))
                .addGap(12, 12, 12))
        );

        getContentPane().add(backGreyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, 470));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back.jpg"))); // NOI18N
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 633, 516));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoToRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToRegisterActionPerformed
        rg = new Registro();
        rg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoToRegisterActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
         try {
             String usuario = txtUsername.getText().trim();
             String pass = String.valueOf(txtPassword.getPassword());
             String query = "SELECT * FROM usuarios WHERE nombre = '"+usuario+"' AND contraseña = '"+pass+"'";
             System.out.println(query);
             PreparedStatement ps = cn.prepareStatement("SELECT * FROM usuarios WHERE nombre = '"+usuario+"' AND contraseña = '"+pass+"'");
             ResultSet rs=ps.executeQuery();
             
             if(rs.next()){
                 dispose();  
                 st = new Sistema();
                 st.setVisible(true);
                      
             }else{
                 JOptionPane.showMessageDialog(this, "EL USUARIO NO EXISTE ");
             }
         } catch (SQLException ex) {
             System.out.println(""+ex);
         }
               
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel applelgo;
    private javax.swing.JLabel back;
    private javax.swing.JPanel backGreyPanel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGoToRegister;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
