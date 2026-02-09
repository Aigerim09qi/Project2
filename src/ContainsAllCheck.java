import java.util.*;

public class ContainsAllCheck {
    public static void main(String[] args) {
        Set<String> A = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange"));
        Set<String> B = new HashSet<>(Arrays.asList("Apple", "Banana"));

        if (A.containsAll(B)) {
            System.out.println("A contains all elements of B");
        } else {
            System.out.println("A does NOT contain all elements of B");
        }
    }
}


