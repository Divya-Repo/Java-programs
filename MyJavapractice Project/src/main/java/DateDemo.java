import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");

        System.out.println("Today's Date:" +d.toString());

        // Print in specific format

        System.out.println(sdf.format(d));

        System.out.println(sd.format(d));

    }
}
