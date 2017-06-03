package modulo6.optional;

import java.util.Optional;

/**
 * Created by JavierSainz on 6/3/17.
 */
public class CreateOptional {
    public static void main(String[] args) {
        Optional<String> summary = Optional.empty();
        summary = Optional.of("A summary");
        summary = Optional.of(null);
        summary = Optional.ofNullable("A summary");
        summary = Optional.ofNullable(null);

        System.out.println(summary);

        if (summary.isPresent()) {
            System.out.println(summary.get());
        }

        summary.ifPresent(s -> System.out.println(s)); //enough?

        //safe?
        System.out.println(summary.get());
        System.out.println(summary.orElse("Empty"));

    }
}