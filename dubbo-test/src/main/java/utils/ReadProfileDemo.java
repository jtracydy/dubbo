/*
*  2019 
*/
package utils;

import com.google.common.collect.Maps;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;

/**
 * @author wangdan Date: 2019/10/11 Time: 11:43
 * @version $Id$
 */

public class ReadProfileDemo {

    private static final String path = "/Users/wangdan/Downloads/";
    private static final String name1 = "country.txt";
    private static final String name2 = "cccc.txt";
    private static final String outName = "res.sql";

    private static Map<String, String> m1 = Maps.newHashMap();
    private static Map<String, Entity> m2 = Maps.newHashMap();

    public static void main(String[] args) throws IOException {
        readFileToList1(path + name1);
        readFileToList2(path + name2);
        deal();
    }


    private static void deal() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : m1.entrySet()) {
            String key = entry.getKey();
            if (m2.containsKey(key)) {
                String str = "update city set attrs = attrs||hstore ('continent' , '" + m2.get(key).getConten() + "')||hstore ('continent_area' , '" + m2.get(key).getConten_area() + "') where id = " + entry.getValue() + ";";
                sb.append(str);
                sb.append("\n");
            } else {
                System.out.println("没有对应关系=" + entry.getKey() + "" + entry.getValue());
            }
        }
        outPut(path + outName, sb.toString());
    }


    public static void readFileToList1(String name) throws IOException {
        File srcFile = new File(name);
        InputStream input = null;
        InputStreamReader reader = null;
        BufferedReader br = null;

        int count = 0;
        try {
            input = new FileInputStream(srcFile);
            reader = new InputStreamReader(input, Charsets.toCharset("UTF-8"));
            br = new BufferedReader(reader);

            String line = "";
            while ((line = br.readLine()) != null) {
                if (StringUtils.isBlank(line)) {
                    continue;
                }
                String[] arr = line.split("\t");
                count++;
                m1.put(arr[1].trim(), arr[0].trim());
            }
        } finally {
            System.out.println("read count = " + count);
            IOUtils.closeQuietly(br);
            IOUtils.closeQuietly(reader);
            IOUtils.closeQuietly(input);
        }
    }

    public static void readFileToList2(String name) throws IOException {
        File srcFile = new File(name);
        InputStream input = null;
        InputStreamReader reader = null;
        BufferedReader br = null;

        int count = 0;
        try {
            input = new FileInputStream(srcFile);
            reader = new InputStreamReader(input, Charsets.toCharset("UTF-8"));
            br = new BufferedReader(reader);

            String line = "";
            while ((line = br.readLine()) != null) {
                if (StringUtils.isBlank(line)) {
                    continue;
                }
                Entity entity = new Entity();
                String[] arr = line.split(",");
                entity.setConten(arr[3].trim());
                entity.setConten_area(arr[4].trim());
                count++;
                m2.put(arr[0].trim(), entity);
            }
        } finally {
            System.out.println("read count = " + count);
            IOUtils.closeQuietly(br);
            IOUtils.closeQuietly(reader);
            IOUtils.closeQuietly(input);
        }
    }

    public static void outPut(String outPath, String content) throws IOException {
        File targetFile = new File(outPath);
        OutputStream out = null;
        OutputStreamWriter writer = null;
        BufferedWriter bw = null;
        try {
            out = new FileOutputStream(targetFile, false);
            writer = new OutputStreamWriter(out);
            bw = new BufferedWriter(writer);
            bw.write(content);
            bw.flush();
        } finally {
            IOUtils.closeQuietly(bw);
            IOUtils.closeQuietly(writer);
            IOUtils.closeQuietly(out);
        }
    }

    static class Entity {

        private String conten;
        private String conten_area;

        public String getConten() {
            return conten;
        }

        public void setConten(String conten) {
            this.conten = conten;
        }

        public String getConten_area() {
            return conten_area;
        }

        public void setConten_area(String conten_area) {
            this.conten_area = conten_area;
        }
    }
}