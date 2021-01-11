package Stack;

import java.util.Scanner;

public class MaxElement {

    /**
     *  Keep track of the maximum element in the stack. 
     */
    public static void maxElementInStack(){

        Stack stack = new Stack(4);
        Stack maxStack = new Stack(4);

        Scanner scan = new Scanner(System.in);

        try{

            String command = "";

            while(!command.equals("exit")){
                System.out.println("Enter command: push, pop, print, max, exit");
                command = scan.nextLine();

                if(command.equals("push")){
                    System.out.println("Please enter value: ");
                    int value = scan.nextInt();
                    scan.nextLine();
                    stack.push(value);
                    if(maxStack.isEmpty() || value >= maxStack.peek()){
                        maxStack.push(value);
                    }

                } else if(command.equals("pop")){
                    int pop = stack.pop();
                    if(maxStack.peek() == pop){
                        maxStack.pop();
                    }
                } else if(command.equals("print")){
                    stack.printStack();
                }else if(command.equals("max")){
                    System.out.println("Max element: " + maxStack.peek());
                } else if(command.equals("exit")){
                    System.out.println("Goodbye");
                } else {
                    System.out.println("Please enter a valid command");
                }
            }

        } finally {
            scan.close();
        }
    }

    public static void main(String[] args) {
        maxElementInStack();
    }
    
}
