import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class BoolFrequency {
    public static void main(String[] args) {
//        try {
            Map<String, Boolean> map = new LinkedHashMap<>();
            String arr[] = {"a", "b", "c", "d", "a", "c", "c"};

            Set<String> set = new HashSet<>();
//            Map.Entry<String, Boolean> entry1 = map.entrySet().iterator().next();
            for (String i : arr) {
                set.add(i);
            }
            for (String i : set) {
                int count = 0;
                for (String j : arr) {
                    if (j.equals(i)) {
                        count++;
                    }
                }
                if (count > 1) {
                    map.put(i, true);
                } else
                    map.put(i, false);
            }
            System.out.println(map);
//        }catch (Exception e){}
    }
}
