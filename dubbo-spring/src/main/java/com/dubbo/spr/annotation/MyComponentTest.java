package com.dubbo.spr.annotation;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springmvc-spring.xml"})
public class MyComponentTest {


    @Test
    public void testAnnotation(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyComponentTest.class);
        context.refresh();

//        InjectAnnotation annotation = context.getBean(InjectAnnotation.class);
//        annotation.get();
        InjectClass injectClass = context.getBean(InjectClass.class);
        injectClass.print();
    }

    @MyComponent
    public class InjectClass {
        public void print() {
            System.out.println("hello world");
        }
    }

}
