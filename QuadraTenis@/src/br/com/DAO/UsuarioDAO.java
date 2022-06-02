/**
 * 
 * @author Matheus Barbosa, Vinicius Sugawara.
 */
package br.com.DAO;

import br.com.DTO.UsuarioDTO;
import java.sql.*;
import java.util.ArrayList;

public class UsuarioDAO {    
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;
    ArrayList<UsuarioDTO> lista = new ArrayList<>();
    
    
    public void cadastrarUsuario (UsuarioDTO novoUsuario){
        String sql = "insert into usuario (nome, email, senha, gestorquadras, gestorusuarios, analistarelatorios, zelador) values (?,?,?,?,?,?,?);";
        conn = new ConexaoDAO().Conexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, novoUsuario.getNome());
            pstm.setString(2, novoUsuario.getEmail());
            pstm.setString(3, novoUsuario.getSenha());
            pstm.setBoolean(4, novoUsuario.isGestorquadras());
            pstm.setBoolean(5, novoUsuario.isGestorusuarios());
            pstm.setBoolean(6, novoUsuario.isAnalistarelatorios());
            pstm.setBoolean(7, novoUsuario.isZelador());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            System.out.println("Ta dando caquinha aqui na classe UsuarioDAO > cadastrarUsuario!" + erro.getMessage());
        }        
    }
    
    public ResultSet autenticarUsuario(UsuarioDTO usuarioAutenticar){
        String sql = "select * from usuario where email = ? and senha = ?";
        conn = new ConexaoDAO().Conexao();
        
        try {            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuarioAutenticar.getEmail());
            pstm.setString(2, usuarioAutenticar.getSenha());
            
            rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            System.out.println("Ta dando caquinha aqui na classe UsuarioDAO > autenticarUsuario!" + erro.getMessage());
            return null;
        }
    }
    
    public ArrayList<UsuarioDTO> pesquisarUsuario(){
        String sql = "select * from usuario";
        conn = new ConexaoDAO().Conexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()){
                UsuarioDTO usuarioPesquisa = new UsuarioDTO();
                usuarioPesquisa.setId(rs.getInt("id"));
                usuarioPesquisa.setNome(rs.getString("nome"));
                usuarioPesquisa.setEmail(rs.getString("email"));
                usuarioPesquisa.setSenha(rs.getString("senha"));
                usuarioPesquisa.setGestorquadras(rs.getBoolean("gestorquadras"));
                usuarioPesquisa.setGestorusuarios(rs.getBoolean("gestorusuarios"));
                usuarioPesquisa.setAnalistarelatorios(rs.getBoolean("analistarelatorios"));
                usuarioPesquisa.setZelador(rs.getBoolean("zelador")); 
                
                //Adiciona as informações na lista para exibição
                lista.add(usuarioPesquisa);
            }
        } catch (SQLException erro) {
            System.out.println("Ta dando caquinha aqui na classe UsuarioDAO > pesquisarUsuario!" + erro.getMessage());
        }
        return lista;
    }
}