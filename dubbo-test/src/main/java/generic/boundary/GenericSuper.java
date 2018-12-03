/*
* Copyright (c) 2018 Qunar.com. All Rights Reserved.
*/
package generic.boundary;

import com.google.common.collect.Lists;
import common.Father;
import common.Grandpa;
import common.Son;

import java.util.Collection;
import java.util.List;

/**
 * @author wangdan Date: 2018/10/17 Time: 19:50
 * @version $Id$
 */
public class GenericSuper {


    /**
     * super Father 或者是Father的父类
     * @param collection
     */
    public static void get(Collection< ? super Father> collection){

    }

    /**
     *  extends  父类是Father类的 或者是Father
     * @param collection
     */
    public static void getExtend(Collection<? extends Father> collection){

    }
    public static void main(String[] args) {
        List<Grandpa> grandpas = Lists.newArrayList();
        List<Father> fathers =Lists.newArrayList();
        List<Son> sons = Lists.newArrayList();

        get(fathers);
        get(grandpas);
        //get(sons);

        getExtend(sons);
        getExtend(fathers);
        //getExtend(grandpas);
    }
}