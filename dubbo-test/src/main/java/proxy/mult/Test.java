package proxy.mult;

public class Test {

    public static void main(String[] args) {

        Boat boat = new LcBoatImpl();
        ProxyDynamic proxyDynamic = new ProxyDynamic();
        Boat b = (Boat)proxyDynamic.getPrxy(boat);
        b.get("name");
    }
}
