import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author adrielly.7257
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private Connection conn;
    
    public Main() {
        initComponents();
        conectarBD();
    }
    
    private void conectarBD() {
        try {
            String url = "jdbc:mysql://projeto.csst1irsxxi6.us-east-1.rds.amazonaws.com/projeto";
            String usuario = "admin";  // Substitua pelo seu usuário
            String senha = "senac#2024";        // Substitua pela sua senha

            conn = DriverManager.getConnection(url, usuario, senha);
            JOptionPane.showMessageDialog(this, "Conexão ao banco de dados estabelecida.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldDisciplina = new javax.swing.JTextField();
        jTextFieldPeriodo = new javax.swing.JTextField();
        jTextFieldNota1 = new javax.swing.JTextField();
        jTextFieldNota2 = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jButtonResultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("PORTAL DO ALUNO");

        jLabel3.setText("Id:");

        jLabel4.setText("Nome:");

        jLabel5.setText("Disciplina:");

        jLabel6.setText("Período:");

        jLabel7.setText("Nota 1º:");

        jLabel8.setText("Nota 2º:");

        jButtonCadastrar.setText("CADASTRAR");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("ATUALIZAR");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("BUSCAR DISCIPLINA");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonApagar.setText("APAGAR");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jButtonResultado.setText("RESULTADO");
        jButtonResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldDisciplina)
                                .addComponent(jTextFieldPeriodo)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldNota1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                        .addComponent(jTextFieldNota2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCadastrar)
                        .addGap(45, 45, 45)
                        .addComponent(jButtonAtualizar)
                        .addGap(50, 50, 50)
                        .addComponent(jButtonApagar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButtonResultado)
                        .addGap(45, 45, 45)
                        .addComponent(jButtonBuscar)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonApagar))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonResultado)
                    .addComponent(jButtonBuscar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        try {
            String sql = "INSERT INTO adrielly (nome, disciplina, periodo, nota1, nota2) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, jTextFieldNome.getText());
            stmt.setString(2, jTextFieldDisciplina.getText());
            stmt.setString(3, jTextFieldPeriodo.getText());
            stmt.setString(4, jTextFieldNota1.getText());
            stmt.setString(5, jTextFieldNota2.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar aluno: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try {
            String sql = "SELECT nome, disciplina, nota1, nota2 FROM adrielly WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(jTextFieldId.getText()));
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                jTextFieldNome.setText(rs.getString("nome"));
                jTextFieldDisciplina.setText(rs.getString("disciplina"));
                jTextFieldNota1.setText(rs.getString("nota1"));
                jTextFieldNota2.setText(rs.getString("nota2"));
            } else {
                JOptionPane.showMessageDialog(this, "Disciplina não encontrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao buscar disciplina: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResultadoActionPerformed
         
        String status = "";
        double nota1 = Integer.parseInt(jTextFieldNota1.getText());
        double nota2 = Integer.parseInt(jTextFieldNota2.getText());
        
        double media = (nota1 + nota2) / 2;
        
        if (media >= 7){
            status = "Aprovado";
            JOptionPane.showMessageDialog(this, "Média: " + media + " Status: " + status);
        } else if (media < 4){
            status = "Reprovado";
            JOptionPane.showMessageDialog(this, "Média: " + media + " Status: " + status);
        } else {
            status = "Recuperação";
            JOptionPane.showMessageDialog(this, "Média: " + media + " Status: " + status);
        }
        
    }//GEN-LAST:event_jButtonResultadoActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        try {
            String sql = "UPDATE adrielly SET nome = ?, disciplina = ?, periodo = ?, nota1 = ?, nota2 = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, jTextFieldNome.getText());
            stmt.setString(2, jTextFieldDisciplina.getText());
            stmt.setString(3, jTextFieldPeriodo.getText());
            stmt.setString(4, jTextFieldNota1.getText());
            stmt.setString(5, jTextFieldNota2.getText());
            stmt.setInt(6, Integer.parseInt(jTextFieldId.getText()));
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Aluno atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao atualizar aluno: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        try {
            String sql = "DELETE FROM adrielly WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(jTextFieldId.getText()));
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Aluno excluído com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao excluir aluno: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonResultado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldDisciplina;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNota1;
    private javax.swing.JTextField jTextFieldNota2;
    private javax.swing.JTextField jTextFieldPeriodo;
    // End of variables declaration//GEN-END:variables
}
