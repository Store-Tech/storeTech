package prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public static String status="";
            
    public static java.sql.Connection getConexao() {
        Connection connection = null;   
        
        try{
            String serverName = "localhost";
            String database = "store_tech";
            String url = "jdbc:mysql://" + serverName + "/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String passwd = "1234";
            connection = DriverManager.getConnection(url, user, passwd);
            
            if(connection!=null){
                status = ("STATUS--->Conectado com sucesso");
            }else{
                status = ("STATUS--->Não foi possivel se conectar");
            }
            return connection;
        }catch(SQLException e){
            System.out.println("Não foi possivel se conectar no banco " + e);
            return null;
        }
            
    }
    
    public static boolean fecharConexao() {
        try {
            Conexao.getConexao().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static java.sql.Connection ReiniciarConexao() {
        fecharConexao();
        return Conexao.getConexao();
    }
}
