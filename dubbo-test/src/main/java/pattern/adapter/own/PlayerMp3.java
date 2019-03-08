/*
*  2019 
*/
package pattern.adapter.own;

/**
 * @author wangdan Date: 2019/3/7 Time: 17:47
 * @version $Id$
 */
public class PlayerMp3 implements Player {
    @Override
    public void playMusic() {
        System.out.println("Player play map3");
    }
}