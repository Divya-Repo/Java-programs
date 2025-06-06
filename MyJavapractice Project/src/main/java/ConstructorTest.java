

    class A {
        A() {
            System.out.println("Constructor A");
        }
    }

    class B extends A {
        B() {
            System.out.println("Constructor B");
        }
    }
    public class ConstructorTest {
        public static void main(String[] args) {
            B b = new B();
        }

}
