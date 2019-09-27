import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int diff= o2.getAge()- o1.getAge();
        if (diff !=0){
            return o2.getAge()- o1.getAge();}
        else
            return o2.getName().compareTo(o1.getName());
    }
}
