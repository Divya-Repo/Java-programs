// super Parent class
class Parent {

    // static variable for parent
    static int staticVarParent = 10;

    // instance variable Parent
    int instanceVarParent = 20;

    // static block
    static {
        System.out.println("This is a parent static block");
    }

    //instance block
    {
        System.out.println("This is parent instance block");
    }

    //Constructor without argument

    Parent() {
        System.out.println("This is a Parent no argument constructor");

    }

    Parent(int x) {
        this();  // This calls no argument constructor
        System.out.println("This is a Parent argument constructor" + x);

    }

    //local variable method

    public void parentMethod() {
        int x = 5, y = 6;
        System.out.println("Parent Method - Local variables : " + x + y);
    }
}

// subclass
class Child extends Parent {

    // static variable
    static int staticVarChild = 300;

    // instance variable
    int instanceVarChild = 400;

    // static block

    static {
        System.out.println("This is static block for Child");
    }

    // instance block
    {
        System.out.println("This is Child instance block");
    }

    // Child Constructor
    public Child() {
        super(12); // Constructor Chaining
        System.out.println("Child Constructor no argument");

    }
    // Child Method

    public void childMethod() {
        System.out.println("Child Method: " + instanceVarChild);
    }

}
