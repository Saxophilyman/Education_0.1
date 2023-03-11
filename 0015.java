import java.util.*;

public class Level1 {
    public static boolean TankRush(int h1, int w1, String s1, int h2, int w2, String s2) {
        if (h1 < h2 || w1 < w2) {
            return false;
        }
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        for (int i = 0; i <= arr1.length - arr2.length; i++) {
            int nextCord = 0;
            int checkCord = arr1[i].indexOf(arr2[0], nextCord);
            int checkLine = 1;
            int checkIn = 1;
            while (checkCord != -1) {
                if (arr1[i + checkLine].indexOf(arr2[checkLine], checkCord) != checkCord) {
                    checkLine = 1;
                    nextCord = checkCord + 1;
                    checkCord = arr1[i].indexOf(arr2[0], nextCord);
                } else {
                    checkLine++;
                    checkIn++;
                    if (checkIn == h2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
