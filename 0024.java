import java.util.*;

public class Level1 {
    public static void MatrixTurn(String Matrix[], int M, int N, int T) {
        //need refactoring
        ArrayList<StringBuilder> around = new ArrayList<>();
        String[] res = new String[M];
        int m = M;
        for (int index = 0; index < m; index++) {
            res[index] = "";
            StringBuilder s = new StringBuilder();
            StringBuilder end = new StringBuilder();
            s.append(Matrix[index], index, N - index);
            for (int rightLeft = 1 + index; rightLeft < m - index - 1; rightLeft++) {
                s.append(Matrix[rightLeft], N - index - 1, N - index);
                end.append(Matrix[rightLeft], index, index + 1);
            }
            s.append(new StringBuilder(Matrix[Matrix.length - index - 1]).reverse(), index, N - index);
            s.append(end.reverse());
            around.add(s);
            m -= 2;
            res[res.length - index -1] = "";
        }
        for (int i = 0; i < around.size(); i++) {
            StringBuilder op = new StringBuilder(around.get(i));
            around.set(i, new StringBuilder(op.substring(around.get(i).length()-T)).append(op.substring(0,around.get(i).length()-T)));
        }

        m = M;
        for (int index = 0; index < m; index++) {
            res[index] = String.valueOf(new StringBuffer(res[index]).insert(index, around.get(index).substring(0, N - index*2 )));
            int ofEnd = 0;
            for (int indexOfArr = 1 + index; indexOfArr < m - index - 1; indexOfArr++) {
                res[indexOfArr] = String.valueOf(new StringBuffer(res[indexOfArr]).insert(index,
                        around.get(index).substring(around.get(index).length() - indexOfArr, around.get(index).length() - indexOfArr + 1)));
                res[indexOfArr] = res[indexOfArr] + around.get(index).substring(N - (index ) + indexOfArr - 1, N - (index ) + indexOfArr);
                ofEnd++;
            }
            res[res.length - index -1] = String.valueOf(new StringBuffer(res[res.length - index -1]).insert(index,
                    new StringBuilder(around.get(index).substring(around.get(index).length() - (N - index*2) - ofEnd, around.get(index).length() - ofEnd)).reverse()));
            m -= 2;
        }
        for (int indexMatrix = 0; indexMatrix < Matrix.length; indexMatrix++) {
            Matrix[indexMatrix] = res[indexMatrix];
        }
    }
}
