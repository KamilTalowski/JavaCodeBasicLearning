import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class App {
    public static void main(String[] args) throws Exception {
        
        //Set<Integer> nums = new HashSet<Integer>();
        Collection<Integer> nums = new TreeSet<Integer>(); //sorted no extra set methods
        //Set<Integer> nums = new TreeSet<Integer>(); //sorted
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);
        
        Iterator<Integer> values = nums.iterator(); //Iteratable-> Collection-> List,Queue,Set

        while(values.hasNext()){
            System.out.println(values.next());
        }
        // for(int n : nums){
        //     System.out.println(n);
        // }
        
    }
}
