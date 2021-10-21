package storeTech;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas {
    
    public boolean validaLogin(String usuario, String senha) throws SQLException{
        boolean retorno=false;
        Conexao conexao = new Conexao();
        PreparedStatement pst;
        Connection con = conexao.getConexao();
        String SQL = "SELECT usuario, password FROM users WHERE usuario = ? AND password = ?";
        pst = con.prepareStatement(SQL);
        pst.setString(1, usuario);
        pst.setString(2, senha);
        ResultSet rs = pst.executeQuery();
        if(rs.next())
            retorno = true;
        else
            retorno = false;
        rs.close();
        pst.close();
        conexao.fecharConexao();
        return retorno;
    }
    
}
