package storeTech;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consultas {
    
    private PreparedStatement pst;
    Connection con;
    
    public boolean validaLogin(String usuario, String senha) throws SQLException{
        boolean autentica=false;
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        String SQL = "SELECT usuario, password FROM users WHERE usuario = ? AND password = ?";
        pst = con.prepareStatement(SQL);
        pst.setString(1, usuario);
        pst.setString(2, senha);
        ResultSet rs = pst.executeQuery();
        if(rs.next())
            autentica = true;
        else
            autentica = false;
        rs.close();
        pst.close();
        conexao.fecharConexao();
        return autentica;
    }
    
    public boolean usuarioDisponivel(String usuario) throws SQLException{
        boolean disponivel=false;
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        String SQL = "SELECT usuario from users WHERE usuario=?";
        pst = con.prepareStatement(SQL);
        pst.setString(1, usuario);
        ResultSet rs = pst.executeQuery();
        if(rs.next())
            disponivel = false;
        else
            disponivel = true;
        rs.close();
        pst.close();
        conexao.fecharConexao();
        return disponivel;
    }
    
    public void adicionaUsuario(String nome, String usuario, String email, String senha) throws SQLException{
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        String SQL = "insert into users (nome, usuario, email, password) values(?,?,?,?);";
        pst = con.prepareStatement(SQL);
        pst.setString(1, nome);
        pst.setString(2, usuario);
        pst.setString(3, email);
        pst.setString(4, senha);
        pst.executeUpdate();
        pst.close();
        conexao.fecharConexao();
    }
}
