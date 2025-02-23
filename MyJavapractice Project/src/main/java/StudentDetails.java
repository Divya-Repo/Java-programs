class Students{

    private String name;
    private String rollNumber;
    private float marks;

    public String getName(){
        return name;
    }
    public String getRollNumber(){
        return rollNumber;
    }
    public float getMarks(){
        return marks;
    }

    public void setMarks(float marks) {
        if(marks>=0 && marks <= 100){
         this.marks = marks;
    } else{
            System.out.println("Invalid Marks");
        }
    }

    public Students(String name, String rollNumber, float marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void studentDetails(){
        System.out.println("Student Name : " + getName());
        System.out.println("Student RollNumber : " + getRollNumber());
        System.out.println("Student Marks : " + getMarks());
    }
}



public class StudentDetails {
    public static void main(String[] args) {

        Students stu = new Students("Divya","A4566",25);
        stu.studentDetails();

        stu.setMarks(60);

        System.out.println("Updated Details: " );
        stu.studentDetails();
    }
}
