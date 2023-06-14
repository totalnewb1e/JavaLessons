package Lessons.less2.HW;

import java.util.Scanner;

/**
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */

public class Task3 {
    public static void main(String[] args) {
        int result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the size of your array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("input your array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            if (Math.abs(arr[i]) < 100 & Math.abs(arr[i]) > 10) {
                result += i;
            }
            System.out.println("Sum of indexes is " + result);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[i] = result;
            }
            System.out.print(" " + arr[i]);
        }
        input.close();
    }
}

