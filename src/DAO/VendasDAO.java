package DAO;

import Model.Cliente;
import Model.Produto;
import Model.TipoProduto;
import Model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import storeTech.Conexao;

public class VendasDAO {

    private PreparedStatement pst;
    Connection con;

    public int adicionaVenda(Venda v, int ClienteId){
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        int codVenda=0;
        String SQL = "insert into tb_venda (SITUACAO, FORMAPAGAMENTO, VALOR, ClienteId) values(?,?,?,?)";
        try {
            pst = con.prepareStatement(SQL);
            pst.setString(1, v.getSituacao());
            pst.setString(2, v.getFormaPagamento().toString());
            pst.setDouble(3, v.getValor());
            pst.setInt(4, ClienteId);
            pst.executeUpdate();
            codVenda = retornaCodVenda();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar venda. Erro: " + e);
        }
        conexao.fecharConexao();
        return codVenda;
    }

    public int retornaCodVenda(){
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        String SQL = "SELECT MAX(VENDAID) FROM tb_venda";
        int codigo = 0;
        ResultSet rs = null;
        try {
            pst = con.prepareStatement(SQL);
            rs = pst.executeQuery();
            //Object result = rs.getObject(1);
            if (rs != null && rs.next()) {
                codigo = rs.getInt("MAX(VENDAID)");
                System.out.println(codigo);
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao resgatar código da Venda. Erro: " + e);
        }
        conexao.fecharConexao();
        return codigo;
    }

    public void adicionaItemVenda(ArrayList<Produto> listaCarrinho, int codVenda){
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        String SQL = "insert into tb_item_venda (VENDAID, PRODUTOID, QTD) values(?,?,?)";
        try {
            for (Produto p : listaCarrinho) {
                pst = con.prepareStatement(SQL);
                pst.setInt(1, codVenda);
                pst.setInt(2, p.getCodProd());
                pst.setDouble(3, p.getQuantidade());
                pst.executeUpdate();
            }
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar item de venda. Erro: " + e);
        }
        conexao.fecharConexao();
    }

}
