/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import DAO.ClienteDAO;
import Model.Cliente;

/**
 *
 * @author Israel
 */
public class CadastroClienteTest {

    static Cliente cliente;

    public CadastroClienteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        
    }

    @AfterClass
    public static void tearDownClass() {
        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.deleteClienteTeste(cliente);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        
    }

    /**
     * Test of cadastraCliente method, of class CadastroCliente.
     */
    @Test
    public void CadastroCliente() {
        cliente = new Cliente();
        CadastroCliente cc = new CadastroCliente();
        cliente.setNome("Israel");
        cliente.setUsuario("israel.gomes");
        cliente.setCpf("12345678915");
        cliente.setEmail("israelgomes13@gmail.com");
        cliente.setSenha("batatinha123");
        System.out.println(cliente);
        String msg = cc.cadastraCliente(cliente);
        assertEquals("O cadastro foi realizado com sucesso", msg);
    }

    @Test
    public void EmailNaoInformado() {
        cliente = new Cliente();
        CadastroCliente cc = new CadastroCliente();
        cliente.setNome("Israel");
        cliente.setUsuario("israel.gomes");
        cliente.setCpf("12345678915");
        cliente.setEmail("");
        cliente.setSenha("batatinha123");
        System.out.println(cliente);
        String msg = cc.cadastraCliente(cliente);
        assertEquals("O email não foi informado", msg);
    }

    @Test
    public void SenhaNaoInformada() {
        cliente = new Cliente();
        CadastroCliente cc = new CadastroCliente();
        cliente.setNome("Israel");
        cliente.setUsuario("israel.gomes");
        cliente.setCpf("12345678915");
        cliente.setEmail("israel@bol.com.br");
        cliente.setSenha("");
        String msg = cc.cadastraCliente(cliente);
        assertEquals("A senha não foi informada", msg);
    }

    @Test
    public void SenhaDivergente() {
        String senhaPrimeiroCampo = "";
        String senhaSegundoCampo = "batatinha123";
        cliente = new Cliente();
        CadastroCliente cc = new CadastroCliente();
        cliente.setNome("Israel");
        cliente.setUsuario("israel.gomes");
        cliente.setCpf("12345678915");
        cliente.setEmail("israel@bol.com.br");
        cliente.setSenha("batatinha159");
        senhaPrimeiroCampo = cliente.getSenha();
        assertNotEquals(senhaPrimeiroCampo, senhaSegundoCampo);
    }
}
