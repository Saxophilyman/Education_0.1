import java.util.*;

public class Level1 {
   public static String PatternUnlock(int n, int[] hits) {
        double lengthLine = 0;
        for (int index = 0; index < n - 1; index++) {
            if (hits[index] + hits[index + 1] == 7 || hits[index] + hits[index + 1] == 10 || Math.abs(hits[index] - hits[index + 1]) == 1) {
                lengthLine += 1;
            } else lengthLine += 1.414215;
        }
        lengthLine *= 100000;
        String code = String.valueOf((int) lengthLine);
        StringBuilder finalCode = new StringBuilder();
        String[] kodArray = code.split("");
        for (String human : kodArray) {
            if (!human.equals("0")) {
                finalCode.append(human);
            }
        }
        return finalCode.toString();
    }
}
