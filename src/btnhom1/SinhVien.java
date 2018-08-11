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
public class SinhVien implements Serializable{
    
    private String maSV, matKhau, hoTen, gioiTinh;
    private int tuoi, maNganh;
    public static boolean logged=false;

    public SinhVien() {
    }

    public SinhVien(String maSV, String matKhau, String hoTen, String gioiTinh, int tuoi, int maNganh) {
        this.maSV = maSV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.maNganh = maNganh;
    }
        
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(int maNganh) {
        this.maNganh = maNganh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", matKhau=" + matKhau + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", tuoi=" + tuoi + ", maNganh=" + maNganh + '}';
    }
    
}
