package Stack;

import java.util.Scanner;

public class StackDriver {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter size of stack: ");
            int size = scan.nextInt();
            scan.nextLine();
            Stack stack = new Stack(size);
            String command = "";

            while(!command.equals("exit")){
                System.out.println("Enter command: push, pop, print, exit");
                command = scan.nextLine();

                if(command.equals("push")){
                    System.out.println("Please enter value: ");
                    int value = scan.nextInt();
                    scan.nextLine();
                    stack.push(value);
                    stack.printStack();
                } else if(command.equals("pop")){
                    stack.pop();
                    stack.printStack();
                } else if(command.equals("print")){
                    stack.printStack();
                }else if(command.equals("exit")){
                    System.out.println("Goodbye");
                } else {
                    System.out.println("Please enter a valid command");
                }
            }
        } finally {
            scan.close();
        }
    }
    
}
