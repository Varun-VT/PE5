import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapObjectManipulation {
    public static void main(String[] args) {

        Map<String, String> map= new LinkedHashMap<>(){{put("val1", "java"); put( "val2", "c++");}};

        Map.Entry<String, String> entry1=  map.entrySet().iterator().next();

            Object key1= entry1.getKey();
            Object value1= entry1.getValue();

           Map.Entry<String, String> entry2=  map.entrySet().iterator().next();
           if (value1 != ""){
               map.put("val1", "");
           }
           map.put("val2", (String)value1);
            System.out.println(map);
        }
    }

