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
public class QLLopTC {
    
    private LopTC[] arrLopTCs;
    private DocGhiObj dgo;

    public QLLopTC() throws IOException, ClassNotFoundException {
        
        dgo=new DocGhiObj("monhoc\\lopTC.txt");
        arrLopTCs = (LopTC[])dgo.doc();
        
    }
    
    
    
}
