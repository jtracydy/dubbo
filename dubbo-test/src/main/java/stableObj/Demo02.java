/*
*  2019 
*/
package stableObj;

import lombok.Data;

/**
 * @author wangdan Date: 2019/7/24 Time: 11:24
 * @version $Id$
 */
public class Demo02 {


    public static void main(String[] args) {
        new Thread(new D(new Person("zhagnsan",22))).start();
    }

    static class D implements Runnable {
        private Person person;

        D(Person person) {
            person.setAge(11111);
            this.person = person;
        }

        @Override
        public void run() {
            System.out.println(person.getAge() + " " + person.getName());
            System.out.println(person.getAge() + " " + person.getName());
        }
    }

    @Data
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}