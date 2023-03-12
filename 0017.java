import java.util.*;

public class Level1 {
    public static boolean LineAnalysis(String line) {
        String arr1[] = line.split("\\*");
        for (int index = 2; index < arr1.length - 1; index++) {
            if (!arr1[1].equals(arr1[index])) {
                return false;
            }
        }
        return true;
    }
}
