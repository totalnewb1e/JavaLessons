package Lessons.less2.HW;

import java.util.Scanner;

/** Дана последовательность N целых чисел. Найти сумму простых чисел.
 *
 */
public class Task1 {
    public static void main(String[] args) {
        int a, result = 0, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the length of number sequence: ");
        n = input.nextInt();
        System.out.println("input ur sequence: ");

        for (int i = 1; i <= n; i++) {
            a = input.nextInt();
            result += a;
            if (a > 0 && a != 1) {
                for (int k = 2; k <= Math.sqrt(a); k++) {
                    if (a % k == 0) {
                        result -= a;
                        break;
                    }
                }
            } else {
                result -= a;
            }
        }
        System.out.println("Sum of prime nums in ur sequence is: " + result);
        input.close();
    }
}