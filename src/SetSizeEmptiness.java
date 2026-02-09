import java.util.*;

public class SetSizeEmptiness {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());
    }
}

