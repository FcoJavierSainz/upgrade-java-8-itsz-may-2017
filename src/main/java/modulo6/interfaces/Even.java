package modulo6.interfaces;

import java.util.function.BiPredicate;

/**
 * Created by JavierSainz on 6/3/17.
 */
public class Even {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isModule = (x, y) -> x % y == 0;
        System.out.println(isModule.test(9, 2));
    }
}
