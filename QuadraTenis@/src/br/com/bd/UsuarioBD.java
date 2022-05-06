/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bd;

import br.com.gui.CadastroUsuarios;
import br.com.source.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Matheus Barbosa
 */
public class UsuarioBD {
    
    private final Connection connection;
    
    public UsuarioBD (Connection connection){
        this.connection = connection;
    }
    
    public void insert (Usuario usuario) throws SQLException{
        String sql = "insert into usuario (nome, email, senha, gestorquadras, gestorusuarios, analistarelatorios, zelador) values ('"+ usuario.getNome() +"','"+ usuario.getEmail() +"','"+ usuario.getSenha() +"','"+ usuario.isGestorquadras() +"','"+ usuario.isGestorusuarios()+"','"+usuario.isAnalistarelatorios()+"','"+usuario.isZelador()+"');";
        PreparedStatement statement = connection.prepareStatement(sql); 
        statement.execute();
    }

    public boolean existeUsuario(Usuario usuario) throws SQLException {
        String sql = "select * from usuario where email = '"+usuario.getEmail()+"' and senha = '"+usuario.getSenha()+"'";
        PreparedStatement statement = connection.prepareStatement(sql); 
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();        
        return resultSet.next();
    }
    
}
