package WordCount;

import java.util.*;

public class Main {
    private static HashMap.Entry<String, Integer> findLargest(HashMap<String, Integer> map) {
        HashMap.Entry<String, Integer> maxEntry = null;

        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            if ((maxEntry == null) || (maxEntry.getValue() < entry.getValue())){
                maxEntry = entry;
            }
        }
        return maxEntry;
    }


public static void main(String[] args){
    String unText = new TheText().getTheText();

    unText = unText.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");

    String[] words = unText.split(" +");
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    for(String aWord : words) {
        if (!map.containsKey(aWord)) {
            map.put(aWord, 1);
        } else {
            map.put(aWord, 1);
        }
    }
    ArrayList<HashMap.Entry<String, Integer>> sortedMap = new ArrayList<HashMap.Entry<String, Integer>>();
    sortedMap.addAll(map.entrySet());

    Collections.sort(sortedMap, new Comparator<Map.Entry<String, Integer>>(){
        public int compare (HashMap.Entry<String, Integer> o1, HashMap.Entry<String, Integer> o2){
            return o2.getValue() - o1.getValue();
        }
    });
}
}
