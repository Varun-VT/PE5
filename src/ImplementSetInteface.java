import java.util.*;

public class ImplementSetInteface {
    public static void main(String[] args) {
        String[] arr= new String[]{"Harry","Olive","Alice","Bluto", "Eugene"};
        Set<String> set = new LinkedHashSet<>();
        for (String i: arr) {
            set.add(i);
        }
        List<String> list= new ArrayList<String>(set);
        Collections.sort(list);
        System.out.println("Sorted Set: "+list);
    }

}
