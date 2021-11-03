package DAO;

import Model.Cliente;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import storeTech.Conexao;

public class ProdutoDAO {
    
    private PreparedStatement pst;
    Connection con; 
    
    public int retornaCodProd() throws SQLException {
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        String SQL = "SELECT MAX(CLIENTEID) FROM tb_cliente";
        int codigo = 0;
        ResultSet rs = null;
        try {
            pst = con.prepareStatement(SQL);
            rs = pst.executeQuery();
            Object result = rs.getObject(1);
            if (result != null) {
                codigo = ((Integer) result) + 1;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao resgatar código do Produto. Erro: " + e);
        }
        rs.close();
        conexao.fecharConexao();
        return codigo;
    }
    
    public void adicionaProduto(Produto p) throws SQLException {
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        String SQL = "insert into tb_produto (NOME, PRECO, QTD) values(?,?,?);";
        try {
            pst = con.prepareStatement(SQL);
            pst.setString(1, p.getNome());
            pst.setDouble(2, p.getPreco());
            pst.setInt(3, p.getQuantidade());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto. Erro: " + e);
        }
        pst.close();
        conexao.fecharConexao();
    }
}
