package DAO;

import Model.Cliente;
import Model.Produto;
import Model.TipoProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import storeTech.Conexao;

public class ProdutoDAO {

    private PreparedStatement pst;
    Connection con;

    public int retornaCodProd(){
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
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao resgatar código do Produto. Erro: " + e);
        }      
        conexao.fecharConexao();
        return codigo;
    }

    public void adicionaProduto(Produto p){
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        String SQL = "insert into tb_produto (NOME, PRECO, QTD, TIPOPROD) values(?,?,?,?)";
        try {
            pst = con.prepareStatement(SQL);
            pst.setString(1, p.getNome());
            pst.setDouble(2, p.getPreco());
            pst.setInt(3, p.getQuantidade());
            pst.setString(4, p.getTipoProd().toString());
            pst.executeUpdate();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto. Erro: " + e);
        }
        conexao.fecharConexao();
    }

    public String[] retornaTiposProduto(){
        String[] tiposProd = null;
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        ResultSet rs = null;
        String SQL = "SELECT COLUMN_TYPE FROM INFORMATION_SCHEMA.COLUMNS\n"
                + " WHERE TABLE_NAME = 'tb_produto' AND COLUMN_NAME = 'tipoProd'";
        try {
            pst = con.prepareStatement(SQL);
            rs = pst.executeQuery();
            while (rs.next()) {
                String tipos = rs.getString("COLUMN_TYPE");
                tipos = tipos.substring(5, tipos.length() - 1).replaceAll("'", "");
                tiposProd = tipos.split(",");
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao resgatar a lista de clientes. Erro: " + e);
        } 
        conexao.fecharConexao();
        return tiposProd;
    }

    public ArrayList todosProdutos(){
        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        ResultSet rs = null;
        String SQL = "SELECT PRODUTOID, NOME, PRECO, QTD, TIPOPROD FROM TB_PRODUTO";
        try {
            pst = con.prepareStatement(SQL);
            rs = pst.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodProd(rs.getInt("PRODUTOID"));
                produto.setNome(rs.getString("NOME"));
                produto.setPreco(rs.getDouble("PRECO"));
                produto.setQuantidade(rs.getInt("QTD"));
                produto.setTipoProd(TipoProduto.getTipoProd(rs.getString("TIPOPROD")));
                listaProdutos.add(produto);
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao resgatar a lista de clientes. Erro: " + e);
        }

        conexao.fecharConexao();
        return listaProdutos;
    }

    public ArrayList pesquisaProduto(Produto p){
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        ResultSet rs = null;
        String SQL = "SELECT PRODUTOID, NOME, PRECO, QTD, TIPOPROD FROM TB_PRODUTO WHERE NOME LIKE ? AND TIPOPROD like ?";
        try {
            pst = con.prepareStatement(SQL);
            pst.setString(1, "%" + p.getNome() + "%");
            if (p.getTipoProd() != null) {
                pst.setString(2, "%" + p.getTipoProd().toString() + "%");
            } else {
                pst.setString(2, "%%");
            }
            rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Produto produto = new Produto();
                    produto.setCodProd(rs.getInt("PRODUTOID"));
                    produto.setNome(rs.getString("NOME"));
                    produto.setPreco(rs.getDouble("PRECO"));
                    produto.setQuantidade(rs.getInt("QTD"));
                    produto.setTipoProd(TipoProduto.getTipoProd(rs.getString("TIPOPROD")));
                    listaProduto.add(produto);
                }
            } else {
                rs.close();
                conexao.fecharConexao();
                listaProduto.add(p);
                return listaProduto;
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao resgatar a lista de clientes. Erro: " + e);
        }
        conexao.fecharConexao();
        return listaProduto;
    }

    public Produto retornaProduto(int codProd) {
        Produto p = new Produto();
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        ResultSet rs = null;
        String SQL = "SELECT PRODUTOID, NOME, PRECO, QTD, TIPOPROD FROM TB_PRODUTO WHERE PRODUTOID = ?";
        try {
            pst = con.prepareStatement(SQL);
            rs = pst.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodProd(rs.getInt("PRODUTOID"));
                produto.setNome(rs.getString("NOME"));
                produto.setPreco(rs.getDouble("PRECO"));
                produto.setQuantidade(rs.getInt("QTD"));
                produto.setTipoProd(TipoProduto.getTipoProd(rs.getString("TIPOPROD")));
                rs.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao resgatar a lista de clientes. Erro: " + e);
        }
        conexao.fecharConexao();
        return p;
    }

    public void deleteProduto(Produto p) {
        Conexao conexao = new Conexao();
        Connection con = conexao.getConexao();
        String delete = "DELETE FROM storetech.TB_PRODUTO WHERE PRODUTOID= ?";
        try {
            pst = con.prepareStatement(delete);
            pst.setInt(1, p.getCodProd());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar produto" + e);
        }
        conexao.fecharConexao();
    }
}
