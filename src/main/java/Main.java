public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("+5871356745", "������");
        book.add("+65874523658", "������");
        book.add("+425834549", "������");
        book.add("+74958792564", "������");
        book.add("+9853687495", "������");
        book.add("+3457894521", "������");
        book.add("+123456789", "������");
        System.out.println(book.get("������"));
        System.out.println(book.get("������"));
        System.out.println(book.get("������"));

        String[] array = {"����", "�������", "�������", "����", "������", "����", "������", "����", "������", "����",
                "����", "������", "����", "����", "������", "����", "����", "������", "�����", "�����"};

        CountWords countWords = new CountWords();
        System.out.println(countWords.countUniqueWord(array));
    }
}
