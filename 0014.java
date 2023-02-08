import java.util.*;

public class Level1 {    
    public static int Unmanned(int L, int N, int[][] track) {
        int timeOfAllWay = 0;
        int pointWay = 0;
        int varForTrafficLightsOperation;
        for (int countTrafficLights = 0; countTrafficLights < track.length; countTrafficLights++) {
            timeOfAllWay += track[countTrafficLights][0] - pointWay;
            pointWay = track[countTrafficLights][0];
            varForTrafficLightsOperation = timeOfAllWay;
            while (varForTrafficLightsOperation > track[countTrafficLights][1] + track[countTrafficLights][2]) {
                varForTrafficLightsOperation -= track[countTrafficLights][1] + track[countTrafficLights][2];
            }
            if (varForTrafficLightsOperation < track[countTrafficLights][1]) {
                timeOfAllWay += track[countTrafficLights][1] - varForTrafficLightsOperation;
            }
        }
        timeOfAllWay += L - pointWay; 
        return timeOfAllWay;
    }
}
