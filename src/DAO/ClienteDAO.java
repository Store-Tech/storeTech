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

    public void adicionaUsuario(Cliente c) {
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        String SQL = "insert into tb_cliente (NOME, USUARIO, EMAIL, CPF, SENHA) values(?,?,?,?,?);";
        try {
            pst = con.prepareStatement(SQL);
            pst.setString(1, c.getNome());
            pst.setString(2, c.getUsuario());
            pst.setString(3, c.getEmail());
            pst.setString(4, c.getCpf());
            pst.setString(5, c.getSenha());
            pst.executeUpdate();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário. Erro: " + e);
        }
        conexao.fecharConexao();
    }

    public boolean validaLogin(String usuario, String senha) {
        boolean autentica = false;
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        ResultSet rs = null;
        String SQL = "SELECT usuario, password FROM tb_cliente WHERE USUARIO = ? AND SENHA = ?";
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
            rs.close();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao autenticar. Erro: " + e);
        }
        conexao.fecharConexao();
        return autentica;
    }

    public boolean usuarioDisponivel(String usuario) {
        boolean disponivel = false;
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        ResultSet rs = null;
        String SQL = "SELECT USUARIO from tb_cliente WHERE USUARIO=?";
        try {
            pst = con.prepareStatement(SQL);
            pst.setString(1, usuario);
            rs = pst.executeQuery();
            if (rs.next()) {
                disponivel = false;
            } else {
                disponivel = true;
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar usuário no banco. Erro: " + e);
        }
        conexao.fecharConexao();
        return disponivel;
    }

    public ArrayList todosUsuarios() {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        ResultSet rs = null;
        String SQL = "SELECT CLIENTEID, NOME, USUARIO, CPF, EMAIL from tb_cliente";
        try {
            pst = con.prepareStatement(SQL);
            rs = pst.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigo(rs.getInt("CLIENTEID"));
                cliente.setNome(rs.getString("NOME"));
                cliente.setUsuario(rs.getString("USUARIO"));
                cliente.setCpf(rs.getString("CPF"));
                cliente.setEmail(rs.getString("EMAIL"));
                listaCliente.add(cliente);
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao resgatar a lista de clientes. Erro: " + e);
        }
        conexao.fecharConexao();
        return listaCliente;
    }

    public boolean cpfExistente(String cpf) {
        boolean disponivel = false;
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        ResultSet rs = null;
        String SQL = "SELECT CPF from tb_cliente WHERE CPF=?";
        try {
            pst = con.prepareStatement(SQL);
            pst.setString(1, cpf);
            rs = pst.executeQuery();
            if (rs.next()) {
                disponivel = false;
            } else {
                disponivel = true;
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar CPF no banco. Erro: " + e);
        }
        conexao.fecharConexao();
        return disponivel;
    }

    public void updateCliente(Cliente c) {
        Conexao conexao = new Conexao();
        Connection con = conexao.getConexao();
        String update = "UPDATE storetech.TB_CLIENTE SET NOME = ?, CPF = ?, EMAIL = ? WHERE CLIENTEID = ?";
        try {
            pst = con.prepareStatement(update);
            pst.setString(1, c.getNome());
            pst.setString(2, c.getCpf());
            pst.setString(3, c.getEmail());
            pst.setInt(4, c.getCodigo());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente" + e);
        }
        conexao.fecharConexao();
    }

    public ArrayList pesquisaUsuario(Cliente c){
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        ResultSet rs = null;
        String SQL = "SELECT CLIENTEID, NOME, USUARIO, EMAIL, CPF from tb_cliente where Nome like ? and CPF like ? and Email like ? and CLIENTEID like ?";
        try {
            pst = con.prepareStatement(SQL);
            pst.setString(1, "%" + c.getNome() + "%");
            pst.setString(2, "%" + c.getCpf() + "%");
            pst.setString(3, "%" + c.getEmail() + "%");
            Integer codigo = c.getCodigo();
            if (codigo != 0) {
                pst.setInt(4, c.getCodigo());
            } else {
                pst.setString(4, "%%");
                System.out.println("Entrei no else");
            }
            rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setCodigo(rs.getInt("CLIENTEID"));
                    cliente.setNome(rs.getString("NOME"));
                    cliente.setUsuario(rs.getString("USUARIO"));
                    cliente.setCpf(rs.getString("CPF"));
                    cliente.setEmail(rs.getString("EMAIL"));
                    listaCliente.add(cliente);
                }
            } else {
                rs.close();
                conexao.fecharConexao();
                listaCliente.add(c);
                return listaCliente;
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao resgatar a lista de clientes. Erro: " + e);
        }
        conexao.fecharConexao();
        return listaCliente;
    }

    public void deleteCliente(Cliente c){
        Conexao conexao = new Conexao();
        Connection con = conexao.getConexao();
        String delete = "DELETE FROM storetech.TB_CLIENTE WHERE CLIENTEID = ?";
        try {
            pst = con.prepareStatement(delete);
            pst.setInt(1, c.getCodigo());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar cliente" + e);
        }
        conexao.fecharConexao();
    }

    public void deleteClienteTeste(Cliente c){
        Conexao conexao = new Conexao();
        Connection con = conexao.getConexao();
        String delete = "DELETE FROM storetech.TB_CLIENTE WHERE USUARIO = ?";
        try {
            pst = con.prepareStatement(delete);
            pst.setString(1, c.getUsuario());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar cliente" + e);
        }
        conexao.fecharConexao();
    }


    public Cliente pesquisaUnicoUsuario(String CPF){
        Cliente cliente = null;
        Conexao conexao = new Conexao();
        con = conexao.getConexao();
        ResultSet rs = null;
        String SQL = "SELECT CLIENTEID, CPF, NOME, USUARIO, EMAIL from tb_cliente where CPF = ?";
        try {
            pst = con.prepareStatement(SQL);
            pst.setString(1, CPF);
            rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    cliente = new Cliente();
                    cliente.setCodigo(rs.getInt("CLIENTEID"));
                    cliente.setCpf(rs.getString("CPF"));
                    cliente.setNome(rs.getString("NOME"));
                    cliente.setUsuario(rs.getString("USUARIO"));
                    cliente.setEmail(rs.getString("EMAIL"));
                }
            } else {
                rs.close();
                conexao.fecharConexao();
                return cliente;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao resgatar a lista de clientes. Erro: " + e);
        }
        conexao.fecharConexao();
        return cliente;
    }
}
