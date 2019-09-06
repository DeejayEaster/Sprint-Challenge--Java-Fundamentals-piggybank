package bank;

public class Penny extends Money{

    public Penny(int quantity) {
        super("Penny", 0.01, quantity);
    }

    public Penny() {
        super("Penny", 0.01, 1);
    }
}