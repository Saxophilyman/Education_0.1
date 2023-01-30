import java.util.*;

public class Level1 {
    public static String TheRabbitsFoot(String s, boolean encode) {
        String[][] matrix;
        StringBuilder redString = new StringBuilder();
        int indexOfStr = 0;
        if (encode) {
            s = s.replaceAll("\\s", "");
        } else {
            s = s.replaceAll("\\s+", " ");
        }
        char[] stringCode = s.toCharArray();
        double n = Math.sqrt(s.length());
        int line = (int) n;
        int column;
        if (n > (int) n) {
            column = (int) n + 1;
        } else column = (int) n;
        if (s.length() > line * column) {
            line += 1;
        }
        String[] decrypt = s.split(" ");
        if (encode) {
            matrix = new String[line][column];
        } else {
            matrix = new String[decrypt[0].length()][decrypt.length];
        }

        for (int indexColumn = 0; indexColumn < matrix.length; indexColumn++) {
            for (int indexLine = 0; indexLine < matrix[0].length; indexLine++) {
                if (encode) {
                    if (indexOfStr < s.length()) {
                        matrix[indexColumn][indexLine] = String.valueOf(stringCode[indexOfStr]);
                    }
                } else {
                    if (indexOfStr < decrypt[indexColumn].length()) {
                        matrix[indexColumn][indexLine] = String.valueOf(decrypt[indexColumn].charAt(indexLine));
                    }
                }
                indexOfStr++;
            }
            if (!encode)
                indexOfStr = 0;
        }

        for (int indexLine = 0; indexLine < matrix[0].length; indexLine++) {
            for (int indexColumn = 0; indexColumn < matrix.length; indexColumn++) {
                if (matrix[indexColumn][indexLine] != null)
                    redString.append(matrix[indexColumn][indexLine]);
            }
            if (encode && indexLine != matrix[0].length - 1) {
                redString.append(" ");
            }
        }
        return String.valueOf(redString);
    }
}
