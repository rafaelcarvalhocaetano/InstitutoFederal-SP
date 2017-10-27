package com.rb.view;

import com.rb.dao.FuncionarioDAO;
import com.rb.domain.FuncionariosRB;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael Carvalho
 */
public class ViewFuncionarios extends javax.swing.JFrame {

    public ViewFuncionarios() {
        initComponents();
        read();
    }
    private void read(){
        DefaultTableModel tbl = (DefaultTableModel) tblFuncionarios.getModel();
        tbl.setNumRows(0);
        
        FuncionarioDAO dao = new FuncionarioDAO();
        
        try {
            for(FuncionariosRB f: dao.listar()){
                tbl.addRow(new Object[]{
                    f.getId(),
                    f.getNome(),
                    f.getModelo(),
                    f.getData(),
                    f.getEntrada(),                    
                    f.getSaida(),
                    f.getObs()
                });
            }
        } catch (SQLException ex) {
            System.out.println("Erro no READ()");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMini = new javax.swing.JLabel();
        btnFechar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        entrada = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        modelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        saida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        obs = new javax.swing.JTextField();
        id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/img/icons8-Minus-30.png"))); // NOI18N
        btnMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMiniMouseClicked(evt);
            }
        });

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/img/icons8-Cancel-30.png"))); // NOI18N
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NOME");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ENTRADA");

        nome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nome.setSelectionColor(new java.awt.Color(0, 0, 0));

        entrada.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        entrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrada.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        entrada.setSelectionColor(new java.awt.Color(0, 0, 0));
        entrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entradaMouseClicked(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblFuncionarios.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "MODELO", "DATA", "HORÁRIO ENTRADA", "HORÁRIO SAÍDA", "OBS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFuncionarios.setGridColor(new java.awt.Color(0, 0, 0));
        tblFuncionarios.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tblFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncionariosMouseClicked(evt);
            }
        });
        tblFuncionarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblFuncionariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblFuncionarios);
        if (tblFuncionarios.getColumnModel().getColumnCount() > 0) {
            tblFuncionarios.getColumnModel().getColumn(0).setResizable(false);
            tblFuncionarios.getColumnModel().getColumn(1).setResizable(false);
            tblFuncionarios.getColumnModel().getColumn(2).setResizable(false);
            tblFuncionarios.getColumnModel().getColumn(4).setResizable(false);
            tblFuncionarios.getColumnModel().getColumn(5).setResizable(false);
            tblFuncionarios.getColumnModel().getColumn(6).setResizable(false);
        }

        btnSalvar.setBackground(new java.awt.Color(51, 51, 51));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(51, 51, 51));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("EXCLUIR");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/imgWrite/icons8-Ball Point Pen Filled-10.png"))); // NOI18N
        btnUpdate.setText("ATUALIZAR");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRelatorios.setBackground(new java.awt.Color(51, 51, 51));
        btnRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/imgWrite/icons8-Export Pdf-50.png"))); // NOI18N
        btnRelatorios.setText("RELATÓRIOS");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VEÍCULOS LEVE - RB");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA");

        try {
            data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        data.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataMouseClicked(evt);
            }
        });

        modelo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        modelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MODELO");

        saida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saidaMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SAÍDA");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("OBS");

        obs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        id.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMini)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nome)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modelo)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saida)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(obs)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRelatorios)
                                .addGap(440, 440, 440)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFechar)
                    .addComponent(btnMini))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(id))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(obs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        dispose();
    }//GEN-LAST:event_btnFecharMouseClicked

    private void btnMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiniMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMiniMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        FuncionarioDAO dao = new FuncionarioDAO();
        FuncionariosRB f = new FuncionariosRB();
        
        if(data.getText().isEmpty() || nome.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campos Obrigatórios", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        f.setNome(nome.getText());
        f.setModelo(modelo.getText());
        f.setData(data.getText());
        f.setEntrada(entrada.getText());
        f.setSaida(saida.getText());
        f.setObs(obs.getText());
        
        dao.create(f);
        read();
        
        nome.setText("");
        modelo.setText("");
        entrada.setText("");
        saida.setText("");
        obs.setText("");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataMouseClicked
        Date dataa = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        data.setText(formato.format(dataa));
    }//GEN-LAST:event_dataMouseClicked

    private void entradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entradaMouseClicked
       
        String hora = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
        entrada.setText(hora);
    }//GEN-LAST:event_entradaMouseClicked

    private void saidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saidaMouseClicked
        String hora = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
        saida.setText(hora);
    }//GEN-LAST:event_saidaMouseClicked

    private void tblFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncionariosMouseClicked
        
        if(tblFuncionarios.getSelectedRow() != -1){
            id.setText(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 0).toString());
            nome.setText(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 1).toString());
            modelo.setText(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 2).toString());
            //data.setText(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 3).toString());
            entrada.setText(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 4).toString());
            saida.setText(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 5).toString());
            obs.setText(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_tblFuncionariosMouseClicked

    private void tblFuncionariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblFuncionariosKeyReleased
        if(tblFuncionarios.getSelectedRow() != -1){
            id.setText(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 0).toString());
            nome.setText(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 1).toString());
            modelo.setText(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 2).toString());
            //data.setText(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 3).toString());
            entrada.setText(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 4).toString());
            saida.setText(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 5).toString());
            obs.setText(tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_tblFuncionariosKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(tblFuncionarios.getSelectedRow() != -1){
            
            FuncionarioDAO dao = new FuncionarioDAO();
            FuncionariosRB f = new FuncionariosRB();
            
            f.setId((Integer) tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 0));
            
            f.setNome(nome.getText());
            f.setModelo(modelo.getText());
            f.setData(data.getText());
            f.setEntrada(entrada.getText());
            f.setSaida(saida.getText());
            f.setObs(obs.getText());
            
            dao.update(f);
            read();           
        }        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(tblFuncionarios.getSelectedRow() != -1){
            
            FuncionarioDAO dao = new FuncionarioDAO();
            FuncionariosRB f = new FuncionariosRB();
            
            f.setId((Integer) tblFuncionarios.getValueAt(tblFuncionarios.getSelectedRow(), 0));
            
            f.setNome(nome.getText());
            f.setModelo(modelo.getText());
            f.setData(data.getText());
            f.setEntrada(entrada.getText());
            f.setSaida(saida.getText());
            f.setObs(obs.getText());
            
            int i;
            
            i = JOptionPane.showConfirmDialog(rootPane, "Deseja Excluir o Item Selecionado", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            if(i == JOptionPane.YES_OPTION){
                dao.delete(f);
                read();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel btnFechar;
    private javax.swing.JLabel btnMini;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JTextField entrada;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField obs;
    private javax.swing.JTextField saida;
    private javax.swing.JTable tblFuncionarios;
    // End of variables declaration//GEN-END:variables
}
