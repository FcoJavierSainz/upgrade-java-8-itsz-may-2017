package modulo5.dates;

import java.time.Period;

/**
 * Created by JavierSainz on 5/26/17.
 */
public class PeriodParsing {
    public static void main(String[] args) {
        Period p5Yrs1 = Period.parse("P5y");
        Period p5Yrs2 = Period.parse("p5y");
        Period p5Yrs3 = Period.parse("P5Y");
        Period p5Yrs4 = Period.parse("+P5Y");
        Period p5Yrs5 = Period.parse("P+5Y");
        Period p5Yrs6 = Period.parse("-P-5Y");
        System.out.println(p5Yrs5 + ":" + p5Yrs6);

    }
}
