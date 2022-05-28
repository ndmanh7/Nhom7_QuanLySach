/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GiaoDien;

import CSDL.DataIO;
import static CSDL.DataIO.dsHoaDon;
import static CSDL.DataIO.dsSach;

import CSDL.HoaDon;
import CSDL.Sach;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ADMIN
 */
public class QuanLyHoaDon extends javax.swing.JFrame {

   DefaultTableModel model = null;
   
   
   
   
    public QuanLyHoaDon() {
        initComponents();
        
        model = (DefaultTableModel) tableHoaDon.getModel();
        
        loadTable();
        
        
    }
    private void loadTable(){
        for (int i = DataIO.dsHoaDon.size() - 1 ; i >= DataIO.dsHoaDon.size() / 2; i--) {
            DataIO.dsHoaDon.remove(i);
        }
        for(int i = tableHoaDon.getRowCount() - 1; i>=0; i--){
            model.removeRow(i);
        }
        DataIO.loadHoaDon();
        
        
        
        for (HoaDon hoaDon : dsHoaDon) {
            Vector vecto = new Vector();
            vecto.add(hoaDon.getMaHoaDon());
            vecto.add(hoaDon.getMaNguoiMua());
            vecto.add(hoaDon.getMaSach());
            vecto.add(hoaDon.getNgayMua());
            vecto.add(hoaDon.getSoLuongMua());
            vecto.add(hoaDon.getThanhTien());
            
            
            model.addRow(vecto);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnQuayLai = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHoaDon = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaNguoiMua = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNgayMua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSoLuongMua = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
<<<<<<< HEAD
        jLabel1.setText("HÓA ĐƠN");
=======
        jLabel1.setText("Hóa đơn");
>>>>>>> 852af5adf8713b881522410ce8f8201db2776fb1
        jLabel1.setToolTipText("");
        jLabel1.setRequestFocusEnabled(false);

        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiaoDien/back.png"))); // NOI18N
        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        btnTimKiem.setText("Tìm kiếm");
=======
        btnTimKiem.setText("Tìm kiếm");
>>>>>>> 852af5adf8713b881522410ce8f8201db2776fb1
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuayLai)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
<<<<<<< HEAD
                "Mã hóa đơn", "Mã người mua", "Mã sách", "Ngày mua", "Số lượng mua", "Thành  tiền"
=======
                "Mã hóa đơn", "Mã người mua", "Mã sách", "Ngày mua", "Số lượng mua", "Thành tiền"
>>>>>>> 852af5adf8713b881522410ce8f8201db2776fb1
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHoaDonMouseClicked(evt);
            }
        });
        tableHoaDon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableHoaDonKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableHoaDon);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
<<<<<<< HEAD
        jLabel2.setText("Mã hóa đơn");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Mã người mua");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Mã sách");

        jLabel5.setText("Ngày mua");
=======
        jLabel2.setText("Mã hóa đơn");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Mã người mua");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Mã sách");

        jLabel5.setText("Ngày mua");
>>>>>>> 852af5adf8713b881522410ce8f8201db2776fb1

        txtNgayMua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayMuaActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        jLabel6.setText("Số lượng mua");

        btnCapNhat.setText("Cập nhật");
=======
        jLabel6.setText("Số lượng mua");

        btnCapNhat.setText("Cập nhật");
>>>>>>> 852af5adf8713b881522410ce8f8201db2776fb1
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(158, 158, 158))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(txtMaNguoiMua)
                    .addComponent(txtMaSach)
                    .addComponent(txtNgayMua)
                    .addComponent(txtSoLuongMua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMaNguoiMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNgayMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSoLuongMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNgayMuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayMuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayMuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        HoaDon hoaDon = new HoaDon();
        hoaDon.setMaHoaDon(txtMaHoaDon.getText()); 
        hoaDon.setMaNguoiMua(txtMaNguoiMua.getText());
        hoaDon.setMaSach(txtMaSach.getText());
        hoaDon.setNgayMua(txtNgayMua.getText());
        hoaDon.setSoLuongMua(Integer.parseInt(txtSoLuongMua.getText()));
        
        
        for (int j = DataIO.dsSach.size() - 1 ; j >= DataIO.dsSach.size() / 2; j--) {
            DataIO.dsSach.remove(j);
        }
        DataIO.loadSach();
        int check = 0, i = 0;
        for (Sach sach : dsSach) {
            if(sach.getMaSach().equals(txtMaSach.getText())){
                i = dsSach.indexOf(sach);
                check++;
            }
        }
        
        if(check != 0){
            Sach sach = dsSach.get(i);
            sach.setSoLuongCon(sach.getSoLuongCon() - hoaDon.getSoLuongMua());
            dsSach.set(i, sach);
            hoaDon.setThanhTien(hoaDon.getSoLuongMua()*sach.getDonGia());
            DataIO.dsHoaDon.add(hoaDon);
        
        HoaDon hoaDon1 = DataIO.dsHoaDon.get(DataIO.dsHoaDon.size() - 1);
        model.addRow(new Object[]{
            hoaDon1.getMaHoaDon(),hoaDon1.getMaNguoiMua(),hoaDon1.getMaSach(),
            hoaDon1.getNgayMua(),hoaDon1.getSoLuongMua(),hoaDon1.getThanhTien()
        });
        DataIO.writeHoaDon();
        DataIO.writeSach();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Khong ton tai sach nay!");
        }
        
        
        
        
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void tableHoaDonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableHoaDonKeyReleased
        int i = tableHoaDon.getSelectedRow();
        
        
        txtMaHoaDon.setText(model.getValueAt(i, 0).toString());
        txtMaNguoiMua.setText(model.getValueAt(i, 1).toString());
        txtMaSach.setText(model.getValueAt(i, 2).toString());
        txtNgayMua.setText(model.getValueAt(i, 3).toString());
        txtSoLuongMua.setText(model.getValueAt(i, 4).toString());
        
    }//GEN-LAST:event_tableHoaDonKeyReleased

    private void tableHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHoaDonMouseClicked
        int i = tableHoaDon.getSelectedRow();
        
        
        txtMaHoaDon.setText(model.getValueAt(i, 0).toString());
        txtMaNguoiMua.setText(model.getValueAt(i, 1).toString());
        txtMaSach.setText(model.getValueAt(i, 2).toString());
        txtNgayMua.setText(model.getValueAt(i, 3).toString());
        txtSoLuongMua.setText(model.getValueAt(i, 4).toString());
        
        
    }//GEN-LAST:event_tableHoaDonMouseClicked

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        int i = tableHoaDon.getSelectedRow();
        
        HoaDon hoaDon = new HoaDon();
        hoaDon.setMaHoaDon(txtMaHoaDon.getText());
        hoaDon.setMaNguoiMua(txtMaNguoiMua.getText());
        hoaDon.setMaSach(txtMaSach.getText());
        hoaDon.setNgayMua(txtNgayMua.getText());
        hoaDon.setSoLuongMua(Integer.parseInt(txtSoLuongMua.getText()));
        DataIO.loadSach();
        int check1 = 0, i1 = 0;
        for (Sach sach : dsSach) {
            if(sach.getMaSach().equals(txtMaSach.getText())){
                i1 = dsSach.indexOf(sach);
                check1++;
            }
        }
        
        if(check1 != 0){
            Sach sach = dsSach.get(i1);
            hoaDon.setThanhTien(hoaDon.getSoLuongMua()*sach.getDonGia());
            
        }
        
        
        
        
        
        DataIO.dsHoaDon.set(i, hoaDon);
        
        model.setValueAt(hoaDon.getMaHoaDon(), i, 0);
        model.setValueAt(hoaDon.getMaNguoiMua(), i, 1);
        model.setValueAt(hoaDon.getMaSach(), i, 2);
        model.setValueAt(hoaDon.getNgayMua(), i, 3);
        model.setValueAt(hoaDon.getSoLuongMua(), i, 4);
        model.setValueAt(hoaDon.getThanhTien(), i, 5);
       
        
        DataIO.writeHoaDon();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int i = tableHoaDon.getSelectedRow();
        
        DataIO.dsHoaDon.remove(i);
        
        model.removeRow(i);
        DataIO.writeHoaDon();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        NhanVienMenu menu = new NhanVienMenu();
        menu.pack();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        model.fireTableDataChanged();
        TableRowSorter timKiem = new TableRowSorter(model);
        tableHoaDon.setRowSorter(timKiem);
        timKiem.setRowFilter(RowFilter.regexFilter(txtTimKiem.getText()));
    }//GEN-LAST:event_btnTimKiemActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyHoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHoaDon;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtMaNguoiMua;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNgayMua;
    private javax.swing.JTextField txtSoLuongMua;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
