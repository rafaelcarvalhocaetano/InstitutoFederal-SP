package com.rb.view;

import com.rb.dao.VisitanteDAO;
import com.rb.domain.Visitante;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael Carvalho
 */
public class ViewVisitante extends javax.swing.JFrame {

    public ViewVisitante() {
        initComponents();
        read();
    }
    
    private void read(){
        DefaultTableModel tbl = (DefaultTableModel) tblVisitante.getModel();
        tbl.setNumRows(0);
        
        
        VisitanteDAO dao = new VisitanteDAO();
        
        try {
            for(Visitante v : dao.listar()){
                tbl.addRow(new Object[]{
                    v.getId(),
                    v.getPlaca(),
                    v.getModelo(),
                    v.getNome(),
                    v.getRg(),
                    v.getEmpresa(),
                    v.getData(),
                    v.getEntrada(),
                    v.getSaida()
                });
            }
        } catch (SQLException ex) {
            System.out.println("Erro no listar");
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
        placa = new javax.swing.JFormattedTextField();
        nome = new javax.swing.JTextField();
        combo2 = new javax.swing.JComboBox<>();
        empresa = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        saida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVisitante = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        entrada = new javax.swing.JTextField();
        btnRelatorios = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        id = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();

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
        jLabel3.setText("PLACA");

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
            placa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAA-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        placa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        placa.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        placa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        placa.setPreferredSize(new java.awt.Dimension(6, 20));
        placa.setSelectionColor(new java.awt.Color(0, 0, 0));

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

        tblVisitante.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblVisitante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Placa", "Nome", "Empresa", "RG", "Data", "Horário Entrada", "Carregado-Vazio", "Horário Saída", "Carregado-Vazio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVisitante.setGridColor(new java.awt.Color(0, 0, 0));
        tblVisitante.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tblVisitante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVisitanteMouseClicked(evt);
            }
        });
        tblVisitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblVisitanteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblVisitante);
        if (tblVisitante.getColumnModel().getColumnCount() > 0) {
            tblVisitante.getColumnModel().getColumn(0).setResizable(false);
            tblVisitante.getColumnModel().getColumn(1).setResizable(false);
            tblVisitante.getColumnModel().getColumn(2).setResizable(false);
            tblVisitante.getColumnModel().getColumn(3).setResizable(false);
            tblVisitante.getColumnModel().getColumn(4).setResizable(false);
            tblVisitante.getColumnModel().getColumn(5).setResizable(false);
            tblVisitante.getColumnModel().getColumn(6).setResizable(false);
            tblVisitante.getColumnModel().getColumn(7).setResizable(false);
            tblVisitante.getColumnModel().getColumn(8).setResizable(false);
            tblVisitante.getColumnModel().getColumn(9).setResizable(false);
        }

        btnSalvar.setBackground(new java.awt.Color(51, 51, 51));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EXCLUIR");

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/imgWrite/icons8-Ball Point Pen Filled-10.png"))); // NOI18N
        jButton3.setText("ATUALIZAR");

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
        jLabel6.setText("MODELO");

        combo1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "V" }));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VEÍCULOS E PEDESTRES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(jLabel2)
                .addContainerGap(412, Short.MAX_VALUE))
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
        data.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataMouseClicked(evt);
            }
        });

        id.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("ID");

        modelo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

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
                                    .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(modelo)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(id)))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(id)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void tblVisitanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVisitanteMouseClicked
        
        
        if(tblVisitante.getSelectedRow() != -1){
            
            id.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 0).toString());
            placa.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 1).toString());
            modelo.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 2).toString());
            nome.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 3).toString());
            rg.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 4).toString());
            data.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 5).toString());
            entrada.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 6).toString());
            combo1.setSelectedItem(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 7));
            saida.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 8).toString());
            combo2.setSelectedItem(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 9));
                        
        }
    }//GEN-LAST:event_tblVisitanteMouseClicked

    private void tblVisitanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblVisitanteKeyReleased
        
        if(tblVisitante.getSelectedRow() != -1){
            
            id.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 0).toString());
            placa.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 1).toString());
            modelo.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 2).toString());
            nome.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 3).toString());
            rg.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 4).toString());
            data.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 5).toString());
            entrada.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 6).toString());
            combo1.setSelectedItem(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 7));
            saida.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 8).toString());
            combo2.setSelectedItem(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 9));
                        
        }
        
    }//GEN-LAST:event_tblVisitanteKeyReleased

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataMouseClicked
        Date datahoje = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                
        data.setText(formato.format(datahoje));
        
    }//GEN-LAST:event_dataMouseClicked

    private void saidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saidaMouseClicked
        String hora = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
        saida.setText(hora);
    }//GEN-LAST:event_saidaMouseClicked

    private void entradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entradaMouseClicked
        String horario = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
        entrada.setText(horario);
    }//GEN-LAST:event_entradaMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVisitante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnFechar;
    private javax.swing.JLabel btnMini;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JTextField empresa;
    private javax.swing.JTextField entrada;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nome;
    private javax.swing.JFormattedTextField placa;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField saida;
    private javax.swing.JTable tblVisitante;
    // End of variables declaration//GEN-END:variables
}
