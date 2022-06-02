/**
 * 
 * @author Matheus Barbosa, Vinicius Sugawara.
 */
package br.com.DAO;

import br.com.DTO.UsuarioDTO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoDAO {
    private String url;
    private String usuario;
    private String senha;
    private Connection conn = null;

    public Connection Conexao() {
        this.url = "jdbc:postgresql://localhost:5432/quadratenis";
        this.usuario = "postgres";
        this.senha = "71759939";
        
        try {
            //Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url,usuario,senha);
        } catch (SQLException e) {
            System.out.println("Ta dando caquinha aqui na classe ConexaoDAO!" + e.getMessage());
        }
        return conn;
    }
    
    public int ExecutaSQL(String sql){
        try {
            Statement stm = conn.createStatement();
            int rs = stm.executeUpdate(sql);
            conn.close();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }        
    }
    
    public ResultSet ExecutaBusca(String sql){
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            conn.close();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void RemoveUsuario (UsuarioDTO usuario) throws SQLException{
        try {
            PreparedStatement stm = conn.prepareStatement("delete from usuario where id=?");
            stm.setInt(1, usuario.getId());
            stm.setString(2, usuario.getEmail());
            
            stm.executeUpdate();
            System.out.println("Deu tudo certo");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Deu tudo errado");
        } finally {
            conn.close();
        }
    }
    
    public void AlteraUsuario(UsuarioDTO usuario) throws SQLException{
        try {
            PreparedStatement stm = conn.prepareStatement("update usuario set nome=? where id =? and email=?;");
            stm.setString(1, usuario.getNome());
            stm.setInt(2, usuario.getId());
            stm.setString(3, usuario.getEmail());
            
            stm.executeUpdate();
            System.out.println("Deu tudo certo");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Deu tudo errado");
        } finally {
            conn.close();
        }
    }
    
    
    public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/quadratenis","postgres","71759939");
        return conexao;
    }
}
