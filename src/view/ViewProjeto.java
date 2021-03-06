package view;

// Sessão de importação.
import controller.ControllerProjeto;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Projeto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User;
import utils.DocumentoLimitado;

/**
 * Classe que define a tela ~ Projeto.
 * @author Vinicius Tavano Ferreira.
 * @since Classe criada em 07/09/2017.
 */
public class ViewProjeto extends javax.swing.JFrame {

    private List<Projeto> projetos;
    private Projeto projeto;
    private final User user;

    /**
     * Creates new form FormProjeto
     * @param user
     */
    public ViewProjeto(User user) {
        initComponents();
        this.user = user;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        setLocation(400, 100);//(x,y)
        setLocationRelativeTo(null);
        tfCodigo.setEditable(true);
        this.atualizarTabela();
        this.btExcluir.setEnabled(false);
        this.btLimpar.setEnabled(false);
        tfNome.setDocument(new DocumentoLimitado(11));
    }

    private ViewProjeto() {
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

        painelProjeto = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbModeloProcesso = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        cbModeloProcesso = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProjeto = new javax.swing.JTable();
        painelBotoes = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btMenu = new javax.swing.JButton();
        btListagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(204, 255, 51));
        setLocation(new java.awt.Point(400, 100));
        setResizable(false);

        painelProjeto.setBackground(new java.awt.Color(255, 255, 255));
        painelProjeto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Projeto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N

        lbCodigo.setForeground(new java.awt.Color(0, 153, 255));
        lbCodigo.setText("Código:");

        lbNome.setForeground(new java.awt.Color(0, 153, 255));
        lbNome.setText("Nome:");

        lbModeloProcesso.setForeground(new java.awt.Color(0, 153, 255));
        lbModeloProcesso.setText("Modelo de processo:");

        tfCodigo.setBackground(new java.awt.Color(227, 218, 218));
        tfCodigo.setFocusable(false);

        cbModeloProcesso.setBackground(new java.awt.Color(255, 255, 204));
        cbModeloProcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XP", "Crystal", "FDD", "Waterfall", "RUP", "RAD", "Prototipação", "Incremental", "Espiral" }));
        cbModeloProcesso.setSelectedIndex(-1);
        cbModeloProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModeloProcessoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelProjetoLayout = new javax.swing.GroupLayout(painelProjeto);
        painelProjeto.setLayout(painelProjetoLayout);
        painelProjetoLayout.setHorizontalGroup(
            painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProjetoLayout.createSequentialGroup()
                        .addGroup(painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCodigo)
                            .addComponent(lbNome))
                        .addGap(79, 79, 79)
                        .addGroup(painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbModeloProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbModeloProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelProjetoLayout.setVerticalGroup(
            painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProjetoLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbModeloProcesso)
                    .addComponent(cbModeloProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbProjeto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbProjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Modelo proc."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
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
        tbProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProjetoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProjeto);
        if (tbProjeto.getColumnModel().getColumnCount() > 0) {
            tbProjeto.getColumnModel().getColumn(0).setMinWidth(60);
            tbProjeto.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        painelBotoes.setBackground(new java.awt.Color(255, 255, 255));
        painelBotoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(0, 153, 255));
        btSalvar.setText("Salvar");
        btSalvar.setToolTipText("Incluir ou modificar um projeto");
        btSalvar.setName("btSalvar"); // NOI18N
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(0, 153, 255));
        btExcluir.setText("Excluir");
        btExcluir.setToolTipText("Deletar um projeto");
        btExcluir.setName("btSalvar"); // NOI18N
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(0, 153, 255));
        btLimpar.setText("Limpar");
        btLimpar.setToolTipText("Limpar os campos da tela");
        btLimpar.setName("btSalvar"); // NOI18N
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btMenu.setForeground(new java.awt.Color(0, 153, 255));
        btMenu.setText("Voltar");
        btMenu.setToolTipText("Voltar à tela de menu");
        btMenu.setName("btSalvar"); // NOI18N
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });

        btListagem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btListagem.setForeground(new java.awt.Color(0, 153, 255));
        btListagem.setText("Listagem");
        btListagem.setToolTipText("Listar todos os projetos");
        btListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btListagem)
                .addGap(26, 26, 26)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar)
                    .addComponent(btMenu)
                    .addComponent(btListagem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelProjeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(495, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        this.salvarProjeto();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tbProjetoVetoableChange(java.beans.PropertyChangeEvent evt) throws java.beans.PropertyVetoException {
        System.out.println("Printando");
    }

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        this.removerProjeto();
        this.limparCampos();
        this.atualizarTabela();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        //Invoca a tela ~ Cockpit.
        new ViewMenu(this.user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btMenuActionPerformed

    private void tbProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProjetoMouseClicked
        int row = this.tbProjeto.getSelectedRow();
        this.projeto = this.projetos.get(row);
        this.popularCampos();
    }//GEN-LAST:event_tbProjetoMouseClicked

    private void btListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListagemActionPerformed
        ResultSet rs;
        String listagem = "Código\tNome do Projeto\tEtapa";
        listagem = listagem + "\n======================================================================";
        try {
            rs = ControllerProjeto.buscarTodosProjetos();
            while (rs.next()) {
                listagem = listagem + "\n"
                        + rs.getString("codigo") + "\t"
                        + rs.getString("nome") + "\t\t"
                        + rs.getString("etapa");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewProjeto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
        ViewListagem flp = new ViewListagem(listagem, this, true);
        flp.setVisible(true);

    }//GEN-LAST:event_btListagemActionPerformed

    private void cbModeloProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbModeloProcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbModeloProcessoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListagem;
    private javax.swing.JButton btMenu;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbModeloProcesso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbModeloProcesso;
    private javax.swing.JLabel lbNome;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelProjeto;
    private javax.swing.JTable tbProjeto;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    private void salvarProjeto() {
        if (!isCamposValidos()) {
            return;
        }
        
        Integer codigo = tfCodigo.getText().isEmpty() ? null : Integer.parseInt(tfCodigo.getText());
        String nome = this.tfNome.getText();
        String etapa = (String) this.cbModeloProcesso.getSelectedItem();

        if (this.projeto == null) {
            this.projeto = new Projeto();
        }
        this.projeto.setCodigo(codigo);
        this.projeto.setNome(nome);
        this.projeto.setEtapa(etapa);

        try {
            ControllerProjeto.inserirProjeto(this.projeto);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ViewProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.limparCampos();
        this.atualizarTabela();
    }

    private void removerProjeto() {
        Integer codProjeto = Integer.parseInt(tfCodigo.getText());
        try {
            ControllerProjeto.excluirProjeto(codProjeto);
        } catch (SQLException ex) {
            Logger.getLogger(ViewProjeto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.limparCampos();
    }
  
    private void limparCampos() {
        this.tfCodigo.setText("");
        this.tfNome.setText("");
        this.cbModeloProcesso.setSelectedIndex(-1);

        this.tfCodigo.setEnabled(true);
        this.btExcluir.setEnabled(false);
        this.btLimpar.setEnabled(false);

    }

    private boolean isCamposValidos() {
        boolean isValido = false;

        if (this.tfNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome é obrigatório");
        } else if (this.cbModeloProcesso.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(this, "Etapa é obrigatório");
        } else {
            isValido = true;
        }
        return isValido;
    }

    private void atualizarTabela() {
        String[] colunas = {"Codigo", "Nome", "Modelo proc."};
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(colunas);

        try {
            this.projetos = ControllerProjeto.lista();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        for (Projeto p : this.projetos) {
            tableModel.addRow(p.getValueAsObject());
        }
        this.tbProjeto.setModel(tableModel);
    }

    private void popularCampos() {

        if (this.projeto != null) {
            this.tfCodigo.setText(this.projeto.getCodigo().toString());
            this.tfNome.setText(this.projeto.getNome());
            this.cbModeloProcesso.setSelectedItem(this.projeto.getEtapa());
        }
        
        this.btExcluir.setEnabled(true);
        this.btLimpar.setEnabled(true);
        this.tfCodigo.setEnabled(false);
    }

}//fim do ViewProjeto
