import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    private static int compare(String o1, String o2) {
        if (o1.charAt(0) == o2.charAt(0)) {
            return Integer.parseInt(o1.substring(1)) - Integer.parseInt(o2.substring(1));
        }
        return o1.charAt(0) - o2.charAt(0);
    }

    public long getCountEvenNumbers(List<Integer> list) {
        return list.stream().filter(item -> item % 2 == 0).count();
    }

    public String getFirstElement(List<String> list) {
        if (list == null) {
            return "0";
        }
        return list.stream().findFirst().orElse("0");
    }

    public String getLastElement(List<String> list) {
        if (list == null || list.size() == 0) {
            return "0";
        }
        return list.get(list.size() - 1);
    }

    public long sumWord(List<String> list, String word) {
        if (list == null || list.size() == 0) {
            return 0;
        }
        return list.stream().filter(o -> o.equals(word)).count();
    }

    public String[] getSortedArray(List<String> list) {
        List<String> sortedList = list.stream().sorted(Practice::compare).collect(Collectors.toList());
        return sortedList.toArray(new String[0]);
    }
}
