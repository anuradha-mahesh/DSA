import java.util.ArrayDeque;

public class LearnArrayDeque {
 public static void main(String[] args) {
     ArrayDeque<Integer> deque = new ArrayDeque<>();
      deque.addFirst(10);
        deque.addLast(20);
        deque.offerFirst(5);
        deque.offerLast(25);

        System.out.println("Deque: " + deque); // [5, 10, 20, 25]

        System.out.println("First Element: " + deque.peekFirst()); // 5
        System.out.println("Last Element: " + deque.peekLast());   // 25

        deque.pollFirst(); // Removes 5
        deque.pollLast();  // Removes 25

        System.out.println("After removing: " + deque); // [10, 20]
 }   
}
