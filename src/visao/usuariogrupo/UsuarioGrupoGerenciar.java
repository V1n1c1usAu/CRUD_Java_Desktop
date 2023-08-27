/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao.usuariogrupo;

import controlador.UsuarioDao;
import controlador.UsuarioGrupoDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
import modelo.UsuarioGrupo;
import visao.usuario.UsuarioCadastrar;

/**
 *
 * @author aluno
 */
public class UsuarioGrupoGerenciar extends javax.swing.JFrame {

    /**
     * Creates new form UsuarioGrupoGerenciar
     */
    public UsuarioGrupoGerenciar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonCarregarTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gerenciar Grupo Usuário");

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquisar por nome:");

        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });
        jTextFieldPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisarKeyReleased(evt);
            }
        });

        jTableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Data Cadastro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jLabel3.setText("* Dois cliques para alterar o registro.");

        jButtonCarregarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/download-pequeno.jpg"))); // NOI18N
        jButtonCarregarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNovo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCarregarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCarregarTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonExcluir)
                        .addComponent(jButtonAlterar))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed

        new UsuarioGrupoCadastrar().setVisible(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jTextFieldPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarKeyReleased
        String campoPesquisa = jTextFieldPesquisar.getText();

        // if (!campoPesquisa.equals("")) {
        this.preencherTabela(campoPesquisa);
        //}
    }//GEN-LAST:event_jTextFieldPesquisarKeyReleased

    private void preencherTabela(String campoPesquisa) {
        DefaultTableModel modelo = (DefaultTableModel) jTableDados.getModel();
        modelo.setNumRows(0);
        try {

            UsuarioGrupoDao dao = new UsuarioGrupoDao();
            List<UsuarioGrupo> lista = dao.buscar(campoPesquisa);

            for (UsuarioGrupo obj : lista) {

                String[] linha = {
                    obj.getId().toString(),
                    obj.getNome(),
                    ""
                };
                modelo.addRow(linha);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar. " + ex.getMessage());
        }

    }

    private void jTableDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDadosMouseClicked

    }//GEN-LAST:event_jTableDadosMouseClicked

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

        int linhaSelecionada = jTableDados.getSelectedRow();

        if (linhaSelecionada != -1) {
            Integer id = Integer.valueOf(jTableDados.getModel().getValueAt(linhaSelecionada, 0).toString());

            try {
                UsuarioGrupoDao dao = new UsuarioGrupoDao();
                dao.excluir(id);

                DefaultTableModel modelo = (DefaultTableModel) jTableDados.getModel();
                modelo.removeRow(linhaSelecionada);

                JOptionPane.showMessageDialog(this, "Registro excluido com sucesso.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir registro." + e.getMessage());

            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um registro para excluir.");
        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        new UsuarioGrupoAlterar().setVisible(true);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonCarregarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarTodosActionPerformed

    }//GEN-LAST:event_jButtonCarregarTodosActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UsuarioGrupoGerenciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioGrupoGerenciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioGrupoGerenciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioGrupoGerenciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioGrupoGerenciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCarregarTodos;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}