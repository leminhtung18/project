/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btnhom1;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Linh Liv
 */
public class frmPhanLoaiGiaoVien extends javax.swing.JFrame {

    private PLGV[] arrPlgvs = null;
    private QLPLGV ql = null;
    private int maPLGV;

    /**
     * Creates new form frmPhanLoaiGiaoVien
     */
    public frmPhanLoaiGiaoVien() throws IOException, ClassNotFoundException {
        initComponents();
        myinit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaPhanLoai = new javax.swing.JTextField();
        txtTenPhanLoai = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltData = new javax.swing.JList<>();
        btnSua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Phân Loại Giáo Viên");

        jLabel2.setText("Mã phân loại:");

        jLabel3.setText("Tên phân loại:");

        txtMaPhanLoai.setEnabled(false);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel4.setText("Data Phân Loại:");

        ltData.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ltData);

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset))
                    .addComponent(txtTenPhanLoai)
                    .addComponent(txtMaPhanLoai)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaPhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenPhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnReset))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSua)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String strTenPhanLoai = this.txtTenPhanLoai.getText().trim();
        if (!strTenPhanLoai.equals("")) {
            if (!ql.checkTrung(strTenPhanLoai)) {

                //sửa pl
                if (btnThem.getText().equalsIgnoreCase("Xong")) {
                    PLGV plgv = new PLGV(Integer.parseInt(txtMaPhanLoai.getText()), strTenPhanLoai);
                    ql.editPLGV(plgv, Integer.parseInt(txtMaPhanLoai.getText()));
                    try {
                        ql.ghi();
                        this.reset();
                    } catch (IOException | ClassNotFoundException ex) {
                        Logger.getLogger(frmPhanLoaiGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    return ;
                }
                
                //thêm pl
                PLGV plgv = new PLGV(this.maPLGV, strTenPhanLoai);
                ql.addPLGV(plgv);
                try {
                    ql.ghi();
                    this.reset();
                    JOptionPane.showMessageDialog(null, "Đăng ký thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(frmPhanLoaiGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
                }
                return;
            }
            JOptionPane.showMessageDialog(null, "Trùng trong danh sách", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Không được bỏ trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        try {
            // TODO add your handling code here:
            this.reset();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(frmPhanLoaiGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:

        if (!ltData.isSelectionEmpty()) {
            int i = 0;
            for (PLGV pl : arrPlgvs) {
                if (i == ltData.getSelectedIndex()) {
                    txtMaPhanLoai.setText(String.valueOf(pl.getMaPL()));
                    txtTenPhanLoai.setText(pl.getTenPL());
                    btnThem.setText("Xong");
                    break;
                }
                i++;
            }
            return;
        }
        JOptionPane.showMessageDialog(null, "Chưa chọn", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnSuaActionPerformed

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
            java.util.logging.Logger.getLogger(frmPhanLoaiGiaoVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPhanLoaiGiaoVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPhanLoaiGiaoVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPhanLoaiGiaoVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmPhanLoaiGiaoVien().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(frmPhanLoaiGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> ltData;
    private javax.swing.JTextField txtMaPhanLoai;
    private javax.swing.JTextField txtTenPhanLoai;
    // End of variables declaration//GEN-END:variables

    private void myinit() throws IOException, ClassNotFoundException {
        ql = new QLPLGV();
        arrPlgvs = ql.getArrPLGVs();
        this.setMaPL();
        txtMaPhanLoai.setText(String.valueOf(this.maPLGV));
        DefaultListModel listDataPLGV = new DefaultListModel();
        if (arrPlgvs != null) {
            for (String plgv : ql.getPLGV()) {
                listDataPLGV.addElement(plgv);
            }
            ltData.setModel(listDataPLGV);
        }
    }

    private void setMaPL() {
        System.out.println(Arrays.toString(arrPlgvs));
        if (arrPlgvs == null) {
            this.maPLGV = 1;
            return;
        }
        this.maPLGV = arrPlgvs[arrPlgvs.length - 1].getMaPL();
        this.maPLGV++;
    }

    private void reset() throws IOException, ClassNotFoundException {
        ql.reload();
        this.arrPlgvs = ql.getArrPLGVs();
        this.setMaPL();
        txtMaPhanLoai.setText(String.valueOf(this.maPLGV));
        txtTenPhanLoai.setText("");
        DefaultListModel listDataPLGV = new DefaultListModel();
        if (arrPlgvs != null) {
            for (String plgv : ql.getPLGV()) {
                listDataPLGV.addElement(plgv);
            }
            ltData.setModel(listDataPLGV);
        }
    }
}
