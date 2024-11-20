
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author adrielly.7257
 */
public class MatriculaAluno extends javax.swing.JFrame {

    /**
     * Creates new form MatriculaAluno
     */
    public MatriculaAluno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    String turno = " ";
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonTecnico = new javax.swing.JRadioButton();
        jRadioButtonTecnologo = new javax.swing.JRadioButton();
        jCheckBoxManha = new javax.swing.JCheckBox();
        jCheckBoxTarde = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxNoite = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxUnidade = new javax.swing.JComboBox<>();
        jButtonMatricula = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelCursoSele = new javax.swing.JLabel();
        jLabelDisponi = new javax.swing.JLabel();
        jLabelUnidade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("MATRICULA DE ALUNO");

        jLabel2.setText("Informe seu nome:");

        jLabel3.setText("Informe seu e-mail:");

        jLabel4.setText("Selecione o curso:");

        bg1.add(jRadioButtonTecnico);
        jRadioButtonTecnico.setText("Técnico");
        jRadioButtonTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTecnicoActionPerformed(evt);
            }
        });

        bg1.add(jRadioButtonTecnologo);
        jRadioButtonTecnologo.setText("Tecnólogo");

        jCheckBoxManha.setText("Manhã");
        jCheckBoxManha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxManhaActionPerformed(evt);
            }
        });

        jCheckBoxTarde.setText("Tarde");
        jCheckBoxTarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTardeActionPerformed(evt);
            }
        });

        jLabel5.setText("Selecione a disponibilidade:");

        jCheckBoxNoite.setText("Noite");
        jCheckBoxNoite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNoiteActionPerformed(evt);
            }
        });

        jLabel6.setText("Selecione a unidade:");

        jComboBoxUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma unidade", "Senac Centro", "Senac Portão" }));

        jButtonMatricula.setText("MATRICULAR");
        jButtonMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatriculaActionPerformed(evt);
            }
        });

        jButtonFechar.setText("FECHAR");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("RESULTADO");

        jLabelNome.setText("Nome:");

        jLabelEmail.setText("E-mail:");

        jLabelCursoSele.setText("Curso Selecionado:");

        jLabelDisponi.setText("Disponibilidade:");

        jLabelUnidade.setText("Unidade Selecionada:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jCheckBoxManha)
                        .addGap(42, 42, 42)
                        .addComponent(jCheckBoxTarde)
                        .addGap(37, 37, 37)
                        .addComponent(jCheckBoxNoite))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBoxUnidade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                            .addComponent(jLabel4))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDisponi)
                            .addComponent(jLabelCursoSele)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelUnidade))))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jRadioButtonTecnico)
                        .addGap(44, 44, 44)
                        .addComponent(jRadioButtonTecnologo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jButtonMatricula)
                .addGap(40, 40, 40)
                .addComponent(jButtonFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelCursoSele))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelDisponi))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonTecnico)
                    .addComponent(jRadioButtonTecnologo)
                    .addComponent(jLabelUnidade))
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxManha)
                    .addComponent(jCheckBoxTarde)
                    .addComponent(jCheckBoxNoite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMatricula)
                    .addComponent(jButtonFechar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonTecnicoActionPerformed

    private void jCheckBoxManhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxManhaActionPerformed
        
        if (jCheckBoxManha.isSelected()) {
            jCheckBoxTarde.setSelected(false);
            jCheckBoxNoite.setSelected(false);
            turno = "Manhã";
        } else {
            turno = "Escolha um turno";
        }
        
    }//GEN-LAST:event_jCheckBoxManhaActionPerformed

    private void jButtonMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatriculaActionPerformed
        // TODO add your handling code here:
        String nome = jTextFieldNome.getText();
        String email = jTextFieldEmail.getText();
        bg1.add(jRadioButtonTecnico);
        bg1.add(jRadioButtonTecnologo);
        String mensagem = " ";
        
        if (jRadioButtonTecnico.isSelected()){
            mensagem = "Curso Técnico";  
        }
        else if (jRadioButtonTecnologo.isSelected()){
               mensagem = "Curso Tecnológo";  
        }
        else
        {
            mensagem = "Escolha um curso"; 
        }
        
        jLabelNome.setText("Nome: " + nome);
        jLabelEmail.setText("Email: " + email);
        jLabelCursoSele.setText("Curso Selecionado: " + mensagem);
        jLabelDisponi.setText("Disponibilidade: " + turno);
        jLabelUnidade.setText(jComboBoxUnidade.getSelectedItem().toString());
        
    }//GEN-LAST:event_jButtonMatriculaActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jCheckBoxTardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTardeActionPerformed
        if (jCheckBoxTarde.isSelected()) {
            jCheckBoxManha.setSelected(false);
            jCheckBoxNoite.setSelected(false);
            turno = "Tarde";
        } else {
            turno = "Escolha um turno";
        }
        
    }//GEN-LAST:event_jCheckBoxTardeActionPerformed

    private void jCheckBoxNoiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNoiteActionPerformed
        if (jCheckBoxNoite.isSelected()) {
            jCheckBoxManha.setSelected(false);
            jCheckBoxTarde.setSelected(false);
            turno = "Noite";
        } else {
            turno = "Escolha um turno";
        }
        
    }//GEN-LAST:event_jCheckBoxNoiteActionPerformed

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
            java.util.logging.Logger.getLogger(MatriculaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatriculaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatriculaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatriculaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatriculaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg1;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonMatricula;
    private javax.swing.JCheckBox jCheckBoxManha;
    private javax.swing.JCheckBox jCheckBoxNoite;
    private javax.swing.JCheckBox jCheckBoxTarde;
    private javax.swing.JComboBox<String> jComboBoxUnidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCursoSele;
    private javax.swing.JLabel jLabelDisponi;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelUnidade;
    private javax.swing.JRadioButton jRadioButtonTecnico;
    private javax.swing.JRadioButton jRadioButtonTecnologo;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
