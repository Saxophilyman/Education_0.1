import java.util.*;

public class Level1 {
        public static int odometer(int[] oksana) {
        int speed = 0;
        int time = 0;
        for (int index = 0; index < oksana.length; index++) {
            if (oksana[index] % 2 != 0) {
                time += oksana[index];
            } else speed += oksana[index];
        }
        return speed * time;
    }
}
