import java.util.*;

public class RetainCommon {
    public static void main(String[] args) {
        Set<Integer> X = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> Y = new HashSet<>(Arrays.asList(3, 4, 5));

        X.retainAll(Y);
        System.out.println(X);
    }
}

