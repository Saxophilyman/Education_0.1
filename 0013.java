import java.util.*;

public class Level1 {    
    public static int[] UFO(int N, int[] data, boolean octal) {
        int[] decimalSignal = new int[N];
        int signalType = (octal) ? 8 : 16;
        for (int indexMessage = 0; indexMessage < data.length; indexMessage++) {
            decimalSignal[indexMessage] = Integer.parseInt(String.valueOf(data[indexMessage]), signalType);
        }
        return decimalSignal;
    }
}
