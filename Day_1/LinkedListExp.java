import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExp {
    public static void main(String[] args) {
        LinkedList ls1 = new LinkedList();
        LinkedList<String> ls2 = new LinkedList<String>();
        LinkedList<Integer> ls3 = new LinkedList<Integer>();
        ls1.add(100);
        ls1.add("Maha");
        ls1.add(34.23);
        ls1.add(true);
        ls1.add('m');
        ls1.add(null);
        System.out.println(ls1);
        System.out.println(ls1.size());
        ls1.remove(3);
        System.out.println(ls1);
        ls1.remove("Maha");
        System.out.println(ls1);
        ls1.add(3, true);
        System.out.println(ls1);
        System.out.println(ls1.get(4));
        ls1.set(4, "Maha");
        System.out.println(ls1);
        System.out.println(ls1.contains("Maha"));
        System.out.println(ls1.contains("Java"));
        System.out.println(ls1.isEmpty());
        //reading data using forloop
        for (int i = 0; i < ls1.size(); i++) {
            System.out.println(ls1.get(i));
        }
        // reading data using foreach loop
        for (Object e : ls1
        ) {
            System.out.println(e);
        }
        Iterator it = ls1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        ls2.add("Maha");
        ls2.add("Lakshmi");
        ls2.add("Nadigatla");
        ls1.addAll(ls2);
        System.out.println(ls1);
        Collections.sort(ls2);
        System.out.println(ls2);
        ls1.removeAll(ls2);
        System.out.println(ls1);
        Collections.sort(ls2, Collections.reverseOrder());
        System.out.println(ls2);
        Collections.shuffle(ls1);
        System.out.println(ls1);


    }
}
