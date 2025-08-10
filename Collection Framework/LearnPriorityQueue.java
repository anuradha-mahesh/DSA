import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(20); 
        pq.offer(9);
        pq.offer(50);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        pq.poll();
        pq.offer(9);
        System.out.println(pq);
    }
}
