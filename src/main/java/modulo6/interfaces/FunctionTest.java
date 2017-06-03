package modulo6.interfaces;

import java.util.function.Function;

/**
 * Created by JavierSainz on 6/3/17.
 */
public class FunctionTest {
    public static void main(String[] args) {
        round(5.4, new Function<Double, Long>() {
            public Long apply(Double d) {
                return Math.round(d);
            }
        });
        round(5.4, d -> Math.round(d));

        Function<String, String> f1 = s -> {
            return s.toUpperCase();
        };
        Function<String, String> f2 = s -> {
            return s.toLowerCase();
        };
        System.out.println(f1.compose(f2).apply("Compose"));
        System.out.println(f1.andThen(f2).apply("AndThen"));
    }

    static void round(double d, Function<Double, Long> f) {
        long result = f.apply(d);
        System.out.println(result);
    }
}
