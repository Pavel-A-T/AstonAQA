package first;

public class Dog extends Animal {
    static int quantity;
    final int MAX_RUN = 500;
    final int MAX_SWIM = 10;

    Dog() {
        ++quantity;
    }

    @Override
    void swim(int distance) {
        if (distance > MAX_SWIM) {
            System.out.println("Пёс утонул");
        } else if (distance < MAX_SWIM && distance > 0) {
            System.out.println("Пёс проплыл " + distance + " метров");
        } else {
            System.out.println("Пёс проплыл 0 метров");
        }
    }

    @Override
    void run(int distance) {
        if (distance > MAX_RUN) {
            System.out.println("Пёс пробежал " + MAX_RUN + " метров");
        } else if (distance < MAX_RUN && distance > 0) {
            System.out.println("Пёс пробежал " + distance + " метров");
        } else {
            System.out.println("Пёс пробежал 0 метров");
        }
    }

    void showAllQuantityAnimals() {
        System.out.println("Всего количество животных: " + super.getQuantity());
    }

    void showDogs() {
        System.out.println("Всего собак: " + this.getQuantity());
    }

    public int getQuantity() {
        return quantity;
    }
}
