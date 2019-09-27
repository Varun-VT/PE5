import java.util.*;

public class ListImplementation {
    public static void main(String[] args) {
//        String[] arr = new String[]{"Apple", "Grape", "Melon", "Berry"};
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        while(str!= null){
        list.add(str);
        
    }
        list.remove((Object)"Apple");
        list.remove("Melon");
        list.add("Kiwi");
        list.add("Melon");
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
