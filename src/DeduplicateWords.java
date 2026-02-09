import java.util.*;

public class DeduplicateWords {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        String[] words = sentence.split(" ");

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println(uniqueWords);
    }
}
