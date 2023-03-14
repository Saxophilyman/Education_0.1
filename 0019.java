import java.util.*;

public class Level1 {    
    public static String [] ShopOLAP(int N, String [] items){
        ArrayList<String []> data = new ArrayList<>();
        ArrayList<String []> swap = new ArrayList<>();
        Arrays.sort(items);
        for (String item : items) {
            data.add(item.split(" "));
        }

        for (int index = 0; index < data.size(); index++) {
            for (int indexChecking = index + 1; indexChecking < data.size(); indexChecking++) {
                if (data.get(index)[0].equals(data.get(indexChecking)[0])) {
                    data.get(index)[1] = String.valueOf((Integer.parseInt(data.get(index)[1]) + Integer.parseInt(data.get(indexChecking)[1])));
                    data.remove(indexChecking);
                }
            }
        }

        for (int index = 0; index < data.size()-1; index++) {
            for (int innerIndex = 0; innerIndex < data.size() - index - 1; innerIndex++) {
                if(Integer.parseInt(data.get(innerIndex + 1)[1]) > Integer.parseInt(data.get(innerIndex)[1])){
                    swap.add(0, data.get(innerIndex+1));
                    data.set(innerIndex + 1, data.get(innerIndex));
                    data.set(innerIndex, swap.get(0));
                }
            }
        }

        String [] result = new String[data.size()];
        for (int index = 0; index < data.size(); index++) {
            result[index] = data.get(index)[0] + " " + data.get(index)[1];
        }

        return result;
    }
}
