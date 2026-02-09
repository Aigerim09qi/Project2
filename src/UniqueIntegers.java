import java.util.*;

public class UniqueIntegers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> unique = new HashSet<>(nums);

        System.out.println(unique);
    }
}
