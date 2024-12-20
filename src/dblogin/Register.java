/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dblogin;

import java.sql.Statement;
import java.awt.event.ItemEvent;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Register extends javax.swing.JFrame {
    private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3308/loginregister";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
   
    public Register() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameTfield = new javax.swing.JTextField();
        userTfield = new javax.swing.JTextField();
        emailTfield = new javax.swing.JTextField();
        phoneTfield = new javax.swing.JTextField();
        signinButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        cpassLabel = new javax.swing.JLabel();
        passPfield = new javax.swing.JPasswordField();
        cpassPfield = new javax.swing.JPasswordField();
        showpassCheckBox = new javax.swing.JCheckBox();
        showpassCheckBox1 = new javax.swing.JCheckBox();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 3, 52));

        signinButton.setBackground(new java.awt.Color(223, 27, 65));
        signinButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        signinButton.setText("SIGN IN");
        signinButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("NAME");

        userLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("USERNAME");

        phoneLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneLabel.setText("PHONE");

        passLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("PASSWORD");

        emailLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("E-MAIL");

        cpassLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        cpassLabel.setForeground(new java.awt.Color(255, 255, 255));
        cpassLabel.setText("CONFIRM PASWORD");

        showpassCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        showpassCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        showpassCheckBox.setText("SHOW PASSWORD");
        showpassCheckBox.setBorderPaintedFlat(true);
        showpassCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showpassCheckBoxItemStateChanged(evt);
            }
        });

        showpassCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        showpassCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        showpassCheckBox1.setText("SHOW PASSWORD");
        showpassCheckBox1.setBorderPaintedFlat(true);
        showpassCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showpassCheckBox1ItemStateChanged(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(223, 27, 65));
        backButton.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dblogin/_a043e31a-b64e-4647-a296-b04cf1ac6d04 (2).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(phoneTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passPfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpassPfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showpassCheckBox)
                            .addComponent(showpassCheckBox1))
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(signinButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passPfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showpassCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpassPfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showpassCheckBox)
                .addGap(33, 33, 33)
                .addComponent(signinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton)
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     private void saveToDatabase(String name, String username, String email, String phone, String password) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO users (Name, User_Name, Email, Phone, Password) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, username);
                preparedStatement.setString(3, email);
                preparedStatement.setString(4, phone);
                preparedStatement.setString(5, password);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
      private boolean usernameExists(String username) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT * FROM users WHERE User_Name = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, username);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return true;
        }
    }
      
      
    private boolean passwordExists(String password) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT * FROM users WHERE Password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, password);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return true;
        }
    }
        
    
    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed
       String name = nameTfield.getText();
        String username = userTfield.getText();
        String email = emailTfield.getText();
        String phone = phoneTfield.getText();
        char[] passwordChars = passPfield.getPassword();
        String password = new String(passwordChars);
        char[] confirmPasswordChars = cpassPfield.getPassword();
        String confirmPassword = new String(confirmPasswordChars);

        if (password.equals(confirmPassword) && !usernameExists(username) && !passwordExists(password) && !name.isEmpty() && !username.isEmpty()
                && !email.isEmpty() && !phone.isEmpty() && !password.isEmpty()) {
            saveToDatabase(name, username, email, phone, password);
            JOptionPane.showMessageDialog(this, "ACCOUNT CREATED SUCCESSFULLY!");
            
            nameTfield.setText("");
            userTfield.setText("");
            emailTfield.setText("");
            phoneTfield.setText("");
            passPfield.setText("");
            cpassPfield.setText("");
            
            this.setVisible(false);
            new LogIn().setVisible(true);
           
        } else {
            JOptionPane.showMessageDialog(this, "REGISTRATION FAILED: PLEASE CHECK YOUR CREDENTIALS OR CHANGE YOUR USERNAME AND PASSWORD AS IT MAY HAVE ALREADY EXISTS!");
        }
        
                
    }//GEN-LAST:event_signinButtonActionPerformed

    private void showpassCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showpassCheckBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            
            cpassPfield.setEchoChar((char) 0); // Set echo char to 0 to show characters
        } else {
            
            cpassPfield.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassCheckBoxItemStateChanged

    private void showpassCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showpassCheckBox1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            
            passPfield.setEchoChar((char) 0); // Set echo char to 0 to show characters
        } else {
            
            passPfield.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassCheckBox1ItemStateChanged

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
          this.setVisible(false);
       new HomePage().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cpassLabel;
    private javax.swing.JPasswordField cpassPfield;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTfield;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passPfield;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTfield;
    private javax.swing.JCheckBox showpassCheckBox;
    private javax.swing.JCheckBox showpassCheckBox1;
    private javax.swing.JButton signinButton;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTfield;
    // End of variables declaration//GEN-END:variables
}
