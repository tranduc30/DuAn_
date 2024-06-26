/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quanlycuahangpoly;

import Model.KhachHang;
import Repository.KhachHangRepository;
import Service.KhachHangService;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import quanlycuahang.Hepper.Xdate;

/**
 *
 * @author ADMIN
 */
public class KhachHangJPanel extends javax.swing.JPanel {
    KhachHangRepository khachHangRepository = new KhachHangRepository();
    List<KhachHang> list;
    DefaultTableModel dtm;
    /**
     * Creates new form KhachHang
     */
    public KhachHangJPanel() {
        initComponents();
//        fillTable();
        fillTableKhachHang();
        ButtonGroup bG = new ButtonGroup();
        bG.add(rdo1);
        bG.add(rdo2);
    }

    /**
     ButtonGroup bG = new ButtonGroup();
        bG.add(rdo1);
        bG.add(rdo2);  * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        rdo2 = new javax.swing.JRadioButton();
        btnXoa = new javax.swing.JButton();
        rdo1 = new javax.swing.JRadioButton();
        txtTenKhachHang = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnThem1 = new javax.swing.JButton();
        txtSdt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtMaKhachHang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSearchKH = new javax.swing.JTextField();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_KhachHang = new javax.swing.JTable();
        btnFirstPage = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        pageLabel = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnLastPage = new javax.swing.JButton();
        btnExportExcel = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("QUẢN LÝ KHÁCH HÀNG");

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane3.setViewportView(txtDiaChi);

        buttonGroup1.add(rdo2);
        rdo2.setText("Không hoạt động");

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdo1);
        rdo1.setSelected(true);
        rdo1.setText("Đang hoạt động");

        btnThem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem1.setText("Tìm kiếm");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Ngày Sinh");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Trạng thái");

        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Email");

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Địa Chỉ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Số Điện Thoại");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Mã khách hàng");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Làm Mới");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Họ Tên");

        txtSearchKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchKHActionPerformed(evt);
            }
        });
        txtSearchKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKHKeyReleased(evt);
            }
        });

        tbl_KhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Họ tên", "Sđt", "Ngày sinh", "Email", "Địa chỉ", "Trạng thái"
            }
        ));
        tbl_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_KhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_KhachHang);

        btnFirstPage.setText("|<");
        btnFirstPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstPageActionPerformed(evt);
            }
        });

        btnPrev.setText("<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        pageLabel.setText("jLabel12");

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLastPage.setText(">|");
        btnLastPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastPageActionPerformed(evt);
            }
        });

        btnExportExcel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExportExcel.setText("Export");
        btnExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(83, 83, 83)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdo1)
                                            .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(32, 32, 32)
                                                .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(128, 128, 128)
                                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49)
                                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(65, 65, 65)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rdo2)
                                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel5)
                                                            .addComponent(jLabel9))
                                                        .addGap(59, 59, 59)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSearchKH, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(275, 275, 275)
                                .addComponent(btnExportExcel)
                                .addGap(18, 18, 18)
                                .addComponent(btnFirstPage, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPrev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLastPage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrev)
                        .addComponent(btnNext)
                        .addComponent(pageLabel)
                        .addComponent(btnFirstPage)
                        .addComponent(btnLastPage)
                        .addComponent(btnExportExcel))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThem1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rdo1)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(rdo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(291, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThem1ActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tbl_KhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_KhachHangMouseClicked
        int index = tbl_KhachHang.getSelectedRow();
        Model.KhachHang kh = khachHangRepository.getById(tbl_KhachHang.getValueAt(index, 0).toString());
        show(kh);
    }//GEN-LAST:event_tbl_KhachHangMouseClicked

    private void btnFirstPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstPageActionPerformed
        this.goToFirstPage();
    }//GEN-LAST:event_btnFirstPageActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.prevPage();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.nextPage();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastPageActionPerformed
        this.goToLastPage();
    }//GEN-LAST:event_btnLastPageActionPerformed

    private void txtSearchKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKHKeyReleased
       searchKH(txtSearchKH.getText());
    }//GEN-LAST:event_txtSearchKHKeyReleased

    private void btnExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportExcelActionPerformed
        showSaveDialogAndExport();
    }//GEN-LAST:event_btnExportExcelActionPerformed

    private void txtSearchKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKHActionPerformed
    
    public void searchKH(String ma) {
        list = khachHangService.Search(ma);
        dtm = (DefaultTableModel) tbl_KhachHang.getModel();
        dtm.setRowCount(0);
        for (KhachHang s : list) {
            dtm.addRow(new Object[]{
                s.getIdKhachHang(), s.getTenKhachHang(), s.getSdt(), 
                s.getNgaySinh(), s.getEmail(), s.getDiaChi(), s.isTrangThai()? "Còn hoạt động" : "Không hoạt động"});
        }
    }
    public void show(Model.KhachHang kh) {
        txtDiaChi.setText(kh.getDiaChi());
        txtMaKhachHang.setText(String.valueOf(kh.getIdKhachHang()));
        txtEmail.setText(kh.getEmail());
        txtNgaySinh.setDate(kh.getNgaySinh());
        txtSdt.setText(kh.getSdt());
        txtTenKhachHang.setText(kh.getTenKhachHang());
        if (kh.isTrangThai() == true) {
            rdo1.setSelected(true);
        } else {
            rdo2.setSelected(true);
        }
    }
    
    public void fillTableKhachHang() {
        List<Model.KhachHang> listKH;
        DefaultTableModel mol;
//        listKH = khachHangRepository.getAllKhachHang();
        listKH = khachHangRepository.getKHByPage(currentPage, recordsPerPage);
        mol = (DefaultTableModel) tbl_KhachHang.getModel();
        mol.setRowCount(0);
        for (Model.KhachHang kh : listKH) {
            mol.addRow(new Object[]{kh.getIdKhachHang(), 
                    kh.getTenKhachHang(), 
                    kh.getSdt(), 
                    kh.getNgaySinh(),
                    kh.getEmail(), 
                    kh.getDiaChi(),
                    kh.isTrangThai()? "Còn hoạt động" : "Không hoạt động"});
        }
        int totalPages = (int) Math.ceil((double) khachHangRepository.getTotalKH()/ recordsPerPage);
        pageLabel.setText("Trang: " + currentPage + " / " + totalPages);
    }
//    public void fillTable() {
//            DefaultTableModel model = (DefaultTableModel) tbl_KhachHang.getModel();
//            model.setRowCount(0);
//            try {
//                List<Model.KhachHang> list = khachHangRepository.getAllKhachHang();
//                for (Model.KhachHang kh : list) {
//                    model.addRow(new Object[]{
//                        kh.getIdKhachHang(),
//                        kh.getTenKhachHang(),
//                        kh.getNgaySinh(),
//                        kh.getSdt(),
//                        kh.getEmail(),
//                        kh.isGioiTinh()? "Nam" : "Nữ",
//                        kh.getDiaChi(),
//                        kh.getMatKhau(),
//                        kh.isTrangThai()? "Làm việc" : "Nghỉ việc",
//                    });
//                }
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu");
//                e.printStackTrace();
//            }
//        }
    public KhachHang getForm() {
        KhachHang kh = new KhachHang();
        kh.setIdKhachHang(Integer.parseInt(txtMaKhachHang.getText()));
        kh.setTenKhachHang(txtTenKhachHang.getText());
        kh.setTrangThai(rdo1.isSelected());
        //String ngaySinh = format.format(jDateNgaysinh.getDate());
        kh.setNgaySinh(Xdate.toDate(Xdate.toString(txtNgaySinh.getDate(), "yyyy-MM-dd"), "yyyy-MM-dd"));
        kh.setEmail(txtEmail.getText());
        kh.setSdt(txtSdt.getText());
        kh.setDiaChi(txtDiaChi.getText());
        return kh;
    }
    
      public KhachHang getFormAdd() {
        KhachHang kh = new KhachHang();
        kh.setTenKhachHang(txtTenKhachHang.getText());
        kh.setTrangThai(rdo1.isSelected());
        //String ngaySinh = format.format(jDateNgaysinh.getDate());
        kh.setNgaySinh(Xdate.toDate(Xdate.toString(txtNgaySinh.getDate(), "yyyy-MM-dd"), "yyyy-MM-dd"));
        kh.setEmail(txtEmail.getText());
        kh.setSdt(txtSdt.getText());
        kh.setDiaChi(txtDiaChi.getText());
        return kh;
    }
    
    void delete() {
        int chooser = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa nhân viên?");
        if (chooser == JOptionPane.YES_OPTION) {
            try {
                String manv = txtMaKhachHang.getText();
                khachHangRepository.delKH(manv);
                fillTableKhachHang();
                JOptionPane.showMessageDialog(this, "Xóa thành công!!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Xóa thất bại");
                e.printStackTrace();
            }
        }
    }
    KhachHangService khachHangService  = new KhachHangService();
    void update() {
            try {
                if (validateKhachHangForm()) {
                    khachHangService.update(getForm());
                    fillTableKhachHang();
                    JOptionPane.showMessageDialog(this, "Update thành công!!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại!" + "\n" + "Vui lòng chọn dữ liệu ở mục danh sách để cập nhật");
                e.printStackTrace();
            }
    }
    
    void insert() {
            try {
                if (validateKhachHangForm()) {
                    khachHangService.insert(getFormAdd());
                    fillTableKhachHang();
                    JOptionPane.showMessageDialog(this, "Thêm mới thành công");
                }
            } catch (Exception e) {//
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Thêm mới thất bại");

            }
        
    }
    
    private boolean isValidPhoneNumber(String phoneNumber) {
        // Định dạng số điện thoại: 10 hoặc 11 chữ số, bắt đầu từ 0 hoặc 84
        String regex = "^(0|84)?[0-9]{9,10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    
    //    Sđt trùng
    private boolean isPhoneNumberDuplicate(String phoneNumber) {
        DefaultTableModel model = (DefaultTableModel) tbl_KhachHang.getModel();
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            String existingPhoneNumber = (String) model.getValueAt(i, 2); // Assuming 2 is the column index for phone number
            if (existingPhoneNumber.equals(phoneNumber)) {
                return true; // Phone number already exists in the table
            }
        }

        return false; // Phone number is not a duplicate
    }
    
    //    Email trùng
    private boolean isEmailDuplicate(String email) {
        DefaultTableModel model = (DefaultTableModel) tbl_KhachHang.getModel();
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            String existingEmail = (String) model.getValueAt(i, 4); // Assuming 4 is the column index for email
            if (existingEmail.equals(email)) {
                return true;
            }
        }

        return false;
    }

    private boolean isValidEmail(String email) {
        // Định dạng email sử dụng regex cơ bản
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean validateKhachHangForm() {
        // Kiểm tra tên khách hàng
        if (txtTenKhachHang.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Tên khách hàng");
            return false;
        }

        // Kiểm tra số điện thoại
        if (txtSdt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Số điện thoại");
            return false;
        } else if (!isValidPhoneNumber(txtSdt.getText())) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ");
            return false;
        } else if (isPhoneNumberDuplicate(txtSdt.getText())) {
            JOptionPane.showMessageDialog(this, "Số điện thoại đã tồn tại trong danh sách khách hàng");
            return false;
        }   

        // Kiểm tra ngày sinh
        if (txtNgaySinh.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn Ngày sinh");
            return false;
        }

        // Kiểm tra email
        if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Email");
            return false;
        } else if (!isValidEmail(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Email không hợp lệ");
            return false;
        } else if (isEmailDuplicate(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Email đã tồn tại trong danh sách khách hàng");
            return false;
        }

        // Kiểm tra địa chỉ
        if (txtDiaChi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Địa chỉ");
            return false;
        }

        return true; // Đã kiểm tra hết, thông tin hợp lệ
    }
    private int currentPage = 1;
    private int recordsPerPage = 10;
    public void nextPage() {
        int totalRecords = khachHangRepository.getTotalKH();
        int totalPages = (int) Math.ceil((double) totalRecords / recordsPerPage);

        if (currentPage < totalPages) {
            currentPage++;
            fillTableKhachHang();
        }
    }

    public void prevPage() {
        if (currentPage > 1) {
            currentPage--;
            fillTableKhachHang();
        }
    }
    
    public void goToLastPage() {
        int totalRecords = khachHangRepository.getTotalKH();
        int totalPages = (int) Math.ceil((double) totalRecords / recordsPerPage);

        if (currentPage < totalPages) {
            currentPage = totalPages;
            fillTableKhachHang();
        }
    }
    
    public void goToFirstPage() {
        if (currentPage > 1) {
            currentPage = 1;
            fillTableKhachHang();
        }
    }
    
    private void exportToExcel(File fileToSave) {
        DefaultTableModel model = (DefaultTableModel) tbl_KhachHang.getModel();
        Workbook workbook = new HSSFWorkbook(); // Sử dụng HSSFWorkbook cho định dạng .xls
        Sheet sheet = workbook.createSheet("KhachHangData");

        // Tạo header từ tên cột
        Row headerRow = sheet.createRow(0);
        for (int col = 0; col < model.getColumnCount(); col++) {
            Cell cell = headerRow.createCell(col);
            cell.setCellValue(model.getColumnName(col));
        }

        // Thêm dữ liệu từ JTable vào Excel
        for (int row = 0; row < model.getRowCount(); row++) {
            Row excelRow = sheet.createRow(row + 1);
            for (int col = 0; col < model.getColumnCount(); col++) {
                Cell cell = excelRow.createCell(col);
                cell.setCellValue(model.getValueAt(row, col).toString());
            }
        }

        // Định dạng lại các cột (ví dụ: làm to rộng cột A)
         for (int col = 0; col < 10; col++) {
            sheet.setColumnWidth(col, 5000); // 3000 đơn vị là width, tùy thuộc vào đơn vị của bạn
        }

        // Lưu Workbook vào file Excel
        try (FileOutputStream outputStream = new FileOutputStream(fileToSave)) {
            workbook.write(outputStream);
            JOptionPane.showMessageDialog(this, "Export Excel successful!\nFile saved at: " + fileToSave.getAbsolutePath());
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Export Excel failed!");
        }
    }

     
       private void showSaveDialogAndExport() {
        JFileChooser fileChooser = new JFileChooser(System.getProperty("user.home") + "/Downloads");
        fileChooser.setDialogTitle("Save Excel File");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".xls") || f.isDirectory();
            }

            public String getDescription() {
                return "Excel Files (*.xls)";
            }
        });

        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            // Add .xls extension if not present
            if (!fileToSave.getAbsolutePath().endsWith(".xls")) {
                fileToSave = new File(fileToSave.getAbsolutePath() + ".xls");
            }
            exportToExcel(fileToSave);
        }
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportExcel;
    private javax.swing.JButton btnFirstPage;
    private javax.swing.JButton btnLastPage;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JRadioButton rdo1;
    private javax.swing.JRadioButton rdo2;
    private javax.swing.JTable tbl_KhachHang;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaKhachHang;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtSearchKH;
    private javax.swing.JTextField txtTenKhachHang;
    // End of variables declaration//GEN-END:variables
}
