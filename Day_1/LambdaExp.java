import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExp {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,99};
        List<Integer> l1 = Arrays.asList(1,2,2,3,4,5);
        Arrays.stream(nums).forEach(o -> System.out.print(o%2 +  " "));
        System.out.println("...............................................");
        Arrays.stream(nums).filter(o -> o%2 == 0).forEach(odd -> System.out.println(odd ));
        System.out.println("...............................................");
        List<Integer> nums2 = l1.stream().filter(o-> o%2 == 0).collect(Collectors.toList());
        l1.stream().forEach(o -> System.out.println(o%2));
        System.out.println("...............................................");
        List<Integer> numsAsList = Arrays.stream(nums).filter(o -> o%2 != 0).boxed().collect(Collectors.toList());
        System.out.println(nums2);
        System.out.println("...............................................");
        System.out.println(numsAsList);

    }
}
