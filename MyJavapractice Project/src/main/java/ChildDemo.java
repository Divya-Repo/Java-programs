public class ChildDemo extends ParentDemo{

    String name = "This is a child variable";

    public void printParentName(){
        System.out.println(super.name);
    }

    public static void main(String[] args) {

        ChildDemo var = new ChildDemo();
        System.out.println(var.name);

       var.printParentName();

       // System.out.println(((ParentDemo)var).name);
    }

}
