import java.util.*;

public class Level1 {
    public static String BigMinus(String s1, String s2) {
        return String.valueOf(Math.abs(Long.parseLong(s1) - Long.parseLong(s2)));
    }
}
