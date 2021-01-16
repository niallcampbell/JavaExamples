package Interfaces;

public class Driver {

    public static void main(String[] args) {
        Vehicle car = new Car("Tesla", "Cybertruck", "Metallic Silver");
        car.printDetails();
        System.out.println();
        Vehicle motorbike = new Motorbike("Triumph", "Speed Twin", "Black");
        motorbike.printDetails();
    }
    
}