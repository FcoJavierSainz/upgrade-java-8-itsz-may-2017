package modulo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by JavierSainz on 5/18/17.
 */
public class TestCopyOnWrite {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 3, 52));
        CopyOnWriteArrayList<Integer> listCopy =  new CopyOnWriteArrayList<>(list);

        Collections.synchronizedList(list);
        for (Integer item : listCopy) {
            System.out.print(item + " ");
            listCopy.add(9);
        }
        System.out.println();
        System.out.println("Size: " + list.size());
        System.out.println("Size: " + listCopy);
    }
}
