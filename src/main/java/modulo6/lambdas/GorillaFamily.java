package modulo6.lambdas;

/**
 * Created by JavierSainz on 6/3/17.
 */
interface Gorilla {
    String move();
    default String getName() {
        return "Gorilla";
    }
}

public class GorillaFamily {
    String walk = "walk";

    void everyonePlay(boolean baby) {
        String approach = "amble";

        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> {
            //System.out.println(Gorilla.getName());
            System.out.println(this);
            return approach;
        });
    }

    void play(Gorilla g) {
        System.out.println(g);
        System.out.println(g.move());
    }

    public static void main(String[] args) {
        new GorillaFamily().everyonePlay(true);
    }
}

