import java.util.*;

public  classLevel1 {
       public static ArrayList<String> returnList(int len, String[] text) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "");
        int indexForLIst = 0;
        int countLen = len;
        boolean newString = true;
        for (int index = 0; index < text.length; index++) {
            if (text[index].length() <= countLen) {
                if (newString) {
                    list.set(indexForLIst, list.get(indexForLIst) + text[index]);
                } else {
                    list.set(indexForLIst, list.get(indexForLIst) + " " + text[index]);
                }
                countLen -= text[index].length() + 1;
                newString = false;
            } else {
                countLen = len;
                indexForLIst++;
                list.add(indexForLIst, "");
                newString = true;
                if (text[index].length() > len) {
                    int indexOfLargeString = 0;
                    int endIndexOfLargeString = text[index].length();
                    while (indexOfLargeString <= text[index].length()) {
                        if (endIndexOfLargeString >= len) {
                            list.set(indexForLIst, text[index].substring(indexOfLargeString, indexOfLargeString + len));
                            indexForLIst++;
                            list.add(indexForLIst, "");
                        } else {
                            endIndexOfLargeString = indexOfLargeString + endIndexOfLargeString;
                            list.set(indexForLIst, text[index].substring(indexOfLargeString, endIndexOfLargeString) + " ");
                        }
                        endIndexOfLargeString -= len;
                        indexOfLargeString += len;
                    }
                    countLen -= list.get(indexForLIst).length();
                } else index--;
            }
        }
        return list;
    }
}
