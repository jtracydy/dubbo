/*
*  2019 
*/
package nio.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author wangdan Date: 2019/2/21 Time: 16:12
 * @version $Id$
 */
public class Demo01 {


    public static void main(String[] args) {
        String str = "/Users/wangdan/work/niowrite.txt";
        String content =" nio nio";

        try {
            writeByNio(str,content);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void writeByNio(String path, String content) throws IOException {
        File file = new File(path);
        FileOutputStream fos = new FileOutputStream(file);
        FileChannel fileChannel = fos.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put(content.getBytes());
        buffer.flip();
        fileChannel.write(buffer);
        fileChannel.close();
        fos.close();
    }
}