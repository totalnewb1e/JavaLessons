package Lessons.less4.HW4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

/**@apiNote //Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 *
 */
public class Task1 {
    public static void main(String[] args) {
        var list = new java.util.LinkedList<>(new Random().ints(0, 100).limit(5)
                .boxed().toList());
        System.out.println(list);
        new LinkedList<>(list).descendingIterator().forEachRemaining(System.out::println);
        System.out.println("--------------------------------------------------");
        ListIterator<Integer> revList = list.listIterator(list.size());
        while (revList.hasPrevious()){
            System.out.println(revList.previous());
        }
    }
}