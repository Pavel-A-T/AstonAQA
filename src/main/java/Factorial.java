public class Factorial {
    public static long factorial(int fact) {
        long result = 1;
        if (fact == 0 || fact == 1) {
            return result;
        } else if (fact > 1) {
            for (int i = 1; i <= fact; i++) {
                result *= i;
            }
        } else {
            System.out.println("Факториал не может быть вычислен! Некорректные данные");
            return -1;
        }
        return result;
    }
}
