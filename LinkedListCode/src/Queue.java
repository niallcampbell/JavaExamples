/**
 *  Implement a Queue using a Linked List. 
 * 
 *  Queue = First In First Out. 
 * 
 *  Add to the rear, remove from the front. 
 * 
 *  Front of Queue == head of linked list
 */
public class Queue {

    private LinkedList queue = new LinkedList();
    private int nItems;

    public Queue(){
        nItems = 0;
    }

    public void insert(int value){
        Node node = new Node(value);
        queue.addNode(node);
        nItems++;
    }

    public Node remove(){
        if(nItems == 0){
            return null;
        } else{
            nItems--;
            return queue.removeFirstNode();
        }
    }

    public void printQueue(){
        Node temp = queue.getHead();
        if(temp == null){
            System.out.println("The queue is empty");
            return;
        }

        System.out.print("Queue: ");
        while(temp.getNext() != null){
            System.out.print(temp.getValue() + " ");
            temp = temp.getNext();
        }
        System.out.println(temp.getValue());
    }
    
}
