package Student;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try{
            StudentDB db = new StudentDB();
            System.out.println("Welcome to the student viewer. ");
            String command = "y";
            while(command.equals("y")){
                db.printIDs();
                System.out.println();
                System.out.println("Please enter student id: ");
                int id = Integer.parseInt(scan.nextLine());
                System.out.println();
                Student student = db.getStudent(id);
                if(student == null){
                    System.out.println("Student with id " + id + " doesn't exist.");
                } else {
                    student.printDetails();
                    System.out.println();
                }
                System.out.print("Display another student? (y/n): ");
                command = scan.nextLine();
                System.out.println();
            }
            System.out.println("Goodbye. ");
            
        } finally {
            scan.close();
        }
    }
    
}