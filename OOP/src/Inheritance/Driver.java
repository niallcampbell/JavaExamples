package Inheritance;

public class Driver {

    public static void main(String[] args) {
        Engineer engineer = new Engineer("James Doe", "jamesd@gmail.com", 32000);
        engineer.print();

        System.out.println();

        Manager manager = new Manager("John Smith", "johnsmith@gmail.com", 50000);
        manager.print();
    }
    
}
