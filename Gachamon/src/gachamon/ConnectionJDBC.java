package gachamon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static Connection getConnection() {
        String user = "root";
        String password = "gachamon2020";
        String urlconnection = "jdbc:mysql://34.95.173.74:3306/gachamon";
        Connection connection = null;
        try{
           connection = DriverManager.getConnection(urlconnection,user,password);
            System.out.println("Conectado com sucesso");
        } catch (SQLException throwables) {
            System.out.println("Falha na conexao");
            throwables.printStackTrace();
        }
        return connection;
    }
}
