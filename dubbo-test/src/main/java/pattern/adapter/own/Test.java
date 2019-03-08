/*
*  2019 
*/
package pattern.adapter.own;

/**
 * @author wangdan Date: 2019/3/7 Time: 17:45
 * @version $Id$
 */
public class Test {

    public static void main(String[] args) {
        Video video = new VideoTom();
        Watch watch = new Watch(video);
        watch.see();
    }
}