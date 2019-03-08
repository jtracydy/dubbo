/*
*  2019 
*/
package pattern.adapter.own;

/**
 * @author wangdan Date: 2019/3/7 Time: 17:47
 * @version $Id$
 */
public class AdapterPlayer implements Video {

    private Player player;

    public AdapterPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void playMovie() {
        player.playMusic();
    }
}