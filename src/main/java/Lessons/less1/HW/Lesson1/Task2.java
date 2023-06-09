package Lessons.less1.HW.Lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many digits do u prefer: ");
        int size = input.nextInt();
        List<Integer> nextValues = new ArrayList<>();
        System.out.println("insert ur digits: ");
        for (int i = 0; i < size; i++) {
            nextValues.add(input.nextInt());
        }
        System.out.println("ur digits is: \n" + nextValues + "\n" + nextValues.getClass());
        System.out.println("sum of all positive digits that placed b4 negative once is: " + solution2(nextValues));
    }

    /**
     * Дана последовательность целых чисел, оканчивающаяся нулем.
     * Найти сумму положительных чисел, после которых следует отрицательное число.
     *
     * @param nextValues initial string of digits
     * @return resulting string
     */
    private static int solution2(List<Integer> nextValues) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 1; i < nextValues.size(); i++) {
            if (nextValues.get(i) < 0 && nextValues.get(i - 1) > 0) {
                newList.add(nextValues.get(i - 1));
            }
        }
        int result = 0;
        for (Integer integer : newList) {
            result += integer;
        }
        return result;
    }
}




