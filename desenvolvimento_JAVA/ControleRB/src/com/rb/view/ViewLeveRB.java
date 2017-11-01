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
import com.rb.dao.VeiculoLeveDAO;
import com.rb.domain.VeiculosLeveRB;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael Carvalho
 */
public class ViewLeveRB extends javax.swing.JFrame {

    public ViewLeveRB() {
        initComponents();
        img();        
        read();
    }
    public void img(){
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\ControleRB\\img\\logoRB.png");
        setIconImage(imagemTituloJanela.getImage());
    }
    
    private void read(){
        DefaultTableModel tbl = (DefaultTableModel) tblLeve.getModel();
        tbl.setNumRows(0);
        
        VeiculoLeveDAO dao = new VeiculoLeveDAO();
        try {
            for(VeiculosLeveRB v : dao.listar()){
                tbl.addRow(new Object[]{
                    v.getId(),
                    v.getNome(),
                    v.getDestino(),
                    v.getData(),
                    v.getSaida(),
                    v.getKmsaida(),
                    v.getEntrada(),
                    v.getKmentrada(),
                    
                    v.getObs(),
                    v.getAut()
                });
                
            }
        } catch (SQLException ex) {
            System.out.println("Erro READ");
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
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        aut = new javax.swing.JTextField();
        saida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLeve = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        entrada = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        destino = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kmsaida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        kmentrada = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        obs = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        listaPDF = new javax.swing.JLabel();
        dataPDF = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        pdfGeral = new javax.swing.JLabel();

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
        jLabel5.setText("SAÍDA");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ENTRADA");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("AUTORIZADO");

        nome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nome.setSelectionColor(new java.awt.Color(0, 0, 0));

        aut.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        aut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aut.setSelectionColor(new java.awt.Color(0, 0, 0));

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

        tblLeve.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblLeve.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Nome", "Destino", "Data", "Horário da Saída", "KM Saída", "Horário da Entrada", "KM Entrada", "Autorizado", "Observações"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLeve.setGridColor(new java.awt.Color(0, 0, 0));
        tblLeve.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tblLeve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLeveMouseClicked(evt);
            }
        });
        tblLeve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblLeveKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblLeve);
        if (tblLeve.getColumnModel().getColumnCount() > 0) {
            tblLeve.getColumnModel().getColumn(1).setResizable(false);
            tblLeve.getColumnModel().getColumn(2).setResizable(false);
            tblLeve.getColumnModel().getColumn(3).setResizable(false);
            tblLeve.getColumnModel().getColumn(4).setResizable(false);
            tblLeve.getColumnModel().getColumn(6).setResizable(false);
            tblLeve.getColumnModel().getColumn(7).setResizable(false);
            tblLeve.getColumnModel().getColumn(8).setResizable(false);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(452, 452, 452))
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
        data.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataMouseClicked(evt);
            }
        });

        destino.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DESTINO");

        kmsaida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kmsaida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("KM SAÍDA");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("KM ENTRADA");

        kmentrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kmentrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("OBS");

        obs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        id.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        id.setText("ID");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "PDF por Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        listaPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/img/4.png"))); // NOI18N
        listaPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPDFMouseClicked(evt);
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
                .addComponent(listaPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaPDF)
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
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nome)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(kmsaida))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kmentrada)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(aut)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(obs)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFechar)
                            .addComponent(btnMini))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kmsaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kmentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(aut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(obs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        Date hoje = new Date();
        SimpleDateFormat datahoje = new SimpleDateFormat("dd/MM/yyyy");
        data.setText(datahoje.format(hoje));
    }//GEN-LAST:event_dataMouseClicked

    private void saidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saidaMouseClicked
        String hsaida = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
        saida.setText(hsaida);
    }//GEN-LAST:event_saidaMouseClicked

    private void entradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entradaMouseClicked
        String horarioEntrada = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
        entrada.setText(horarioEntrada);
    }//GEN-LAST:event_entradaMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        VeiculoLeveDAO dao = new VeiculoLeveDAO();
        VeiculosLeveRB r = new VeiculosLeveRB();
        if(data.getText().equals("  /  /    ")){
            JOptionPane.showMessageDialog(rootPane, "Data Obrigatório", "DATA", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(data.getText().isEmpty() || nome.getText().isEmpty() || destino.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campos Obrigatórios", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            
            r.setNome(nome.getText());
            r.setDestino(destino.getText());
            r.setData(data.getText());
            r.setSaida(saida.getText());
            r.setKmsaida(kmsaida.getText());
            r.setEntrada(entrada.getText());
            r.setKmentrada(kmentrada.getText());
            r.setAut(aut.getText());
            r.setObs(obs.getText());
            
            dao.create(r);
            read();
            
            nome.setText("");
            destino.setText("");
            saida.setText("");
            kmsaida.setText("");
            entrada.setText("");
            kmentrada.setText("");
            aut.setText("");
            obs.setText("");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        VeiculoLeveDAO dao = new VeiculoLeveDAO();
        VeiculosLeveRB r = new VeiculosLeveRB();
        
        if(tblLeve.getSelectedRow() != -1) {

            r.setId((int) tblLeve.getValueAt(tblLeve.getSelectedRow(), 0));
            r.setNome(nome.getText());
            r.setDestino(destino.getText());
            r.setSaida(saida.getText());
            r.setKmsaida(kmsaida.getText());
            r.setEntrada(entrada.getText());
            r.setKmentrada(kmentrada.getText());
            r.setAut(aut.getText());
            r.setObs(obs.getText());

            dao.update(r);
            read();

            nome.setText("");
            destino.setText("");
            saida.setText("");
            kmsaida.setText("");
            entrada.setText("");
            kmentrada.setText("");
            aut.setText("");
            obs.setText("");

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        VeiculoLeveDAO dao = new VeiculoLeveDAO();
        VeiculosLeveRB r = new VeiculosLeveRB();
        int i;
        if (tblLeve.getSelectedRow() != -1) {

            r.setId((int) tblLeve.getValueAt(tblLeve.getSelectedRow(), 0));
            
            r.setNome(nome.getText());
            r.setDestino(destino.getText());
            r.setSaida(saida.getText());
            r.setKmsaida(kmsaida.getText());
            r.setEntrada(entrada.getText());
            r.setKmentrada(kmentrada.getText());
            r.setAut(aut.getText());
            r.setObs(obs.getText());

            i = JOptionPane.showConfirmDialog(rootPane, "Deseja Excluir este item", "Excluir", JOptionPane.INFORMATION_MESSAGE);
            
            if (i == JOptionPane.YES_OPTION) {
                dao.delete(r);
                read();

                nome.setText("");
                destino.setText("");
                saida.setText("");
                kmsaida.setText("");
                entrada.setText("");
                kmentrada.setText("");
                aut.setText("");
                obs.setText("");
            } else {
                return;
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblLeveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLeveMouseClicked
        
        
        if(tblLeve.getSelectedRow() != -1){
            
            id.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 0).toString());
            nome.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 1).toString());
            destino.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 2).toString());
           
            saida.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 4).toString());
            kmsaida.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 5).toString());
            
            entrada.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 6).toString());
            kmentrada.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 7).toString());
            
            obs.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 8).toString());
            aut.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 9).toString());
            
        }
    }//GEN-LAST:event_tblLeveMouseClicked

    private void tblLeveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblLeveKeyReleased
         if(tblLeve.getSelectedRow() != -1){
            
            id.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 0).toString());
            nome.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 1).toString());
            destino.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 2).toString());
           
            saida.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 4).toString());
            kmsaida.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 5).toString());
            
            entrada.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 6).toString());
            kmentrada.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 7).toString());
            
            obs.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 8).toString());
            aut.setText(tblLeve.getValueAt(tblLeve.getSelectedRow(), 9).toString());
            
        }
    }//GEN-LAST:event_tblLeveKeyReleased

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
        
        VeiculoLeveDAO dao = new VeiculoLeveDAO();
        VeiculosLeveRB r = new VeiculosLeveRB();
        
        try {
            
            PdfWriter.getInstance(doc, new FileOutputStream(url));
            doc.open();
            
            PdfPTable tbl = new PdfPTable(9);
            
            float[] tams = {0.2f,0.2f,0.09f,0.07f,0.12f,0.09f, 0.13f, 0.25f, 0.2f};
            tbl.setWidths(tams);
            tbl.setHorizontalAlignment(Element.ALIGN_CENTER);
            tbl.setWidthPercentage(100.0f);
            
            Font fc = FontFactory.getFont(FontFactory.TIMES_ROMAN, 7);
            Font fc1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Element.ALIGN_CENTER);
            
            PdfPCell cel = new PdfPCell(new Paragraph("CONTROLE DE VEÍCULOS PARTICULÁRES DA RB",fc1));
            
            cel.setBackgroundColor(new BaseColor(100, 100, 100));
            cel.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel.setColspan(9);
            
            PdfPCell cel1 = new PdfPCell(new Paragraph("Nome", fc1));
            PdfPCell cel2 = new PdfPCell(new Paragraph("Destino", fc1));
            PdfPCell cel3 = new PdfPCell(new Paragraph("Data", fc1));
            PdfPCell cel4 = new PdfPCell(new Paragraph("Saída", fc1));
            PdfPCell cel5 = new PdfPCell(new Paragraph("KM Saída", fc1));
            PdfPCell cel6 = new PdfPCell(new Paragraph("Entrada", fc1));
            PdfPCell cel7 = new PdfPCell(new Paragraph("KM Entrada", fc1));
            PdfPCell cel8 = new PdfPCell(new Paragraph("Aut", fc1));
            PdfPCell cel9 = new PdfPCell(new Paragraph("Obs", fc1));
            
            //Alinhamento do texto da table no centro de cada coluna            
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel4.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel5.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel6.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel7.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel8.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel9.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            tbl.addCell(cel);
            tbl.addCell(cel1);
            tbl.addCell(cel2);
            tbl.addCell(cel3);
            tbl.addCell(cel4);
            tbl.addCell(cel5);
            tbl.addCell(cel6);
            tbl.addCell(cel7);
            tbl.addCell(cel8);
            tbl.addCell(cel9);
           
            
            for (VeiculosLeveRB c : dao.listar()) {

                cel1 = new PdfPCell(new Paragraph(c.getNome(), fc));
                cel2 = new PdfPCell(new Paragraph(c.getDestino(), fc));
                cel3 = new PdfPCell(new Paragraph(c.getData(), fc));
                cel4 = new PdfPCell(new Paragraph(c.getSaida(), fc));
                cel5 = new PdfPCell(new Paragraph(c.getKmsaida(), fc));
                cel6 = new PdfPCell(new Paragraph(c.getEntrada(), fc));
                cel7 = new PdfPCell(new Paragraph(c.getKmentrada(), fc));
                cel8 = new PdfPCell(new Paragraph(c.getAut(), fc));
                cel9 = new PdfPCell(new Paragraph(c.getObs(), fc));

                //Alinhamento do texto da table no centro de cada coluna            
                cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel5.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel6.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel7.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel8.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel9.setHorizontalAlignment(Element.ALIGN_CENTER);

                tbl.addCell(cel1);
                tbl.addCell(cel2);
                tbl.addCell(cel3);
                tbl.addCell(cel4);
                tbl.addCell(cel5);
                tbl.addCell(cel6);
                tbl.addCell(cel7);
                tbl.addCell(cel8);
                tbl.addCell(cel9);

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
            doc.close();
            
            Desktop.getDesktop().open(new File(url));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Verificar Preenchimento", "ERROS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_pdfGeralMouseClicked

    private void listaPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPDFMouseClicked
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
        
        VeiculoLeveDAO dao = new VeiculoLeveDAO();
        VeiculosLeveRB r = new VeiculosLeveRB();
        r.setData(dataPDF.getText());
        
        try {
            
            PdfWriter.getInstance(doc, new FileOutputStream(url));
            doc.open();
            
            PdfPTable tbl = new PdfPTable(9);
            
            float[] tams = {0.2f,0.2f,0.09f,0.07f,0.12f,0.09f, 0.13f, 0.25f, 0.2f};
            tbl.setWidths(tams);
            tbl.setHorizontalAlignment(Element.ALIGN_CENTER);
            tbl.setWidthPercentage(100.0f);
            
            Font fc = FontFactory.getFont(FontFactory.TIMES_ROMAN, 7);
            Font fc1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Element.ALIGN_CENTER);
            
            PdfPCell cel = new PdfPCell(new Paragraph("CONTROLE DE VEÍCULOS PARTICULÁRES DA RB",fc1));
            
            cel.setBackgroundColor(new BaseColor(100, 100, 100));
            cel.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel.setColspan(9);
            
            PdfPCell cel1 = new PdfPCell(new Paragraph("Nome", fc1));
            PdfPCell cel2 = new PdfPCell(new Paragraph("Destino", fc1));
            PdfPCell cel3 = new PdfPCell(new Paragraph("Data", fc1));
            PdfPCell cel4 = new PdfPCell(new Paragraph("Saída", fc1));
            PdfPCell cel5 = new PdfPCell(new Paragraph("KM Saída", fc1));
            PdfPCell cel6 = new PdfPCell(new Paragraph("Entrada", fc1));
            PdfPCell cel7 = new PdfPCell(new Paragraph("KM Entrada", fc1));
            PdfPCell cel8 = new PdfPCell(new Paragraph("Aut", fc1));
            PdfPCell cel9 = new PdfPCell(new Paragraph("Obs", fc1));
            
            //Alinhamento do texto da table no centro de cada coluna            
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel4.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel5.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel6.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel7.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel8.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel9.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            tbl.addCell(cel);
            tbl.addCell(cel1);
            tbl.addCell(cel2);
            tbl.addCell(cel3);
            tbl.addCell(cel4);
            tbl.addCell(cel5);
            tbl.addCell(cel6);
            tbl.addCell(cel7);
            tbl.addCell(cel8);
            tbl.addCell(cel9);
           
            
            for (VeiculosLeveRB c : dao.listarData(r)) {

                cel1 = new PdfPCell(new Paragraph(c.getNome(), fc));
                cel2 = new PdfPCell(new Paragraph(c.getDestino(), fc));
                cel3 = new PdfPCell(new Paragraph(c.getData(), fc));
                cel4 = new PdfPCell(new Paragraph(c.getSaida(), fc));
                cel5 = new PdfPCell(new Paragraph(c.getKmsaida(), fc));
                cel6 = new PdfPCell(new Paragraph(c.getEntrada(), fc));
                cel7 = new PdfPCell(new Paragraph(c.getKmentrada(), fc));
                cel8 = new PdfPCell(new Paragraph(c.getAut(), fc));
                cel9 = new PdfPCell(new Paragraph(c.getObs(), fc));

                //Alinhamento do texto da table no centro de cada coluna            
                cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel2.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel3.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel4.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel5.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel6.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel7.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel8.setHorizontalAlignment(Element.ALIGN_CENTER);
                cel9.setHorizontalAlignment(Element.ALIGN_CENTER);

                tbl.addCell(cel1);
                tbl.addCell(cel2);
                tbl.addCell(cel3);
                tbl.addCell(cel4);
                tbl.addCell(cel5);
                tbl.addCell(cel6);
                tbl.addCell(cel7);
                tbl.addCell(cel8);
                tbl.addCell(cel9);

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
            doc.close();
            
            Desktop.getDesktop().open(new File(url));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Verificar Preenchimento", "ERROS", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_listaPDFMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLeveRB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aut;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel btnFechar;
    private javax.swing.JLabel btnMini;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JFormattedTextField dataPDF;
    private javax.swing.JTextField destino;
    private javax.swing.JTextField entrada;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kmentrada;
    private javax.swing.JTextField kmsaida;
    private javax.swing.JLabel listaPDF;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField obs;
    private javax.swing.JLabel pdfGeral;
    private javax.swing.JTextField saida;
    private javax.swing.JTable tblLeve;
    // End of variables declaration//GEN-END:variables
}
