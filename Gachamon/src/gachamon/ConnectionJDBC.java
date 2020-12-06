package gachamon;

import View.Cadastro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public static ResultSet usuarioLogado(){
    Connection con = ConnectionJDBC.getConnection();
        String update = "select * from cliente where logado = true";
        PreparedStatement prst = null;
        try {
            prst = con.prepareStatement(update);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = null;
        try {
            rs = prst.executeQuery();
            rs.next();
            return rs;
            }catch (SQLException ex) {
            	Logger.getLogger(ConnectionJDBC.class.getName()).log(Level.SEVERE, null, ex);
			}
        return null;
    }
    
}
