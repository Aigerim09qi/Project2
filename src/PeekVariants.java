import java.util.*;

public class PeekVariants {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(10);
        d.add(50);
        d.add(90);

        System.out.println(d.peek());
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());

        d.clear();
        System.out.println(d.peek()); // null
    }
}

