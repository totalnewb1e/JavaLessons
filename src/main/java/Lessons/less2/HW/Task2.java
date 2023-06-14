package Lessons.less2.HW;

import java.util.Scanner;

/**
 * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class Task2 {
    public static void main(String[] args) {
        int a, b, n;
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the length of number sequence: ");
        n = input.nextInt();
        System.out.println("input ur sequence: ");

        a = input.nextInt();
        for (int i = 1; i < n; i++) {
            b = input.nextInt();
            if (a > b) {
                flag = false;
            }
            a = b;
        }
        input.close();

        if (flag) {
            System.out.println("The sequence is ascending.");
        } else {
            System.out.println("The sequence isn't ascending.");
        }
    }
}

