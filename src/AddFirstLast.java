import java.util.*;

public class AddFirstLast {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.addFirst(2);
        d.addLast(3);
        d.addFirst(1);
        d.addLast(4);

        for (int x : d) {
            System.out.println(x);
        }
    }
}
