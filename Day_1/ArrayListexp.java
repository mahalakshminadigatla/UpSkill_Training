import java.sql.Array;
import java.util.*;

public class ArrayListexp {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList l2 = new ArrayList();
        Random random = new Random();
        l2.add(32);
        // l2.add("Maha");
        l2.add(89);
        l2.add(56);
        l2.add(76);
        l1.add(1);
        l1.add(877);
        l1.add(10);
        l1.add(90);
        l1.add(3, 70);
        l1.set(0, 12);
        l1.addAll(2, l2);
        System.out.println(l1.contains(10));
        System.out.println(l1);
        System.out.println(l1.isEmpty());
        Collections.sort(l1);
        System.out.println(l1);
        Collections.shuffle(l2);
        System.out.println(l2);
        Collections.shuffle(l1, random);
        System.out.println(l1);

        //for loop..................
        System.out.println("Reading Data using for loop.................");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));

        }

        //for..each loop....................
        System.out.println("Reading data using for each loop.................");
        for (Integer e : l1) {
            System.out.println(e);
        }

        //iterator.................
        System.out.println("Reading data using iterator..................");
        Iterator iterator = l1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Integer[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(l3);
    }
}