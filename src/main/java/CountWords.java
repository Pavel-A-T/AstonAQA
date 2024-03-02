import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CountWords {
    public List<String> countUniqueWord(String[] array) {
        List<String> result = new ArrayList<>();
        List<String> list = Arrays.asList(array);
        for (int i = 0; i < list.size(); i++) {
            //count количество повторений слова
            int count = 1;
            String word = list.get(i);
            if (word == null) {
                continue;
            }
            for (int j = i + 1; j < list.size(); j++) {
                String secondWord = list.get(j);
                if (secondWord != null && secondWord.hashCode() == word.hashCode() && secondWord.equals(word)) {
                    list.set(j, null);
                    count++;
                }
            }
            result.add(word + " - " + count + "раз(а)");
        }
        return result;
    }
}
