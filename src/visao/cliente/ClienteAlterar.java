package visao.cliente;

import controlador.ClienteDao;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 *
 * @author Marcelo Borth
 */
public class ClienteAlterar extends javax.swing.JFrame {

    public ClienteAlterar() {
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelDadosGerais = new javax.swing.JPanel();
        jButtonSalvarDadosGerais = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObs = new javax.swing.JTextArea();
        jLabelObs = new javax.swing.JLabel();
        jLabelTipoCliente = new javax.swing.JLabel();
        jComboBoxTipoCliente = new javax.swing.JComboBox<>();
        jLabelCpfCnpj = new javax.swing.JLabel();
        jTextFieldCpfCnpj = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alterar Cliente");

        jPanelDadosGerais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalvarDadosGerais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jButtonSalvarDadosGerais.setText("Salvar");
        jButtonSalvarDadosGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarDadosGeraisActionPerformed(evt);
            }
        });
        jPanelDadosGerais.add(jButtonSalvarDadosGerais, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNome.setText("Nome:");
        jPanelDadosGerais.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 37, 20));
        jPanelDadosGerais.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 200, -1));
        jPanelDadosGerais.add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 200, -1));

        jTextAreaObs.setColumns(20);
        jTextAreaObs.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObs);

        jPanelDadosGerais.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 250, 97));

        jLabelObs.setText("Observação:");
        jPanelDadosGerais.add(jLabelObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabelTipoCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTipoCliente.setText("Tipo:");
        jPanelDadosGerais.add(jLabelTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 30, -1));

        jComboBoxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Jurídica", "Pessoa Física" }));
        jPanelDadosGerais.add(jComboBoxTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 150, -1));

        jLabelCpfCnpj.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCpfCnpj.setText("CPF/CNPJ:");
        jPanelDadosGerais.add(jLabelCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, 20));

        jTextFieldCpfCnpj.setToolTipText("");
        jTextFieldCpfCnpj.setName(""); // NOI18N
        jTextFieldCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCpfCnpjActionPerformed(evt);
            }
        });
        jPanelDadosGerais.add(jTextFieldCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 200, -1));

        jLabelTelefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTelefone.setText("Telefone:");
        jPanelDadosGerais.add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 50, 20));
        jPanelDadosGerais.add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 200, -1));

        jLabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEmail.setText("Email:");
        jPanelDadosGerais.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 50, 20));

        jLabel2.setText("ID:");
        jPanelDadosGerais.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTextFieldid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldidActionPerformed(evt);
            }
        });
        jPanelDadosGerais.add(jTextFieldid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 93, -1));

        jTabbedPane1.addTab("Dados Gerais", jPanelDadosGerais);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setarValoresZerados() {
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jComboBoxTipoCliente.setSelectedItem(0);
        jTextFieldCpfCnpj.setText("");
        jTextFieldTelefone.setText("");
    }

    public void mostrarCliente(String idTexto) {
        try {
            Integer id = Integer.valueOf(idTexto);

            ClienteDao dao = new ClienteDao();
            Cliente obj = dao.getCliente(id);

            if (obj != null) {

                //Recupera o status salvo no banco
                //Preenche os dados do formulário
                jTextFieldNome.setText(obj.getNome());
                jTextFieldEmail.setText(obj.getEmail());
                jComboBoxTipoCliente.setSelectedIndex(obj.getTipoCliente());
                jTextFieldCpfCnpj.setText(obj.getCpfCnpj());
                jTextFieldTelefone.setText(obj.getTelefone());

                jTextAreaObs.setText(obj.getObservacao());

            } else {
                JOptionPane.showMessageDialog(this, "Registro não encontrado.");

                setarValoresZerados();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao consultar registro.");

            setarValoresZerados();

        }
    }


    private void jButtonSalvarDadosGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarDadosGeraisActionPerformed

        Integer id = Integer.valueOf(jTextFieldid.getText());
        String nome = jTextFieldNome.getText();
        Integer tipoCliente = (jComboBoxTipoCliente.getSelectedIndex());
        String cpfCnpj = jTextFieldCpfCnpj.getText();
        String telefone = jTextFieldTelefone.getText();
        String email = jTextFieldEmail.getText();
        String observacao = jTextAreaObs.getText();

        if (id == null) {
            JOptionPane.showMessageDialog(this, "Informe o ID.");
            jTextFieldNome.requestFocus();
            return;
        }

        if (nome.equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o nome.");
            jTextFieldNome.requestFocus();
            return;
        }
        if (tipoCliente.equals(null)) {
            JOptionPane.showMessageDialog(this, "Informe o tipo cliente.");
            jTextFieldNome.requestFocus();
            return;
        }
        if (cpfCnpj.equals("") || cpfCnpj.length() < 11) {
            JOptionPane.showMessageDialog(this, "Informe o CPF/CNPJ.");
            jTextFieldNome.requestFocus();
            return;
        }
        if (telefone.equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o telefone.");
            jTextFieldNome.requestFocus();
            return;
        }
        if (email.equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o email.");
            jTextFieldNome.requestFocus();
            return;
        }

        Cliente u = new Cliente(id, nome, tipoCliente, cpfCnpj, telefone, email, observacao);

        try {
            ClienteDao dao = new ClienteDao();
            dao.atualizar(u);

            JOptionPane.showMessageDialog(this, "Registro atualizado com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }

    }//GEN-LAST:event_jButtonSalvarDadosGeraisActionPerformed


    private void jButtonAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlterarSenhaActionPerformed

    private void jTextFieldidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldidActionPerformed

        String id = jTextFieldid.getText();

        if (!id.trim().equals("")) {
            this.mostrarCliente(id);
        } else {
            setarValoresZerados();

        }
    }//GEN-LAST:event_jTextFieldidActionPerformed

    private void jTextFieldCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCpfCnpjActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteAlterar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvarDadosGerais;
    private javax.swing.JComboBox<String> jComboBoxTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCpfCnpj;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTipoCliente;
    private javax.swing.JPanel jPanelDadosGerais;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaObs;
    private javax.swing.JTextField jTextFieldCpfCnpj;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldid;
    // End of variables declaration//GEN-END:variables
}
