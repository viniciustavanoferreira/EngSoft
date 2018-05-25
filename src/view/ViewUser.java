package view;

//Sessão de importação.
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utils.DocumentoLimitado;
import model.DAOUser;
import controller.ControllerUser;
import model.User;

/**
 * Classe que define a tela ~ Acesso.
 * @author Vinicius Tavano Ferreira
 * @since Classe criada em 20/08/2017
 */
public class ViewUser extends javax.swing.JFrame {
    DAOUser connect = new DAOUser();
    User user = new User();
    
      
    /**
     * Creates new form Acess
     */ 
    public ViewUser() {
        initComponents();
        
        tfUsuario.setDocument(new DocumentoLimitado(44));
        tfSenha.setDocument(new DocumentoLimitado(26));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCabLogon = new javax.swing.JPanel();
        painelLogon = new javax.swing.JPanel();
        tfUsuario = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        btEntrar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btFechar = new javax.swing.JButton();
        lblTituloLogon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbTituloGSTI = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso ~ Sistema");
        setBackground(new java.awt.Color(204, 204, 255));
        setResizable(false);

        painelCabLogon.setBackground(new java.awt.Color(245, 245, 245));
        painelCabLogon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelLogon.setBackground(new java.awt.Color(255, 255, 255));
        painelLogon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        tfUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tfUsuario.setForeground(new java.awt.Color(102, 102, 102));
        tfUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tfUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfUsuario.setMargin(new java.awt.Insets(2, 4, 2, 2));
        tfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUsuarioMouseClicked(evt);
            }
        });
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });

        tfSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tfSenha.setForeground(new java.awt.Color(102, 102, 102));
        tfSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tfSenha.setMargin(new java.awt.Insets(2, 4, 2, 2));
        tfSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfSenhaMouseClicked(evt);
            }
        });
        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });

        btEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(0, 153, 255));
        btEntrar.setText("Entrar");
        btEntrar.setToolTipText("Realiza acesso");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 153, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsuario.setText("Usuário:");

        lblSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 153, 255));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSenha.setText("Senha:");

        btFechar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btFechar.setForeground(new java.awt.Color(0, 153, 255));
        btFechar.setText("Fechar");
        btFechar.setToolTipText("Fecha aplicação");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        lblTituloLogon.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblTituloLogon.setForeground(new java.awt.Color(0, 153, 255));
        lblTituloLogon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTituloLogon.setText("LOGON");

        javax.swing.GroupLayout painelLogonLayout = new javax.swing.GroupLayout(painelLogon);
        painelLogon.setLayout(painelLogonLayout);
        painelLogonLayout.setHorizontalGroup(
            painelLogonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLogonLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(lblTituloLogon, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelLogonLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelLogonLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelLogonLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btEntrar)
                .addGap(11, 11, 11)
                .addComponent(btFechar))
        );
        painelLogonLayout.setVerticalGroup(
            painelLogonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLogonLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTituloLogon)
                .addGap(9, 9, 9)
                .addGroup(painelLogonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLogonLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblUsuario))
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painelLogonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLogonLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblSenha))
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painelLogonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEntrar)
                    .addComponent(btFechar)))
        );

        painelCabLogon.add(painelLogon, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 350, 180));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloGSTI.setFont(new java.awt.Font("Segoe UI Light", 0, 26)); // NOI18N
        lbTituloGSTI.setForeground(new java.awt.Color(0, 153, 255));
        lbTituloGSTI.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTituloGSTI.setText("EngSoft ~ Desenv. de software sob IEEE 12207       ");

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloGSTI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbTituloGSTI)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelCabLogon, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCabLogon, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        setSize(new java.awt.Dimension(606, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btFecharActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        ResultSet rs;
        String codUser = (String)this.tfUsuario.getText().toUpperCase();
        String codPassword = (String)this.tfSenha.getText().toUpperCase();
        if(this.tfUsuario.getText().equals("")||(this.tfSenha.getText().equals(""))){
            JOptionPane.showMessageDialog(null,"Preencher os campos usuário e senha corretamente.");
            this.tfUsuario.setText("");
            this.tfSenha.setText("");
        }
        else{
            try{
                rs = ControllerUser.getCodUserPassUsuario(codUser, codPassword);
                
                if(rs != null){
                    String test = rs.getString("CODUSER");
                    this.user.setCodUser(rs.getString("CODUSER"));
                    this.user.setDescName(rs.getString("DESCNAME"));

                    //Invoca a tela ~ Cockpit.
                    new ViewMenu(this.user).setVisible(true);

                    this.dispose();
                    rs.close();
                }
                else{
                    this.tfUsuario.setText("");
                    this.tfSenha.setText("");
                }
            }
            catch(SQLException e){
                Logger.getLogger(ViewUser.class.getName()).log(Level.SEVERE, null, e);

            }

        }
    }//GEN-LAST:event_btEntrarActionPerformed

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSenhaActionPerformed

    private void tfSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSenhaMouseClicked

    }//GEN-LAST:event_tfSenhaMouseClicked

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void tfUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsuarioMouseClicked

    }//GEN-LAST:event_tfUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(ViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
            new ViewUser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btFechar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbTituloGSTI;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTituloLogon;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel painelCabLogon;
    private javax.swing.JPanel painelLogon;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

}
