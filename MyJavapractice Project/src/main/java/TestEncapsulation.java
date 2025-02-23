class StudentsDetail{
    private String name;
    private int age,grade;
// getters and setters for age
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }


 // getters and setters for name

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    // getters and setters for grade
    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }
    public void StudentsDetailsDisplay(){
        System.out.println("Name of the Student: " +name);
        System.out.println("Age of the Student: " +age);
        System.out.println("Grade of the Student: " +grade);
    }

}

public class TestEncapsulation {
    public static void main(String[] args){
        StudentsDetail stud = new StudentsDetail();
        stud.setName("Divya");
        stud.setAge(22);
        stud.setGrade(10);
        stud.StudentsDetailsDisplay();

    }
}
