import java.util.HashSet;

public class HashSetexp {
    public static void main(String[] args){
        HashSet hs = new HashSet<>();
        HashSet hs1 = new HashSet<>(100,85);
        HashSet hs2 = new HashSet(100,(float) 0.8);
        HashSet<Integer> hs3 = new HashSet<Integer>();
        hs.add(100);
        hs.add("Maha");
        hs.add('k');
        hs.add(true);
        hs.add(0.987);
        hs.add(null);
        hs.add(100);
        System.out.println(hs);
        hs.remove(100);
        System.out.println(hs);

    }
}
