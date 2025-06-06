public class StaticVar {

    String name;
    String address;
    String city;

    StaticVar(String name,String address,String city){
        this.name = name;
        this.address = address;
        this.city = city;

    }

    public void getData(){
        System.out.println(name);
        System.out.print(address);
        System.out.print(city);
    }

    public static void main(String[] args) {

        StaticVar obj = new StaticVar("Divya","32 street"," EP ");
        obj.getData();
    }
}
