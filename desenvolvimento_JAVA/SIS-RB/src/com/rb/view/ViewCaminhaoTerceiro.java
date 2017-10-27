package com.rb.view;

import com.rb.dao.CaminhaoTerDAO;
import com.rb.domain.CaminhaoT;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael Carvalho
 */
public class ViewCaminhaoTerceiro extends javax.swing.JFrame {

    public ViewCaminhaoTerceiro() {
        initComponents();
        read();
    }
    
     private void read(){
        DefaultTableModel tbl = (DefaultTableModel) tblCTerceiro.getModel();
        tbl.setNumRows(0);
        
         CaminhaoTerDAO dao = new CaminhaoTerDAO();
        
        try {
            for(CaminhaoT rb: dao.listar()){
                tbl.addRow(new Object[]{
                    rb.getId(),
                    rb.getCavalo(),
                    rb.getCarreta(),
                    rb.getNome(),
                    rb.getData(),
                    rb.getEntrada(),
                    rb.getComoentrada(),
                    rb.getSaida(),
                    rb.getComosaida(),                    
                    rb.getRg(),
                    rb.getEmpresa()
                    
                });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Erro no READ()");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMini = new javax.swing.JLabel();
        btnFechar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cavalo = new javax.swing.JFormattedTextField();
        nome = new javax.swing.JTextField();
        combo2 = new javax.swing.JComboBox<>();
        empresa = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        saida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCTerceiro = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        entrada = new javax.swing.JTextField();
        btnRelatorios = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        carreta = new javax.swing.JTextField();
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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CAVALO");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NOME");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SAÍDA");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ENTRADA");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EMPRESA");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("RG");

        try {
            cavalo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAA-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cavalo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cavalo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cavalo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cavalo.setPreferredSize(new java.awt.Dimension(6, 20));
        cavalo.setSelectionColor(new java.awt.Color(0, 0, 0));

        nome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nome.setSelectionColor(new java.awt.Color(0, 0, 0));

        combo2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "V" }));

        empresa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        empresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        empresa.setSelectionColor(new java.awt.Color(0, 0, 0));

        rg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rg.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        rg.setSelectionColor(new java.awt.Color(0, 0, 0));

        saida.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        saida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        saida.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        saida.setSelectionColor(new java.awt.Color(0, 0, 0));
        saida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saidaMouseClicked(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblCTerceiro.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblCTerceiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Placa", "Carreta/Modelo", "Nome", "Data", "Entrada", "Carreg. / Vazio", "Saída", "Carreg. / Vazio", "RG", "Empresa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCTerceiro.setGridColor(new java.awt.Color(0, 0, 0));
        tblCTerceiro.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tblCTerceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCTerceiroMouseClicked(evt);
            }
        });
        tblCTerceiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCTerceiroKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblCTerceiro);
        if (tblCTerceiro.getColumnModel().getColumnCount() > 0) {
            tblCTerceiro.getColumnModel().getColumn(0).setResizable(false);
            tblCTerceiro.getColumnModel().getColumn(1).setResizable(false);
            tblCTerceiro.getColumnModel().getColumn(2).setResizable(false);
            tblCTerceiro.getColumnModel().getColumn(3).setResizable(false);
            tblCTerceiro.getColumnModel().getColumn(4).setResizable(false);
            tblCTerceiro.getColumnModel().getColumn(5).setResizable(false);
            tblCTerceiro.getColumnModel().getColumn(6).setResizable(false);
            tblCTerceiro.getColumnModel().getColumn(7).setResizable(false);
            tblCTerceiro.getColumnModel().getColumn(8).setResizable(false);
            tblCTerceiro.getColumnModel().getColumn(9).setResizable(false);
            tblCTerceiro.getColumnModel().getColumn(10).setResizable(false);
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

        entrada.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        entrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entradaMouseClicked(evt);
            }
        });

        btnRelatorios.setBackground(new java.awt.Color(51, 51, 51));
        btnRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/imgWrite/icons8-Export Pdf-50.png"))); // NOI18N
        btnRelatorios.setText("RELATÓRIOS");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CARRETA");

        combo1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "V" }));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VEÍCULOS TERCEIRO - CAMINHÕES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(25, Short.MAX_VALUE))
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
        data.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataMouseClicked(evt);
            }
        });

        carreta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        carreta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        id.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cavalo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(carreta)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nome)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(saida))
                                .addGap(10, 10, 10)
                                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(entrada))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(empresa)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(rg))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRelatorios)
                                .addGap(440, 440, 440)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cavalo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carreta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
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
        ViewMain v = new ViewMain();
        v.setVisible(true);
    }//GEN-LAST:event_btnFecharMouseClicked

    private void btnMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiniMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMiniMouseClicked

    private void dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataMouseClicked
        Date datah = new Date();
        SimpleDateFormat hoje = new SimpleDateFormat("dd/MM/yyyy");
        
        data.setText(hoje.format(datah));
    }//GEN-LAST:event_dataMouseClicked

    private void saidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saidaMouseClicked
        String hj = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
        saida.setText(hj);
    }//GEN-LAST:event_saidaMouseClicked

    private void entradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entradaMouseClicked
        String horario = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
        
        entrada.setText(horario);
    }//GEN-LAST:event_entradaMouseClicked

    private void tblCTerceiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTerceiroMouseClicked
        if(tblCTerceiro.getSelectedRow() != -1){
            
            id.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 0).toString());
            cavalo.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 1).toString());
            carreta.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 2).toString());
            nome.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 3).toString());
            //data.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 4).toString());
            entrada.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 5).toString());
            combo2.setSelectedItem(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 6));
            saida.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 7).toString());
            combo1.setSelectedItem(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 8).toString());
            rg.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 9).toString());
            empresa.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 10).toString());
            
        }
    }//GEN-LAST:event_tblCTerceiroMouseClicked

    private void tblCTerceiroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCTerceiroKeyReleased
         if(tblCTerceiro.getSelectedRow() != -1){
            
            id.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 0).toString());
            cavalo.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 1).toString());
            carreta.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 2).toString());
            nome.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 3).toString());
            //data.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 4).toString());
            entrada.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 5).toString());
            combo2.setSelectedItem(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 6));
            saida.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 7).toString());
            combo1.setSelectedItem(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 8).toString());
            
            empresa.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 9).toString());
            rg.setText(tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 10).toString());
            
        }
    }//GEN-LAST:event_tblCTerceiroKeyReleased

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       
        if(data.getText().isEmpty() || nome.getText().isEmpty() || empresa.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campos Obrigatórios", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            CaminhaoT r = new CaminhaoT();
            CaminhaoTerDAO dao = new CaminhaoTerDAO();
            
            r.setCavalo(cavalo.getText());
            r.setCarreta(carreta.getText());
            r.setNome(nome.getText());
            r.setData(data.getText());
            r.setEntrada(entrada.getText());
            r.setComoentrada((String) combo2.getSelectedItem());
            r.setSaida(saida.getText());
            r.setComosaida((String) combo1.getSelectedItem());
            r.setEmpresa(empresa.getText());
            r.setRg(rg.getText());
            
            dao.create(r);
            
            id.setText("");
            cavalo.setText("");
            carreta.setText("");
            nome.setText("");
            saida.setText("");
            entrada.setText("");
            empresa.setText("");
            rg.setText("");
            
            read();
            
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        if (tblCTerceiro.getSelectedRow() != -1) {
            
            CaminhaoT r = new CaminhaoT();
            CaminhaoTerDAO dao = new CaminhaoTerDAO();
            
            r.setId((Integer) tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 0));
            
            r.setCavalo(cavalo.getText());
            r.setCarreta(carreta.getText());
            r.setNome(nome.getText());
            r.setData(data.getText());
            r.setSaida(saida.getText());
            r.setComosaida(combo1.getSelectedItem().toString());
            r.setEntrada(entrada.getText());
            r.setComoentrada(combo2.getSelectedItem().toString());
            r.setEmpresa(empresa.getText());
            r.setRg(rg.getText());
           
            JOptionPane.showConfirmDialog(rootPane, "CONFIRMAÇÂO", "Deseja excluir este item", JOptionPane.INFORMATION_MESSAGE);
            dao.delete(r);
            read();
            
            id.setText("");
            cavalo.setText("");
            carreta.setText("");
            nome.setText("");
            saida.setText("");
            entrada.setText("");
            empresa.setText("");
            rg.setText("");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (tblCTerceiro.getSelectedRow() != -1) {
            
            CaminhaoT r = new CaminhaoT();
            CaminhaoTerDAO dao = new CaminhaoTerDAO();
            
            r.setId((Integer) tblCTerceiro.getValueAt(tblCTerceiro.getSelectedRow(), 0));
            
            r.setCavalo(cavalo.getText());
            r.setCarreta(carreta.getText());
            r.setNome(nome.getText());
            r.setData(data.getText());
            r.setSaida(saida.getText());
            r.setComosaida(combo1.getSelectedItem().toString());
            r.setEntrada(entrada.getText());
            r.setComoentrada(combo2.getSelectedItem().toString());
            r.setEmpresa(empresa.getText());
            r.setRg(rg.getText());
           
            dao.update(r);
            read();
            
            id.setText("");
            cavalo.setText("");
            carreta.setText("");
            nome.setText("");
            saida.setText("");
            entrada.setText("");
            empresa.setText("");
            rg.setText("");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCaminhaoTerceiro().setVisible(true);
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
    private javax.swing.JTextField carreta;
    private javax.swing.JFormattedTextField cavalo;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JTextField empresa;
    private javax.swing.JTextField entrada;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField saida;
    private javax.swing.JTable tblCTerceiro;
    // End of variables declaration//GEN-END:variables
}
