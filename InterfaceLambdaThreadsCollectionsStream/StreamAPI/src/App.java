import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        // Consumer<Integer> con = n -> System.out.println(n);

        // nums.forEach(con);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n-> n%2==0);
        // Stream<Integer> s3 = s2.map(n->n*2);
        // Integer result= s3.reduce(0, (c,e) -> c+e);

        Integer result = nums.stream()
                            .filter(n-> n%2==0)
                            .map(n->n*2)
                            .reduce(0, (c,e) -> c+e);

        System.out.println(result);



        //s3.forEach(n -> System.out.println(n));

        //nums.forEach(n -> System.out.println(n*2));

        //nums.forEach(n-> System.out.println(n));


        //  }
        // int sum =0;
        // for( int n: nums){
        //     if(n%2==0){
        //         n=n*2;
        //         sum = sum +n;          
        //     }
        // }
        
        //System.out.println(sum);
    }
}
