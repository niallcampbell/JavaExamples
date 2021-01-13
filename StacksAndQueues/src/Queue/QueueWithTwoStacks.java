package Queue;

import java.util.Iterator;
import java.util.Stack;

/**
 *  Queue with two stacks.
 * 
 *  Queue: front ------ rear 
 * 
 *  Algorithm:
 * 
 *  Two stacks: input stack and output stack. 
 * 
 *  enqueue(): add elements to the rear of the queue. 
 *  dequeue(): remove elements from the front of the queue. 
 * 
 *  enqueue():
 *      push new element on to the input stack. 
 * 
 *  dequeue():
 *      if the output stack is not empty, pop the top element. 
 *      if output stack is empty, pop all elements in the input stack & push them on to the output stack. 
 *      Pop the top element of the output stack. 
 * 
 *  New elements will only be added to the output stack if it is empty. 
 *  Once the output stack is empty and a dequeue is requested, the contents of the input stack 
 *  will be pushed on to the output stack with the item at the front of the queue being on top 
 *  of the output stack. 
 */
public class QueueWithTwoStacks {

    private Stack<Integer> input;
    private Stack<Integer> output;

    public QueueWithTwoStacks(){
        input = new Stack<Integer>();
        output = new Stack<Integer>();
    }

    /**
     *  Add elements to the front of the queue. 
     */
    public void enqueue(int n){

        input.push(n);

    }

    /**
     *  Remove items from the front of the queue. 
     */
    public int dequeue(){

        if(!output.empty()){
            return output.pop();
        }

        while(!input.empty()){
            output.push(input.pop());
        }

        return output.pop();
    }

    /**
     *  Stack Iterator prints from 0...N of a Stack (i.e. item at the top of the stack is printed last)
     * 
     *  Pop output stack to temp stack to reverse order and print tempStack. 
     *      i.e. item at the front of the queue will be printed first. 
     *  Push items from tempStack back on to output stack to reset.
     * 
     *  Print input stack with iterator. 
     */
    public void printQueue(){

        System.out.print("Queue: ");

        Stack<Integer> tempStack = new Stack<Integer>();

        while(!output.empty()){
            tempStack.push(output.pop());
        }

        Iterator<Integer> tempIterator = tempStack.iterator();
        while(tempIterator.hasNext()){
            System.out.print((int) tempIterator.next() + " ");
        }

        while(!tempStack.empty()){
            output.push(tempStack.pop());
        }

        Iterator<Integer> inputIterator = input.iterator();
        while(inputIterator.hasNext()){
            System.out.print((int) inputIterator.next() + " ");
        }
        
        System.out.println();
    }

}