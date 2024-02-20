package first;

public class Animal {
    static int quantity;

    Animal() {
        ++quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    void swim(int distance) {
        System.out.println("distance = " + distance);
    }

    void run(int distance) {
        System.out.println("distance = " + distance);
    }
}
