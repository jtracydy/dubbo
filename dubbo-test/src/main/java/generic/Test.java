package generic;

/**
 * 泛型分为泛型类，泛型方法，泛型接口，泛型类和接口中的类型在初始化的时候执行该泛型的类型，
 * 泛型类型更多的像一个类型的规范，某个类型的泛型类定义了具体的泛型类型是无法改变的。
 *
 * 泛型方法在方法调用的时候该方法的类型就被确定了
 */
public class Test {

    public static void main(String[] args) {

        Generic<String> generic = new Generic();

        System.out.println(generic instanceof Generic);

        GeneticInt g1 = new GenericImpl01();
        System.out.println(g1.get("a"));

        GeneticInt<Integer> g11 = new GenericImpl01();
        System.out.println(g11.get(1));

        /**
         * GenericImpl02类中指定了接口泛型类型为String 所以传入参数类型必须为String,
         *
         * 实现类 实现方法参数类型根据接口类型确定了
         */
        GeneticInt g22 = new GenericImpl02();
        System.out.println(g22.get("1"));

        GeneticInt<String> g31 = new GenericImpl03<Integer>();
        System.out.println(g31.get("1"));

         GenericUtils genericUtils = new GenericUtils();
         genericUtils.getKey(new GenericCls<Number>());

        genericUtils.getValue(new GenericCls<Integer>());
    }
}
