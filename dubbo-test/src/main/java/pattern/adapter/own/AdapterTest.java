/*
*  2019 
*/
package pattern.adapter.own;

/**
 * @author wangdan Date: 2019/3/7 Time: 17:49
 * @version $Id$
 */
public class AdapterTest {

    public static void main(String[] args) {
        Player player = new PlayerMp3();
        AdapterPlayer adapterPlayer = new AdapterPlayer(player);

        Watch watch = new Watch(adapterPlayer);
        watch.see();
    }
}