import java.util.*;

public class PollVariants {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.add(2);
        d.add(3);

        while (!d.isEmpty()) {
            System.out.println(d.pollFirst());
        }
    }
}

