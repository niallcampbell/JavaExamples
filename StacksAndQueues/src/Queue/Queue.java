package Queue;

/**
 *  Queue is FIFO - item that has been in the queue the longest is removed. 
 */
public class Queue {

    private int[] queueArray;
    private int size;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size){
        this.size = size;
        queueArray = new int[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    /**
     *  Insert items at the rear of the queue. 
     */
    public void insert(int item){

        if(isFull()){
            System.out.println("Cannot add item, queue is full.");
            return;
        }

        //wrap around
        if(rear == size-1){
            rear = -1;
        }

        rear++;
        queueArray[rear] = item;
        nItems++;
    }

    /**
     *  Remove items from the front of the queue. 
     */
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty, no items to remove.");
            return 0;
        }
        int item = queueArray[front];
        front++;
        if(front == size){
            front = 0;
        }
        nItems--;
        return item;
    }

    public boolean isFull(){
        return nItems == size;
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public void printQueue(){
        System.out.print("Queue: ");
        
        if(front <= rear){
            for(int i = front; i <= rear; i++){
                System.out.print(queueArray[i] + " ");
            }
        }else if(rear < front){
            for(int i = front; i < size; i++){
                System.out.print(queueArray[i] + " ");
            }
            for(int i = 0; i <= rear; i ++){
                System.out.print(queueArray[i] + " ");
            }
        }    

        System.out.println();
    }
    
}
