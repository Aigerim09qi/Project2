import java.util.*;

public class PalindromeCheckDeque {
    public static void main(String[] args) {
        String word = "level";
        ArrayDeque<Character> d = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            d.add(c);
        }

        boolean ok = true;
        while (d.size() > 1) {
            if (d.poll() != d.pollLast()) {
                ok = false;
                break;
            }
        }

        System.out.println(ok);
    }
}

