/*
*  2019 
*/
package io.file;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * @author wangdan Date: 2019/1/16 Time: 19:56
 * @version $Id$
 */
public class Demo03 {

    /**
     * 字符流
     * @param args
     */
    public static void main(String[] args) {
        String path = "/Users/wangdan/work/oi/fw.txt";
//        output(path,"正常是啊啊的发达地方adafda");
        input(path);
    }

    public static void output(String path,String content){
        FileWriter fw = null;
        try{
            fw = new FileWriter(path);
            fw.write(content.toCharArray());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                fw.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void input(String path){
        FileReader fr = null;
        try{
            fr = new FileReader(path);
            char c [] = new char[50];
            fr.read(c);
            System.out.println(new String(c));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    /**
     * 字节流转换流
     * @param path
     * @param content
     */
    public static void outputWrite(String path,String content){
        InputStreamReader isr = null;
        try {
            isr = new InputStreamReader(new FileInputStream(path),"utf-8");
            isr.read();
        } catch (Exception e) {
        } finally {
            try {
            } catch (Exception e) {
            }
        }
    }

    public static void inputRead(String path){
        try {
        } catch (Exception e) {
        } finally {
            try {
            } catch (Exception e) {
            }
        }
    }
}