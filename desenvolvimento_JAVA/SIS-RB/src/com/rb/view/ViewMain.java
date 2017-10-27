package com.rb.view;

import com.rb.dao.CaminhaoRBDAO;
import com.rb.domain.CaminhaoRB;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael Carvalho
 */
public class ViewMain extends javax.swing.JFrame {

    public ViewMain() {
        initComponents();
        read();
    }
    private void read(){
        DefaultTableModel tbl = (DefaultTableModel) tblCRB.getModel();
        tbl.setNumRows(0);
        
        CaminhaoRBDAO dao = new CaminhaoRBDAO();
        
        try {
            for(CaminhaoRB rb: dao.listar()){
                tbl.addRow(new Object[]{
                    rb.getId(),
                    rb.getCavalo(),
                    rb.getCarreta(),
                    rb.getNome(),
                    rb.getData(),
                    rb.getSaida(),
                    rb.getComosaida(),
                    rb.getEntrada(),
                    rb.getComoentrada(),
                    rb.getDestino(),
                    rb.getLacre()
                    
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cavalo = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        combo2 = new javax.swing.JComboBox<>();
        destino = new javax.swing.JTextField();
        lacre = new javax.swing.JTextField();
        hsaida = new javax.swing.JTextField();
        data = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCRB = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        hentrada = new javax.swing.JTextField();
        btnVisitante = new javax.swing.JButton();
        btnCaminhaoTerceiros = new javax.swing.JButton();
        btnFiorino = new javax.swing.JButton();
        btnFuncionarios = new javax.swing.JButton();
        btnChaves = new javax.swing.JButton();
        combo1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        carreta = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        dataPDF = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CARRETA");

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
        jLabel9.setText("DESTINO");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("LACRE");

        try {
            cavalo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAA-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cavalo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cavalo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cavalo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cavalo.setSelectionColor(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CAVALO");

        nome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nome.setSelectionColor(new java.awt.Color(0, 0, 0));

        combo2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CARREGADO", "VAZIO" }));

        destino.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        destino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        destino.setSelectionColor(new java.awt.Color(0, 0, 0));

        lacre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lacre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lacre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lacre.setSelectionColor(new java.awt.Color(0, 0, 0));

        hsaida.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hsaida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hsaida.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        hsaida.setSelectionColor(new java.awt.Color(0, 0, 0));
        hsaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hsaidaMouseClicked(evt);
            }
        });

        try {
            data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        data.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        data.setSelectionColor(new java.awt.Color(255, 255, 255));
        data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataMouseClicked(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblCRB.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblCRB.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "CAVALO", "CARRETA", "NOME", "DATA", "HORA SAÍDA", "Carregado / Vazio", "HORA ENTRADA", "Carregado / Vazio", "DESTINO", "LACRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCRB.setGridColor(new java.awt.Color(0, 0, 0));
        tblCRB.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblCRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCRBMouseClicked(evt);
            }
        });
        tblCRB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCRBKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblCRB);

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

        hentrada.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hentrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hentrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hentradaMouseClicked(evt);
            }
        });

        btnVisitante.setBackground(new java.awt.Color(51, 51, 51));
        btnVisitante.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnVisitante.setForeground(new java.awt.Color(255, 255, 255));
        btnVisitante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/imgWrite/icons8-Plus Math-10.png"))); // NOI18N
        btnVisitante.setText("VISITANTE");
        btnVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitanteActionPerformed(evt);
            }
        });

        btnCaminhaoTerceiros.setBackground(new java.awt.Color(51, 51, 51));
        btnCaminhaoTerceiros.setForeground(new java.awt.Color(255, 255, 255));
        btnCaminhaoTerceiros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/imgWrite/icons8-Plus Math-10.png"))); // NOI18N
        btnCaminhaoTerceiros.setText("CAMINHÃO");
        btnCaminhaoTerceiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaminhaoTerceirosActionPerformed(evt);
            }
        });

        btnFiorino.setBackground(new java.awt.Color(51, 51, 51));
        btnFiorino.setForeground(new java.awt.Color(255, 255, 255));
        btnFiorino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/imgWrite/icons8-Car-10.png"))); // NOI18N
        btnFiorino.setText("FIORINO");
        btnFiorino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiorinoActionPerformed(evt);
            }
        });

        btnFuncionarios.setBackground(new java.awt.Color(51, 51, 51));
        btnFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        btnFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/imgWrite/icons8-User Account Filled-10.png"))); // NOI18N
        btnFuncionarios.setText("FUNCIONÁRIOS");
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });

        btnChaves.setBackground(new java.awt.Color(51, 51, 51));
        btnChaves.setForeground(new java.awt.Color(255, 255, 255));
        btnChaves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/imgWrite/icons8-Key Filled-10.png"))); // NOI18N
        btnChaves.setText("CHAVES");
        btnChaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChavesActionPerformed(evt);
            }
        });

        combo1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CARREGADO", "VAZIO" }));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTROLE DE ACESSO DE VEÍCULOS - RB");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        id.setText("ID");

        carreta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        carreta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "PDF por Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/img/4.png"))); // NOI18N

        try {
            dataPDF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataPDF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataPDF.setToolTipText("");
        dataPDF.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dataPDF, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dataPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "PDF Geral", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/img/4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cavalo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(carreta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hsaida, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(destino)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lacre)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMini)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChaves, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFuncionarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiorino, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCaminhaoTerceiros, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cavalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(carreta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lacre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hsaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(hentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCaminhaoTerceiros, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFiorino, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChaves, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        System.exit(0);
    }//GEN-LAST:event_btnFecharMouseClicked

    private void btnMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiniMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMiniMouseClicked

    private void dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataMouseClicked
        Date dataa = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        data.setText(formato.format(dataa));
        
    }//GEN-LAST:event_dataMouseClicked

    private void hsaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hsaidaMouseClicked
        
        String hora = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
        hsaida.setText(hora);
    }//GEN-LAST:event_hsaidaMouseClicked

    private void hentradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hentradaMouseClicked
        
        String hora = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
        hentrada.setText(hora);
    }//GEN-LAST:event_hentradaMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        CaminhaoRBDAO dao = new CaminhaoRBDAO();
        CaminhaoRB r = new CaminhaoRB();
        
        if(data.getText().isEmpty() || nome.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campos Obrigatórios", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            r.setCavalo(cavalo.getText());
            r.setCarreta(carreta.getText());
            r.setNome(nome.getText());
            r.setData(data.getText());
            r.setSaida(hsaida.getText());
            r.setComosaida((String) combo1.getSelectedItem());
            r.setEntrada(hentrada.getText());
            r.setComoentrada((String) combo2.getSelectedItem());
            r.setDestino(destino.getText());
            r.setLacre(lacre.getText());
            
            dao.create(r);
            
            id.setText("");
            cavalo.setText("");
            carreta.setText("");
            nome.setText("");
            hsaida.setText("");
            hentrada.setText("");
            destino.setText("");
            lacre.setText("");
            
            read();
            
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tblCRBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCRBKeyReleased
        
        if(tblCRB.getSelectedRow() != -1){
            
            
            id.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 0).toString());
            cavalo.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 1).toString());
            carreta.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 2).toString());
            nome.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 3).toString());
            //data.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 4).toString());
            hsaida.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 5).toString());
            combo1.setSelectedItem(tblCRB.getValueAt(tblCRB.getSelectedRow(), 6).toString());
            hentrada.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 7).toString());
            combo2.setSelectedItem(tblCRB.getValueAt(tblCRB.getSelectedRow(), 8));
            destino.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 9).toString());
            lacre.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 10).toString());
            
        }
    }//GEN-LAST:event_tblCRBKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tblCRB.getSelectedRow() != -1) {
            
            CaminhaoRB r = new CaminhaoRB();
            CaminhaoRBDAO dao = new CaminhaoRBDAO();
            
            r.setId((Integer) tblCRB.getValueAt(tblCRB.getSelectedRow(), 0));
            
            r.setCavalo(cavalo.getText());
            r.setCarreta(carreta.getText());
            r.setNome(nome.getText());
            r.setData(data.getText());
            r.setSaida(hsaida.getText());
            r.setComosaida(combo1.getSelectedItem().toString());
            r.setEntrada(hentrada.getText());
            r.setComoentrada(combo2.getSelectedItem().toString());
            r.setDestino(destino.getText());
            r.setLacre(lacre.getText());
           
            JOptionPane.showConfirmDialog(rootPane, "CONFIRMAÇÂO", "Deseja excluir este item", JOptionPane.INFORMATION_MESSAGE);
            dao.delete(r);
            read();
            
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblCRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCRBMouseClicked
       
        if(tblCRB.getSelectedRow() != -1){
            
            id.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 0).toString());
            cavalo.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 1).toString());
            carreta.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 2).toString());
            nome.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 3).toString());
            //data.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 4).toString());
            hsaida.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 5).toString());
            combo1.setSelectedItem(tblCRB.getValueAt(tblCRB.getSelectedRow(), 6).toString());
            hentrada.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 7).toString());
            combo2.setSelectedItem(tblCRB.getValueAt(tblCRB.getSelectedRow(), 8));
            destino.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 9).toString());
            lacre.setText(tblCRB.getValueAt(tblCRB.getSelectedRow(), 10).toString());
            
            
        }
    }//GEN-LAST:event_tblCRBMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (tblCRB.getSelectedRow() != -1) {
            
            CaminhaoRB r = new CaminhaoRB();
            CaminhaoRBDAO dao = new CaminhaoRBDAO();
            
            r.setId((int) tblCRB.getValueAt(tblCRB.getSelectedRow(), 0));
            
            r.setCavalo(cavalo.getText());
            r.setCarreta(carreta.getText());
            r.setNome(nome.getText());
            r.setData(data.getText());
            r.setSaida(hsaida.getText());
            r.setComosaida(combo1.getSelectedItem().toString());
            r.setEntrada(hentrada.getText());
            r.setComoentrada(combo2.getSelectedItem().toString());
            r.setDestino(destino.getText());
            r.setLacre(lacre.getText());
           
            dao.update(r);
            read();
            
            id.setText("");
            cavalo.setText("");
            carreta.setText("");
            nome.setText("");
            hsaida.setText("");
            hentrada.setText("");
            destino.setText("");
            lacre.setText("");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitanteActionPerformed
        
        ViewVisitante vv = new ViewVisitante();
        dispose();
        vv.setVisible(true);
       
    }//GEN-LAST:event_btnVisitanteActionPerformed

    private void btnCaminhaoTerceirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaminhaoTerceirosActionPerformed
        dispose();
        ViewCaminhaoTerceiro vc = new ViewCaminhaoTerceiro();
        vc.setVisible(true);
    }//GEN-LAST:event_btnCaminhaoTerceirosActionPerformed

    private void btnFiorinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiorinoActionPerformed
        dispose();
        ViewLeveRB vl = new ViewLeveRB();
        vl.setVisible(true);
    }//GEN-LAST:event_btnFiorinoActionPerformed

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
        ViewFuncionarios f = new ViewFuncionarios();
        dispose();
        f.setVisible(true);
    }//GEN-LAST:event_btnFuncionariosActionPerformed

    private void btnChavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChavesActionPerformed
        ViewCheves c = new ViewCheves();
        dispose();
        c.setVisible(true);
    }//GEN-LAST:event_btnChavesActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaminhaoTerceiros;
    private javax.swing.JButton btnChaves;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel btnFechar;
    private javax.swing.JButton btnFiorino;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JLabel btnMini;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnVisitante;
    private javax.swing.JTextField carreta;
    private javax.swing.JFormattedTextField cavalo;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JFormattedTextField dataPDF;
    private javax.swing.JTextField destino;
    private javax.swing.JTextField hentrada;
    private javax.swing.JTextField hsaida;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lacre;
    private javax.swing.JTextField nome;
    private javax.swing.JTable tblCRB;
    // End of variables declaration//GEN-END:variables
}
