public class Node {
    
    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setNextNode(Node next){
        this.next = next;
    }

    public Node getNext(){
        return next;
    }

    public void printNode(){
        System.out.println("Node value: " + value);
    }

}
