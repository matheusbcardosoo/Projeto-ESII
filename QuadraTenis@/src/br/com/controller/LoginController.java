/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

import br.com.bd.Conexao;
import br.com.bd.UsuarioBD;
import br.com.gui.Login;
import br.com.gui.TelaPrincipal;
import br.com.source.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus Barbosa
 */
public class LoginController {
    private Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    public void autenticarUsuario() throws SQLException{
        
        String email = view.getJtfUsuario().getText();
        String senha = view.getJpfSenha().getText();
        
        Usuario usuarioAutenticar = new Usuario (email, senha);
        
        Connection conexao = new Conexao().getConnection();
        UsuarioBD usuariobd = new UsuarioBD(conexao);
        
        boolean existe = usuariobd.existeUsuario(usuarioAutenticar);
        
        if (existe){            
            view.dispose();
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido(s)!");
        }
        
        
    }
    
}
