//A Queue is a linear data structure that follows the FIFO rule:

// First In, First Out
// The element that is inserted first is the one removed first.

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        //add element
        q.offer(10);
        q.offer(20);
        q.offer(30);
        
        //return the front element
        System.out.println("Front Element: " + q.peek());
        
        //removes and returns the front element
        System.out.println("Removing front element: " + q.poll() + "\nNow Queue looks like " + q);
        
        System.out.println(q.size());

        System.out.println(q.isEmpty());
    }
}
