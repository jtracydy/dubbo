/*
*  2019 
*/
package test01;

import com.google.common.collect.Maps;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangdan Date: 2019/7/23 Time: 17:02
 * @version $Id$
 */
public class Demo15 {

    static {
        System.out.println("demo15 loading");
    }


    public static void main(String[] args) {
//        Map<Student, String> map = Maps.newHashMap();
//        Student s1 = new Student();
//        s1.setAge(11);
//        s1.setName("zhangsan");
//        Student s2 = new Student();
//        s2.setAge(2);
//        s2.setName("lisi");
//        Student s3 = new Student();
//        s3.setAge(11);
//        s3.setName("zhangsan");
//
//        map.put(s1, "first");
//        map.put(s2, "sceond");
//        map.put(s3, "third");
//
//        for (Map.Entry<Student, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        Map<People,Integer> map = new HashMap<People, Integer>();
        map.put(new People("liu",18),5);
        map.put(new People("cheng",22),1);
        People p = new People("liu",18);
        People p1 = new People("cheng",22);
        System.out.println(map.get(p));
        System.out.println(map.get(p1));
    }

    @Data
    static class Student {
        private String name;
        private int age;

        @Override
        public int hashCode() {
            System.out.println(age % 10);
            return age % 10;
        }
    }

   static  class People{
        private String name;
        private int age;

        public People(){

        }
        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}