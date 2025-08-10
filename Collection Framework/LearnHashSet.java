import java.util.HashSet;

public class LearnHashSet {
    public static void main(String[] args) {
        // Creating a HashSet of Strings to store fruit names
        HashSet<String> fruits = new HashSet<>();

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana"); // Duplicate - will NOT be added

        // Prints the entire set (unordered)
        System.out.println(fruits); // Output could be in any order

        System.out.println(fruits.contains("Apple")); // true

        // Removes "Mango" from the set
        fruits.remove("Mango");

        System.out.println(fruits.size()); // 2

        // Clears all elements from the set
        fruits.clear();

        // Checks if the set is empty after clearing
        System.out.println(fruits.isEmpty()); // true
    }
}
