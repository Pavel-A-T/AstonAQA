import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Login {
    public static void getLogins() {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String liter = "f";
        while (true) {
            System.out.println("Введите логин:");
            String str = scanner.nextLine();
            if (str.isBlank()) {
                scanner.close();
                break;
            }
            list.add(str.trim());
            System.out.println("Чтобы закончить нажмите <Enter>");
        }
        List<String> fStartList = list.stream().filter(item -> Character.toString(item.charAt(0)).equals(liter)).collect(Collectors.toList());
        if (fStartList.size() > 0) {
            System.out.println(fStartList);
        }
        System.out.println("Конец программы");
    }
}
