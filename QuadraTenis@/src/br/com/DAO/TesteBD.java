/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.DAO;

import br.com.DTO.UsuarioDTO;
import java.sql.*;

/**
 *
 * @author Matheus Barbosa
 */
public class TesteBD {
    public static void main(String[] args) throws SQLException {
        ConexaoDAO con = new ConexaoDAO();
        
        /*String sql = "insert into usuario (nome, email, senha) values ('matheus', 'matheus@123.com', '123456')";
        int res = con.ExecutaSQL(sql);*/
        
        UsuarioDTO usuario = new UsuarioDTO(13,"Matheus","matheus@123.com");
                
        con.AlteraUsuario(usuario);
        
        /*try {
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                System.out.println(id+" - "+nome+" - "+email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        
        
    }
}
