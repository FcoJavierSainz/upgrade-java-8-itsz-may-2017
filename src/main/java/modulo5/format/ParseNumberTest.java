package modulo5.format;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class ParseNumberTest {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        String one = "456abc";
        String two = "-2.5165x10";
        String three = "x85.3";
        try {
            System.out.println(nf.parse(one));
            System.out.println(nf.parse(two));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //System.out.println(nf.parse(three));
    }
}
