import java.util.*;

public class CaseInsensitiveUniqueWords {
    public static void main(String[] args) {
        String[] words = {"Apple", "apple", "APPLE", "Banana", "BANANA"};

        Set<String> unique = new HashSet<>();
        for (String w : words) {
            unique.add(w.toLowerCase());
        }

        System.out.println(unique);
    }
}
