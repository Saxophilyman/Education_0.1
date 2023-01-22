import java.util.*;

public class Level1 {
    public static int[] MadMax(int N, int[] Tele) {
        int[] arrayImpulse = new int[Tele.length];
        Arrays.sort(Tele);
        for (int i = 0; i < Tele.length / 2; i++) {
            arrayImpulse[i] = Tele[i];
            arrayImpulse[Tele.length / 2 + 1 + i] = Tele[Tele.length - 2 - i];
        }
        arrayImpulse[Tele.length / 2] = Tele[Tele.length - 1];
        return arrayImpulse;
    }
}
