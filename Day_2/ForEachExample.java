import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alya");
        names.add("Bunny");
        names.add("Chandu");

        // Using forEach with a lambda expression
        names.forEach(name -> System.out.println(name));

        // Alternatively, using a method reference
        names.forEach(System.out::println);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Sequential stream
        long sequentialCount = numbers.stream().filter(n -> n % 2 == 0).count();

            // Parallel stream
        long parallelCount = numbers.parallelStream().filter(n -> n % 2 == 0).count();

        System.out.println(sequentialCount);
        System.out.println(parallelCount);

    }

}

