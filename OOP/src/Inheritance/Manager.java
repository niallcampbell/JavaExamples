package Inheritance;

public class Manager extends Employee {
    
    private static String jobTitle = "Scrum Manager";
    private int salary;

    public Manager(String name, String email, int salary){
        super(name, email);
        this.salary = salary;
    }

    public void print(){
        System.out.println("Employee details: ");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Company: " + company);
        System.out.println("Salary: €" + salary);
    }

}
