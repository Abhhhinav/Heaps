package Heaps;
import java.util.PriorityQueue;

public class priorQueueObj {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student>pq = new PriorityQueue<>();

        pq.add(new Student("Abhinav", 6));
        pq.add(new Student("Abhishek", 2));
        pq.add(new Student("Rahul", 3));
        pq.add(new Student("Mohan", 1));
        while(!pq.isEmpty()){
           System.out.println(pq.peek().name + " -> "+ pq.peek().rank);
           pq.remove();
        }
    }
}
