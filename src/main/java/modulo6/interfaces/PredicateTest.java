package modulo6.interfaces;

import java.util.function.Predicate;

/**
 * Created by JavierSainz on 6/3/17.
 */
public class PredicateTest {
    public static void main(String[] args) {
        // please code!!!
        Predicate<String> startWithA = s -> {
            System.out.println("start");
            return s.startsWith("A");
        };
        //System.out.println(startWithA.test("Arbol"));
        Predicate<String> endWithL = s -> {
            System.out.println("end");
            return s.endsWith("l");
        };

        //System.out.println(startWithA.negate().test("Arbol"));
        Predicate<String> complex = startWithA.and(endWithL);
        System.out.println(Predicate.isEqual("A").test("A"));
        System.out.println(complex.test("arbol"));
    }
}
