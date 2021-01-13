package Queue;

public class QueueWithTwoStacksDriver {

    public static void main(String[] args) {
        
        QueueWithTwoStacks queue = new QueueWithTwoStacks();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.printQueue();

        queue.dequeue();
        queue.printQueue();

        queue.enqueue(4);
        queue.printQueue();

    }
    
}
