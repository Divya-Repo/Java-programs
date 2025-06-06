public class ConstructorChaining {

   public ConstructorChaining(){
        System.out.println("no-arg");
    }

    public ConstructorChaining(int a){
        this(5,6);
        System.out.println("one-arg");
    }

    public ConstructorChaining(int a, int b){

        System.out.println("Two-arg");
    }

    public static void main(String[] args) {

        ConstructorChaining obj1 = new ConstructorChaining();
        ConstructorChaining obj2 = new ConstructorChaining(5);


    }

}
