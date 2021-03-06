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
        System.out.println("Length of list: " + myList.listLength());

        System.out.println();
        System.out.println("Middle element: " + myList.getMiddleElement().getValue());

        System.out.println();
        System.out.println("Middle element in a single pass: " + myList.getMiddleElementInASinglePass().getValue());

        System.out.println();
        System.out.println("Second node from the end: " + myList.getKthNodeFromTheEnd(2).getValue());
        System.out.println("Third node from the end: " + myList.getKthNodeFromTheEnd(3).getValue());

        System.out.println();
        System.out.println("Reverse list");
        myList.reverseList();
        myList.printList();

        System.out.println();
        System.out.println("Add nodes");
        Node node1 = new Node(3);
        myList.addNode(node1);
        Node node2 = new Node(2);
        myList.addNode(node2);
        myList.printList();
        System.out.println();
        System.out.println("Remove dupliactes");
        myList.removeDuplicateValues();
        myList.printList();
        System.out.println();

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

        System.out.println();
        System.out.println("Length of list: " + myList.listLength());

        Node node3 = new Node(1);
        myList.addNode(node3);
        Node node4 = new Node(2);
        myList.addNode(node4);
        Node node5 = new Node(5);
        myList.addNode(node5);
        myList.printList();
        System.out.println("List is in order: " + myList.isInOrder());
        Node node6 = new Node(4);
        myList.addNode(node6);
        myList.printList();
        System.out.println("List is in order: " + myList.isInOrder());
    }

}
