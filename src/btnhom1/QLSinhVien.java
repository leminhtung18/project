/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btnhom1;

import java.io.IOException;

/**
 *
 * @author Linh Liv
 */
public class QLSinhVien {
    
    private SinhVien[] arrSVs=null;
    private DocGhiObj dgo;
    
    public QLSinhVien() throws IOException, ClassNotFoundException {
        dgo = new DocGhiObj("sv\\dataSV.txt");
        arrSVs = (SinhVien[]) dgo.doc();      
    }
    
    public boolean checkLogin(String userID, String pass){
        for (SinhVien arrSV : arrSVs) {
            if (arrSV.getMaSV().equalsIgnoreCase(userID)) {
                if (arrSV.getMatKhau().equals(Helper.getMD5(pass))) {
                    return true;
                }
            }
        }
        return false;
    }

    public SinhVien[] getArrSVs() {
        return arrSVs;
    }
    
    public void addSinhVien(SinhVien sv){
        if (arrSVs==null){
            arrSVs=new SinhVien[1];
            arrSVs[0]=sv;
            return ;
        }
        arrSVs=(SinhVien[]) Helper.addArr(arrSVs, sv);
    }
    
    public void ghi() throws IOException{
        dgo.ghi(arrSVs);
    }
    
}
