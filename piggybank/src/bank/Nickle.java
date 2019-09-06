package bank;

public class Nickle extends Money{

    public Nickle(int quantity) {
        super("Nickle", 0.05, quantity);
    }

    public Nickle() {
        super("Nickle", 0.05, 1);
    }
}