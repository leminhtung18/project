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
public class PLGV implements Serializable{
    
    private int maPL;
    private String tenPL;

    public PLGV(int maPL, String tenPL) {
        this.maPL = maPL;
        this.tenPL = tenPL;
    }
    
    public int getMaPL() {
        return maPL;
    }

    public void setMaPL(int maPL) {
        this.maPL = maPL;
    }

    public String getTenPL() {
        return tenPL;
    }

    public void setTenPL(String tenPL) {
        this.tenPL = tenPL;
    }

    @Override
    public String toString() {
        return "PLGV{" + "maPL=" + maPL + ", tenPL=" + tenPL + '}';
    }
}
