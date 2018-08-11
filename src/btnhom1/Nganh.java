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
public class Nganh implements Serializable{
    
    private int maNganh;
    private String tenNganh;

    public int getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(int maNganh) {
        this.maNganh = maNganh;
    }

    public String getTenNganh() {
        return tenNganh;
    }

    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }

    @Override
    public String toString() {
        return "Nganh{" + "maNganh=" + maNganh + ", tenNganh=" + tenNganh + '}';
    }
}
