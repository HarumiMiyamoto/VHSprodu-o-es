package Controller;


import Util.Util;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import vhs_producoes.Funcionario;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author info206
 */
public class LoginContoler {
    public Funcionario autentica(String login , String senha) throws SQLException {
        String sql = "SELECT * FROM Funcionario WHERE login like '%" + login + "%' AND '%"+senha+"%'"; //Consulta SQL 
        Util util = new Util(); //inicializando minha classe q faz conexão com banco de dados
        Connection conexao = util.conecta(); //faz a conexão com banco
        Statement statement = conexao.createStatement();//usa da conqxão para pegar a credencial para acesso ao banco
        ResultSet result = statement.executeQuery(sql);//executa a consulta SQL e agora retoena valores, por isso ResultSet
        Funcionario l = null;  //declaração de variavel  pessoa 
        while (result.next()) {
            l = new Funcionario(result.getString("cargo"), result.getString("login"),result.getString("senha"));// inicializa pessoa
        }
        return l;
        

    }

}
