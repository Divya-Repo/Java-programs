public class ConstructoChain {

    ConstructoChain() {
        System.out.println("No-arg constructor called");
    }

    ConstructoChain(String name) {
        this(name, 18);
        System.out.println("One-arg constructor called");
    }

    ConstructoChain(String name, int age) {

        System.out.println("Two-arg constructor called for student:" +name + " , age: " +age);
    }

    public static void main(String[] args) {
        ConstructoChain obj = new ConstructoChain("Divya");
    }
}
