package modulo6.interfaces;

import java.time.Instant;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by JavierSainz on 6/3/17.
 */
public class MethodReference
{
    public static void main(String[] args) {
        Consumer<String> consumeStr = System.out::println;
        consumeStr.accept("Hi");

        Supplier<Instant> now = Instant::now;
        System.out.println(now.get());
    }
}
