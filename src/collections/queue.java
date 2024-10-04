package collections;
import java.util.*;
/*
        queue(FIFO) this interface so we didn't create object

         */

public class queue {
    public static void main(String[] args) {

       /* Queue<Integer> io=new LinkedList<>();
        io.add(5);
        io.add(10);
        io.add(15);
        io.add(20);
        System.out.println(io.peek());
        System.out.println(io.remove());//like use poll,
        System.out.println(io.poll());// if poll use queue is empty this show null
        System.out.println(io.peek());*/


        Queue<Integer> i=new PriorityQueue<>();
        i.add(5);
        i.add(1);
        i.add(15);
        i.add(20);
        System.out.println(i.peek());
        System.out.println(i.remove());//like use poll,
        System.out.println(i.poll());// if poll use queue is empty this show null
        System.out.println(i.peek());
    }
    }

