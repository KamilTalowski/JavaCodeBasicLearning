import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        //filter
        //Predicate<Integer> p = n -> n%2==0;

        //map
        //Function<Integer, Integer> fun = n-> n*2;

        //reduce
        



        // Integer result = nums.stream()
        //                     .filter(n -> n%2==0)
        //                     .map(n-> n*2)
        //                     .reduce(0, (c,e) -> c+e);

        // System.out.println(result);


        Stream<Integer> sortedValues = nums.parallelStream() //pararell for filter
                                            .filter(n -> n%2==0)
                                            .sorted();

        sortedValues.forEach(n-> System.out.println(n));
    }
}
