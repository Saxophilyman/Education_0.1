import java.util.*;

public class Level1 {
    public static int[] SynchronizingTables(int N, int[] ids, int[] salary) {
        int[] copyOfIds = Arrays.copyOf(ids, ids.length);
        Arrays.sort(copyOfIds);
        Arrays.sort(salary);
        int[] correctSalary = new int[N];
        for (int indexCopyOfIds = 0; indexCopyOfIds < N; indexCopyOfIds++) {
            for (int indexOfIds = 0; indexOfIds < N; indexOfIds++) {
                if (copyOfIds[indexCopyOfIds] == ids[indexOfIds]) {
                    correctSalary[indexOfIds] = salary[indexCopyOfIds];
                }
            }
        }
        return correctSalary;
    }
}
