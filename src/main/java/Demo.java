import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Integer[] array = {2, 4, 8, 11, 13, 15, 27, 31, 12, 6, 4, 44, 45};
        List<String> list = Arrays.asList("Highload", "High", "Load", "Highload", "High", "High" , "2");
        String str = "High";
        List<String> ar = Arrays.asList("f10", "a15", "f2", "d13", "f4", "f5", "b54", "a16", "f24", "a142", "a25", "d12");
        List<String> a2 =  Arrays.asList("f10", "a15", "f2", "f4", "f5", "b54", "a16");

        Practice practice = new Practice();
        System.out.println("количество чётных элементов array = " + practice.getCountEvenNumbers(Arrays.asList(array)) + "\n");
        System.out.println("Первое слово в коллекции: " + practice.getFirstElement(list));
        System.out.println("Последнее слово в коллекции: " + practice.getLastElement(list));
        System.out.printf("слово %s встречается в колекции -> " + practice.sumWord(list, str) + " раз(а)\n\n", str);
        System.out.println("Отсортированный массив ar: " + Arrays.asList(practice.getSortedArray(ar)));
        System.out.println("Отсортированный массив a2: " + Arrays.asList(practice.getSortedArray(a2)) + "\n");

        new Students();
        System.out.println("\nДЗ №5:");
        Login.getLogins();
    }
}
