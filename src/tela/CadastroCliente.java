/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import DAO.ClienteDAO;
import Model.Cliente;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class CadastroCliente extends javax.swing.JInternalFrame {

    private boolean usuarioValido;
    private boolean verificaSenha;
    private boolean verificaEmail;
    private boolean verificaCpf;

    public CadastroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbCriarCliente = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jlAvisoUsuario = new javax.swing.JLabel();
        jlComparaSenha = new javax.swing.JLabel();
        jpConfirmaSenha = new javax.swing.JPasswordField();
        jpSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jftCpf = new javax.swing.JFormattedTextField();
        jlAvisoEmail = new javax.swing.JLabel();
        jlAvisoCpf = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setBackground(new java.awt.Color(255, 153, 153));
        setClosable(true);
        setForeground(java.awt.Color.gray);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirmar senha");

        jtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtUsuarioFocusLost(evt);
            }
        });
        jtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtUsuarioActionPerformed(evt);
            }
        });

        jtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtEmailFocusLost(evt);
            }
        });
        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail");

        jbCriarCliente.setBackground(new java.awt.Color(0, 102, 51));
        jbCriarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbCriarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jbCriarCliente.setText("Criar conta");
        jbCriarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriarClienteActionPerformed(evt);
            }
        });

        jbFechar.setBackground(new java.awt.Color(255, 0, 0));
        jbFechar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbFechar.setForeground(new java.awt.Color(255, 255, 255));
        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jpConfirmaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpConfirmaSenhaKeyReleased(evt);
            }
        });

        jpSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpSenhaKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuário");

        jtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNomeFocusLost(evt);
            }
        });
        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CPF");

        try {
            jftCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jftCpfFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCriarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtEmail)
                    .addComponent(jpSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(jpConfirmaSenha)
                    .addComponent(jtNome)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlAvisoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftCpf)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlAvisoCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbFechar)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jlAvisoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlComparaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlAvisoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlAvisoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlAvisoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlComparaSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCriarCliente)
                .addGap(12, 12, 12)
                .addComponent(jbFechar)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmailActionPerformed

    private void jtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtUsuarioFocusLost
        String usuario;
        boolean disponivel = false;
        usuario = jtUsuario.getText();
        ClienteDAO cliente = new ClienteDAO();

        if (!usuario.equals("")) {
            disponivel = cliente.usuarioDisponivel(usuario);
        }
        System.out.println(disponivel);

        if (disponivel && !usuario.contains(" ")) {
            jlAvisoUsuario.setForeground(new Color(0, 255, 0));
            jlAvisoUsuario.setText("Nome disponivél");
            usuarioValido = true;
        } else if (usuario.contains(" ")) {
            jlAvisoUsuario.setForeground(new Color(255, 102, 102));
            jlAvisoUsuario.setText("Usuário contém espaço");
            usuarioValido = false;
        } else {
            jlAvisoUsuario.setForeground(new Color(255, 102, 102));
            jlAvisoUsuario.setText("Usuário já existe");
            usuarioValido = false;
        }
    }//GEN-LAST:event_jtUsuarioFocusLost

    private void jpSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpSenhaKeyReleased

    }//GEN-LAST:event_jpSenhaKeyReleased

    private void jpConfirmaSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpConfirmaSenhaKeyReleased
        String senha = jpSenha.getText();
        String confirmaSenha = jpConfirmaSenha.getText();
        if (senha.equals(confirmaSenha)) {
            jlComparaSenha.setForeground(new Color(0, 255, 0));
            jlComparaSenha.setText("Senhas correspondem");
            verificaSenha = true;
        } else {
            jlComparaSenha.setForeground(new Color(255, 102, 102));
            jlComparaSenha.setText("Senhas não correspondem");
            verificaSenha = false;
        }
    }//GEN-LAST:event_jpConfirmaSenhaKeyReleased

    private void jtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtUsuarioActionPerformed

    }//GEN-LAST:event_jtUsuarioActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbCriarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriarClienteActionPerformed
        Cliente c = new Cliente();
        c.setNome(jtNome.getText());
        c.setUsuario(jtUsuario.getText());
        c.setCpf(jftCpf.getText().replaceAll("[.,-]", ""));
        c.setEmail(jtEmail.getText());
        c.setSenha(jpSenha.getText());
        if(usuarioValido && verificaSenha && verificaEmail && !c.getNome().equals("") && !c.getEmail().equals("")){
        cadastraCliente(c);
        }
        jtNome.setText("");
        jtUsuario.setText("");
        jftCpf.setText("");
        jtEmail.setText("");
        jpSenha.setText("");
        jpConfirmaSenha.setText("");
        jlAvisoEmail.setText("");
        jlComparaSenha.setText("");
        jlAvisoUsuario.setText("");
    }//GEN-LAST:event_jbCriarClienteActionPerformed

    private void jtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNomeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeFocusLost

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeActionPerformed

    private void jtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtEmailFocusLost
        String email = jtEmail.getText();
        if (email.contains("@") && (email.contains(".com") || email.contains(".br"))) {
            jlAvisoEmail.setText("");
            verificaEmail = true;
        } else {
            jlAvisoEmail.setForeground(new Color(255, 102, 102));
            jlAvisoEmail.setText("Email inválido");
            verificaEmail = false;
        }

    }//GEN-LAST:event_jtEmailFocusLost

    private void jftCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftCpfFocusLost
        String cpf = jftCpf.getText().replaceAll("[.,-]", "");
        ClienteDAO cliente = new ClienteDAO();
        if (cliente.cpfExistente(cpf)) {
            jlAvisoCpf.setText("");
            verificaCpf = true;
        } else {
            jlAvisoCpf.setForeground(new Color(255, 102, 102));
            jlAvisoCpf.setText("CPF já cadastrado");
            verificaCpf = false;
        }

    }//GEN-LAST:event_jftCpfFocusLost
    
    public String cadastraCliente(Cliente c){
        ClienteDAO cliente = new ClienteDAO();
        String msg = "";
        if (!c.getNome().equals("") && !c.getEmail().equals("")) {
            System.out.println("Entrei");
            cliente.adicionaUsuario(c);
            msg = "O cadastro foi realizado com sucesso";
        } else if (c.getNome().equals("") || c.getUsuario().equals("") || c.getEmail().equals("")) {
            msg = "Um ou mais campos estão vazios";
        } else if (!verificaEmail) {
            msg = "O email informado não é válido";
        } else if (!usuarioValido) {
            msg = "O usuário passado já existe";
        } else if (!usuarioValido && c.getUsuario().equals("")) {
            msg = "O usuário não foi preenchido";
        } else if (!verificaSenha) {
            msg = "As senhas não correspondem";
        }
        JOptionPane.showMessageDialog(null, msg);
        return msg;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbCriarCliente;
    private javax.swing.JButton jbFechar;
    private javax.swing.JFormattedTextField jftCpf;
    private javax.swing.JLabel jlAvisoCpf;
    private javax.swing.JLabel jlAvisoEmail;
    private javax.swing.JLabel jlAvisoUsuario;
    private javax.swing.JLabel jlComparaSenha;
    private javax.swing.JPasswordField jpConfirmaSenha;
    private javax.swing.JPasswordField jpSenha;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables
}
