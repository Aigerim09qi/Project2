import java.util.*;

public class StackBehavior {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("W");
        stack.push("M");
        stack.push("B");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
