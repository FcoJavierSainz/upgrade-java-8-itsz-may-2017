package modulo5.format;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class ParsingDatesWithDateFormat {
    public static void main(String[] args) throws ParseException {
        DateFormat shortFormat = DateFormat.getDateInstance(
                DateFormat.SHORT, Locale.US);
        String s = "01/31/1984";

        Date date = shortFormat.parse(s);
        DateFormat fullFormat = DateFormat.getDateInstance(
                DateFormat.FULL, new Locale("es", "MX"));
        System.out.println(fullFormat.format(date));

        SimpleDateFormat f1 = new SimpleDateFormat("MM dd yyyy hh:mm:ss");
        SimpleDateFormat f2 = new SimpleDateFormat("EEEE dd 'de' MMMM 'de' yyyy (DDD)", new Locale("es", "MX"));
        SimpleDateFormat f3 = new SimpleDateFormat("hh");
        Date parsedDate = f1.parse("01 2 2016 33:50:35");
        System.out.println(f2.format(parsedDate));  // January 2016
        System.out.println(f3.format(parsedDate));  // 01


    }
}
