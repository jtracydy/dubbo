/*
*  2019 
*/
package pattern.chain.example;

/**
 * @author wangdan Date: 2019/3/27 Time: 16:32
 * @version $Id$
 */
public class Client {

    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        //提交请求
        handler1.handleRequest();

        System.out.println(Math.round(-1.5));

        String str = "aaaavvvvv";
        System.out.println(new StringBuffer(str).reverse().toString());
        }

}