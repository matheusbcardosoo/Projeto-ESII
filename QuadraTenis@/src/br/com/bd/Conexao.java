/**
 * Código responsável por realizar conexão entre a aplicação e o banco de dados.
 * @author Matheus Barbosa, Vinicius Sugawara
 */
package br.com.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/quadratenis","postgres","71759939");
        return conexao;
    }
}
