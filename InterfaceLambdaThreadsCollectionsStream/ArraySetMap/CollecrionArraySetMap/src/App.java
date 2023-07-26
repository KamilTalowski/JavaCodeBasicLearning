import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //Collection nums = new ArrayList(); //no generics
        //Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        //nums.add("5"); //not using generics we can make mistakes
        
        System.out.println(nums.indexOf(5)); //List
        System.out.println(nums.get(2)); //List

        // for(Object n : nums){
        //     int num= (Integer)n;
        //     System.out.println(num);
        // }
        
    }
}
