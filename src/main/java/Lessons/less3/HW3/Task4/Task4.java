package Lessons.less3.HW3.Task4;

import java.util.Collections;
import java.util.Random;

/**
 * @apiNote Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */
public class Task4 {
    public static void main(String[] args) {
        var list = new java.util.ArrayList<>(new Random().ints(0, 100).limit(10)
                .boxed().toList());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("min value = " + list.get(0));
        System.out.println("max value = " + list.get(list.size() - 1));
        if (list.size() % 2 == 0) {
            System.out.println("mid value = " + list.get(list.size() / 2 -1));
        } else {
            System.out.println("mid value = " + list.get(list.size() / 2));
        }
    }
}

