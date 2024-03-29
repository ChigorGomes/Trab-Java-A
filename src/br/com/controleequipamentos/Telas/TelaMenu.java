package br.com.controleequipamentos.Telas;

import br.com.controleequipamentos.classes.DAO.UsuarioDAO;
import br.com.controleequipamentos.classes.Usuario;
import javax.swing.JOptionPane;

public class TelaMenu extends javax.swing.JFrame {

    Usuario user = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    String aux;

    public TelaMenu(String nome) {
        initComponents();
        aux = nome;
    }

    private TelaMenu() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonCadastroEquipamento = new javax.swing.JButton();
        jButtonManutencao = new javax.swing.JButton();
        jButtonGerenciamentoManutencao = new javax.swing.JButton();
        jButtonEditaPerfil = new javax.swing.JButton();
        jButtonCadastraTipoEquipamento = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(253, 253, 253));

        jButtonCadastroEquipamento.setText("CADASTRAR EQUIPAMENTO");
        jButtonCadastroEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroEquipamentoActionPerformed(evt);
            }
        });

        jButtonManutencao.setText("ABERTURA DE MANUTENÇÃO");
        jButtonManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManutencaoActionPerformed(evt);
            }
        });

        jButtonGerenciamentoManutencao.setText("GERENCIAMENTO DE MANUTENÇÃO");
        jButtonGerenciamentoManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerenciamentoManutencaoActionPerformed(evt);
            }
        });

        jButtonEditaPerfil.setText("EDITAR PERFIL");
        jButtonEditaPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditaPerfilActionPerformed(evt);
            }
        });

        jButtonCadastraTipoEquipamento.setText("CADASTRAR TIPOS DE EQUIPAMENTOS");
        jButtonCadastraTipoEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastraTipoEquipamentoActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ICOMP.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonGerenciamentoManutencao)
                            .addComponent(jButtonCadastraTipoEquipamento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonEditaPerfil, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonManutencao, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCadastroEquipamento)
                .addGap(161, 161, 161))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCadastraTipoEquipamento, jButtonCadastroEquipamento, jButtonEditaPerfil, jButtonGerenciamentoManutencao, jButtonManutencao});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButtonCadastroEquipamento)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditaPerfil)
                    .addComponent(jButtonCadastraTipoEquipamento))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonManutencao)
                    .addComponent(jButtonGerenciamentoManutencao))
                .addGap(50, 50, 50))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonCadastraTipoEquipamento, jButtonCadastroEquipamento, jButtonEditaPerfil, jButtonGerenciamentoManutencao, jButtonManutencao});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroEquipamentoActionPerformed
 
        if (usuarioDAO.controleAcessoUsuarioSecretaria(aux) == true) {
            if (new TelaCadastroEquipamento(aux) == null) {
                new TelaCadastroEquipamento(aux).setVisible(true);
                new TelaCadastroEquipamento(aux).setResizable(false);
            } else {
                new TelaCadastroEquipamento(aux).setVisible(true);
                new TelaCadastroEquipamento(aux).setResizable(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não tem permissão!");
        }

    }//GEN-LAST:event_jButtonCadastroEquipamentoActionPerformed

    private void jButtonCadastraTipoEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastraTipoEquipamentoActionPerformed
 
        if (usuarioDAO.controleAcessoUsuarioSecretaria(aux) == true) {
            if (new TelaCadastroTipoEquipamento(aux) == null) {
                new TelaCadastroTipoEquipamento(aux).setVisible(true);
                new TelaCadastroTipoEquipamento(aux).setResizable(false);

            } else {
                new TelaCadastroTipoEquipamento(aux).setVisible(true);
                new TelaCadastroTipoEquipamento(aux).setResizable(false);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não tem permissão!");
        }
    }//GEN-LAST:event_jButtonCadastraTipoEquipamentoActionPerformed

    private void jButtonManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManutencaoActionPerformed
 
        if (usuarioDAO.controleAcessoUsuarioSecretaria(aux) == true) {
            if (new TelaGerenciamentoManutencaoDefeito(aux) == null) {
                new TelaGerenciamentoManutencaoDefeito(aux).setVisible(true);
                new TelaGerenciamentoManutencaoDefeito(aux).setResizable(false);

            } else {
                new TelaGerenciamentoManutencaoDefeito(aux).setVisible(true);
                new TelaGerenciamentoManutencaoDefeito(aux).setResizable(false);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não tem permissão!");
        }


    }//GEN-LAST:event_jButtonManutencaoActionPerformed

    private void jButtonEditaPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditaPerfilActionPerformed
 
        new TelaEditaCadastro(aux).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonEditaPerfilActionPerformed

    private void jButtonGerenciamentoManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerenciamentoManutencaoActionPerformed
 
        if (usuarioDAO.controleAcessoUsuarioSuporte(aux) == true) {
            if (new TelaGerenciamentoManutencaoConserto(aux) == null) {
                new TelaGerenciamentoManutencaoConserto(aux).setVisible(true);
                new TelaGerenciamentoManutencaoConserto(aux).setResizable(false);

            } else {
                new TelaGerenciamentoManutencaoConserto(aux).setVisible(true);
                new TelaGerenciamentoManutencaoConserto(aux).setResizable(false);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não tem permissão!");
        }
    }//GEN-LAST:event_jButtonGerenciamentoManutencaoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastraTipoEquipamento;
    private javax.swing.JButton jButtonCadastroEquipamento;
    private javax.swing.JButton jButtonEditaPerfil;
    private javax.swing.JButton jButtonGerenciamentoManutencao;
    private javax.swing.JButton jButtonManutencao;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
