class Animals{
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dogss extends Animals{
    public void makeSound(){
        System.out.println("Dog barks");
    }
}

public class AnimalParents{
    public static void main(String[] args) {
        Dogss obj = new Dogss();
        Animals obj1 = new Animals();
        obj.makeSound();
        obj1.makeSound();
    }
}