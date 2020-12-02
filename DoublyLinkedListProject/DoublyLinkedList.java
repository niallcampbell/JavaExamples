/**
 * Class for a DoublyLinkedList object.
 *
 */
public class DoublyLinkedList
{
   private Node head;

   public DoublyLinkedList(){
       head = null;
   }
    
   public void insertNodeAtEndOfList(Node n){
       
       System.out.println("Inserting node with data " + n.getData() + " at the end of the list");
       
       if(head == null){
           head = n;
           return;
       }
        
       Node current = head;
        
       while(current.getNext() != null){
           current = current.getNext();
       }
        
       n.setPrev(current);
       current.setNext(n);
   }
   
   public void deleteNodeAtEndOfList(){
       
       //Loop through list keeping store of prev and curr
       //with last current point prev.next to null
       //point curr.prev to null
       
       if(head == null){
           return;
       }
       else if(head.getNext() == null){
           head = null;
           return;
       }
       
       Node current = head;
       Node previous = null;
       
       while(current.getNext() != null){
           previous = current;
           current = current.getNext();
       }
       
       System.out.println("Deleting node with data: " + current.getData());
       
       previous.setNext(null);
       current.setPrev(null);
       
   }
   
   public void insertNodeAtBeginningOfList(Node n){
       if(head == null){
           head = n;
           return;
       }
       
       n.setNext(head);
       head.setPrev(n);
       
       head = n;
       
       System.out.println("Inserting node with data: " + n.getData() + " at beginning of list.");
   }
   
   public void deleteNodeAtBeginningOfList(){
       if(head == null){
           System.out.println("List is empty");
           return;
       }
       else if(head.getNext() == null){
           System.out.println("Deleted node with data: " + head.getData());
           head = null;
           return;
       }
       
       System.out.println("Deleting element at beginning of list with data: " + head.getData());
       
       Node newHead = head.getNext();
       newHead.setPrev(null);
       head.setNext(null);
       head = newHead;
   }
   
   public void insertNodeAfter(Node n, int val){
       if(head == null){
           System.out.println("List is empty.");
           return;
       }
       
       Node current = head;
       Node next = head.getNext();
       
       while(current.getNext() != null){
           
           if(current.getData() == val){
               System.out.println("Inserting new node " + n.getData() + " after node with data " + val);
               current.setNext(n);
               next.setPrev(n);
               n.setPrev(current);
               n.setNext(next);
               return;
           }
           else{
               current = next;
               next = current.getNext();
           }
       }
       
       System.out.println("Could not find node with data: " + val);
   }
   
   public void deleteNodeWithValue(int val){
       
       if(head == null){
           System.out.println("List is empty.");
           return;
       }
       else if(head.getData() == val){
           System.out.println("Deleting node with value: " + val);
           Node newHead = head.getNext();
           head.setNext(null);
           newHead.setPrev(null);
           head = newHead;
           return;
       }
       
       Node current = head.getNext();
       Node prev = head;
       
       while(current.getNext() != null){
           
           if(current.getData() == val){
               System.out.println("Deleting node with value: " + val);
               
               Node next = current.getNext();
               next.setPrev(current.getPrev());
               
               prev.setNext(next);
               current.setPrev(null);
               current.setNext(null);
               
           }
           else{
               prev = current;
               current = current.getNext();
           }
       }
       
       //Check the last element
       if(current.getData() == val){
           System.out.println("Deleting node with value: " + val);
           
           prev.setNext(null);
           current.setPrev(null);
               
       }
       else{
           System.out.println("Could not find node with value: " + val);
       }
       
   }
    
   public void printListInOrder(){
        
       if(head == null){
           System.out.println("The list is currently empty.");
           return;
       }
       System.out.println("Print list in order:");
       Node current = head;
        
       while(current.getNext() != null){
           System.out.println("Data: " + current.getData());
           current = current.getNext();
       }
        
       System.out.println("Data: " + current.getData());
   }
   
   public void printListInReverse(){
       if(head == null){
           System.out.println("The list is currently empty.");
           return;
       }
       
       System.out.println("Print list in reverse:");
       
       Node current = head;
       
       while(current.getNext() != null){
           current = current.getNext();
       }
       
       while(current.getPrev() != null){
           System.out.println("Data: " + current.getData());
           current = current.getPrev();
       }
       
       System.out.println("Data: " + current.getData());
   }
}
