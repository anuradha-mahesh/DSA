import java.util.LinkedHashSet;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
         LinkedHashSet<String> cities = new LinkedHashSet<>();

        // Adding elements
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Delhi"); // Duplicate — won't be added

        // Maintains insertion order
        System.out.println(cities); // Output: [Mumbai, Delhi, Pune]

        // Check if element exists
        System.out.println(cities.contains("Pune")); // true

        // Remove an element
        cities.remove("Delhi");

        // Print size of set
        System.out.println(cities.size()); // 2

        // Clear the set
        cities.clear();

        // Check if set is empty
        System.out.println(cities.isEmpty()); // true
    }
}
