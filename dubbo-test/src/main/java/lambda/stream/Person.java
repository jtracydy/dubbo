package lambda.stream;


import lombok.Data;

@Data
public class Person {

    private  String name;
    private   int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {
    }

    public static int sum(){
        return 10 * 2;
    }

    public static Object sum(Object o) {
        return o;
    }

//    public int sum(int i1,int i2){
//        return i1 + i2;
//    }


}
