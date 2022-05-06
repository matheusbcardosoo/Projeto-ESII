/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

import br.com.bd.Conexao;
import br.com.bd.UsuarioBD;
import br.com.gui.CadastroUsuarios;
import br.com.source.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus Barbosa
 */
public class FormCadastroController {
    
    private CadastroUsuarios view;

    public FormCadastroController(CadastroUsuarios view) {
        this.view = view;
    }
    
    public void salvarUsuario(){
        
        String nome = view.getJtfNomeCompleto().getText();;
        String email = view.getJtfEmail().getText();
        String senha = view.getJpfSenha().getText();
        Boolean gestorQuadras = view.getJcbGestorQuadras().isSelected();
        Boolean gestorUsuarios = view.getJcbGestorUsuarios().isSelected();
        Boolean analistaRelatorios = view.getJcbAnalistaRelatorios().isSelected(); 
        Boolean zelador = view.getJcbZelador().isSelected();
        
        Usuario usuario = new Usuario(nome, email, senha, gestorQuadras, gestorUsuarios, analistaRelatorios, zelador);
        
        Connection conexao;
        try {
            conexao = new Conexao().getConnection();
            UsuarioBD usuariobd = new UsuarioBD(conexao);
            usuariobd.insert(usuario);
            
            JOptionPane.showMessageDialog(null, "Usuário cadastrado no sistema!");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }  

    public void cancelar() {
        view.dispose();
    }
    }