package modulo5.format;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class FormatDateWithDateFormat {
    public static void main(String[] args) {
        DateFormat s = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat m = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat l = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);

        Date d = new GregorianCalendar(2015, Calendar.JULY, 4).getTime();
        System.out.println(s.format(d)); // 7/4/15
        System.out.println(m.format(d)); // Jul 4, 2015
        System.out.println(l.format(d)); // July 4, 2015
        System.out.println(f.format(d)); // Saturday, July 4, 2015

        DateFormat de = DateFormat.getDateTimeInstance(
                DateFormat.MEDIUM, DateFormat.FULL, Locale.GERMANY);
        System.out.println(de.format(d));
    }
}
