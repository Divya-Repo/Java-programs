 class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
}

 class Dogs extends Animal{
    // No override yet for Task 1
}

public class Inheritance1 {
    public static void main(String[] args) {
        Dogs obj = new Dogs();
        obj.makeSound();  // Output: Animal makes sound
    }
}