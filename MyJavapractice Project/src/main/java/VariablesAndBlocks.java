public class VariablesAndBlocks {

    static int staticvar = 10;

    int instancevar = 1;

    void localvar(){

        int localvariable = 2;
        System.out.println("Local variable: " +localvariable);

    }

    void display(){

        System.out.println("instance variable: " +instancevar);
        System.out.println("Static variable: " + staticvar) ;
        staticvar++;
        instancevar++;
    }

    public static void main(String[] args) {


    VariablesAndBlocks obj1 = new VariablesAndBlocks();
        VariablesAndBlocks obj2 = new VariablesAndBlocks();

        obj1.display();
        obj2.display();

        obj1.localvar();

    }
}
