import java.util.*;

public class RemoveElements {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>(Arrays.asList("Amber", "Lana", "Rei", "Kana", "Robert"));

        boolean removed = names.remove("Kana");
        System.out.println("Removed? " + removed);
        System.out.println(names);
    }
}

