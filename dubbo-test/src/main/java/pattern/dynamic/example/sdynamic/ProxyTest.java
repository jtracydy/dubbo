/*
*  2019 
*/
package pattern.dynamic.example.sdynamic;

/**
 * @author wangdan Date: 2019/3/12 Time: 16:01
 * @version $Id$
 */

public class ProxyTest {

    public static void main(String[] args) {

        RealMovie realmovie = new RealMovie();

        Movie movie = new Cinema(realmovie);

        movie.play();

    }

}

