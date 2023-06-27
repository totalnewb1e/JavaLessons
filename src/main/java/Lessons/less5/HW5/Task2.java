package Lessons.less5.HW5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**@apiNote Подсчитать количество искомого слова, через map
 *
 */
public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String str = "Russia goes ahead of the whole planet. The planet is not Russia.";
        str = str.toLowerCase().replace("-", "").replace(".", "");
        String[] words = str.split(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your word: ");
        String userWord = scanner.nextLine();
        userWord = userWord.toLowerCase();
        map.put(userWord, 0);
        scanner.close();

        for (String word : words) {
            if (word.equals(userWord)) {
                map.put(userWord, map.get(userWord) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Your word - " + entry.getKey() + " - meets " + entry.getValue());
        }
    }
}

