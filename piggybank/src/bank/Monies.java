package bank;

public abstract class Monies {
    String name;
    double value;
    int quantity;

    public Monies(String name, double value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public Monies() {
        quantity = 1;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }


    public int getQuantity() {
        return quantity;
    }
}
