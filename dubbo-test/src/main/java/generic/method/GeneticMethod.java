package generic.method;

import java.util.Collection;

public class GeneticMethod<T> {

    public T getValue(T t) {
        return t;
    }


    /**
     * 泛型方法
     *
     * @param r
     * @param <R>
     * @return
     */
    public <R> R getValueR(R r) {
        return r;
    }


    /**
     * T 和 GeneticMethod中的T并不是一个类型
     *
     * @param t
     * @param <T>
     */
    public <T> void getValueT(T t) {

        System.out.println(t);
    }

    /**
     * 反省方法可变参数
     * @param arg
     * @param <E>
     */
    public <E> void sout(E... arg) {
        for (E e : arg) {
            System.out.println(e);
        }
    }

    /**
     * 静态方法想是使用泛型必须在方法内定义
     * @param t
     * @param <T>
     */
    public static <T> void getStaticT(T t){
        System.out.println(t);
    }

    /**
     * 泛型参数上下界
     * @param collection
     */
    public void getMuli(Collection<?  extends Number> collection){
        System.out.println();
    }
}
