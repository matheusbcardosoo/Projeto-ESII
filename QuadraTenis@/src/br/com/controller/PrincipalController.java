/**
 * 
 * @author Matheus Barbosa, Vinicius Sugawara.
 */
package br.com.Controller;

import br.com.DAO.ConexaoDAO;
import br.com.DAO.UsuarioDAO;
import br.com.VIEW.CadastroUsuariosVIEW;
import br.com.VIEW.ConsultaUsuariosVIEW;
import br.com.VIEW.LoginVIEW;
import br.com.VIEW.PrincipalVIEW;
import br.com.DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PrincipalController {
    private final PrincipalVIEW view;

    public PrincipalController(PrincipalVIEW view) {
        this.view = view;
    }
    
    public void cadastrarUsuario(){
        CadastroUsuariosVIEW telaCadastroUsuarios = new CadastroUsuariosVIEW();
        telaCadastroUsuarios.setVisible(true);
    }

    public void consultaUsuarios() {
        ConsultaUsuariosVIEW telaConsultaUsuarios = new ConsultaUsuariosVIEW();
        telaConsultaUsuarios.setVisible(true);
    }
    
    public void encerrarSessao(){
        LoginVIEW telaLogin = new LoginVIEW();
        view.dispose();
        telaLogin.setVisible(true);
    }
    
    public String dataAtual(){
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return (formato.format(dataSistema));
    }
}