package generic;


import java.util.Collection;

public interface Service {


    /**
     * 参数类型：Bird继承了那个类
      * @param collection
     * @return
     */
    Collection<? super Animal> getSup(Collection<? super Bird> collection);


    /**
     * 参数类型：那个类实现了Bird
     * @param collection
     * @return
     */

    Collection<? super Animal> getExt(Collection<? extends Bird> collection);

    /**
     *
     * @param list
     */
    //void  getExtSup(List<? extends Animal,? super Fish> list);
}
