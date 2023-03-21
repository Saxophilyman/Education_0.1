import java.util.*;

public class Level1 {
    public static boolean SherlockValidString(String s) {
        String[] cypherArr = s.split("");
        List<String> cypherArrList = Arrays.asList(cypherArr);
        ArrayList<String> cypherSymbolOut = new ArrayList<>();
        ArrayList<Integer> arrCountRepeat = new ArrayList<>();
        for (int index = 0; index < cypherArrList.size(); index++) {
            if (!String.valueOf(cypherSymbolOut).contains(cypherArrList.get(index))) {
                arrCountRepeat.add(Collections.frequency(cypherArrList, cypherArrList.get(index)));
                cypherSymbolOut.add(cypherArrList.get(index));
            }
        }

        Collections.sort(arrCountRepeat);
        ArrayList<Integer> arrCountRepeatForOutNumbers = new ArrayList<>();
        ArrayList<Integer> lastCheckArrOfCountRepeat = new ArrayList<>();
        for (int index = 0; index < arrCountRepeat.size(); index++) {
            if (Collections.binarySearch(arrCountRepeatForOutNumbers, arrCountRepeat.get(index)) < 0) {
                lastCheckArrOfCountRepeat.add(Collections.frequency(arrCountRepeat, arrCountRepeat.get(index)));
                arrCountRepeatForOutNumbers.add(arrCountRepeat.get(index));
            }
        }
        return arrCountRepeatForOutNumbers.size()==1 || (arrCountRepeatForOutNumbers.size() <= 2 &&
                arrCountRepeatForOutNumbers.get(0) + 1 >= arrCountRepeatForOutNumbers.get(1) &&
                arrCountRepeatForOutNumbers.get(0) - 1 <= arrCountRepeatForOutNumbers.get(1) &&
                (lastCheckArrOfCountRepeat.get(0) <= 1 || lastCheckArrOfCountRepeat.get(1) <= 1));
    }
}
