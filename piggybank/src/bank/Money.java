package bank;

public abstract class Money {
    String name;
    double value;
    int quantity;

    public Money(String name, double value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public Money() {
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
