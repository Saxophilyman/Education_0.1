import java.util.*;

public class Level1 {
    public static String Keymaker(int k) {
        int[] doors = new int[k];
        for (int step = 1; step <= k; step++) {
            for (int checkDoor = step; checkDoor <= k; checkDoor += step) {
                if (doors[checkDoor - 1] == 0) {
                    doors[checkDoor - 1] = 1;
                } else doors[checkDoor - 1] = 0;
            }
        }
        
        StringBuilder s = new StringBuilder();
        for (int index = 0; index < doors.length; index++) {
            s.append(doors[index]);
        }
        return s.toString();
    }
}
