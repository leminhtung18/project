package btnhom1;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmDangNhap {

    JFrame main;
    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnDangNhap, btnThoat;
    PreparedStatement stmt;
    ResultSet rs;

    public frmDangNhap() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        main = new JFrame("Đăng Nhập");
        main.setBounds((int) width / 2 - 250, (int) height / 2 - 200, 500, 400);
        main.setResizable(false);
        main.setLayout(null);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Quản Lý Sinh Viên");
        label.setFont(new Font("Courier New", Font.BOLD, 25));
        label.setBounds(130, 20, 400, 50);
        main.add(label);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Viết tên đăng nhập"));
        panel.setBounds(50, 100, 400, 150);
        panel.setLayout(null);
        JLabel label1 = new JLabel("Tên đăng nhập:");
        label1.setBounds(10, 40, 150, 20);
        JLabel label2 = new JLabel("Mật khẩu:");
        label2.setBounds(10, 70, 150, 20);
        panel.add(label1);
        panel.add(label2);
        txtUser = new JTextField();
        txtUser.setBounds(170, 40, 200, 20);
        txtPass = new JPasswordField();
        txtPass.setBounds(170, 70, 200, 20);
        panel.add(txtUser);
        panel.add(txtPass);
        main.add(panel);

        btnDangNhap = new JButton("Đăng Nhập");
        btnDangNhap.setBounds(80, 260, 120, 60);
        btnThoat = new JButton("Thoát");
        btnThoat.setBounds(280, 260, 120, 60);
        main.add(btnDangNhap);
        main.add(btnThoat);

        txtPass.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    try {
                        DangNhap();
                    } catch (IOException | ClassNotFoundException ex) {
                        Logger.getLogger(frmDangNhap.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        btnDangNhap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    DangNhap();
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(frmDangNhap.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    void DangNhap() throws IOException, ClassNotFoundException {
        boolean pass = false;
        String passwords = String.copyValueOf(txtPass.getPassword());
        if ("".equals(txtUser.getText().trim()) || "".equals(passwords.trim())) {
            JOptionPane.showMessageDialog(null, "Không được bỏ trống tên đăng nhập hoặc mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtUser.getText().toLowerCase().contains("gv")) {
            QLGiaoVien qlgv = new QLGiaoVien();
            if (!qlgv.checkLogin(txtUser.getText(), passwords)) {
                JOptionPane.showMessageDialog(null, "Sai tên đăng nhập hoặc mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            pass = true;
        }
        if (txtUser.getText().toLowerCase().contains("sv")) {
            QLSinhVien qlsv = new QLSinhVien();
            if (!qlsv.checkLogin(txtUser.getText(), passwords)) {
                JOptionPane.showMessageDialog(null, "Sai tên đăng nhập hoặc mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            pass = true;
        }
        if (pass == false) {
            JOptionPane.showMessageDialog(null, "Sai tên đăng nhập hoặc mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // xử lý đăng nhập thành công
        System.out.println("Thành công");
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                frmDangNhap form = new frmDangNhap();

            }
        });
    }
}
