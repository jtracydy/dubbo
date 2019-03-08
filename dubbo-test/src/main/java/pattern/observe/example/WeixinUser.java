/*
*  2019 
*/
package pattern.observe.example;

/**
 * @author wangdan Date: 2019/3/8 Time: 14:25
 * @version $Id$
 */
public class WeixinUser implements Observer {

    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}