import groovyjarjarpicocli.CommandLine;

class Cars{
    private final String brand;
    private final String model;
    private int speed;
    // getters

    public String getBrand() {
        return brand;
    }

        public String getModel() {
            return model;
        }

        public int getSpeed(){
            return speed;
            }

    public Cars (String brand,String model ){
        this.brand = brand;
        this.speed = 0;
        this.model = model;
    }

    public void accelerate(int increment){
        if(increment > 0){
            speed += speed + increment;
            System.out.println("Speed: " +speed);
        }else {
            System.out.println("Invalid speed");
        }

    }
    public void brake(int decrement){
    if ( decrement > 0  && decrement < speed){
        speed = speed - decrement;
        System.out.println("Speed: " +speed);
    }else{
        System.out.println("Invalid decrement speed");
    }

    }
}

public class Vehicle {
    public static void main(String[] args) {

        Cars car = new Cars("Toyoto","Camry");
        car.accelerate(30);
        car.brake(12);

        System.out.println("Car: " +car.getBrand() + "Model: " +car.getModel() + "Speed: " + car.getSpeed());

    }
}
