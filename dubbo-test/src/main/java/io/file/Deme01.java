/*
*  2019 
*/
package io.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wangdan Date: 2019/1/8 Time: 11:11
 * @version $Id$
 */
public class Deme01 {

    /**
     * 节点流文件操作
     */
    public static void main(String[] args) {
        String path = "/Users/wangdan/work/oi/file.txt";
//        String content = "阿打发打发打发打发点啊啊啊啊啊";
//        fileOutpt(path,content);

        fileInput(path);
    }


    public static void fileOutput(String path, String content) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(path);
            byte[] bytes = content.getBytes();
            fos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void fileInput(String path){
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(path);
            byte bytes[] = new byte[fis.available()];
            int i = fis.read(bytes);
            System.out.println(new String(bytes));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}