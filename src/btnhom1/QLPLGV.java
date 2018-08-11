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
public class QLPLGV {

    private PLGV[] arrPLGVs = null;
    private DocGhiObj dgo;
    
    public QLPLGV() throws IOException, ClassNotFoundException {
        dgo = new DocGhiObj("gv\\dataPLGV.txt");
        arrPLGVs = (PLGV[]) dgo.doc();
    }
        
    public PLGV[] getArrPLGVs() {
        return arrPLGVs;
    }
    
    public void reload() throws IOException, ClassNotFoundException{
        arrPLGVs=(PLGV[])dgo.doc();
    }
    
    public void addPLGV(PLGV plgv) {
        if (this.arrPLGVs == null) {
            arrPLGVs = new PLGV[1];
            arrPLGVs[0] = plgv;
            return;
        }      
        arrPLGVs = (PLGV[]) Helper.addArr(arrPLGVs, plgv);
    }
    
    public void editPLGV(PLGV plgv, int id) {
        arrPLGVs[id-1]=plgv;
    }
    
    public String[] getPLGV(){
        String[] str=new String[arrPLGVs.length];
        int i=0;
        for (PLGV pl: arrPLGVs){
            str[i]=pl.getMaPL()+" - "+pl.getTenPL();
            i++;
        }
        return str;
    }
    
    public boolean checkTrung(String tenPL){
        if (arrPLGVs==null){
            return false;
        }
        for (PLGV pl : arrPLGVs){
            if (pl.getTenPL().equalsIgnoreCase(tenPL)){
                return true;
            }
        }
        return false;
    }
    
    public void ghi() throws IOException {
        dgo.ghi(arrPLGVs);
    }
}
