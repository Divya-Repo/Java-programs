//Create a Student class with:
//
//name (String)
//grade (int)
//Add a method displayInfo() to print student details.
// Create an object of the Student class and initialize its fields.
public class Student {
    String name;
    int grade;

    public void  displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("grade: " + grade);
    }

    public static void main(String[] args) {
        Student detail = new Student();
        detail.name = "Divya";
        detail.grade = 1;

        detail.displayInfo();
    }



}
