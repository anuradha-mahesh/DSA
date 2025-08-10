//ArrayList is a resizable array — unlike a normal array, it can grow or shrink dynamically.


import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // 📌 Adding elements
        list.add(3);
        list.add(4);
        
        // 🧹 Removing element at index 0
        list.remove(0);
        
        // ✨ Adding at specific index
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        list.add(4);     // to make index 3 available
        list.set(3, 5);  // setting value at index 3

        // 🔍 Accessing and checking
        System.out.println(list.get(2));       // get element at index 2
        System.out.println(list);              // print entire list
        System.out.println(list.size());       // list size
        System.out.println(list.contains(4));  // check for value
        System.out.println(list.isEmpty());    // check if list is empty

        // 🔁 Traversing
        for (int element : list) {
            System.out.println(element);
        }
    }
}
