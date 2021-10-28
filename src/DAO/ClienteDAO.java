/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import storeTech.Conexao;

/**
 *
 * @author Matheus
 */
public class ClienteDAO {

    private PreparedStatement pst;
    Connection con;

    public void adicionaUsuario(Cliente c) throws SQLException {
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        String SQL = "insert into users (NOME, USUARIO, EMAIL, CPF, PASSWORD) values(?,?,?,?,?);";
        try {
            pst = con.prepareStatement(SQL);
            pst.setString(1, c.getNome());
            pst.setString(2, c.getUsuario());
            pst.setString(3, c.getEmail());
            pst.setString(4, c.getCpf());
            pst.setString(5, c.getSenha());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário. Erro: " + e);
        }
        pst.close();
        conexao.fecharConexao();
    }

    public boolean validaLogin(String usuario, String senha) throws SQLException {
        boolean autentica = false;
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        ResultSet rs = null;
        String SQL = "SELECT usuario, password FROM users WHERE USUARIO = ? AND PASSWORD = ?";
        try {
            pst = con.prepareStatement(SQL);
            pst.setString(1, usuario);
            pst.setString(2, senha);
            rs = pst.executeQuery();
            if (rs.next()) {
                autentica = true;
            } else {
                autentica = false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao autenticar. Erro: " + e);
        }
        rs.close();
        pst.close();
        conexao.fecharConexao();
        return autentica;
    }

    public boolean usuarioDisponivel(String usuario) throws SQLException {
        boolean disponivel = false;
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        ResultSet rs = null;
        String SQL = "SELECT USUARIO from users WHERE USUARIO=?";
        try {
            pst = con.prepareStatement(SQL);
            pst.setString(1, usuario);
            rs = pst.executeQuery();
            if (rs.next()) {
                disponivel = false;
            } else {
                disponivel = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar usuário no banco. Erro: " + e);
        }
        rs.close();
        pst.close();
        conexao.fecharConexao();
        return disponivel;
    }

    public int retornaCodProd() throws SQLException {
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        String SQL = "SELECT MAX(idC) FROM cliente";
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
            JOptionPane.showMessageDialog(null, "Erro ao resgatar código do produto. Erro: " + e);
        }
        rs.close();
        conexao.fecharConexao();
        return codigo;
    }

    public ArrayList todosUsuarios() throws SQLException {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        ResultSet rs = null;
        String SQL = "SELECT CODUSUARIO, NOME, USUARIO, CPF, EMAIL from users";
        try {
            pst = con.prepareStatement(SQL);
            rs = pst.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigo(rs.getInt("CODUSUARIO"));
                cliente.setNome(rs.getString("USUARIO"));
                cliente.setUsuario(rs.getString("NOME"));
                cliente.setCpf(rs.getString("CPF"));
                cliente.setEmail(rs.getString("EMAIL"));
                listaCliente.add(cliente);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao resgatar a lista de clientes. Erro: " + e);
        }
        rs.close();
        conexao.fecharConexao();
        return listaCliente;
    }
}
