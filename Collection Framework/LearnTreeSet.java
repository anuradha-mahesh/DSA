import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(5);
        set.add(20);
        set.add(10); // Duplicate, will be ignored

        System.out.println(set); // Output: [5, 10, 20] - Sorted

        System.out.println(set.contains(10)); // true
        set.remove(5);
        System.out.println(set.size()); // 2
        System.out.println(set.first()); // 10
        System.out.println(set.last());  // 20
        System.out.println(set.ceiling(15)); // 20 (next greater or equal)
        System.out.println(set.floor(15));   // 10 (next smaller or equal)

        set.clear();
        System.out.println(set.isEmpty()); // true
    }
}


