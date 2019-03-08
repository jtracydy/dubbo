/*
*  2019 
*/
package pattern.adapter.own;

/**
 * @author wangdan Date: 2019/3/7 Time: 17:43
 * @version $Id$
 */
public class Watch {

    private Video video;

    public Watch(Video video){
        this.video = video;
    }

    public void see(){
        video.playMovie();
    }
}