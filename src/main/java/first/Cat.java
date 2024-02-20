package first;

public class Cat extends Animal {
    static final int MAX_RUN = 200;
    static final int MAX_SWIM = 0;
    static int quantity;
    private boolean satiation;

    Cat() {
        ++quantity;
    }

    @Override
    void swim(int distance) {
        if (distance > MAX_SWIM) {
            System.out.println("Кот утонул");
        } else {
            System.out.println("Кот проплыл 0 метров");
        }
    }

    @Override
    void run(int distance) {
        if (distance > MAX_RUN) {
            System.out.println("Кот пробежал " + MAX_RUN + " метров");
        } else if (distance < MAX_RUN && distance > 0) {
            System.out.println("Кот пробежал " + distance + " метров");
        } else {
            System.out.println("Кот пробежал 0 метров");
        }
    }

    void eat(Food food, int quantityFood) {
        if (!this.satiation && food.getQuantityFood() - quantityFood < 0) {
            System.out.println("Коту нечего есть");
        } else if (!this.satiation) {
            food.setQuantityFood(food.getQuantityFood() - quantityFood);
            satiation = true;
            System.out.println("Кот наелся и сыт");
        } else {
            System.out.println("Кот сыт");
        }
    }

    void showAllQuantityAnimals() {
        System.out.println("Всего количество животных: " + super.getQuantity());
    }

    void showCats() {
        System.out.println("Всего котов: " + this.getQuantity());
    }

    public int getQuantity() {
        return quantity;
    }
}
