import java.util.*;

public class Level1 {
    public static boolean TransformTransform(int A[], int N) {
        int sum = 0;
        int[] resArr = transform(transform(A));
        for (int x : resArr) {
            sum += resArr[x];
        }
        return sum % 2 == 0;
    }

    private static int[] transform(int[] arr) {
        ArrayList<Integer> array = new ArrayList<>();
        int k;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int tr = 0;
                k = i + j;
                for (int m = j; m < k; m++) {
                    if (tr < arr[m]) {
                        tr = arr[m];
                    }
                }
                array.add(tr);
            }
        }
        int[] returnArray = new int[array.size()];
        for (Integer x : array) {
            returnArray[x] = array.get(x);
        }
        return returnArray;
    }
}
