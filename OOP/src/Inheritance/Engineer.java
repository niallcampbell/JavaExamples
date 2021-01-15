package Inheritance;

public class Engineer extends Employee {

    private static String jobTitle = "Software Engineer";
    private int salary;

    public Engineer(String name, String email, int salary){
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
