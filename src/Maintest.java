import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Maintest {
    public static void main(String[] args) {
        List<Student> list= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        list.add(new Student("Varun", "q1", 20));
        list.add(new Student("Shivam", "q2", 30));
        list.add(new Student("Ram", "q3", 40));
        list.add(new Student("Mohan", "q4", 30));
        list.add(new Student("aohan", "q5", 40));

        System.out.println("Unsorted");
        for (int i=0; i<list.size(); i++)
                System.out.println(list.get(i));
        Collections.sort(list, new StudentSorter());

        System.out.println("\nSorted by rollno");
        for (int i=0; i<list.size(); i++)
                System.out.println(list.get(i).toString());
        }
    }

