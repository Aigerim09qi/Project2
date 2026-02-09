import java.util.*;

public class BulkAdd {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        set1.addAll(set2);
        System.out.println(set1);
    }
}
