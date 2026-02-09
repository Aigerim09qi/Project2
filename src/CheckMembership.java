import java.util.*;

public class CheckMembership {
    static Set<String> allowed = new HashSet<>(Arrays.asList("admin", "user", "guest"));

    public static boolean isAllowed(String name) {
        return allowed.contains(name);
    }

    public static void main(String[] args) {
        System.out.println(isAllowed("admin"));
        System.out.println(isAllowed("test"));
    }
}

