/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PadariaTremBao.view;

import PadariaTremBao.controller.ClienteController;
import PadariaTremBao.controller.VendedorController;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Paulo
 */
public class CadastrarCliente extends javax.swing.JFrame {

    private ClienteController controller;
    /**
     * Creates new form CadastrarCliente
     */
    public CadastrarCliente(VendedorController vController) {
        initComponents();
        controller = new ClienteController(this, vController);
    }

    private CadastrarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_documento = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_rua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_numero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_bairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_cidade = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_telefone = new javax.swing.JFormattedTextField();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setAlwaysOnTop(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(100, 100, 100));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Cadastro de clientes");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 0, 190, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 30, 60, 17);

        txt_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_nome);
        txt_nome.setBounds(30, 50, 330, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Documento");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 90, 90, 17);

        txt_documento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txt_documento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_documento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_documento.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        txt_documento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_documento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_documentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_documentoFocusLost(evt);
            }
        });
        jPanel1.add(txt_documento);
        txt_documento.setBounds(40, 110, 150, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Telefone");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 90, 59, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Endereço");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 150, 80, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Rua");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 180, 40, 17);

        txt_rua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_rua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_rua);
        txt_rua.setBounds(90, 180, 140, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Número");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(240, 180, 70, 17);

        txt_numero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_numero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_numero);
        txt_numero.setBounds(310, 180, 50, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Bairro");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 220, 50, 17);

        txt_bairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_bairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_bairro);
        txt_bairro.setBounds(90, 220, 140, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Cidade");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 260, 50, 14);

        txt_estado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_estado);
        txt_estado.setBounds(310, 220, 50, 25);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Estado");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(240, 220, 60, 17);

        txt_cidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_cidade);
        txt_cidade.setBounds(90, 260, 140, 25);

        btn_salvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salvar);
        btn_salvar.setBounds(80, 320, 80, 30);

        btn_cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar);
        btn_cancelar.setBounds(200, 320, 90, 30);

        txt_telefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txt_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_telefone.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        txt_telefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_telefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_telefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_telefoneFocusLost(evt);
            }
        });
        jPanel1.add(txt_telefone);
        txt_telefone.setBounds(240, 110, 120, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_documentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_documentoFocusGained
        // TODO add your handling code here:
        txt_documento.setText("");
    }//GEN-LAST:event_txt_documentoFocusGained

    private void txt_documentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_documentoFocusLost
        // TODO add your handling code here:
        if(txt_documento.getText().trim().length()<14){
            txt_documento.setText("");
        }else{
            controller.procurarCliente();
        }
    }//GEN-LAST:event_txt_documentoFocusLost

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        // TODO add your handling code here:
        controller.cadastrarCliente();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void txt_telefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_telefoneFocusGained
        // TODO add your handling code here:
        txt_telefone.setText("");
    }//GEN-LAST:event_txt_telefoneFocusGained

    private void txt_telefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_telefoneFocusLost
        // TODO add your handling code here:
        if(txt_telefone.getText().trim().length()<14){
            txt_telefone.setText("");
        }
    }//GEN-LAST:event_txt_telefoneFocusLost

    public void exibirMensagem(String mensagem){
        JOptionPane.showMessageDialog(this, mensagem);
    }
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
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCliente().setVisible(true);
            }
        });
    }

    public ClienteController getController() {
        return controller;
    }

    public void setController(ClienteController controller) {
        this.controller = controller;
    }

    public JButton getBtn_cancelar() {
        return btn_cancelar;
    }

    public void setBtn_cancelar(JButton btn_cancelar) {
        this.btn_cancelar = btn_cancelar;
    }

    public JButton getBtn_salvar() {
        return btn_salvar;
    }

    public void setBtn_salvar(JButton btn_salvar) {
        this.btn_salvar = btn_salvar;
    }

    public JTextField getTxt_bairro() {
        return txt_bairro;
    }

    public void setTxt_bairro(JTextField txt_bairro) {
        this.txt_bairro = txt_bairro;
    }

    public JTextField getTxt_cidade() {
        return txt_cidade;
    }

    public void setTxt_cidade(JTextField txt_cidade) {
        this.txt_cidade = txt_cidade;
    }

    public JFormattedTextField getTxt_documento() {
        return txt_documento;
    }

    public void setTxt_documento(JFormattedTextField txt_documento) {
        this.txt_documento = txt_documento;
    }

    public JTextField getTxt_estado() {
        return txt_estado;
    }

    public void setTxt_estado(JTextField txt_estado) {
        this.txt_estado = txt_estado;
    }

    public JTextField getTxt_nome() {
        return txt_nome;
    }

    public void setTxt_nome(JTextField txt_nome) {
        this.txt_nome = txt_nome;
    }

    public JTextField getTxt_numero() {
        return txt_numero;
    }

    public void setTxt_numero(JTextField txt_numero) {
        this.txt_numero = txt_numero;
    }

    public JTextField getTxt_rua() {
        return txt_rua;
    }

    public void setTxt_rua(JTextField txt_rua) {
        this.txt_rua = txt_rua;
    }

    public JFormattedTextField getTxt_telefone() {
        return txt_telefone;
    }

    public void setTxt_telefone(JFormattedTextField txt_telefone) {
        this.txt_telefone = txt_telefone;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JFormattedTextField txt_documento;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_rua;
    private javax.swing.JFormattedTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}