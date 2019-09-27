import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FrequencyCountOfWords {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();
        Set<String> set = new HashSet<>();
        Map<String, Integer> map= new HashMap<>();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            set.add(matcher.group(0));
        }

        int counter= 0;
        for (String i : set) {

            pattern = Pattern.compile(i);
            matcher = pattern.matcher(str);
            while (matcher.find()) {
                String a = matcher.group(0);
                Integer j = map.get(a);
                map.put(i, (j == null) ? 1 : j + 1);
            }
            System.out.println(map);
            for(Map.Entry m:map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
    }
}
