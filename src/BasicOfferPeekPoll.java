import java.util.*;

public class BasicOfferPeekPoll {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Peek: " + q.peek());

        while (!q.isEmpty()) {
            System.out.println("Poll: " + q.poll());
        }
    }
}

