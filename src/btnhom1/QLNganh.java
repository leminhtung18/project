/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btnhom1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Linh Liv
 */
public class QLNganh {
    
    private Nganh[] arrNganhs;
    private DocGhiObj dgo;

    public QLNganh() throws IOException, ClassNotFoundException {
        
        dgo=new DocGhiObj("sv\\dataNganh.txt");
        arrNganhs = (Nganh[]) dgo.doc();
        
    }

    public Nganh[] getArrNganhs() {
        return arrNganhs;
    }
    
    public String[] getMaNganh(){
        String[] maNganh=new String[arrNganhs.length];
        int i=0;
        for (Nganh nganh: arrNganhs){
            maNganh[i]=nganh.getMaNganh()+" - "+nganh.getTenNganh();
            i++;
        }
        return maNganh;
    }
    
}
