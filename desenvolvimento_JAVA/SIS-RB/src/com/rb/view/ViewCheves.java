package com.rb.view;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.rb.dao.ChaveDAO;
import com.rb.domain.Chave;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
public class ViewCheves extends javax.swing.JFrame {

    public ViewCheves() {
        initComponents();
        
        read();
    }
    
    private void read(){
        DefaultTableModel tbl = (DefaultTableModel) tblChaves.getModel();
        tbl.setNumRows(0);
        
        ChaveDAO dao = new ChaveDAO();
        try {
            for(Chave v : dao.listar()){
                tbl.addRow(new Object[]{
                    v.getId(),
                    v.getNome(),
                    v.getSetor(),
                    v.getData(),
                    v.getSaida(),
                    v.getEntrada(),
                    v.getDatadevolucao(),
                    v.getVigilante()
                   
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
        Retirada = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        vigilante = new javax.swing.JTextField();
        dataretirada = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChaves = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        entrada = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        setor = new javax.swing.JTextField();
        SETOR = new javax.swing.JLabel();
        saida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        devolucao = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        listaPDFdata = new javax.swing.JLabel();
        dataPDF = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        btnPDF = new javax.swing.JLabel();

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

        Retirada.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Retirada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Retirada.setText("RETIRADA");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ENTRADA");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("VIGILANTE");

        nome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nome.setSelectionColor(new java.awt.Color(0, 0, 0));

        vigilante.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        vigilante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vigilante.setSelectionColor(new java.awt.Color(0, 0, 0));

        dataretirada.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dataretirada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataretirada.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        dataretirada.setSelectionColor(new java.awt.Color(0, 0, 0));
        dataretirada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataretiradaMouseClicked(evt);
            }
        });
        dataretirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataretiradaActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblChaves.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblChaves.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Setor", "Data", "Horário da Saída", "Horário da Entrada", "Devolução", "Vigilante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChaves.setGridColor(new java.awt.Color(0, 0, 0));
        tblChaves.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tblChaves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChavesMouseClicked(evt);
            }
        });
        tblChaves.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblChavesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblChaves);
        if (tblChaves.getColumnModel().getColumnCount() > 0) {
            tblChaves.getColumnModel().getColumn(0).setResizable(false);
            tblChaves.getColumnModel().getColumn(1).setResizable(false);
            tblChaves.getColumnModel().getColumn(2).setResizable(false);
            tblChaves.getColumnModel().getColumn(3).setResizable(false);
            tblChaves.getColumnModel().getColumn(4).setResizable(false);
            tblChaves.getColumnModel().getColumn(5).setResizable(false);
            tblChaves.getColumnModel().getColumn(6).setResizable(false);
            tblChaves.getColumnModel().getColumn(7).setResizable(false);
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
        jLabel2.setText("CONTROLE DE CHAVES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
        );

        setor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        SETOR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SETOR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SETOR.setText("SETOR");

        saida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        saida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saidaMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SAÍDA");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DEVOLUÇÃO");

        devolucao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        devolucao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        devolucao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                devolucaoMouseClicked(evt);
            }
        });

        id.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        id.setText("ID");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "PDF por Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        listaPDFdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/img/4.png"))); // NOI18N
        listaPDFdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPDFdataMouseClicked(evt);
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
                .addComponent(listaPDFdata, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaPDFdata)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dataPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "PDF Geral", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        btnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rb/img/4.png"))); // NOI18N
        btnPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPDFMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnPDF)
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nome)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(setor)
                                    .addComponent(SETOR, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dataretirada)
                                    .addComponent(Retirada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(saida)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entrada)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(devolucao)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(vigilante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(devolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SETOR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(setor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Retirada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataretirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void dataretiradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataretiradaMouseClicked
        Date h = new Date();
        SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
        dataretirada.setText(ff.format(h));
    }//GEN-LAST:event_dataretiradaMouseClicked

    private void entradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entradaMouseClicked
        String horarioEntrada = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
        entrada.setText(horarioEntrada);
    }//GEN-LAST:event_entradaMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       
        Chave c = new Chave();
        ChaveDAO dao = new ChaveDAO();
        
        if(nome.getText().isEmpty() || setor.getText().isEmpty() || vigilante.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campos Obrigatórios", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            
            c.setNome(nome.getText());
            c.setSetor(setor.getText());
            c.setData(dataretirada.getText());            
            c.setSaida(saida.getText());            
            c.setEntrada(entrada.getText());
            c.setDatadevolucao(devolucao.getText());
            c.setVigilante(vigilante.getText());
            
            dao.salvar(c);
            read();
            
            nome.setText("");
            setor.setText("");
            dataretirada.setText("");
            saida.setText("");
            entrada.setText("");
            devolucao.setText("");
            vigilante.setText("");
            
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        Chave c = new Chave();
        ChaveDAO dao = new ChaveDAO();
        
        if(tblChaves.getSelectedRow() != -1) {

            c.setId((int) tblChaves.getValueAt(tblChaves.getSelectedRow(), 0));
            c.setNome(nome.getText());
            c.setSetor(setor.getText());
            c.setData(dataretirada.getText());
            c.setSaida(saida.getText());
            c.setEntrada(entrada.getText());
            c.setDatadevolucao(devolucao.getText());
            c.setVigilante(vigilante.getText());
            
            dao.update(c);
            read();

            nome.setText("");
            setor.setText("");
            dataretirada.setText("");
            saida.setText("");
            entrada.setText("");
            devolucao.setText("");
            vigilante.setText("");
            

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        Chave c = new Chave();
        ChaveDAO dao = new ChaveDAO();
        
        int i;
        if (tblChaves.getSelectedRow() != -1) {

            c.setId((int) tblChaves.getValueAt(tblChaves.getSelectedRow(), 0));
            
            c.setNome(nome.getText());
            c.setSetor(setor.getText());
            c.setData(dataretirada.getText());
            c.setSaida(saida.getText());
            c.setEntrada(entrada.getText());
            c.setDatadevolucao(devolucao.getText());
            c.setVigilante(vigilante.getText());
            

            i = JOptionPane.showConfirmDialog(rootPane, "Deseja Excluir este item", "Excluir", JOptionPane.INFORMATION_MESSAGE);
            
            if (i == JOptionPane.YES_OPTION) {
                dao.delete(c);
                read();

                nome.setText("");
                setor.setText("");
                dataretirada.setText("");
                saida.setText("");
                entrada.setText("");
                devolucao.setText("");
                vigilante.setText("");
               
            } else {
                return;
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblChavesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChavesMouseClicked
        
        
        if(tblChaves.getSelectedRow() != -1){
            
            id.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 0).toString());
            nome.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 1).toString());
            setor.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 2).toString());
            dataretirada.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 3).toString());
            saida.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 4).toString());
            entrada.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 5).toString());
            devolucao.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 6).toString());            
            vigilante.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 7).toString());
            
        }
    }//GEN-LAST:event_tblChavesMouseClicked

    private void tblChavesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblChavesKeyReleased

        if (tblChaves.getSelectedRow() != -1) {

            id.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 0).toString());
            nome.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 1).toString());
            setor.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 2).toString());
            dataretirada.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 3).toString());
            saida.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 4).toString());
            entrada.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 5).toString());
            devolucao.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 6).toString());
            vigilante.setText(tblChaves.getValueAt(tblChaves.getSelectedRow(), 7).toString());

        }
    }//GEN-LAST:event_tblChavesKeyReleased

    private void dataretiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataretiradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataretiradaActionPerformed

    private void saidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saidaMouseClicked
       String h = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
       saida.setText(h);
    }//GEN-LAST:event_saidaMouseClicked

    private void devolucaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolucaoMouseClicked
        
        Date hoje = new Date();
        SimpleDateFormat datahoje = new SimpleDateFormat("dd/MM/yyyy");
        devolucao.setText(datahoje.format(hoje));
    }//GEN-LAST:event_devolucaoMouseClicked

    private void btnPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDFMouseClicked
        
        String nome = null;
        nome = JOptionPane.showInputDialog(null, "Nome do Arquivo", "Pergunta", JOptionPane.PLAIN_MESSAGE);
        new File("C:\\Controle de Acesso").mkdir();
        
        Document doc = new Document(PageSize.A4, 10, 10, 30,1);
        ChaveDAO dao = new ChaveDAO();
     
        String url = "C:\\Controle de Acesso\\"+nome+".pdf";
        
        try {
            
            PdfWriter.getInstance(doc, new FileOutputStream(url));
            doc.open();
            
            Paragraph p = new Paragraph("RELATÓRIOS PDF");
            p.setAlignment(1);
            p.setExtraParagraphSpace(TOP_ALIGNMENT);
            doc.add(p);
            
            p = new Paragraph("");
            doc.add(p);
            
            PdfPTable tbl = new PdfPTable(7);
            tbl.setHorizontalAlignment(Element.ALIGN_CENTER);
            tbl.setWidthPercentage(100.0f);
            
            PdfPCell cel2 = new PdfPCell(new Paragraph("NOME"));
            PdfPCell cel3 = new PdfPCell(new Paragraph("SETOR"));
            PdfPCell cel4 = new PdfPCell(new Paragraph("DATA RETIRADA"));
            PdfPCell cel5 = new PdfPCell(new Paragraph("HORÁRIO SAÍDA"));
            PdfPCell cel6 = new PdfPCell(new Paragraph("HORÁRIO ENTRADA"));
            PdfPCell cel7 = new PdfPCell(new Paragraph("DATA DEVOLUÇÃO"));
            PdfPCell cel8 = new PdfPCell(new Paragraph("VIGILANETE"));
            
            
            cel7.setColspan(1);
            cel4.getHorizontalAlignment();
            cel5.getHorizontalAlignment();
            
            tbl.addCell(cel2);
            tbl.addCell(cel3);
            tbl.addCell(cel4);
            tbl.addCell(cel5);
            tbl.addCell(cel6);
            tbl.addCell(cel7);
            tbl.addCell(cel8);
            
            for(Chave c : dao.listar()){
                
                cel2 = new PdfPCell(new Paragraph(c.getNome()));
                cel3 = new PdfPCell(new Paragraph(c.getSetor()));
                cel4 = new PdfPCell(new Paragraph(c.getData()));
                cel5 = new PdfPCell(new Paragraph(c.getSaida()));
                cel6 = new PdfPCell(new Paragraph(c.getEntrada()));
                cel7 = new PdfPCell(new Paragraph(c.getDatadevolucao()));
                cel8 = new PdfPCell(new Paragraph(c.getVigilante()));
                
                tbl.addCell(cel2);
                tbl.addCell(cel3);
                tbl.addCell(cel4);
                tbl.addCell(cel5);
                tbl.addCell(cel6);
                tbl.addCell(cel7);
                tbl.addCell(cel8);
            }
            doc.add(tbl);
            doc.close();
            
            Desktop.getDesktop().open(new File(url));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Verificar Preenchimento", "ERROS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPDFMouseClicked

    private void listaPDFdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPDFdataMouseClicked
        
        String nome = null;
        nome = JOptionPane.showInputDialog(null, "Nome do Arquivo", "Pergunta", JOptionPane.PLAIN_MESSAGE);
        new File("C:\\Controle de Acesso").mkdir();

        Document doc = new Document(PageSize.A4, 10, 10, 30,1);
        
        ChaveDAO dao = new ChaveDAO();
        Chave cc = new Chave();
        cc.setData(dataPDF.getText());
        
        String url = "C:\\Controle de Acesso"+nome+"pdf";
        
        try {
            
            PdfWriter.getInstance(doc, new FileOutputStream(url));
            doc.open();
            
            Paragraph p = new Paragraph("RELATÓRIOS PDF");
            p.setAlignment(1);
            p.setExtraParagraphSpace(TOP_ALIGNMENT);
            doc.add(p);
            
            p = new Paragraph("");
            doc.add(p);
            
            PdfPTable tbl = new PdfPTable(7);
            tbl.setHorizontalAlignment(Element.ALIGN_CENTER);
            tbl.setWidthPercentage(100.0f);
            
            PdfPCell cel2 = new PdfPCell(new Paragraph("NOME"));
            PdfPCell cel3 = new PdfPCell(new Paragraph("SETOR"));
            PdfPCell cel4 = new PdfPCell(new Paragraph("DATA RETIRADA"));
            PdfPCell cel5 = new PdfPCell(new Paragraph("HORÁRIO SAÍDA"));
            PdfPCell cel6 = new PdfPCell(new Paragraph("HORÁRIO ENTRADA"));
            PdfPCell cel7 = new PdfPCell(new Paragraph("DATA DEVOLUÇÃO"));
            PdfPCell cel8 = new PdfPCell(new Paragraph("VIGILANETE"));
            
            cel7.setColspan(1);
            cel4.getHorizontalAlignment();
            cel5.getHorizontalAlignment();
            
            tbl.addCell(cel2);
            tbl.addCell(cel3);
            tbl.addCell(cel4);
            tbl.addCell(cel5);
            tbl.addCell(cel6);
            tbl.addCell(cel7);
            tbl.addCell(cel8);
            
            for(Chave c : dao.listarUS(cc)){
                
                cel2 = new PdfPCell(new Paragraph(c.getNome()));
                cel3 = new PdfPCell(new Paragraph(c.getSetor()));
                cel4 = new PdfPCell(new Paragraph(c.getData()));
                cel5 = new PdfPCell(new Paragraph(c.getSaida()));
                cel6 = new PdfPCell(new Paragraph(c.getEntrada()));
                cel7 = new PdfPCell(new Paragraph(c.getDatadevolucao()));
                cel8 = new PdfPCell(new Paragraph(c.getVigilante()));

                tbl.addCell(cel2);
                tbl.addCell(cel3);
                tbl.addCell(cel4);
                tbl.addCell(cel5);
                tbl.addCell(cel6);
                tbl.addCell(cel7);
                tbl.addCell(cel8);
            }
            doc.add(tbl);
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            doc.close();
            try {
                Desktop.getDesktop().open(new File(url));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "Verificar Preenchimento", "ERROS", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_listaPDFdataMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCheves().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Retirada;
    private javax.swing.JLabel SETOR;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel btnFechar;
    private javax.swing.JLabel btnMini;
    private javax.swing.JLabel btnPDF;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JFormattedTextField dataPDF;
    private javax.swing.JTextField dataretirada;
    private javax.swing.JTextField devolucao;
    private javax.swing.JTextField entrada;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listaPDFdata;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField saida;
    private javax.swing.JTextField setor;
    private javax.swing.JTable tblChaves;
    private javax.swing.JTextField vigilante;
    // End of variables declaration//GEN-END:variables
}
