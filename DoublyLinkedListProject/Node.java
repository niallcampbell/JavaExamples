
/**
 * Node object class used for a doubly linked list. 
 * 
 * Node contains an item of data, and links to the previous and next nodes. 
 *
 */
public class Node
{
    private int data;
    private Node prev;
    private Node next;

    public Node(int data)
    {
        this.data = data;
        prev = null;
        next = null;
    }

    public int getData()
    {
        return data;
    }
    
    public Node getPrev(){
        return prev;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setPrev(Node n){
        prev = n;
    }
    
    public void setNext(Node n){
        next = n;
    }
}
