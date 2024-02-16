public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.printThreeWords();
        main.checkSumSign();
        main.printColor();
        main.compareNumbers();

    }

    void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }

    void checkSumSign() {
        int a = 5;
        int b = -77;
        System.out.println("Сумма" + (a + b > 0 ? " положительная" : " отрицательная"));
    }

    void printColor() {
        int value = 23;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value < 101) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    void compareNumbers() {
        int a = -5;
        int b = -1;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
}
