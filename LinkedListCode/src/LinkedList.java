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
