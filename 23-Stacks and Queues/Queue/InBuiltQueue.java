import java.util.*;

public class InBuiltQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.remove());
        System.out.println(queue.remove());


        // DEQUEUE
        // ArrayDequeue basically let us to create an object in the dequeue interface.
        // Basically It has the resizable array.
        //We can insert and remove element from both the side.
        // Doubly ended queue
        // Null element is not allowed
        // This is not thread safe
        // No capacity restriction
        //It is faster than LinkedList and stack
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();

    }
}
