import java.util.*;

public class Level1 {
    static ArrayList<String> result = new ArrayList<>() {{
        add("");
    }};
    static int undo = 0;

        public static String BastShoe(String command) {
        if (command.charAt(0) == 49) {
            String string = result.get(0) + "" + command.substring(2);
            result.add(0, string);
            if (undo != 0) {
                List<String> sublist = result.subList(1, result.size());
                result.removeAll(sublist);
                undo = 0;
            }
            return result.get(0);
        }
        if (command.charAt(0) == 50) {
            int n;
            try {
                n = Integer.parseInt(command.substring(2));
            } catch (NumberFormatException e) {
                return result.get(0);
            }
            if (n > result.get(0).length() ) {
                result.add(0, "");
                if (undo != 0) {
                    List<String> sublist = result.subList(1, result.size());
                    result.removeAll(sublist);
                    undo = 0;
                }
                return "";
            }
            result.add(0, result.get(0).substring(0, result.get(0).length() - n));
            if (undo != 0) {
                List<String> sublist = result.subList(1, result.size());
                result.removeAll(sublist);
                undo = 0;
            }
            return result.get(0);
        }
        if (command.charAt(0) == 51) {
            int n;
            try {
                n = Integer.parseInt(command.substring(2));
            } catch (NumberFormatException e) {
                return result.get(0);
            }
            if (n >= result.get(0).length()) {
                return "";
            }
            return String.valueOf(result.get(0).charAt(n));
        }
        if (Integer.parseInt(command) == 4) {
            if (undo + 1 >= result.size()) {
                return result.get(result.size() - 1);
            }
            undo++;
            return result.get(undo);
        }
        if (Integer.parseInt(command) == 5) {
            if (undo - 1 <= 0) {
                return result.get(0);
            }
            undo--;
            return result.get(undo);
        }
        return result.get(0);
    }
}
