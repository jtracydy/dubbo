package proxy.jadynamic;

public class HelloImpl implements Hello{

    @Override
    public void sayHello(){
        System.out.println("sayhello.....");
    }

    @Override
    public void sayBybye() {
        System.out.println("bybybybybybybyyb");
    }

    @Override
    public String getStr() {
        return "invoke hello....";
    }
}
