/*Write a Java class called Student with:

Instance variables: name (String), age (int)

A no-arg constructor that sets default values

A parameterized constructor to set name and age

A method display() to print student details*/


public class ConstructorStudent {

    String name;
    int age;

    public ConstructorStudent(){
        name = "Div";
        age = 10;
    }

    public ConstructorStudent(String name,int age){
        name = name;
        age = age;
    }

    void display(){

        System.out.println("Name" +name + "Age: "+age);
    }

    public static void main(String[] args) {

        ConstructorStudent student = new ConstructorStudent("Sam",12);
        student.display();
    }


}
