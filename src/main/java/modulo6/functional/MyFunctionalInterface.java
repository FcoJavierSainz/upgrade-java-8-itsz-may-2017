package modulo6.functional;

/**
 * Created by JavierSainz on 6/3/17.
 */
interface Parent {
    void method();
}

@FunctionalInterface
public interface MyFunctionalInterface extends Parent{
    String toString();
    boolean equals(Object o);
    void method();
    default void land() {
        System.out.println("Animal is landing");
    }
    static void land2() {
        System.out.println("Animal is landing");
    }
}
