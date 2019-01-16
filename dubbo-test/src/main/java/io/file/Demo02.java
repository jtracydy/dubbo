/*
*  2019 
*/
package io.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author wangdan Date: 2019/1/16 Time: 19:36
 * @version $Id$
 */
public class Demo02 {

    /**
     * 字节流缓冲
     *
     * @param args
     */
    public static void main(String[] args) {
        String path = "/Users/wangdan/work/oi/bf.txt";
        //bufferOutput(path,"adfadfadfzcvzcvzcv");
        bufferInput(path);
    }

    private static void bufferOutput(String path, String content) {
        FileOutputStream file = null;
        BufferedOutputStream bis = null;
        try {
            file = new FileOutputStream(path);
            bis = new BufferedOutputStream(file);
            bis.write(content.getBytes());
            bis.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                file.close();
                bis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private static void bufferInput(String path) {
        FileInputStream file = null;
        BufferedInputStream bis = null;
        try{
            file = new FileInputStream(path);
            bis = new BufferedInputStream(file);
            byte [] b = new byte[20];
            bis.read(b);
            System.out.println(new String(b));
        }catch (Exception e){

        }
    }
}