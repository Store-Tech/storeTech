/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;

/**
 *
 * @author Matheus
 */
public class Principal extends javax.swing.JFrame {

    public final JDesktopPane jdp = new JDesktopPane();
    
    public Principal() throws SQLException {
        initComponents();
        abrirTelaVendas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbCadastrarCliente = new javax.swing.JButton();
        jbCadastrarProduto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbConsultaCliente = new javax.swing.JButton();
        jbConsultaProduto = new javax.swing.JButton();
        jbConsultaVenda = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jbFechar = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro");

        jbCadastrarCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jbCadastrarCliente.setText("-Cadastrar Cliente");
        jbCadastrarCliente.setBorder(null);
        jbCadastrarCliente.setBorderPainted(false);
        jbCadastrarCliente.setContentAreaFilled(false);
        jbCadastrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCadastrarCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbCadastrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCadastrarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCadastrarClienteMouseExited(evt);
            }
        });
        jbCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarClienteActionPerformed(evt);
            }
        });

        jbCadastrarProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbCadastrarProduto.setForeground(new java.awt.Color(255, 255, 255));
        jbCadastrarProduto.setText("-Cadastrar Produto");
        jbCadastrarProduto.setBorder(null);
        jbCadastrarProduto.setBorderPainted(false);
        jbCadastrarProduto.setContentAreaFilled(false);
        jbCadastrarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCadastrarProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbCadastrarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCadastrarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCadastrarProdutoMouseExited(evt);
            }
        });
        jbCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarProdutoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consulta");

        jbConsultaCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbConsultaCliente.setForeground(new java.awt.Color(255, 255, 255));
        jbConsultaCliente.setText("-Consulta Cliente");
        jbConsultaCliente.setBorder(null);
        jbConsultaCliente.setBorderPainted(false);
        jbConsultaCliente.setContentAreaFilled(false);
        jbConsultaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbConsultaCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbConsultaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbConsultaClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbConsultaClienteMouseExited(evt);
            }
        });
        jbConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaClienteActionPerformed(evt);
            }
        });

        jbConsultaProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbConsultaProduto.setForeground(new java.awt.Color(255, 255, 255));
        jbConsultaProduto.setText("-Consulta Produto");
        jbConsultaProduto.setBorder(null);
        jbConsultaProduto.setBorderPainted(false);
        jbConsultaProduto.setContentAreaFilled(false);
        jbConsultaProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbConsultaProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbConsultaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbConsultaProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbConsultaProdutoMouseExited(evt);
            }
        });
        jbConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaProdutoActionPerformed(evt);
            }
        });

        jbConsultaVenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbConsultaVenda.setForeground(new java.awt.Color(255, 255, 255));
        jbConsultaVenda.setText("-Consulta Venda");
        jbConsultaVenda.setBorder(null);
        jbConsultaVenda.setBorderPainted(false);
        jbConsultaVenda.setContentAreaFilled(false);
        jbConsultaVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbConsultaVenda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbConsultaVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbConsultaVendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbConsultaVendaMouseExited(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/web-house (1).png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Store Tech");

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Meus Dados");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Logoff");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jbCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jbConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbConsultaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(83, 83, 83))
                                .addComponent(jbConsultaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCadastrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCadastrarProduto)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbConsultaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbConsultaProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbConsultaVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addGap(31, 31, 31))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jbFechar.setForeground(new java.awt.Color(255, 255, 255));
        jbFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-x (2).png"))); // NOI18N
        jbFechar.setBorder(null);
        jbFechar.setBorderPainted(false);
        jbFechar.setContentAreaFilled(false);
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbFechar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbFechar))
        );

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setDoubleBuffered(true);
        jDesktopPane1.setEnabled(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 797, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarClienteActionPerformed
        CadastroCliente cadastro = new CadastroCliente();
        jDesktopPane1.add(cadastro);
        cadastro.setVisible(true);
    }//GEN-LAST:event_jbCadastrarClienteActionPerformed

    private void jbCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarProdutoActionPerformed
        CadastroProduto cp = null;
        try {
            cp = new CadastroProduto();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(cp); 
        cp.setVisible(true);       
    }//GEN-LAST:event_jbCadastrarProdutoActionPerformed

    private void jbConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaClienteActionPerformed
        ConsultaCliente consultCliente = null;
        try {
            consultCliente = new ConsultaCliente();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(consultCliente);
        consultCliente.setVisible(true);
    }//GEN-LAST:event_jbConsultaClienteActionPerformed

    private void jbCadastrarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCadastrarClienteMouseEntered
        jbCadastrarCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
        
    }//GEN-LAST:event_jbCadastrarClienteMouseEntered

    private void jbCadastrarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCadastrarClienteMouseExited
        jbCadastrarCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
    }//GEN-LAST:event_jbCadastrarClienteMouseExited

    private void jbCadastrarProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCadastrarProdutoMouseEntered
        jbCadastrarProduto.setFont(new Font("Tahoma", Font.BOLD, 12));
    }//GEN-LAST:event_jbCadastrarProdutoMouseEntered

    private void jbCadastrarProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCadastrarProdutoMouseExited
        jbCadastrarProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
    }//GEN-LAST:event_jbCadastrarProdutoMouseExited

    private void jbConsultaClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbConsultaClienteMouseEntered
        jbConsultaCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
    }//GEN-LAST:event_jbConsultaClienteMouseEntered

    private void jbConsultaClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbConsultaClienteMouseExited
        jbConsultaCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
    }//GEN-LAST:event_jbConsultaClienteMouseExited

    private void jbConsultaProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbConsultaProdutoMouseEntered
        jbConsultaProduto.setFont(new Font("Tahoma", Font.BOLD, 12));
    }//GEN-LAST:event_jbConsultaProdutoMouseEntered

    private void jbConsultaProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbConsultaProdutoMouseExited
        jbConsultaProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
    }//GEN-LAST:event_jbConsultaProdutoMouseExited

    private void jbConsultaVendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbConsultaVendaMouseEntered
        jbConsultaVenda.setFont(new Font("Tahoma", Font.BOLD, 12));
    }//GEN-LAST:event_jbConsultaVendaMouseEntered

    private void jbConsultaVendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbConsultaVendaMouseExited
        jbConsultaVenda.setFont(new Font("Tahoma", Font.PLAIN, 12));
    }//GEN-LAST:event_jbConsultaVendaMouseExited

    private void jbConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaProdutoActionPerformed
        ConsultaProduto consultProd = null;
        try {
            consultProd = new ConsultaProduto(this);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(consultProd);
        consultProd.setVisible(true);
    }//GEN-LAST:event_jbConsultaProdutoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void abrirTelaVendas() throws SQLException{
        TelaVendas tv = new TelaVendas(this);
        jDesktopPane1.add(tv);
        tv.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbCadastrarCliente;
    private javax.swing.JButton jbCadastrarProduto;
    private javax.swing.JButton jbConsultaCliente;
    private javax.swing.JButton jbConsultaProduto;
    private javax.swing.JButton jbConsultaVenda;
    private javax.swing.JButton jbFechar;
    // End of variables declaration//GEN-END:variables
}
