import java.util.*;

public class CollectionsClass {
    public static void main(String[] args) {

        // ---------- LIST ----------
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(15);

        // Sorting list
        Collections.sort(list); // Ascending order
        System.out.println("Sorted List: " + list);

        // Reverse list
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // Get max and min
        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));

        // Frequency of an element
        list.add(10);
        System.out.println("Frequency of 10: " + Collections.frequency(list, 10));

        // Shuffle list
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // Swap elements
        Collections.swap(list, 0, 2);
        System.out.println("List after swap: " + list);

        // Replace all occurrences
        Collections.replaceAll(list, 10, 99);
        System.out.println("List after replace: " + list);

        // Binary Search (must be sorted first)
        Collections.sort(list);
        int index = Collections.binarySearch(list, 20);
        System.out.println("Index of 20: " + index);

        // ---------- SET ----------
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        // Convert to list to sort (since Set doesn't support sort directly)
        List<String> sortedSet = new ArrayList<>(set);
        Collections.sort(sortedSet);
        System.out.println("Sorted Set (converted to list): " + sortedSet);

    }
}

