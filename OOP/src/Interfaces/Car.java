package Interfaces;

public class Car implements Vehicle {

    private static int wheels = 4;
    private String make;
    private String model;
    private String colour;

    public Car(String make, String model, String colour){
        this.make = make;
        this.model = model;
        this.colour = colour;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColour(){
        return colour;
    }

    public int getNumWheels(){
        return wheels;
    }

    public void printDetails(){
        System.out.println("Car details: ");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Colour: " + getColour());
        System.out.println("Number of wheels: " + getNumWheels());
    }

}