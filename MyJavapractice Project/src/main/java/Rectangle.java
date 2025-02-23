// Write a Rectangle class with:
//
//length (double)
//width (double)
//Add methods to:
//Calculate and return the area.
//Calculate and return the perimeter.
//Create an object in the main method and use these methods.
public class Rectangle {
    public double length;
    public double width;


    public double area(){
        return  length * width;

    }

    public double perimeter(){

        return  2*(length + width);

    }


    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 10;
        rect.width = 5;

        rect.area();
        rect.perimeter();

        double area = rect.area();
        double perimeter = rect.perimeter();

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " +perimeter);

    }
}
