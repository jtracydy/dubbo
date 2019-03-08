/*
*  2019 
*/
package pattern.adapter.own;

/**
 * @author wangdan Date: 2019/3/7 Time: 17:42
 * @version $Id$
 */
public class VideoTom implements Video{

    @Override
    public void playMovie() {
        System.out.println("Video play movie");
    }
}