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
public class QLMonHoc {
    
    private MonHoc[] arrMonHocs;
    private DocGhiObj dgo;

    public QLMonHoc() throws IOException, ClassNotFoundException {
        
        dgo=new DocGhiObj("monhoc\\dataMH.txt");
        arrMonHocs=(MonHoc[]) dgo.doc();
        
    }
    
}
