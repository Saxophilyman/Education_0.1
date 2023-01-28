import java.util.*;

public  classLevel1 {    
  public static int SumOfThe(int N, int[] data) {
        int sum = 0;
        int allSumOfArray = Arrays.stream(data).sum();
        for (int index : data) {
            if (index * 2 == allSumOfArray) {
                sum = index;
                break;
            }
        }
        return sum;
    }
}
