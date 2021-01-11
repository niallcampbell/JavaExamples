import java.util.HashMap;
import java.util.Map.Entry;

public class LinkedList {

    private Node head;

    public LinkedList(){
        head = null;
    }

    public void addNode(Node n){

        if(head == null){
            head = n;
        } else {
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNextNode(n);
        }
    }

    public void deleteNode(int n){

        Node node = new Node(n);

        if(head == null){
            System.out.println("List is empty, no nodes to delete. ");
            return;
        } else if(node.getValue() == head.getValue() && head.getNext() == null){
            head = null;
            System.out.println("Node " + node.getValue() + " deleted, list is now empty.");
            return;
        } else if(node.getValue() == head.getValue() && head.getNext() != null){
            head = head.getNext();
            System.out.println("Node " + node.getValue() + " has been deleted.");
            return;
        }

        Node temp = head.getNext();
        Node prev = head;

        while(temp.getNext() != null){
            if(temp.getValue() == node.getValue()){
                prev.setNextNode(temp.getNext());
                System.out.println("Node " + node.getValue() + " has been deleted.");
                return;
            } else{
                prev = temp;
                temp = temp.getNext();
            }
        }

        if(temp.getValue() == node.getValue()){
            prev.setNextNode(null);
            System.out.println("Node " + node.getValue() + " has been deleted.");
        } else {
            System.out.println("Node " + node.getValue() + " is not in the list.");
        }

    }


    public Node findNode(int value){

        Node temp = head;

        if(temp.getNext() == null && temp.getValue() != value){
            return null;
        }

        while(temp.getNext() != null){
            if(temp.getValue() == value){
                return temp;
            } else {
                temp = temp.getNext();
            }
        }

        return null;
     }

    public boolean isEmpty(){
        return head == null ? true : false;
    }

    public int listLength(){
        if(head == null){
            return 0;
        }

        Node temp = head;
        int count = 1;

        while(temp.getNext() != null){
            count++;
            temp = temp.getNext();
        }

        return count;
    }

    public Node getMiddleElement(){

        int length = listLength();
        int middle = length / 2;
        Node temp = head;
        int count = 0;

        while(count < length){
            if(count == middle){
                return temp;
            } else {
                temp = temp.getNext();
                count++;
            }
        }
        
        return null;
    }

    /**
     *  Get the middle element in a list in a single pass. 
     * 
     *  Use two pointers. First pointer moves every second iteration, second pointer moves every iteration. 
     *  When second one reaches the end, the first pointer is in the middle. 
     */
    public Node getMiddleElementInASinglePass(){

        Node firstPointer = head;
        Node secondPointer = head;
        int count = 0;

        while(secondPointer.getNext() != null){
            count++;
            if(count % 2 == 0){
                firstPointer = firstPointer.getNext();
            }
            secondPointer = secondPointer.getNext();
        }

        return firstPointer;
    }

    /**
     * 
     *  Find the Kth element from the end in a single pass. 
     *  
     *  Two pointers. Second one starts when the first gets to the kth node. 
     *  As such the second is always k places behind the first pointer. 
     *  When the first one reaches the last element, then the second one is k nodes from the end.
     *  
     */
    public Node getKthNodeFromTheEnd(int k){

        Node firstPointer = head;
        Node secondPointer = head;

        int count = 1;

        while(firstPointer.getNext() != null){
            if(count >= k){
                secondPointer = secondPointer.getNext();
            }
            firstPointer = firstPointer.getNext();
            count++;
        }

        return secondPointer;
        
    }

    /**
     *  Traverse through the list and reverse the next pointers of each node to the previous node. 
     * 
     *  Reverse the linked list. 
     */
    public void reverseList(){

        Node prev = null;
        Node current = head;
        Node next = head.getNext();

        while(next.getNext() != null){
            current.setNextNode(prev);
            prev = current;
            current = next;
            next = next.getNext();
        }

        current.setNextNode(prev);
        next.setNextNode(current);

        head = next;

    }

    /**
     *  Remove duplicate values in an unsorted linked list. 
     */
    public void removeDuplicateValues(){

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        Node temp = head;

        while(temp.getNext() != null){
            if(map.containsKey(temp.getValue())){
                map.put(temp.getValue(), map.get(temp.getValue()) + 1);
            } else {
                map.put(temp.getValue(), 1);
            }
            temp = temp.getNext();
        }

        if(map.containsKey(temp.getValue())){
            map.put(temp.getValue(), map.get(temp.getValue()) + 1);
        } else {
            map.put(temp.getValue(), 1);
        }

        head = null;
        temp = null;

        for(Entry<Integer, Integer> entry : map.entrySet()){
            if(head == null){
                head = new Node(entry.getKey());
            } else if(head.getNext() == null) {
                temp = new Node(entry.getKey());
                head.setNextNode(temp);
            } else {
                Node next = new Node(entry.getKey());
                temp.setNextNode(next);
                temp = next;
            }
        }

    }

    public void printList() {
        if(isEmpty()){
             System.out.println("The linked list is empty.");
             return;
        }

        System.out.println("Linked List: ");
        Node temp = head;

        while(temp.getNext() != null){
             System.out.println("Node value: " + temp.getValue());
             temp = temp.getNext();
        }

        System.out.println("Node value: " + temp.getValue());
    }
}
