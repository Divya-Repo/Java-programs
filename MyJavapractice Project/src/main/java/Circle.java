//Write a Circle class with:
//
//radius (double)
//Add methods to:
//Calculate and return the area.
//Calculate and return the circumference.
//Test the class with an object in the main method.

public class Circle {
    double radius;

    public double area(){
        return Math.PI*radius*radius;
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.radius = 5.5;
        circle.area();
        circle.circumference();

       System.out.println("Radius of the circle: " + circle.radius);
        System.out.println("Area : " + circle.area());
        System.out.println("Circumference : " + circle.circumference());


    }
}
