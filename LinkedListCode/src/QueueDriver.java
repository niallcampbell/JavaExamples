import java.util.Scanner;

public class QueueDriver {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        try {

            Queue queue = new Queue();
            String command = "";

            while(!command.equals("exit")){
                System.out.println("Please enter a command: insert, remove, print, exit");
                command = scan.nextLine();

                if(command.equals("insert")){
                    System.out.println("Please enter a value: ");
                    int value = Integer.parseInt(scan.nextLine());
                    queue.insert(value);
                } else if(command.equals("remove")){
                    queue.remove();
                } else if(command.equals("print")){
                    queue.printQueue();
                } else if(command.equals("exit")){
                    System.out.println("Goodbye.");
                } else {
                    System.out.println("Please enter a valid command.");
                }
            }

        } finally {
            scan.close();
        }

    }
    
}
