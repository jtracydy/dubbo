package generic.method;


import common.Daughter;

import java.util.ArrayList;

/**
 * 泛型方法
 */
public class Test {


    public static void main(String[] args) {

        GeneticMethod<String> geneticMethod = new GeneticMethod<>();
        String str = "Test Generic method";
        geneticMethod.getValueR(str);


        geneticMethod.getMuli(new ArrayList<Number>());
        geneticMethod.getMuli(new ArrayList<Integer>());
        //geneticMethod.getMuli(new ArrayList<String>());

        FSD<Daughter> fsd = new FSD<>();
       // FSD<Integer> fsd = new FSD<>();

    }
}
