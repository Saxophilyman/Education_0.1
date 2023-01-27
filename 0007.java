import java.util.*;
public class Level1 {    
        public static int[] WordSearch(int len, String s, String subs) {
        String[] text = s.split(" ", 0);
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
                newString = true;
                if (text[index].length() > len) {
                    indexForLIst++;
                    list.add(indexForLIst, "");
                    if (indexForLIst - 1 == 0 && list.get(0).isEmpty()) {
                        list.remove(indexForLIst);
                        indexForLIst--;
                    }
                    int indexOfLargeString = 0;
                    int endIndexOfLargeString = text[index].length();
                    while (indexOfLargeString <= text[index].length()) {
                        if (endIndexOfLargeString >= len) {
                            list.set(indexForLIst, text[index].substring(indexOfLargeString, indexOfLargeString + len));
                            indexForLIst++;
                            list.add(indexForLIst, "");
                        } else {
                            endIndexOfLargeString = indexOfLargeString + endIndexOfLargeString;
                            list.set(indexForLIst, text[index].substring(indexOfLargeString, endIndexOfLargeString) + "");
                        }
                        endIndexOfLargeString -= len;
                        indexOfLargeString += len;
                    }
                    countLen -= list.get(indexForLIst).length();
                } else {
                    index--;
                    indexForLIst++;
                    list.add(indexForLIst, "");
                }
                if (index + 1 == text.length && list.get(indexForLIst).isEmpty()) {
                    list.remove(indexForLIst);
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int indexSearch = 0; indexSearch < list.size(); indexSearch++) {
            String[] searchText = list.get(indexSearch).split(" ");
            for (int inIndexSearchText = 0; inIndexSearchText < searchText.length; inIndexSearchText++) {
                if (searchText[inIndexSearchText].equals(subs)) {
                    arr[indexSearch] = 1;
                    break;
                }
            }
        }
        return arr;
    }
}
