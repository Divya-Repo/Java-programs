//Create a Car class with instance variables brand and speed.
// Write methods to set and display the car's details.

public class Car {


    String brand = " Toyoto ";
    String speed =  " 40 km/h ";

    public void display(){
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Speed: " + speed);
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.display();
    }
}
