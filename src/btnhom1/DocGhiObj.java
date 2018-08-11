/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btnhom1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Linh Liv
 */
public class DocGhiObj {

    protected FileInputStream fis;
    protected ObjectInputStream ois;
    protected FileOutputStream fos;
    protected ObjectOutputStream oos;
    protected String dir;

    protected DocGhiObj(String dir) throws FileNotFoundException, IOException {
//        fis=new FileInputStream(dir);
//        ois=new ObjectInputStream(fis);
//        fos=new FileOutputStream(dir);
//        oos=new ObjectOutputStream(fos);
        this.dir = dir;
    }

//    protected void changeDir(String dir) throws FileNotFoundException, IOException{
//                
//    }
    protected void close() throws IOException {
        fis.close();
        ois.close();
        fos.close();
        oos.close();
    }

    public void ghi(Object obj) throws IOException {
        fos = new FileOutputStream(dir);
        oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
    }

    public Object doc() throws IOException, ClassNotFoundException {
        if (!Helper.checkFile(dir,true)){
            return null;
        }
        fis = new FileInputStream(dir);
        ois = new ObjectInputStream(fis);   
        return ois.readObject();
    }
}
