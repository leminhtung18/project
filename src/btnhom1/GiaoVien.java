/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btnhom1;

import java.io.Serializable;



/**
 *
 * @author Linh Liv
 */
public class GiaoVien implements Serializable{
    
    private String maGV, matKhau, hoTen;
    private int tuoi, maPLGV;

//    public GiaoVien(String[] data) {
//        this.maGV=data[0];
//        this.matKhau=data[1];
//        this.hoTen=data[2];
//        this.tuoi=Integer.parseInt(data[3]);
//        this.maPLGV=Integer.parseInt(data[4]);
//    }
    
    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getMaPLGV() {
        return maPLGV;
    }

    public void setMaPLGV(int maPLGV) {
        this.maPLGV = maPLGV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "GiaoVien{" + "maGV=" + maGV + ", matKhau=" + matKhau + ", hoTen=" + hoTen + ", tuoi=" + tuoi + ", maPLGV=" + maPLGV + '}';
    }
    
    
        
}
