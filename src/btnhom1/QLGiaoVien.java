/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btnhom1;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Linh Liv
 */
public class QLGiaoVien{
    
    private GiaoVien[] arrGVs;
    private DocGhiObj dgo;

    public QLGiaoVien() throws IOException, ClassNotFoundException{
        dgo=new DocGhiObj("gv\\dataGV.txt");
        arrGVs=(GiaoVien[])dgo.doc();
    }
    
    public boolean checkLogin(String userID, String pass){
        for (GiaoVien arrGV : arrGVs) {
            if (arrGV.getMaGV().equalsIgnoreCase(userID)) {
                if (arrGV.getMatKhau().equals(Helper.getMD5(pass))) {
                    return true;
                }
            }
        }
        return false;
    }

    public GiaoVien[] getArrGVs() {
        return arrGVs;
    }
    
    public void addGiaoVien(GiaoVien sv){
        if (arrGVs==null){
            arrGVs=new GiaoVien[1];
            arrGVs[0]=sv;
            return ;
        }
        arrGVs=(GiaoVien[]) Helper.addArr(arrGVs, sv);
    }
    
    public void editGV(GiaoVien gv, int id) {
        arrGVs[id-1]=gv;
    }
    
}
