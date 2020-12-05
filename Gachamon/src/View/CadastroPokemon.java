package View;

import gachamon.ConnectionJDBC;
import gachamon.Pokemon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroPokemon extends javax.swing.JFrame {

    Connection con = ConnectionJDBC.getConnection();
    Pokemon NovoPokemon = new Pokemon();
    
    String addPokemon = "insert into novo_pokemon(pokemon, descricao) values(?,?)";

    public CadastroPokemon() {
        initComponents();
    }
    
    private void CadastrarPokemon(Pokemon NovoPokemon){
        
        NovoPokemon.setPokemon(txtPokemon.getText());
        NovoPokemon.setDescricao(txtDescricao.getText());
        
        
        try {
            PreparedStatement prst = con.prepareStatement(addPokemon);
            prst.setString(1, NovoPokemon.getPokemon());
            prst.setString(2, NovoPokemon.getDescricao());
           
            prst.executeUpdate();          
            
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar Pokemon " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Pokemon");
            
        } finally{            
            JOptionPane.showMessageDialog(null, "Pokemon cadastrado com sucesso");
        }                
    } 
    
    private void LimparCampo(){
        txtPokemon.setText("");
        txtDescricao.setText("");
    
    }
    private void BuscarPokemon(Pokemon NovoPokemon){
        String ConsultaPokemon = this.ConsultaPokemon.getText();
        
        Connection con = ConnectionJDBC.getConnection();
        PreparedStatement prst = null;
        try {
            prst = con.prepareStatement("select * from novo_pokemon where pokemon = ?");
            prst.setString(1, ConsultaPokemon);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Pokemon não encontrado!");;
        }
        ResultSet rs = null;
        try {
            rs = prst.executeQuery();
            rs.next();
                if(rs.getString("pokemon").equals(ConsultaPokemon)){
                ConsultaPokemon2.setText(rs.getString("pokemon"));
                ConsultaDescricao.setText(rs.getString("descricao"));
                }
                else{
                JOptionPane.showMessageDialog(null, "Pokemon não encontrado!");
           }
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Pokemon não encontrado!");
        }                  
           
    }
    
    private void LimparCampo2(){
        ConsultaPokemon.setText("");
    
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPokemon = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        buttonCadastrar = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ConsultaPokemon = new javax.swing.JTextField();
        butoonBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        ConsultaPokemon2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ConsultaDescricao = new javax.swing.JTextField();
        buttonLimpar2 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(822, 427));

        jTabbedPane4.setMaximumSize(new java.awt.Dimension(627, 469));
        jTabbedPane4.setMinimumSize(new java.awt.Dimension(627, 469));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Cadastrar Novo Pokemon");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel2.setText("Pokemon:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 104, -1, -1));

        jLabel3.setText("Descrição:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 171, -1, -1));

        txtPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPokemonActionPerformed(evt);
            }
        });
        jPanel3.add(txtPokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 231, -1));

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        jPanel3.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 432, -1));

        buttonCadastrar.setBackground(new java.awt.Color(255, 255, 102));
        buttonCadastrar.setText("Cadastrar Pokemon");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });
        jPanel3.add(buttonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 265, -1, 38));

        buttonLimpar.setBackground(new java.awt.Color(153, 204, 255));
        buttonLimpar.setText("Limpar Campos");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });
        jPanel3.add(buttonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 265, 174, 38));

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 50, 40));

        jTabbedPane4.addTab("Novo Pokemon", jPanel3);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setText("Pesquisar:");

        butoonBuscar.setText("GO!");
        butoonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoonBuscarActionPerformed(evt);
            }
        });

        jLabel6.setText("Pokemon:");

        ConsultaPokemon2.setEditable(false);
        ConsultaPokemon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaPokemon2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Descrição:");

        ConsultaDescricao.setEditable(false);
        ConsultaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaDescricaoActionPerformed(evt);
            }
        });

        buttonLimpar2.setText("Limpar");
        buttonLimpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(ConsultaPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butoonBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(buttonLimpar2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConsultaPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsultaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ConsultaPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butoonBuscar)
                    .addComponent(buttonLimpar2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ConsultaPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ConsultaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(260, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Consultar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(637, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPokemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPokemonActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        CadastrarPokemon(NovoPokemon);
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        LimparCampo();
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void ConsultaPokemon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaPokemon2ActionPerformed
        
    }//GEN-LAST:event_ConsultaPokemon2ActionPerformed

    private void buttonLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpar2ActionPerformed
        LimparCampo2();
    }//GEN-LAST:event_buttonLimpar2ActionPerformed

    private void butoonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoonBuscarActionPerformed
        BuscarPokemon(NovoPokemon);
    }//GEN-LAST:event_butoonBuscarActionPerformed

    private void ConsultaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultaDescricaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConsultaDescricao;
    private javax.swing.JTextField ConsultaPokemon;
    private javax.swing.JTextField ConsultaPokemon2;
    private javax.swing.JButton butoonBuscar;
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonLimpar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtPokemon;
    // End of variables declaration//GEN-END:variables
}
