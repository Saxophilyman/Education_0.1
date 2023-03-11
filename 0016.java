import java.util.*;

public class Level1 {
       public static int MaximumDiscount(int N, int[] price) {
        if (price.length < 3) {
            return 0;
        }
        Arrays.sort(price);
        int sumOfDiscount = 0;
        for (int index = price.length-3; index >= 0; index -= 3) {
            sumOfDiscount += price[index];
        }
        return sumOfDiscount;
    }
}
