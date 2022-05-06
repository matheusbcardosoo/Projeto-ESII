/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

import br.com.gui.CadastroUsuarios;
import br.com.gui.ConsultaUsuarios;
import br.com.gui.TelaPrincipal;

/**
 *
 * @author Matheus Barbosa
 */
public class TelaPrincipalController {
    private TelaPrincipal view;

    public TelaPrincipalController(TelaPrincipal view) {
        this.view = view;
    }
    
    public void cadastrarUsuario(){
        CadastroUsuarios telaCadastroUsuarios = new CadastroUsuarios();
        telaCadastroUsuarios.setVisible(true);
    }

    public void consultaUsuarios() {
        ConsultaUsuarios telaConsultaUsuarios = new ConsultaUsuarios();
        telaConsultaUsuarios.setVisible(true);
    }
}
