/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;


import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author User
 */
public class Registro extends javax.swing.JFrame {
    conexion.conexionMysql con = new conexion.conexionMysql();
    Connection cn = con.conectar();
    
   
    public Login lg;
    public Registro() {
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

        jPanel1 = new javax.swing.JPanel();
        lblUserRegister = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPasswordRegister = new javax.swing.JLabel();
        txtUserRegister = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPasswordRegister = new javax.swing.JPasswordField();
        btnBackToLogin = new javax.swing.JButton();
        btnRegister1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblUserRegister.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        lblUserRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblUserRegister.setText("Username");

        lblEmail.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");

        lblPasswordRegister.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        lblPasswordRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblPasswordRegister.setText("Password");

        txtUserRegister.setBackground(new java.awt.Color(30, 29, 29));
        txtUserRegister.setForeground(new java.awt.Color(255, 255, 255));

        txtEmail.setBackground(new java.awt.Color(30, 29, 29));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));

        txtPasswordRegister.setBackground(new java.awt.Color(30, 29, 29));
        txtPasswordRegister.setForeground(new java.awt.Color(255, 255, 255));

        btnBackToLogin.setBackground(new java.awt.Color(51, 0, 51));
        btnBackToLogin.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnBackToLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnBackToLogin.setText("Back");
        btnBackToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToLoginActionPerformed(evt);
            }
        });

        btnRegister1.setBackground(new java.awt.Color(51, 0, 51));
        btnRegister1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btnRegister1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister1.setText("Register");
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblPasswordRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPasswordRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail)
                            .addComponent(lblUserRegister))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserRegister)
                            .addComponent(txtEmail)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBackToLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegister1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserRegister))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPasswordRegister)
                    .addComponent(txtPasswordRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegister1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(btnBackToLogin)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 270, 450));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/71f86733f9008faad108cc2ae99290f5.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 476));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToLoginActionPerformed
        lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackToLoginActionPerformed

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
       String nombre = txtUserRegister.getText();
       String email = txtEmail.getText();
       String password = String.valueOf(txtPasswordRegister.getPassword());
        
        if(nombre.isEmpty() || email.isEmpty()|| password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }else{
            try {
                String consulta="INSERT INTO usuarios(nombre,email,contraseña) VALUES ('"+nombre+"','"+email+"','"+password+"')";
                PreparedStatement ps = cn.prepareStatement(consulta);
                ps.executeUpdate();
                limpiar();
                JOptionPane.showMessageDialog(null, "Usuario registrado");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hubo un error "+e);
            }
        }
        
    }//GEN-LAST:event_btnRegister1ActionPerformed

    void limpiar(){
        txtUserRegister.setText("");
        txtPasswordRegister.setText("");
        txtEmail.setText("");
    }
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnBackToLogin;
    private javax.swing.JButton btnRegister1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPasswordRegister;
    private javax.swing.JLabel lblUserRegister;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPasswordRegister;
    private javax.swing.JTextField txtUserRegister;
    // End of variables declaration//GEN-END:variables
}
