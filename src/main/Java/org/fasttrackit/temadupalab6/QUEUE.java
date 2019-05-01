package org.fasttrackit.temadupalab6;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QUEUE {

    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.add("ad");
        queue.offer("bsbs");
        queue.offer("sds");

        System.out.printf("%s",queue);
        System.out.println("\nHighest priority element :"+queue.peek());

        queue.poll(); //remove the highest priority element(first elem from collection)

        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}