public class Lesson_3 {
    public static void main(String[] args) {
        Lesson_3 lesson3 = new Lesson_3();
        System.out.println(lesson3.isSumm(5, 16));
        System.out.println("-------------------------------------");
        lesson3.checkNumber(5);
        System.out.println("-------------------------------------");
        System.out.println(lesson3.isNumber(12));
        System.out.println("-------------------------------------");
        lesson3.printString("Повторяющаяся строка", 4);
        System.out.println("-------------------------------------");
        System.out.println(lesson3.isLeapYear(1960));
        System.out.println(lesson3.isLeapYear(2024));
        System.out.println("-------------------------------------");
        lesson3.showArray(lesson3.task6());
        System.out.println("-------------------------------------");
        lesson3.showArray(lesson3.createArray());
        System.out.println("-------------------------------------");
        lesson3.showArray(lesson3.task8());
        System.out.println("-------------------------------------");
        lesson3.showArray(lesson3.sqArray(12));
        System.out.println("-------------------------------------");
        lesson3.showArray(lesson3.getArray(5, 12));
    }

    boolean isSumm(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    void checkNumber(int number) {
        String result = (number >= 0 ? "Положительное " : "Отрицательное ") + "число";
        System.out.println(result);
    }

    boolean isNumber(int number) {
        return !(number >= 0);
    }

    void printString(String str, int quantity) {
        if (quantity <= 0) {
            return;
        }
        for (int i = 0; i < quantity; i++) {
            System.out.println(str);
        }
    }

    boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else return year % 100 != 0 && year % 4 == 0;
    }

    int[] task6() {
        int[] array = {0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
        return array;
    }

    int[] createArray() {
        var array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    int[] task8() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 9, 8, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }

    int[][] sqArray(int length) {
        int start = 0;
        int end = length - 1;
        int[][] array = new int[length][length];
        for (int i = 0; i < array.length; i++) {
            array[i][start] = 1;
            array[i][end] = 1;
            start++;
            end--;
        }
        return array;
    }

    int[] getArray(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = initialValue;
        }
        return result;
    }

    private void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    private void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "; ");
            }
            System.out.println();
        }
    }
}
