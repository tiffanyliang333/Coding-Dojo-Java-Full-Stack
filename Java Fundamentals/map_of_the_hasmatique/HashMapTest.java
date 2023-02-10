import java.util.Set;
import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String>userMap = new HashMap<String, String>();
        userMap.put("one", "Pop");
        userMap.put("two", "Rap");
        userMap.put("three", "Rock");
        userMap.put("four", "Classic");

        Set<String>keys = userMap.keySet();

        for (String key: userMap.keySet()) {
            System.out.println(String.format("Track: %s: Genre: %s", key, userMap.get(key)));
        }
    }
    
}

