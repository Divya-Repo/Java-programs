

class DifferentMethods{

    // define static variable: shared across all instances of the class

       static String staticVariable = "I am static variable";

    //define instance variable: unique to each instance of the class

    String instanceVariable = "I am an instance variable";

    // method to update static variable

    public static void updateStaticVariable(String newValue) {
            staticVariable = newValue;
    }

    //method to update instance variable

    public void updateInstanceVariable(String newValue){

        instanceVariable = newValue;
}


    // Method to display static and instance variable
    public void display(){
        System.out.println("The static variable is: " + staticVariable);
        System.out.println("The instance variable is: " + instanceVariable);
    }

    public static void main(String[] args) {

        // Creating the first Object

        DifferentMethods initval1 = new DifferentMethods();
        DifferentMethods initval2 = new DifferentMethods();

        System.out.println("Initial Values: " );
        initval1.display();
        initval2.display();

        // updating static variable

        updateStaticVariable("Updated Static Variable");
        initval2.updateInstanceVariable("Updated Instance Variable");

        // After Update display

        System.out.println("\n After Updates: ");
        initval1.display();
        initval2.display();

    }
}