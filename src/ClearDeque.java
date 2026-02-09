import java.util.*;

public class ClearDeque {
    public static void main(String[] args) {
        ArrayDeque<String> d = new ArrayDeque<>();
        d.add("X");
        d.add("Y");

        d.clear();
        System.out.println(d.peek());
        System.out.println(d.isEmpty());
    }
}

