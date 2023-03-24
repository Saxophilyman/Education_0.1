import java.util.*;

public class Level1 {
        public static String[] TreeOfLife(int H, int W, int N, String[] tree) {
        Integer[][] yearNumTree = new Integer[H][W];
        String[] resultTree = new String[H];
        for (int index = 0; index < tree.length; index++) {
            for (int innerIndex = 0; innerIndex < tree[index].length(); innerIndex++) {
                if (tree[index].charAt(innerIndex) == '+') {
                    yearNumTree[index][innerIndex] = 1;
                } else yearNumTree[index][innerIndex] = 0;
            }
        }

        int year = 0;
        while (year < N) {
            for (int index = 0; index < yearNumTree.length; index++) {
                for (int innerIndex = 0; innerIndex < yearNumTree[index].length; innerIndex++) {
                    yearNumTree[index][innerIndex]++;
                    //destruction
                    if (year % 2 != 0 && yearNumTree[index][innerIndex] >= 3) {
                        if (innerIndex - 1 >= 0) {
                            yearNumTree[index][innerIndex - 1] = 0;
                        }
                        if (innerIndex + 1 < yearNumTree[index].length && yearNumTree[index][innerIndex + 1] <= 1) {
                            yearNumTree[index][innerIndex + 1] = -1;
                        }
                        if (index - 1 >= 0) {
                            yearNumTree[index - 1][innerIndex] = 0;
                        }
                        if (index + 1 < yearNumTree.length && yearNumTree[index + 1][innerIndex] <= 1) {
                            yearNumTree[index + 1][innerIndex] = -1;
                        }
                        yearNumTree[index][innerIndex] = 0;
                    }
                }
            }
            year++;
        }

        for (int index = 0; index < yearNumTree.length; index++) {
            StringBuilder s = new StringBuilder();
            for (int innerIndex = 0; innerIndex < yearNumTree[index].length; innerIndex++) {
                if (yearNumTree[index][innerIndex] == 0) {
                    resultTree[index] = String.valueOf(s.append("."));
                } else resultTree[index] = String.valueOf(s.append("+"));
            }
        }
        return resultTree;
    }
}
