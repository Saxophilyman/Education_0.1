import java.util.*;

public class Level1 {     
    public static String BiggerGreater(String input) {
        String[] words = input.split("");
        String[] result;
        for (int index = 1; index <= words.length; index++) {
            String[] simpleWords = Arrays.copyOfRange(words, words.length - index, words.length);
            String[] magicWords = Arrays.copyOfRange(words, words.length - index, words.length);
            Arrays.sort(magicWords);
            for (int indexInPartOfWord = 0; indexInPartOfWord < index; indexInPartOfWord++) {
                if (simpleWords[0].compareTo(magicWords[indexInPartOfWord]) < 0) {
                    String[] firstPart = Arrays.copyOfRange(words, 0, words.length - index);
                    result = Arrays.copyOf(firstPart, input.length());
                    result[firstPart.length] = magicWords[indexInPartOfWord];
                    ArrayList<String> newMagicWords = new ArrayList<>(Arrays.asList(magicWords));
                    newMagicWords.remove(indexInPartOfWord);
                    Collections.sort(newMagicWords);
                    System.arraycopy(newMagicWords.toArray(), 0, result, firstPart.length + 1, newMagicWords.size());
                    return Arrays.toString(result);
                }
            }
        }
        return "";
    }
}
