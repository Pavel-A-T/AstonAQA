package first;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = new Dog();
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].run((i + 1) * 175);
            dogs[i].swim((i + 1) * 3);
        }
        dogs[2].showAllQuantityAnimals();
        dogs[1].showAllQuantityAnimals();
        dogs[1].showDogs();

        Food food = new Food();
        food.addFood(40);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat();
        cats[1] = new Cat();
        cats[2] = new Cat();
        for (int i = 0; i < cats.length; i++) {
            cats[i].run((i + 1) * 75);
            cats[i].swim(0);
            cats[i].eat(food, 17);
        }
        cats[2].showAllQuantityAnimals();
        cats[1].showAllQuantityAnimals();
        cats[1].showCats();

        food.addFood(40);
        cats[2].eat(food, 20);
    }
}
