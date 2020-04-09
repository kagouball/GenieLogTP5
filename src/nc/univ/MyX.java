package nc.univ;

public class MyX {
    public static void main(String[] args) {
        Automate automate = new Automate();
        X x = new X(automate);
        automate.setControle(x);
    }
}
