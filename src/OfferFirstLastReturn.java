import java.util.*;

public class OfferFirstLastReturn {
    public static void main(String[] args) {
        ArrayDeque<String> d = new ArrayDeque<>();
        System.out.println(d.offerFirst("Aoi"));
        System.out.println(d.offerLast("BlueLock"));
        System.out.println(d.offerFirst("China"));
        System.out.println(d);
    }
}

