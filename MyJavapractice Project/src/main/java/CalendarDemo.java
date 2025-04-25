import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");

        System.out.println(sd.format( cal.getTime()));





    }
}
