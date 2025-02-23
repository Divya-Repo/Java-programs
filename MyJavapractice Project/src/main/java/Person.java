public class Person{

    String name; //instance variable - defined within a class and outside the method
    int age; //instance variable - defined inside the class and outside the method

    void displayDetails() {
        System.out.println("Name: " + name + " Age: " + age );
    }

        public static void main( String[] args){

            Person student1 = new Person();
            student1.name = "Divya";
            student1.age = 42;

            student1.displayDetails();

    }

}
