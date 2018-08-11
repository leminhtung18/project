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
public class QLDiem {
    
    private Diem[] arrDiems;
    private DocGhiObj dgo;

    public QLDiem() throws IOException, ClassNotFoundException {
        
        dgo=new DocGhiObj("diem\\dataDiem.txt");
        arrDiems =(Diem[])dgo.doc();
    }
    
}
