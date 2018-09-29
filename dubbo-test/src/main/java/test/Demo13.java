package test;


public class Demo13 {

    public static void main(String[] args) {

        get( () -> System.out.println("123"));

        get(new Runnable(){

            @Override
            public void run(){
                System.out.println("adf");
            }
        });


        new Thread(() -> System.out.println("123")).start();
    }

    public static void get(Runnable runnable){
        System.out.println("end");
    }


}
