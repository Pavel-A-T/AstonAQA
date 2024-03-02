import java.util.*;

public class PhoneBook {
    private final Map<String, String> records = new HashMap<>();

    void add(String phoneNumber, String lastName) {
        this.records.put(phoneNumber, lastName);
    }

    List<String> get(String lastName) {
        List<String> result = new ArrayList<>();
        if (this.records.containsValue(lastName)) {
            Set<Map.Entry<String, String>> entries = this.records.entrySet();
            for (Map.Entry<String, String> e : entries) {
                if (e.getValue().equals(lastName)) {
                    result.add(e.getKey());
                }
            }
        }
        return result;
    }
}
