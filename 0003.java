
import java.util.*;

public class Level1 {
public static int ConquestCampaign(int lines, int columns, int countAreaToDecant, int[] battalion) {
        int day = 0;
        boolean conquestCompleted;
        int[][] bridgehead = new int[lines][columns];
        int[][] reserveBridgehead = new int[bridgehead.length][bridgehead[0].length];
        for (int cord = 0; cord < battalion.length; cord += 2) {
            bridgehead[battalion[cord] - 1][battalion[cord + 1] - 1] = 1;
            reserveBridgehead[battalion[cord] - 1][battalion[cord + 1] - 1] = 1;
        }
        do {
            conquestCompleted = true;
            for (int index_lines = 0; index_lines < bridgehead.length; index_lines++) {
                for (int index_columns = 0; index_columns < bridgehead[0].length; index_columns++) {
                    if (bridgehead[index_lines][index_columns] == 1) {
                        reserveBridgehead[index_lines][index_columns] = 1;
                        if (index_lines - 1 >= 0) {
                            reserveBridgehead[index_lines - 1][index_columns] = 1;
                        }
                        if (index_lines + 1 < bridgehead.length) {
                            reserveBridgehead[index_lines + 1][index_columns] = 1;
                        }
                        if (index_columns - 1 >= 0) {
                            reserveBridgehead[index_lines][index_columns - 1] = 1;
                        }
                        if (index_columns + 1 < bridgehead[0].length) {
                            reserveBridgehead[index_lines][index_columns + 1] = 1;
                        }
                    } else conquestCompleted = false;
                }
            }
            day++;
            for (int i = 0; i < reserveBridgehead.length; i++) {
                bridgehead[i] = Arrays.copyOf(reserveBridgehead[i], reserveBridgehead[i].length);
            }
        } while (!conquestCompleted);
        return day;
    }
}
