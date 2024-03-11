public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        int length = 52;

        for (int i = 0; i < length; i++) {
            appleBox1.addFruit(new Apple(0.25f));
            orangeBox1.addFruit(new Orange(0.33f));
            if (i % 2 == 0) {
                appleBox2.addFruit(new Apple(0.22f));
                orangeBox2.addFruit(new Orange(0.35f));
            }
        }

        System.out.println(appleBox1.compare(appleBox2)); //false
        System.out.println(orangeBox2.compare(orangeBox2)); //true
        System.out.println(orangeBox1.compare(appleBox1)); //false
        System.out.println("\n\nвес appleBox1 = " + appleBox1.getWeight());
        System.out.println("вес appleBox2 = " + appleBox2.getWeight());
        System.out.println("вес orangeBox1 = " + orangeBox1.getWeight());
        System.out.println("вес orangeBox2 = " + orangeBox2.getWeight() + "\n\n");

        appleBox2.emptyBox(appleBox1);
        orangeBox1.emptyBox(orangeBox2);

        System.out.println("вес appleBox1 = " + appleBox1.getWeight()); //0
        System.out.println("вес appleBox2 = " + appleBox2.getWeight());
        System.out.println("вес orangeBox1 = " + orangeBox1.getWeight());
        System.out.println("вес orangeBox2 = " + orangeBox2.getWeight()); //0
    }
}
