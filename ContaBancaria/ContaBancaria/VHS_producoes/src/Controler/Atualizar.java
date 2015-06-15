package Controler;


import Controler.Util;
import Util.Util;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Atualizar {
    
            //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
        Util c = new Util();
        Connection conexao = c.conecta();

            //Executa a query de atualização
            Statement statement = conexao.createStatement();
            statement.executeUpdate("UPDATE Agenda SET'local_gravacao'"
                    + this..getText() + "',Endereco='"
                    + this.enderecoDA.getText()+"',CPF='"
                    + this.cpfDA.getText()+"',Nascimento='"
                    + this.nascimentoDA.getText()+"',Telefone='"
                    + this.telefoneDA.getText()+"' WHERE ID='"
                    + this.idDA.getText() + "'");
            JOptionPane.showMessageDialog(rootPane, "Dono atualizado");
        } 

