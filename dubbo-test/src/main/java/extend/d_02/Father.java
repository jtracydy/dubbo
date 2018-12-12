/*
*  2018 
*/
package extend.d_02;

/**
 * @author wangdan Date: 2018/12/9 Time: 10:15
 * @version $Id$\
 *
 * 抽象父类 通过子类的类型选择调用父类的方法
 */
public abstract class Father {

    protected abstract void methodProtected();

    public void getName(Class clazz){
        System.out.println(clazz.getClass().getName());
    }

    private void methodPrivate(){
        System.out.printf("private method .....");
    }

    abstract void methodDefault();

}