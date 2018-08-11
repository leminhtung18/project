/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btnhom1;

/**
 *
 * @author Linh Liv
 */
public class MonHoc {
    
    private String tenMH;
    private int maMH;

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }
    
    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "tenMH=" + tenMH + ", maMH=" + maMH + '}';
    }
    
    
    
}
