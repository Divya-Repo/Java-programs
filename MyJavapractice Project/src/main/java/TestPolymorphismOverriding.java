class ParentVehicle {
    public void move() {
        System.out.println("I am a parent move method");
    }

}
 class MyCars extends ParentVehicle{
    @Override
     public void move() {
         System.out.println("My Car overriding ");
     }
 }
 class MyBike extends ParentVehicle{
     @Override
    public void move(){
        System.out.println("My Bike overriding ");
    }
 }

public class TestPolymorphismOverriding {
    public static void main(String[] args) {
        ParentVehicle vehicle = new ParentVehicle();
        MyCars car = new MyCars();
        car.move();
        MyBike bike = new MyBike();
        bike.move();
    }
}
