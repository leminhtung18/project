/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btnhom1;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 *
 * @author Linh Liv
 */
public class Helper {

    public static String getMD5(String str) {
        String result = "";
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
            digest.update(str.getBytes());
            BigInteger bigInteger = new BigInteger(1, digest.digest());
            result = bigInteger.toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String tangKey(String str) {
        String strDau = str.substring(0, 2);
        String strSo = str.substring(2);
        int key = Integer.parseInt(strSo) + 1;
        String temp= strDau + key;
        if (temp.length()>=str.length()){
            return temp;
        }
        String them="";
        for (int i=0;i<(str.length()-temp.length());i++){
            them+="0";
        }
        return strDau+them+key;
    }
        
    public static boolean checkFile(String dir){
        File f=new File(dir);
        if (!f.exists()){
            return false;
        }
        return f.length()!=0;
    }
    
    public static boolean checkFile(String dir,boolean createFile) throws IOException{
        File f=new File(dir);
        if (!f.exists()){
            if (createFile==true){
                f.createNewFile();
            }
            return false;
        }
        return f.length()!=0;
    }
    
    public static Object[] addArr(Object[] obj,Object objAdd){
        Object[] newArr;
        newArr=Arrays.copyOf(obj, obj.length+1);
        newArr[obj.length]=objAdd;
        return newArr;
    }
}
