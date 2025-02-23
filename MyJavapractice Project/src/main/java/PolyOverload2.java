/*
Write a class VolumeCalculator that has overloaded methods for calculating the volume of different shapes:

volume(int side) → returns the volume of a cube (side³).
volume(int length, int width, int height) → returns the volume of a rectangular box.
volume(double radius, double height) → returns the volume of a cylinder (π × radius² × height).
In main(), call each method with appropriate arguments.
 */
class VolumeCalculator{
    public int volume(int side){
        return side * side * side;
    }
    public int volume(int length, int width, int height){
        return length * width * height;
    }
    public double volume(double radius, double height){
        return 3.1415 * radius * radius * height;
    }
}

public class PolyOverload2 {
    public static void main(String[] args) {

        VolumeCalculator volume = new VolumeCalculator();
        System.out.println("volume of cube: " + volume.volume(5));
        System.out.println("volume of rectangular Box: " + volume.volume(4,5,2));
        System.out.println("volume of cylinder: " + volume.volume(4,5));

    }
}
