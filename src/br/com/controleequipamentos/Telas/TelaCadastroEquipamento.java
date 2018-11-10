package br.com.controleequipamentos.Telas;

import br.com.controleequipamentos.classes.DAO.DescricaoDAO;
import br.com.controleequipamentos.classes.DAO.TipoEquipamentoDAO;
import br.com.controleequipamentos.classes.Descricao;
import br.com.controleequipamentos.classes.TipoEquipamentos;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class TelaCadastroEquipamento extends javax.swing.JFrame {

    TipoEquipamentos tipoEquipamentos = new TipoEquipamentos();
    TipoEquipamentoDAO equipamentoDAO = new TipoEquipamentoDAO();
    Descricao descricao = new Descricao();
    DescricaoDAO descricaoDAO = new DescricaoDAO();
    Vector<TipoEquipamentos> listaEquip = null;
    int cod = 0;
    String aux;

    public TelaCadastroEquipamento(String nome) {
        initComponents();
        aux=nome;
        listaEquip = equipamentoDAO.mostraEquipamentos();
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(listaEquip);

        jComboBoxEquipamentos.setModel(modeloCombo);

    }

    private TelaCadastroEquipamento() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxEquipamentos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jTextFieldLocal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO EQUIPAMENTO");

        jComboBoxEquipamentos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEquipamentosItemStateChanged(evt);
            }
        });
        jComboBoxEquipamentos.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jComboBoxEquipamentosMouseWheelMoved(evt);
            }
        });
        jComboBoxEquipamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBoxEquipamentosMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxEquipamentosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxEquipamentosMouseEntered(evt);
            }
        });

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 2, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DATA");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 2, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EQUIPAMENTO");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 2, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DESCRIÇÃO");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 2, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LOCAL");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ICOMP.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxEquipamentos, jFormattedTextFieldData, jTextFieldLocal});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBoxEquipamentos, jFormattedTextFieldData, jTextFieldLocal});

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

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       
        if (cod <= 0) {
            JOptionPane.showMessageDialog(null, "Selecione um equipamento!");

        } else if (jComboBoxEquipamentos.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um equipamento!");
        } else if (jFormattedTextFieldData.getText().equalsIgnoreCase("  /  /    ")) {
            JOptionPane.showMessageDialog(null, "Preencha a Data!");

        } else if (jTextFieldLocal.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o local!");

        } else if (jTextAreaDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha a descrição!");

        } else {
            descricao.setDescricao(jTextAreaDescricao.getText());
            descricao.setLocalDesc(jTextFieldLocal.getText());
            descricao.setDataDesc(jFormattedTextFieldData.getText());
            descricao.setIdEquipamento(cod);
            descricaoDAO.salvar(descricao);
            new TelaMenu(aux).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jComboBoxEquipamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxEquipamentosMouseClicked
       
        if (jComboBoxEquipamentos.getSelectedIndex() > 0) {
            String nome = "" + jComboBoxEquipamentos.getModel().getSelectedItem();
            cod = descricaoDAO.buscaEquipamento(nome);
            System.out.println(cod);

        }


    }//GEN-LAST:event_jComboBoxEquipamentosMouseClicked

    private void jComboBoxEquipamentosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEquipamentosItemStateChanged
       
        String nome = "" + jComboBoxEquipamentos.getModel().getSelectedItem();
        cod = descricaoDAO.buscaEquipamento(nome);
        System.out.println(cod);


    }//GEN-LAST:event_jComboBoxEquipamentosItemStateChanged

    private void jComboBoxEquipamentosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxEquipamentosMousePressed
       
        if (jComboBoxEquipamentos.getSelectedIndex() > 0) {
            String nome = "" + jComboBoxEquipamentos.getModel().getSelectedItem();
            cod = descricaoDAO.buscaEquipamento(nome);
            System.out.println(cod);

        }

    }//GEN-LAST:event_jComboBoxEquipamentosMousePressed

    private void jComboBoxEquipamentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxEquipamentosMouseEntered

        if (jComboBoxEquipamentos.getSelectedIndex() > 0) {
            String nome = "" + jComboBoxEquipamentos.getModel().getSelectedItem();
            cod = descricaoDAO.buscaEquipamento(nome);
            System.out.println(cod);

        }
    }//GEN-LAST:event_jComboBoxEquipamentosMouseEntered

    private void jComboBoxEquipamentosMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jComboBoxEquipamentosMouseWheelMoved
       
        if (jComboBoxEquipamentos.getSelectedIndex() > 0) {
            String nome = "" + jComboBoxEquipamentos.getModel().getSelectedItem();
            cod = descricaoDAO.buscaEquipamento(nome);
            System.out.println(cod);

        }
    }//GEN-LAST:event_jComboBoxEquipamentosMouseWheelMoved

    private void jFormattedTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroEquipamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxEquipamentos;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldLocal;
    // End of variables declaration//GEN-END:variables
}
