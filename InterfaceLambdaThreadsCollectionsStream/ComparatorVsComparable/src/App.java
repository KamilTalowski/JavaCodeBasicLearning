import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>
{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

        @Override
    public String toString() {
        return "Studnet [age=" + age + ", name=" + name + "]";
    }
    
    @Override
    public int compareTo(Student that) {
        if(this.age>that.age)
                    return 1;
                 else 
                    return-1;
    }
    
}
public class App {
    public static void main(String[] args) throws Exception {

        // Comparator<Integer> com = new Comparator<Integer>(){
        //     public int compare(Integer i, Integer j){
        //          if(i%10>j%10)
        //             return 1;
        //          else 
        //             return-1;
        //     }
        // };
        // Comparator<Student> com = new Comparator<Student>(){
        //     public int compare(Student i, Student j){
        //          if(i.age>j.age)
        //             return 1;
        //          else 
        //             return-1;
        //     }
        // };
        Comparator<Student> com = (Student i, Student j)-> i.age> j.age?1:-1;
;
        // List <Integer> nums = new ArrayList<>();
        // nums.add(43);
        // nums.add(31);
        // nums.add(72);
        // nums.add(29);

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(24, "Kamil"));
        studs.add(new Student(31, "Janek"));
        studs.add(new Student(19, "Pawel"));
        studs.add(new Student(29, "Krystian"));

        //Collections.sort(nums, com);

        Collections.sort(studs, com);

        //Collections.sort(studs);

        for(Student s : studs){
            System.out.println(s);
        }

        //System.out.println(nums);

    }
}
