package proxy.mult;


public class LcBoatImpl implements Boat {

    @Override
    public void swim() {
        System.out.println("LcBoat swim.....");
    }

    @Override
    public void get(String name) {
        System.out.println("LcBoat get....." + name);
    }
}
