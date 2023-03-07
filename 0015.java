import java.util.*;

public class Level1 {
    public static boolean TankRush(int h1, int w1, String s1, int h2, int w2, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        if (h1 < h2 || w1 < w2) {
            return false;
        }
        boolean result = false;
        for (int i = 0; i <= arr1.length - arr2.length; i++) {
            if (arr1[i].contains(arr2[0])) {
                int firstCord = arr1[i].indexOf(arr2[0]);
                for (int k = i, j = 0; k < i + h2; k++, j++) {
                    if (arr1[k].indexOf(arr2[j]) != firstCord) {
                        result = false;
                        break;
                    }
                    result = true;
                }
            }
        }
        return result;
    }
}
