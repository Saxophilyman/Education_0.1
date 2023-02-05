import java.util.*;

public class Level1 {
    public static String BigMinus(String s1, String s2) {

        StringBuilder resultSubtraction = new StringBuilder();
        StringBuilder upStringOfSubtraction = null;
        StringBuilder downStringOfSubtraction = null;
        StringBuilder dop = new StringBuilder("");

        for (int indexOfString = 0; indexOfString < s1.length(); indexOfString++) {
            if (s1.length() > s2.length()) {
                upStringOfSubtraction = new StringBuilder(s1);
                downStringOfSubtraction = new StringBuilder(s2);
                dop = new StringBuilder(upStringOfSubtraction.substring(0, upStringOfSubtraction.length() - downStringOfSubtraction.length()));
                break;
            } else if (s1.length() < s2.length()) {
                upStringOfSubtraction = new StringBuilder(s2);
                downStringOfSubtraction = new StringBuilder(s1);
                dop = new StringBuilder(upStringOfSubtraction.substring(0, upStringOfSubtraction.length() - downStringOfSubtraction.length()));
                break;
            } else if (s1.charAt(indexOfString) > s2.charAt(indexOfString)) {
                upStringOfSubtraction = new StringBuilder(s1.substring(indexOfString));
                downStringOfSubtraction = new StringBuilder(s2.substring(indexOfString));
                break;
            } else if (s1.charAt(indexOfString) < s2.charAt(indexOfString)) {
                upStringOfSubtraction = new StringBuilder(s2.substring(indexOfString));
                downStringOfSubtraction = new StringBuilder(s1.substring(indexOfString));
                break;
            }
              else if (s1.length() == s2.length() && s1.lastIndexOf(s2,s2.length()-1) !=-1 ){
                return String.valueOf(resultSubtraction.append("0"));
            }
        }

        assert upStringOfSubtraction != null;
        int minLength = Math.min(upStringOfSubtraction.length(), downStringOfSubtraction.length());
        int intCurrentSubtraction;
        int valueToCorrect = 0;

        for (int indexOfSubtraction = 1; indexOfSubtraction <= minLength; indexOfSubtraction++) {
            intCurrentSubtraction = (upStringOfSubtraction.charAt(upStringOfSubtraction.length() - indexOfSubtraction) - valueToCorrect) -
                    downStringOfSubtraction.charAt(downStringOfSubtraction.length() - indexOfSubtraction);
            if (intCurrentSubtraction < 0) {
                intCurrentSubtraction = 10 - Math.abs(intCurrentSubtraction);
                valueToCorrect = 1;
            } else {
                valueToCorrect = 0;
            }
            resultSubtraction.insert(0, intCurrentSubtraction);
        }

        int correctLength = 0;
        while (valueToCorrect != 0) {
            if (dop.charAt(dop.length() - 1) > 0 && dop.charAt(dop.length() - correctLength - 1) != '0') {
                dop.setCharAt(dop.length() - correctLength - 1, (char) (dop.charAt(dop.length() - correctLength - 1) - 1));
                valueToCorrect = 0;
            } else {
                dop.setCharAt(dop.length() - correctLength - 1, '9');
                correctLength++;
            }
        }
        resultSubtraction.insert(0, dop);
        if (resultSubtraction.charAt(0) > 0 && resultSubtraction.charAt(0) == '0') {
            resultSubtraction.deleteCharAt(0);
        }
        return String.valueOf(resultSubtraction);
    }
}
