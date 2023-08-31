package visao.cliente;

import controlador.ClienteDao;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 *
 * @author Marcelo Borth
 */
public class ClienteCadastrar extends javax.swing.JFrame {

    public ClienteCadastrar() {
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
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jLabelTipoCliente = new javax.swing.JLabel();
        jComboBoxTipoCliente = new javax.swing.JComboBox<>();
        jLabelCpfCnpj = new javax.swing.JLabel();
        jTextFieldCpfCnpj = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObs = new javax.swing.JTextArea();
        jLabelObs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 10, 292, -1));

        jLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNome.setText("Nome:");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 37, 20));
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 220, -1));

        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setMaximumSize(new java.awt.Dimension(103, 39));
        jButtonCadastrar.setMinimumSize(new java.awt.Dimension(103, 39));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 130, -1));

        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/limpar.png"))); // NOI18N
        jButtonLimpar.setText("Limpar");
        getContentPane().add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 360, 130, -1));

        jLabelTipoCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTipoCliente.setText("Tipo:");
        getContentPane().add(jLabelTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 30, -1));

        jComboBoxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Jurídica", "Pessoa Física" }));
        getContentPane().add(jComboBoxTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, -1));

        jLabelCpfCnpj.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCpfCnpj.setText("CPF/CNPJ:");
        getContentPane().add(jLabelCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        jTextFieldCpfCnpj.setToolTipText("");
        jTextFieldCpfCnpj.setName(""); // NOI18N
        jTextFieldCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCpfCnpjActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 220, -1));

        jLabelTelefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTelefone.setText("Telefone:");
        getContentPane().add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, 20));
        getContentPane().add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 220, -1));

        jLabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEmail.setText("Email:");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 50, 20));
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 220, -1));

        jTextAreaObs.setColumns(20);
        jTextAreaObs.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObs);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 272, 97));

        jLabelObs.setText("Observação:");
        getContentPane().add(jLabelObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        setSize(new java.awt.Dimension(366, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

        String nome = jTextFieldNome.getText();
        Integer tipoCliente = (jComboBoxTipoCliente.getSelectedItem().equals("Pessoa Jurídica")) ? 0 : 1;
        String cpfCnpj = jTextFieldCpfCnpj.getText();
        String telefone = jTextFieldTelefone.getText();
        String email = jTextFieldEmail.getText();
        String observacao = jTextAreaObs.getText();

        //Validações
        if (nome.equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o nome.");
            jTextFieldNome.requestFocus();
            return;
        }
        if (email.equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o email.");
            jTextFieldEmail.requestFocus();
            return;
        }

        //Verificar se email é válido
        Cliente u = new Cliente(null, nome, tipoCliente, cpfCnpj, telefone, email, observacao);

        try {
            ClienteDao dao = new ClienteDao();
            dao.inserir(u);

            JOptionPane.showMessageDialog(this, "Registro inserido com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }

    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCpfCnpjActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JComboBox<String> jComboBoxTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCpfCnpj;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTipoCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObs;
    private javax.swing.JTextField jTextFieldCpfCnpj;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
