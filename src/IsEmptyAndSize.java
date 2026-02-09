import java.util.*;

public class IsEmptyAndSize {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();

        d.add(10);
        System.out.println(d.size() + " " + d.isEmpty());

        d.remove();
        System.out.println(d.size() + " " + d.isEmpty());
    }
}

