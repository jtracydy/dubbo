package extend;

public class Father {
    private String name;

    public Father(String name) {
        this.name = name;
    }

    public void get() {
        System.out.println("father:" + name);
    }
}
