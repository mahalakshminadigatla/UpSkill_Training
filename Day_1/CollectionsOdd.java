import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> oddNumbers = list.stream().filter(o -> o % 2 != 0).collect(Collectors.toList());

        System.out.println(oddNumbers);

    }
}
