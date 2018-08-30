package guava.test;

import org.junit.Test;

public class Demo03 {

    @Test
    public void test01(){
        new A<If<Father>>();    //不报错
        new B<If<Father>>();    //不报错
        new C<If<Father>>();    //不报错

        //new A<If<Child>>();     //报错
        // new B<If<Child>>();     //报错
        new C<If<Child>>();     //不报错

        new A<If<GrandFather>>();   //不报错
       // new B<If<GrandFather>>();   //报错
       // new C<If<GrandFather>>();   //报错
    }

}


class GrandFather {

}

class Father extends GrandFather{

}

class Child extends Father {

}

interface If<T>{
    void doSomething();
}

class A  <T extends If<? super Father>> {
}

class B <T extends If<Father>> {
}

class C <T extends If<? extends Father>>{

}

