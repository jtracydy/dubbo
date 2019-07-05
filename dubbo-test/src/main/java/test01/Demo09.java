/*
*  2019 
*/
package test01;

/**
 * @author wangdan Date: 2019/7/2 Time: 10:08
 * @version $Id$
 */
public class Demo09 {

    public static void main(String[] args) {
        String s1 = new String("aaa");
        System.out.println(s1 == s1.intern());
        String s2 = "aaa";
        System.out.println(s2 == s1.intern());


        String ss1 = "aa";
        String ss2 = "bb";
        String ss3 = ss1+ss2;
        System.out.println(ss3 == ss3.intern());


        String aa = "AA";//设置常量AA到常量池
        String bb = "BB";//设置常量BB到常量池
        String ccdd = "CC"+"DD";//设置常量CCDD到常量池
        String neeff = new String("EE")+new String("FF");//设置EE和FF到常量池。并且添加EE、FF和EEFF对象到堆
        String aabb = aa+bb;//添加AABB对象到堆
        String gghh = "GG"+new String("HH");//设置GG和HH常量到常量池,设置HH和GGHH对象到堆
//         aa.intern();//啥事都不做，返回AA常量
//         ccdd.intern();//啥事都不做，返回CCDD常量
//         neeff.intern();//添加EEFF对象的引用到常量池，并返回EEFF对象
//         aabb.intern();//添加AABB对象的引用到常量池，并返回AABB对象
//         gghh.intern();//添加GGHH对象的引用到常量池，并返回GGHH对象
        System.out.println(aa.intern()==aa);
        System.out.println(neeff.intern()=="EEFF");
        System.out.println("EEFF"==neeff);
        String nccdd = new String("CCDD");
        System.out.println(ccdd==nccdd);
        System.out.println(ccdd==nccdd.intern());
        System.out.println(aabb.intern()==aabb);
        System.out.println(gghh==gghh.intern());

    }
}