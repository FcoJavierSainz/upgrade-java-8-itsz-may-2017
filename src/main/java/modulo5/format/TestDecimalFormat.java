package modulo5.format;

import java.text.DecimalFormat;

/**
 * Created by JavierSainz on 5/27/17.
 */
public class TestDecimalFormat {
    public static void main(String[] args) {
        double d = 1234567.437;
        DecimalFormat one = new DecimalFormat("###,###,###.###");
        System.out.println(one.format(d));

        DecimalFormat two = new DecimalFormat("000,000,000.00000");
        System.out.println(two.format(d));

        DecimalFormat three = new DecimalFormat("$#,###,###.##");
        System.out.println(three.format(d));
    }
}
