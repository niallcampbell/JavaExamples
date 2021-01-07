public class Driver {
    
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.printList();
        System.out.println();

        Node n = new Node(1);
        myList.addNode(n);

        myList.printList();

        for(int i = 2; i < 6; i++){
            Node node = new Node(i);
            myList.addNode(node);
        }

        System.out.println();
        myList.printList();

        System.out.println();
        System.out.println("Find node 3: ");
        Node find = myList.findNode(3);
        if(find == null){
            System.out.println("Node 3 not found.");
        } else {
            System.out.println("Found node: " + find.getValue());
        }

        System.out.println();
        System.out.println("Find node 6: ");
        find = myList.findNode(6);
        if(find == null){
            System.out.println("Node 6 not found.");
        } else {
            System.out.println("Found node: " + find.getValue());
        }

        System.out.println();
        System.out.println("Delete nodes:");
        myList.deleteNode(1);
        myList.printList();
        myList.deleteNode(5);
        myList.printList();
        myList.deleteNode(3);
        myList.printList();
        myList.deleteNode(6);
        myList.printList();
        myList.deleteNode(2);
        myList.printList();
        myList.deleteNode(4);
        myList.printList();
        myList.deleteNode(1);
    }

}
