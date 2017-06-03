package modulo6.interfaces;

import java.util.function.Consumer;

/**
 * Created by JavierSainz on 6/3/17.
 */
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumeStr = t -> System.out.println(t);
        consumeStr.accept("Hi");

        //Consumer chaining
        Consumer<String>  rst = t -> System.out.println("First:" + t);
        Consumer<String> second = t -> System.out.println("Second:" + t);
        rst.andThen(second).accept("Hi");
    }
}
