package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(2);
        pq.add(9);
        pq.add(4);
        pq.add(5);
        while(!pq.isEmpty()){
           System.out.println(pq.peek());
           pq.remove();
        }
    }
}
