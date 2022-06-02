/**
 * 
 * @author Matheus Barbosa, Vinicius Sugawara.
 */
package br.com.Controller;

import br.com.DAO.UsuarioDAO;
import br.com.VIEW.CadastroUsuariosVIEW;
import br.com.DTO.UsuarioDTO;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CadastroUsuarioController {
    
    private final CadastroUsuariosVIEW view;

    public CadastroUsuarioController(CadastroUsuariosVIEW view) {
        this.view = view;
    }
    
    public void salvarUsuario(){        
        String nome = view.getJtfNomeCompleto().getText();
        String email = view.getJtfEmail().getText();
        String senha = view.getJpfSenha().getText();
        Boolean gestorQuadras = view.getJcbGestorQuadras().isSelected();
        Boolean gestorUsuarios = view.getJcbGestorUsuarios().isSelected();
        Boolean analistaRelatorios = view.getJcbAnalistaRelatorios().isSelected(); 
        Boolean zelador = view.getJcbZelador().isSelected();
        
        UsuarioDTO novoUsuario = new UsuarioDTO(nome, email, senha, gestorQuadras, gestorUsuarios, analistaRelatorios, zelador);
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.cadastrarUsuario(novoUsuario);       
    }  
    
    
    public void cancelar() {
        view.dispose();
    }
    
    public String dataAtual(){
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return (formato.format(dataSistema));
    }
    }