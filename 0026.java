import java.util.*;

public class Level1 {
        public static boolean white_walkers(String village) {
        if (village.length() < 5) {
            return false;
        }
        boolean human = false;
        int sumHuman = 0;
        int countWalkers = 0;
        boolean global = false;
        for (int indexChar = 0; indexChar < village.length(); indexChar++) {
            if (village.charAt(indexChar) >= 48 && village.charAt(indexChar) <= 57) {
                int num = Integer.parseInt(village.substring(indexChar, indexChar + 1));
                if (sumHuman == 0) {
                    sumHuman = num;
                    human = true;
                }
                if (sumHuman + num != 10) {
                    sumHuman = num;
                    countWalkers = 0;
                } else if (countWalkers != 3) {
                    return false;
                } else {
                    global = true;
                    sumHuman = num;
                    countWalkers = 0;
                }
            }
            if (human && village.charAt(indexChar) == 61) {
                countWalkers++;
            }
        }
        return global;
    }
}
