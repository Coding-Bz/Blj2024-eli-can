import java.util.HashMap;
import java.util.Map;

public class creating_a_list_hashmap {


    public static String listmaker(HashMap<String, Integer> wordCountMap) {
        StringBuilder list = new StringBuilder();

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            list.append("\n").append(entry.getKey()).append(": ").append(entry.getValue());
        }

        return list.toString();
    }
}
