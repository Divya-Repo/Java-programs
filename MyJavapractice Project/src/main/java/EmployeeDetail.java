public class EmployeeDetail {

    String name;
    int age;
    float salary;

    EmployeeDetail(String name, int age, float salary){

        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void printDetails(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: " +salary);
    }

    public boolean ageCheck(){
           return age >= 60;

    }



    public static void main(String[] args) {

        EmployeeDetail emp1 = new EmployeeDetail("ABC",60,2000f);
        EmployeeDetail emp2 = new EmployeeDetail("XYZ",40,1000f);

        emp1.printDetails();
        emp2.printDetails();



    }

}
