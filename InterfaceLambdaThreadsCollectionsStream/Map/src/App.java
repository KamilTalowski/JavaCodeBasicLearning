import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> students = new HashMap<String, Integer>();
        //Map<String, Integer> students = new Hashtable()<String, Integer>(); //same as hashmap but synchronized
        students.put("Kamil", 56);
        students.put("Herbert", 23);
        students.put("Staszek", 67);
        students.put("Krystian", 92);
        students.put("Adam", 45);
        students.put("Herbert", 35); //Values "keys" are unique as Set, Integer as ArrayList

        
        // System.out.println(students.get("Herbert"));
        // System.out.println(students);
        System.out.println(students.keySet());
        for (String key : students.keySet()) {
            System.out.println(key+ ":" +  students.get(key));
        }
    }
}
