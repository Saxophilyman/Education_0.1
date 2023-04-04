
import java.util.*;

public class Level1 {
            public static boolean Football(int F[], int N) {
        int[] arrSorted = new int[N];
        System.arraycopy(F, 0, arrSorted, 0, F.length);
        Arrays.sort(arrSorted);
        for (int index = 0; index < arrSorted.length; index++) {
            if (F[index] != arrSorted[index]) {
                return secondVar(index, F, arrSorted) || firstVar(index, F, arrSorted);
            }
        }
        return false;
    }

    private static boolean firstVar(int index, int[] arrPrimal, int[] arrSorted) {
        int replaceValue = arrPrimal[index];
        int findIndexMin = index;
        for (int findIndex = index; findIndex < arrPrimal.length; findIndex++) {
            if (replaceValue > arrPrimal[findIndex]) {
                replaceValue = arrPrimal[findIndex];
                findIndexMin = findIndex;
            }
        }
        arrPrimal[findIndexMin] = arrPrimal[index];
        arrPrimal[index] = replaceValue;
        for (int i = index; i < arrPrimal.length; i++) {
            if (arrPrimal[i] != arrSorted[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean secondVar(int index, int[] arrPrimal, int[] arrSorted) {
        ArrayList<Integer> arrReverse = new ArrayList<>();
        for (int findIndex = index; findIndex < arrPrimal.length; findIndex++) {
            if (arrPrimal[index] < arrPrimal[findIndex]) {
                break;
            }
            arrReverse.add(arrPrimal[findIndex]);
        }
        Collections.reverse(arrReverse);
        for (int i = 0; i < arrReverse.size(); i++) {
            if (arrReverse.get(i) != arrSorted[index + i]) {
                return false;
            }
        }
        for (int i = index + arrReverse.size(); i < arrPrimal.length; i++) {
            if (arrPrimal[i] != arrSorted[i]) {
                return false;
            }
        }
        return true;
    }
}
