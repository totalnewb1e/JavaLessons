package Lessons.less1.HW.Lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input ur string: ");
        String newStr = input.nextLine();
        System.out.println("trimmed separated and reversed string:\n " + solution1(newStr) + "\n" + newStr.getClass());
    }

    /**
     * Given an input string s, reverse the order of the words.
     * @param newStr initial string
     * @return resulting string
     */
    public static String solution1(String newStr) {
        String[] sepStr = newStr.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = sepStr.length - 1; i > 0; i--) {
            result.append(sepStr[i]).append(" ");
        }
        return result + sepStr[0];
    }
}

