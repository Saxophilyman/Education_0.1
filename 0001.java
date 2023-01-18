import java.util.*;

public class Level1 {
    public static int squirrel(int number) {
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial = factorial * i;
        }
        String stringFactorial = String.valueOf(factorial);
        char[] arrayOfFactorial = stringFactorial.toCharArray();
        stringFactorial = String.valueOf(arrayOfFactorial[0]);
        return Integer.parseInt(stringFactorial);
    }
}
