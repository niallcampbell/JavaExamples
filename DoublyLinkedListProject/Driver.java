
/**
 * Used to run DoublyLinkedList code. 
 *
 */
public class Driver
{
    public static void main(String [] args){
        
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.printListInOrder();
        
        for(int i = 1; i <= 3; i++){
            
            Node n = new Node(i);
            myList.insertNodeAtEndOfList(n);
            
        }
        
        myList.printListInOrder();
        
        System.out.println();
        myList.deleteNodeAtEndOfList();
        myList.printListInOrder();
        System.out.println();
        
        Node n1 = new Node(4);
        myList.insertNodeAtBeginningOfList(n1);
        myList.printListInOrder();
        System.out.println();
        
        myList.deleteNodeAtBeginningOfList();
        myList.printListInOrder();
        System.out.println();
        
        myList.insertNodeAtEndOfList(new Node(3));
        myList.printListInOrder();
        System.out.println();
        
        myList.insertNodeAfter(new Node(5), 2);
        myList.printListInOrder();
        System.out.println();
        
        myList.deleteNodeWithValue(3);
        myList.printListInOrder();
        System.out.println();
        
        myList.deleteNodeWithValue(6);
        System.out.println();
        
        myList.deleteNodeWithValue(1);
        myList.printListInOrder();
        System.out.println();
        
        myList.insertNodeAtEndOfList(new Node(7));
        myList.insertNodeAtEndOfList(new Node(8));
        myList.insertNodeAtEndOfList(new Node(9));
        myList.printListInOrder();
        System.out.println();
        
        myList.printListInReverse();
    }
}
