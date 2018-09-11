package proxy.cglib;

public class Test {


    public static void main(String[] args) {
//        ProxyCglib proxyCglib = new ProxyCglib();
//        HelloCglib helloCglib = proxyCglib.getInstance(HelloCglib.class);

        HelloCglib helloCglib = ProxyCglib.getInstance(HelloCglib.class);
        helloCglib.sayBybye();
    }
}
