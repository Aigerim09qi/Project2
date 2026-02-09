import java.util.*;

public class BulkRemove {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> B = new HashSet<>(Arrays.asList(3, 4));

        A.removeAll(B);
        System.out.println(A);
    }
}
