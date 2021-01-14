package Student;

import java.util.Random;

public class Student {

    private int id;
    private String name;
    private int age;
    private String course;
    private static String uni = "Maynooth University";
    
    public Student(String name, int age, String course){
        id = generateID();
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getCourse(){
        return course;
    }

    public String getUni(){
        return uni;
    }

    public void printDetails(){
        System.out.println("Student Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Course: " + getCourse());
        System.out.println("University: " + getUni());
    }


    private static int generateID(){
        Random genRandom = new Random();
        return genRandom.nextInt(100);
    }


}