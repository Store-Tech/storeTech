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
      
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
         ClienteDAO clienteDao = new ClienteDAO();
         clienteDao.deleteClienteTeste(cliente);
    }

    /**
     * Test of cadastraCliente method, of class CadastroCliente.
     */
    @Test
    public void testCadastraCliente() {
        cliente = new Cliente();
        CadastroCliente cc = new CadastroCliente(); 
        cliente.setNome("");
        cliente.setUsuario("israel.gomes");
        cliente.setCpf("12345678915");
        cliente.setEmail("israelgomes13@gmail.com");
        cliente.setSenha("batatinha123");
        System.out.println(cliente);
        String msg = cc.cadastraCliente(cliente);
        assertEquals("O cadastro foi realizado com sucesso", msg);
    }
}
