package generic;

/**
 * Genetic<T> 作为参数
 */
public class GenericUtils {

    public void getKey(GenericCls<Number> genetic){
        System.out.println(genetic);
    }

    /**
     * 通配符类型？是实参而不是形参，是和Number、String、Integer一样的参数
     * @param genetic
     */
    public void getValue(GenericCls<?> genetic){
        System.out.println(genetic);
    }
}
