import java.util.*;

public class Level1 {
        public static int odometer(int[] oksana) {
        int speed = oksana[0];
        int time = oksana[1];
        for (int index = 2; index < oksana.length; index++) {
            if (index % 2 != 0) {
                time += oksana[index];
            } else speed += oksana[index];
        }
        return speed * time;
    }
}
