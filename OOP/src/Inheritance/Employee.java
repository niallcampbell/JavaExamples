package Inheritance;

abstract class Employee {

    protected String name;
    protected String email;
    protected static String company = "Facebook";

    public Employee(String name, String email){
        this.name = name;
        this.email = email;
    } 

    public abstract void print();

}