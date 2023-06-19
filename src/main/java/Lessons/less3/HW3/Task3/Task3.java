package Lessons.less3.HW3.Task3;

import java.util.ArrayList;
import java.util.List;

/**@apiNote // Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. Найти названия книг,
// в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 *
 */
public class Task3 {
    public static void main(String[] args) {
        Books book1 = new Books("book1", "Web", 999.0, (short) 2000, 102);
        Books book2 = new Books("book2", "Marks", 542.0, (short) 2022, 467);
        Books book3 = new Books("book3", "Winston", 123.0, (short) 2023, 192);
        Books book4 = new Books("book4", "Armstrong", 346.0, (short) 2011, 439);

        List<Books> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);

        for (Books book : booksList) {
            int k = 3;
            int page = book.getPages();
            String bookName = "Do not match";

            if (book.getPages() <= 2 && book.getYear() > 2010 && book.getAuthor().toLowerCase().contains("a")) {
                bookName = book.getName();
            }

            if (book.getPages() > 2 && book.getYear() > 2010 && book.getAuthor().toLowerCase().contains("a")) {
                while (k < page) {
                    if (page % k != 0) {
                        bookName = book.getName();
                    } else {
                        break;
                    }
                    k += 2;
                }
            }
            System.out.println(bookName);
        }
    }
}



