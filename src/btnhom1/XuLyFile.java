/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btnhom1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author Linh Liv
 */
public class XuLyFile{
    
    /**
     *
     * @param dir
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */

    
    public static ArrayList<String> docTungDong(String dir) throws FileNotFoundException, IOException{
        FileReader fr=new FileReader(dir);
       BufferedReader br=new BufferedReader(fr);
       String str;
        ArrayList<String> kq=new ArrayList<>();
       
        while ((str=br.readLine())!=null){
           kq.add(str);
       };
       return kq;
    }
    
    public static String doc(String dir) throws FileNotFoundException, IOException{
       
       FileReader fr=new FileReader(dir);
       BufferedReader br=new BufferedReader(fr);
       String str;
       String ok = "";
       while ((str=br.readLine())!=null){
           ok+=str;
           ok+="\r\n";
       };
       fr.close();
       br.close();
       return ok;
    }
    
    public static void ghi(String dir, String str) throws IOException{
        FileWriter fw=new FileWriter(dir);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(str);
        bw.close();
        fw.close();
    }
}
