/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btnhom1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;


/**
 *
 * @author Linh Liv
 */
public class main {

    public static void main(String[] args) throws IOException, ClassNotFoundException{
//        XuLyFile.ghi("gv\\dataGV.txt", "GV00001|daylamatkhau|Nguyễn Văn A|40|1\r\n"
//                + "GV00002|daylamatkhau1|Nguyễn Văn B|40|1\r\n"
//        +"GV00003|daylamatkhau3|Nguyễn Văn C|40|1\r\n");

//        XuLyFile.ghi("gv\\dataPLGV.txt", "2|bộ môn\r\n"
//                + "1|quản lý");
//    XuLyFile.ghi("monhoc\\dataMH.txt", 
//              "1|Môn A\r\n"
//            + "2|Môn B\r\n"
//            + "3|Môn C\r\n");
//    XuLyFile.ghi("monhoc\\lopTC.txt", 
//            "1|L1 - Môn A|1|GV00001\r\n"
//          + "2|L2 - Môn C|2|GV00002\r\n"
//                    + "3|L3 - Môn C|2|GV00003\r\n"
//                    + "4|L1 - Môn B|3|GV00001\r\n");
//    }
//        XuLyFile.ghi("sv\\dataNganh.txt", "1|An toàn\r\n"
//                + "2|CNTT\r\n"
//                + "3|Điện Tử Viễn Thông\r\n"
//                + "4|Kinh Tế");

//        XuLyFile.ghi("diem\\dataDiem.txt", "1|SV12001|5.1\r\n"
//                + "2|SV12002|6.2\r\n"
//                + "3|SV12003|1.5\r\n");
//    GiaoVien[] gv=new GiaoVien[2];
//    gv[0]=new GiaoVien();
//    gv[0].setHoTen("Đỗ Quang Linh");
//    gv[0].setMaGV("GV00001");
//    gv[0].setMaPLGV(0);
//    gv[0].setMatKhau("4297f44b13955235245b2497399d7a93");
//    gv[0].setTuoi(40);
//    gv[1]=new GiaoVien();
//    gv[1].setHoTen("Toi la A");
//    gv[1].setMaGV("GV00002");
//    gv[1].setMaPLGV(1);
//    gv[1].setMatKhau("4297f44b13955235245b2497399d7a93");
//    gv[1].setTuoi(49);
//    DocGhiObj dgo=new DocGhiObj("gv\\dataGV.txt");
//    dgo.ghi(gv);

//    Nganh[] ng=new Nganh[4];
//    ng[0]=new Nganh();
//    ng[0].setMaNganh(1);
//    ng[0].setTenNganh("An Toàn Thông Tin");
//    ng[1]=new Nganh();
//    ng[1].setMaNganh(2);
//    ng[1].setTenNganh("Công Nghệ Thông Tin");
//    ng[2]=new Nganh();
//    ng[2].setMaNganh(3);
//    ng[2].setTenNganh("Điện Tử Viễn Thông");
//    ng[3]=new Nganh();
//    ng[3].setMaNganh(4);
//    ng[3].setTenNganh("Kinh Tế");
//    DocGhiObj dgo=new DocGhiObj("sv\\dataNganh.txt");
////    dgo.ghi(ng);
//    QLNganh ql=new QLNganh();

frmPhanLoaiGiaoVien fr=new frmPhanLoaiGiaoVien();
fr.setVisible(true);
    }
}
