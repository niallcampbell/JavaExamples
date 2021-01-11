package Stack;

public class Stack {

    private int top;
    private int maxSize;
    private int [] stackArray;

    public Stack(int maxSize){
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int n){
        if(isFull()){
            System.out.println("Stack is full, cannot add value " + n);
            return;
        }

        top++;
        stackArray[top] = n;
        System.out.println("Added value " + n + " to the top of the stack.");

    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, no items to remove. ");
            return 0;
        }

        System.out.println("Removed item: " + stackArray[top] + " from top of Stack.");
        return stackArray[top--];
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is currently empty.");
            return;
        }

        System.out.print("Stack: ");
        for(int i = 0; i <= top; i++){
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public int peek(){
        return stackArray[top];
    }

}