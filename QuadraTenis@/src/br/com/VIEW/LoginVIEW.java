/**
 * Interface da tela de login.
 * Permite ao usuário acessar o sistema principal.
 * @author Matheus Barbosa, Vinicius Sugawara.
 */
package br.com.VIEW;

import br.com.Controller.LoginController;
import java.awt.Event;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginVIEW extends javax.swing.JFrame {

    private final LoginController controller;

    public LoginVIEW() {
        initComponents();
        controller = new LoginController(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlMensagem3 = new javax.swing.JLabel();
        jlMensagem2 = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jpfSenha = new javax.swing.JPasswordField();
        jbAcessar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jlFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login de usuário");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlMensagem3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jlMensagem3.setText("Bem vindo!");
        getContentPane().add(jlMensagem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jlMensagem2.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jlMensagem2.setText("Realize o login para acessar o sistema.");
        getContentPane().add(jlMensagem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jlSenha.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jlSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/VIEW/icones/Senha.png"))); // NOI18N
        jlSenha.setText("Senha: ");
        getContentPane().add(jlSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        jlUsuario.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jlUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/VIEW/icones/Usuário.png"))); // NOI18N
        jlUsuario.setText("Usuário: ");
        getContentPane().add(jlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jtfUsuario.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        getContentPane().add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 210, -1));

        jpfSenha.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jpfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jpfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 210, -1));

        jbAcessar.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        jbAcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/VIEW/icones/login-24p.png"))); // NOI18N
        jbAcessar.setText("Acessar");
        jbAcessar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAcessarActionPerformed(evt);
            }
        });
        jbAcessar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });
        getContentPane().add(jbAcessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 210, -1));
        jbAcessar.getAccessibleContext().setAccessibleDescription("Entrar no Sistema");

        jbSair.setBackground(new java.awt.Color(255, 0, 0));
        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/VIEW/icones/Sair.png"))); // NOI18N
        jbSair.setBorder(null);
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        getContentPane().add(jbSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 30, 30));

        jlFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/VIEW/imagens/fundo3.png"))); // NOI18N
        getContentPane().add(jlFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfSenhaActionPerformed
    
    }//GEN-LAST:event_jpfSenhaActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        controller.fechar();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAcessarActionPerformed
        controller.autenticarUsuario();
    }//GEN-LAST:event_jbAcessarActionPerformed

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
       if(evt.getKeyCode() == Event.ENTER){
            jbAcessar.doClick();
        }
    }//GEN-LAST:event_Enter

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
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginVIEW().setVisible(true);
            }
        });
    }

    public JPasswordField getJpfSenha() {
        return jpfSenha;
    }

    public void setJpfSenha(JPasswordField jpfSenha) {
        this.jpfSenha = jpfSenha;
    }

    public JTextField getJtfUsuario() {
        return jtfUsuario;
    }

    public void setJtfUsuario(JTextField jtfUsuario) {
        this.jtfUsuario = jtfUsuario;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAcessar;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlFundo;
    private javax.swing.JLabel jlMensagem2;
    private javax.swing.JLabel jlMensagem3;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
