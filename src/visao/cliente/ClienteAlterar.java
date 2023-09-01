package visao.cliente;

import controlador.ClienteDao;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 *
 * @author Vinicius Augusto
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

        jLabelTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelDadosGerais = new javax.swing.JPanel();
        jButtonSalvarDadosGerais = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jScrollPaneObs = new javax.swing.JScrollPane();
        jTextAreaObs = new javax.swing.JTextArea();
        jLabelObs = new javax.swing.JLabel();
        jLabelTipoCliente = new javax.swing.JLabel();
        jComboBoxTipoCliente = new javax.swing.JComboBox<>();
        jLabelCpfCnpj = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jFormattedTextFieldCpfCnpj = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar");

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Alterar Cliente");

        jPanelDadosGerais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalvarDadosGerais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jButtonSalvarDadosGerais.setText("Salvar");
        jButtonSalvarDadosGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarDadosGeraisActionPerformed(evt);
            }
        });
        jPanelDadosGerais.add(jButtonSalvarDadosGerais, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        jLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNome.setText("Nome:");
        jPanelDadosGerais.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 37, 20));
        jPanelDadosGerais.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 200, -1));
        jPanelDadosGerais.add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 200, -1));

        jTextAreaObs.setColumns(20);
        jTextAreaObs.setRows(5);
        jScrollPaneObs.setViewportView(jTextAreaObs);

        jPanelDadosGerais.add(jScrollPaneObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 250, 150));

        jLabelObs.setText("Observação:");
        jPanelDadosGerais.add(jLabelObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabelTipoCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTipoCliente.setText("Tipo:");
        jPanelDadosGerais.add(jLabelTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 30, -1));

        jComboBoxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Jurídica", "Pessoa Física" }));
        jPanelDadosGerais.add(jComboBoxTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 150, -1));

        jLabelCpfCnpj.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCpfCnpj.setText("CPF/CNPJ:");
        jPanelDadosGerais.add(jLabelCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jLabelTelefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTelefone.setText("Telefone:");
        jPanelDadosGerais.add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, 20));

        jLabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEmail.setText("Email:");
        jPanelDadosGerais.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 50, 20));

        jLabelID.setText("ID:");
        jPanelDadosGerais.add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });
        jPanelDadosGerais.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 93, -1));

        try {
            jFormattedTextFieldCpfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCpfCnpjActionPerformed(evt);
            }
        });
        jPanelDadosGerais.add(jFormattedTextFieldCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 200, -1));

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelDadosGerais.add(jFormattedTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 200, -1));

        jTabbedPane1.addTab("Dados Gerais", jPanelDadosGerais);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * setarValoresZerados: Reseta valores do layout.
     */
    private void setarValoresZerados() {
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jComboBoxTipoCliente.setSelectedIndex(0);
        jFormattedTextFieldCpfCnpj.setText("");
        jFormattedTextFieldTelefone.setText("");
    }

    /**
     * mostrarCliente: Recebe um id e retorna o cliente no layout.
     *
     * @param idTexto
     */
    public void mostrarCliente(String idTexto) {
        try {
            Integer id = Integer.valueOf(idTexto); //Converte idTexto para Integer.

            ClienteDao dao = new ClienteDao();
            Cliente obj = dao.getCliente(id); //Busca cliente e retorna na var. obj.

            if (obj != null) {
                jTextFieldNome.setText(obj.getNome());
                jTextFieldEmail.setText(obj.getEmail());
                jComboBoxTipoCliente.setSelectedIndex(obj.getTipoCliente());
                jFormattedTextFieldCpfCnpj.setText(obj.getCpfCnpj());
                jFormattedTextFieldTelefone.setText(obj.getTelefone());
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

    /**
     * jButtonSalvarDadosGeraisActionPerformed: Ao ser acionado realiza o UPDATE
     * no banco.
     *
     * @param evt
     */
    private void jButtonSalvarDadosGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarDadosGeraisActionPerformed

        /**
         * Recebe os valores que estão no layout.
         */
        Integer id = Integer.valueOf(jTextFieldID.getText());
        String nome = jTextFieldNome.getText();
        Integer tipoCliente = (jComboBoxTipoCliente.getSelectedIndex());
        String cpfCnpj = jFormattedTextFieldCpfCnpj.getText().replace(".", "").replace("-", "");
        String telefone = jFormattedTextFieldTelefone.getText().replace("(", "").replace(")", "").replace("-", "");
        String email = jTextFieldEmail.getText();
        String observacao = jTextAreaObs.getText();

        /**
         * Validações.
         */
        if (id < 0) {
            JOptionPane.showMessageDialog(this, "Informe o ID.");
            jTextFieldNome.requestFocus();
            return;
        }
        if (nome.equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o nome.");
            jTextFieldNome.requestFocus();
            return;
        }
        if (tipoCliente < 0) {
            JOptionPane.showMessageDialog(this, "Informe o tipo cliente.");
            jTextFieldNome.requestFocus();
            return;
        }
        if (cpfCnpj.equals("00000000000")
                || cpfCnpj.equals("11111111111")
                || cpfCnpj.equals("22222222222") || cpfCnpj.equals("33333333333")
                || cpfCnpj.equals("44444444444") || cpfCnpj.equals("55555555555")
                || cpfCnpj.equals("66666666666") || cpfCnpj.equals("77777777777")
                || cpfCnpj.equals("88888888888") || cpfCnpj.equals("99999999999")
                || (cpfCnpj.length() != 11)) {

            JOptionPane.showMessageDialog(this, "Informe o CPF/CNPJ corretos.");
            jTextFieldNome.requestFocus();
            return;
        }
        if (telefone.equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o telefone.");
            jTextFieldNome.requestFocus();
            return;
        }
        if (email.equals("")
                || !email.contains("@") && !email.contains(".com")
                || email.contains("@.com")
                || email.contains("@") && !email.contains(".com")
                || !email.contains("@") && email.contains(".com")) {
            JOptionPane.showMessageDialog(this, "Informe o email.");
            jTextFieldNome.requestFocus();
            return;
        }

        /**
         * Instância um novo Cliente com os dados do layout e tenta o UPDATE.
         */
        Cliente u = new Cliente(id, nome, tipoCliente, cpfCnpj, telefone, email, observacao);

        try {
            ClienteDao dao = new ClienteDao();
            dao.atualizar(u);
            JOptionPane.showMessageDialog(this, "Registro atualizado com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }

    }//GEN-LAST:event_jButtonSalvarDadosGeraisActionPerformed

    /*
    private void jButtonAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarSenhaActionPerformed

    }//GEN-LAST:event_jButtonAlterarSenhaActionPerformed
*/
    /**
     * jTextFieldIDActionPerformed: Recebe o ID do jTextFieldID e passa como
     * parâmetro para a função mostrar cliente.
     *
     * @param evt
     */
    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed

        String id = jTextFieldID.getText();

        if (!id.trim().equals("")) {
            this.mostrarCliente(id);
        } else {
            setarValoresZerados();
        }
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jFormattedTextFieldCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCpfCnpjActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteAlterar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ClienteAlterar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvarDadosGerais;
    private javax.swing.JComboBox<String> jComboBoxTipoCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpfCnpj;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabelCpfCnpj;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTipoCliente;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelDadosGerais;
    private javax.swing.JScrollPane jScrollPaneObs;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaObs;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
