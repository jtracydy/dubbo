/*
*  2019 
*/
package nio.own;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author wangdan Date: 2019/2/21 Time: 16:58
 * @version $Id$
 */
public class Demo01 {

    public static void main(String[] args) {

    }


    /**
     * 1 创建文件
     * 2 获取文件channel
     * 3 创建缓冲区
     * 4 读取缓冲区中的内容
     * 5 循环取出文件中的内容
     * 6 filp
     */

    private static void readByNio(String path) throws IOException {
        RandomAccessFile randomAccessFile = null;
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(path,"rw");
            fileChannel = randomAccessFile.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(24);
            int no = fileChannel.read(buffer);
            while(no != -1){
                System.out.println("nio read content"+no);
                buffer.flip();

                while(buffer.hasRemaining()){
                    System.out.println(buffer.get());
                }
                buffer.clear();
                no = fileChannel.read(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            randomAccessFile.close();
            fileChannel.close();
        }


    }
}