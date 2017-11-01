package com.rb.view;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.rb.conexao.ConexaoFactory;
import com.rb.dao.VisitanteDAO;
import com.rb.domain.Visitante;
import static java.awt.Component.TOP_ALIGNMENT;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
                    v.getSaida(),
                    v.getEntrada()
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
        empresa = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        saida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVisitante = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnExluir = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        entrada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        id = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        pdfData = new javax.swing.JLabel();
        dataPDF = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        pdfGeral = new javax.swing.JLabel();
        buscaRG = new javax.swing.JTextField();
        btnRG = new javax.swing.JButton();

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
        jLabel5.setText("ENTRADA");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SAÍDA");

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
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Placa", "Modelo", "Nome", "RG", "Empresa", "Data", "Horário Entrada", "Horário Saída"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVisitante.setGridColor(new java.awt.Color(0, 0, 0));
        tblVisitante.setSelectionBackground(new java.awt.Color(255, 255, 255));
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
        }

        btnSalvar.setBackground(new java.awt.Color(51, 51, 51));
        btnSalvar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExluir.setBackground(new java.awt.Color(51, 51, 51));
        btnExluir.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnExluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExluir.setText("EXCLUIR");
        btnExluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExluirActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 51, 51));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
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

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MODELO");

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
                .addGap(426, 426, 426)
                .addComponent(jLabel2)
                .addContainerGap(438, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(21, 21, 21))
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "PDF por Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        pdfData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/img/4.png"))); // NOI18N
        pdfData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdfDataMouseClicked(evt);
            }
        });

        try {
            dataPDF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
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
                .addComponent(pdfData, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pdfData)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dataPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "PDF Geral", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        pdfGeral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/img/4.png"))); // NOI18N
        pdfGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdfGeralMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pdfGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(pdfGeral)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buscaRG.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        btnRG.setBackground(new java.awt.Color(51, 51, 51));
        btnRG.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRG.setForeground(new java.awt.Color(255, 255, 255));
        btnRG.setText("Buscar por RG");
        btnRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRGActionPerformed(evt);
            }
        });

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
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExluir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buscaRG, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(placa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(modelo)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(id)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nome)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(saida)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entrada)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(btnRG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(empresa)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rg)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRG)
                            .addComponent(buscaRG, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel3))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(placa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(modelo))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
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

    private void tblVisitanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVisitanteMouseClicked
        
        
        if(tblVisitante.getSelectedRow() != -1){
            
            id.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 0).toString());
            placa.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 1).toString());
            modelo.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 2).toString());
            nome.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 3).toString());
            rg.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 4).toString());
            empresa.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 5).toString());
            //data.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 6).toString());
            entrada.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 7).toString());
            saida.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 8).toString());
            
            
        }
    }//GEN-LAST:event_tblVisitanteMouseClicked

    private void tblVisitanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblVisitanteKeyReleased
        
        if (tblVisitante.getSelectedRow() != -1) {

            id.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 0).toString());
            placa.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 1).toString());
            
            modelo.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 2).toString());
            nome.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 3).toString());
            rg.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 4).toString());
            empresa.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 5).toString());
            //data.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 6).toString());
            entrada.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 7).toString());
            saida.setText(tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 8).toString());

        }

    }//GEN-LAST:event_tblVisitanteKeyReleased

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        if(data.getText().equals("  /  /    ")){
            JOptionPane.showMessageDialog(rootPane, "Data Obrigatório", "DATA", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        VisitanteDAO dao = new VisitanteDAO();
        Visitante v = new Visitante();
        
        v.setPlaca(placa.getText());
        v.setModelo(modelo.getText());
        v.setNome(nome.getText());
        v.setRg(rg.getText());
        v.setEmpresa(empresa.getText());
        v.setData(data.getText());
        v.setEntrada(entrada.getText());
        v.setSaida(saida.getText());
        
        dao.create(v);
        read();
        
        placa.setText("");
        modelo.setText("");
        nome.setText("");
        entrada.setText("");
        saida.setText("");
        empresa.setText("");
        rg.setText("");
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

    private void btnExluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExluirActionPerformed
        
        if(tblVisitante.getSelectedRow() != -1){
            
            Visitante v = new Visitante();
            VisitanteDAO dao = new VisitanteDAO();
            
            v.setId((Integer) tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 0));

            v.setPlaca(placa.getText());
            v.setModelo(modelo.getText());
            v.setNome(nome.getText());
            v.setRg(rg.getText());
            v.setEmpresa(empresa.getText());
            v.setData(data.getText());
            v.setEntrada(entrada.getText());
            v.setSaida(saida.getText());
            
            dao.delete(v);
            
            read();
        }
    }//GEN-LAST:event_btnExluirActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (tblVisitante.getSelectedRow() != -1) {
            
            VisitanteDAO dao = new VisitanteDAO();
            Visitante v = new Visitante();
            
            v.setId((Integer)tblVisitante.getValueAt(tblVisitante.getSelectedRow(), 0));
           
            v.setPlaca(placa.getText());
            v.setModelo(modelo.getText());
            v.setNome(nome.getText());
            v.setRg(rg.getText());
            v.setEmpresa(empresa.getText());
            v.setEntrada(entrada.getText());
            v.setSaida(saida.getText());

            dao.update(v);
            read();

            placa.setText("");
            modelo.setText("");
            nome.setText("");
            entrada.setText("");
            saida.setText("");
            empresa.setText("");
            rg.setText("");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void pdfGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfGeralMouseClicked
       
        String nome = null;
        nome = JOptionPane.showInputDialog(null, "Nome do Arquivo", "Pergunta", JOptionPane.PLAIN_MESSAGE);
        
        if(nome.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campo Obrigatórios", "OBRIGATÓRIO", JOptionPane.INFORMATION_MESSAGE);
            nome = JOptionPane.showInputDialog(null, "Nome do Arquivo", "Pergunta", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        new File("C:\\Controle de Acesso").mkdir();
        String url = "C:\\Controle de Acesso\\"+nome+".pdf";        
        Document doc = new Document(PageSize.A4, 10, 10, 10,10);
        
        VisitanteDAO dao = new VisitanteDAO();
      
        try {
            
             PdfWriter.getInstance(doc, new FileOutputStream(url));
            doc.open();
            
            PdfPTable tbl = new PdfPTable(8);
            
            float[] tams = {0.08f,0.08f,0.2f,0.10f,0.2f,0.08f, 0.08f, 0.08f};
            tbl.setWidths(tams);
            tbl.setHorizontalAlignment(Element.ALIGN_CENTER);
            tbl.setWidthPercentage(100.0f);
            
            Font fc = FontFactory.getFont(FontFactory.TIMES_ROMAN, 7);
            Font fc1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Element.ALIGN_CENTER);
            
            PdfPCell cel = new PdfPCell(new Paragraph("CONTROLE DE VEÍCULOS PARTICULÁRES DA RB",fc1));
            
            cel.setBackgroundColor(new BaseColor(100, 100, 100));
            cel.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel.setColspan(8);
            
            PdfPCell cel1 = new PdfPCell(new Paragraph("Placa", fc1));
            PdfPCell cel2 = new PdfPCell(new Paragraph("Modelo", fc1));
            PdfPCell cel3 = new PdfPCell(new Paragraph("Nome", fc1));
            PdfPCell cel4 = new PdfPCell(new Paragraph("Rg", fc1));
            PdfPCell cel5 = new PdfPCell(new Paragraph("Empresa", fc1));
            PdfPCell cel6 = new PdfPCell(new Paragraph("Data", fc1));
            PdfPCell cel7 = new PdfPCell(new Paragraph("Entrada", fc1));
            PdfPCell cel8 = new PdfPCell(new Paragraph("Saída", fc1));
            
            //Alinhamento do texto da table no centro de cada coluna            
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel4.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel5.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel6.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel7.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel8.setHorizontalAlignment(Element.ALIGN_CENTER);
                   
            tbl.addCell(cel);
            tbl.addCell(cel1);
            tbl.addCell(cel2);
            tbl.addCell(cel3);
            tbl.addCell(cel4);
            tbl.addCell(cel5);
            tbl.addCell(cel6);
            tbl.addCell(cel7);
            tbl.addCell(cel8);
            
            for(Visitante c : dao.listar()){
                
                cel1 = new PdfPCell(new Paragraph(c.getPlaca(), fc));
                cel2 = new PdfPCell(new Paragraph(c.getModelo(), fc));
                cel3 = new PdfPCell(new Paragraph(c.getNome(), fc));
                cel4 = new PdfPCell(new Paragraph(c.getRg(), fc));
                cel5 = new PdfPCell(new Paragraph(c.getEmpresa(), fc));
                cel6 = new PdfPCell(new Paragraph(c.getData(), fc));
                cel7 = new PdfPCell(new Paragraph(c.getEntrada(), fc));
                cel8 = new PdfPCell(new Paragraph(c.getSaida(), fc));

                //Alinhamento do texto da table no centro de cada coluna            
                cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel5.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel6.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel7.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel8.setHorizontalAlignment(Element.ALIGN_CENTER);

                tbl.addCell(cel1);
                tbl.addCell(cel2);
                tbl.addCell(cel3);
                tbl.addCell(cel4);
                tbl.addCell(cel5);
                tbl.addCell(cel6);
                tbl.addCell(cel7);
                tbl.addCell(cel8);
                
            }
             Image imagem = Image.getInstance(String.format("C:\\ControleRB\\img\\rb.png"));
            imagem.scalePercent(20, 20);
            imagem.setAlignment(Image.ALIGN_LEFT);
            
            Image imagem1 = Image.getInstance(String.format("C:\\ControleRB\\img\\logoFLC.png"));
            imagem1.scalePercent(5, 5);
            imagem1.setAlignment(Image.ALIGN_RIGHT);            
            imagem1.setAbsolutePosition(550f, 800f);
            
            doc.add(imagem);
            doc.add(imagem1);
            doc.add(new Paragraph(""));
            doc.add(tbl);
            
            Desktop.getDesktop().open(new File(url));
            
            Connection c = ConexaoFactory.db();
            c.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Verificar Preenchimento", "ERROS", JOptionPane.ERROR_MESSAGE);
        }finally{
            doc.close();
            
        }
    }//GEN-LAST:event_pdfGeralMouseClicked

    private void pdfDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfDataMouseClicked
        
         String nome = null;
        nome = JOptionPane.showInputDialog(null, "Nome do Arquivo", "Pergunta", JOptionPane.PLAIN_MESSAGE);
        
        if(nome.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campo Obrigatórios", "OBRIGATÓRIO", JOptionPane.INFORMATION_MESSAGE);
            nome = JOptionPane.showInputDialog(null, "Nome do Arquivo", "Pergunta", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        new File("C:\\Controle de Acesso").mkdir();
        String url = "C:\\Controle de Acesso\\"+nome+".pdf";        
        Document doc = new Document(PageSize.A4, 10, 10, 10,10);
        
        VisitanteDAO dao = new VisitanteDAO();
      
        try {
            
             PdfWriter.getInstance(doc, new FileOutputStream(url));
            doc.open();
            
            PdfPTable tbl = new PdfPTable(8);
            
            float[] tams = {0.08f,0.08f,0.2f,0.10f,0.2f,0.08f, 0.08f, 0.08f};
            tbl.setWidths(tams);
            tbl.setHorizontalAlignment(Element.ALIGN_CENTER);
            tbl.setWidthPercentage(100.0f);
            
            Font fc = FontFactory.getFont(FontFactory.TIMES_ROMAN, 7);
            Font fc1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Element.ALIGN_CENTER);
            
            PdfPCell cel = new PdfPCell(new Paragraph("CONTROLE DE VEÍCULOS PARTICULÁRES DA RB",fc1));
            
            cel.setBackgroundColor(new BaseColor(100, 100, 100));
            cel.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel.setColspan(8);
            
            PdfPCell cel1 = new PdfPCell(new Paragraph("Placa", fc1));
            PdfPCell cel2 = new PdfPCell(new Paragraph("Modelo", fc1));
            PdfPCell cel3 = new PdfPCell(new Paragraph("Nome", fc1));
            PdfPCell cel4 = new PdfPCell(new Paragraph("Rg", fc1));
            PdfPCell cel5 = new PdfPCell(new Paragraph("Empresa", fc1));
            PdfPCell cel6 = new PdfPCell(new Paragraph("Data", fc1));
            PdfPCell cel7 = new PdfPCell(new Paragraph("Entrada", fc1));
            PdfPCell cel8 = new PdfPCell(new Paragraph("Saída", fc1));
            
            //Alinhamento do texto da table no centro de cada coluna            
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel4.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel5.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel6.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel7.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel8.setHorizontalAlignment(Element.ALIGN_CENTER);
                   
            tbl.addCell(cel);
            tbl.addCell(cel1);
            tbl.addCell(cel2);
            tbl.addCell(cel3);
            tbl.addCell(cel4);
            tbl.addCell(cel5);
            tbl.addCell(cel6);
            tbl.addCell(cel7);
            tbl.addCell(cel8);
            
            for(Visitante c : dao.listar()){
                
                cel1 = new PdfPCell(new Paragraph(c.getPlaca(), fc));
                cel2 = new PdfPCell(new Paragraph(c.getModelo(), fc));
                cel3 = new PdfPCell(new Paragraph(c.getNome(), fc));
                cel4 = new PdfPCell(new Paragraph(c.getRg(), fc));
                cel5 = new PdfPCell(new Paragraph(c.getEmpresa(), fc));
                cel6 = new PdfPCell(new Paragraph(c.getData(), fc));
                cel7 = new PdfPCell(new Paragraph(c.getEntrada(), fc));
                cel8 = new PdfPCell(new Paragraph(c.getSaida(), fc));

                //Alinhamento do texto da table no centro de cada coluna            
                cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel5.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel6.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel7.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel8.setHorizontalAlignment(Element.ALIGN_CENTER);

                tbl.addCell(cel1);
                tbl.addCell(cel2);
                tbl.addCell(cel3);
                tbl.addCell(cel4);
                tbl.addCell(cel5);
                tbl.addCell(cel6);
                tbl.addCell(cel7);
                tbl.addCell(cel8);
                
            }
             Image imagem = Image.getInstance(String.format("C:\\ControleRB\\img\\rb.png"));
            imagem.scalePercent(20, 20);
            imagem.setAlignment(Image.ALIGN_LEFT);
            
            Image imagem1 = Image.getInstance(String.format("C:\\ControleRB\\img\\logoFLC.png"));
            imagem1.scalePercent(5, 5);
            imagem1.setAlignment(Image.ALIGN_RIGHT);            
            imagem1.setAbsolutePosition(550f, 806f);
            
            doc.add(imagem);
            doc.add(imagem1);
            doc.add(new Paragraph(""));
            doc.add(tbl);
            
            Desktop.getDesktop().open(new File(url));
            
            Connection c = ConexaoFactory.db();
            c.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Verificar Preenchimento", "ERROS", JOptionPane.ERROR_MESSAGE);
        }finally{
            doc.close();
        }
    }//GEN-LAST:event_pdfDataMouseClicked

    private void btnRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRGActionPerformed
        
        VisitanteDAO dao = new VisitanteDAO();
        Visitante v1 = new Visitante();
        v1.setRg(buscaRG.getText());
        
        try {

            for (Visitante v : dao.listarRG(v1)) {
                
                nome.setText(v.getNome());
                empresa.setText(v.getEmpresa());
                rg.setText(v.getRg());
            }
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_btnRGActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVisitante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExluir;
    private javax.swing.JLabel btnFechar;
    private javax.swing.JLabel btnMini;
    private javax.swing.JButton btnRG;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField buscaRG;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JFormattedTextField dataPDF;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel pdfData;
    private javax.swing.JLabel pdfGeral;
    private javax.swing.JFormattedTextField placa;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField saida;
    private javax.swing.JTable tblVisitante;
    // End of variables declaration//GEN-END:variables
}
