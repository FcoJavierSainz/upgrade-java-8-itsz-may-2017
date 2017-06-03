package modulo6.optional;

import java.util.Optional;

/**
 * Created by JavierSainz on 6/3/17.
 */
public class OptionalMethods {
    public static void main(String[] args) {
        Optional<String> summary = Optional.of("A summary");
        System.out.println(summary.filter(s -> s.length() > 10));
        System.out.println(summary.map(s -> s.length()).orElse(0));
    }
}
