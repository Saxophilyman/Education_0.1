import java.util.*;

public class Level1 {
    public static boolean MisterRobot(int N, int[] data) {
        int timeVar;
        int sortedByAscending = 0;
        int movementIndex = 0;
        for (int firstStep = 0; firstStep < data.length; firstStep++) {
            int minElement = data[firstStep];
            for (int secondStep = sortedByAscending; secondStep < data.length; secondStep++) {
                if (minElement > data[secondStep]) {
                    minElement = data[secondStep];
                    movementIndex = secondStep;
                }
            }
            if (minElement == data[firstStep]) {
                sortedByAscending++;
            } else {
                if (movementIndex - sortedByAscending == 1) {
                    if (movementIndex + 1 >= data.length) {
                    return false;
                    }
                    timeVar = data[movementIndex - 1];
                    data[movementIndex - 1] = data[movementIndex];
                    data[movementIndex] = data[movementIndex + 1];
                    data[movementIndex + 1] = timeVar;
                    sortedByAscending++;
                }
                if (movementIndex - sortedByAscending == 2) {
                    timeVar = data[movementIndex - 2];
                    data[movementIndex - 2] = data[movementIndex];
                    data[movementIndex] = data[movementIndex - 1];
                    data[movementIndex - 1] = timeVar;
                    sortedByAscending++;
                }
                if (movementIndex - sortedByAscending >= 3) {
                    timeVar = data[movementIndex - 2];
                    data[movementIndex - 2] = data[movementIndex];
                    data[movementIndex] = data[movementIndex - 1];
                    data[movementIndex - 1] = timeVar;
                    firstStep--;
                }
            }
        }
        return true;
    }
}
