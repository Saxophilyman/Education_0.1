import java.util.*;

public class Level1{
       public static int SumOfThe(int N, int[] data) {
        int sum = 0;
        int allSumOfArray = 0;
        for (int indexForSum : data) {
            allSumOfArray += indexForSum;
        }
        for (int index : data) {
            if (index * 2 == allSumOfArray) {
                sum = index;
                break;
            }
        }
        return sum;
    }
}
