import java.util.*;

public class Level1 {
        public static int odometer(int[] oksana) {
        int distance = 0;
        int time = 0;
        for (int index = 0; index < oksana.length; index +=2) {
            distance += oksana[index] * (oksana[index+1] - time);
            time = oksana[index+1];
        }
        return distance;
    }
}
