public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("+5871356745", "Иванов");
        book.add("+65874523658", "Хусейн");
        book.add("+425834549", "Петров");
        book.add("+74958792564", "Иванов");
        book.add("+9853687495", "Травуж");
        book.add("+3457894521", "Иванов");
        book.add("+123456789", "Петров");
        System.out.println(book.get("Иванов"));
        System.out.println(book.get("Травуж"));
        System.out.println(book.get("Петров"));

        String[] array = {"печь", "печенье", "причина", "небо", "погода", "стол", "погода", "стул", "кресло", "печь",
                "небо", "погода", "стол", "стул", "кресло", "печь", "небо", "погода", "весна", "пирог"};

        CountWords countWords = new CountWords();
        System.out.println(countWords.countUniqueWord(array));
    }
}
