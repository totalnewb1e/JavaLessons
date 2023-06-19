package Lessons.less3.HW3.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**@apiNote //    Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
//    Получить наименования товаров заданного сорта с наименьшей ценой.
 *
 */
public class Task2 {
    public static void main(String[] args) {
        ListOfGoods2 goods1 = new ListOfGoods2("Scotch", "UK", 14.55, 99.99, (byte) 2);
        ListOfGoods2 goods2 = new ListOfGoods2("Caviar", "RU", 16.94, 56.99, (byte) 2);
        ListOfGoods2 goods3 = new ListOfGoods2("Leather", "KZ", 21.78, 122.99, (byte) 2);
        ListOfGoods2 goods4 = new ListOfGoods2("Cheese", "FR", 12.34, 39.99, (byte) 2);

        List<ListOfGoods2> goods2List = new ArrayList<>();
        goods2List.add(goods1);
        goods2List.add(goods2);
        goods2List.add(goods3);
        goods2List.add(goods4);
        System.out.println("goods2List = " + goods2List);

        Scanner input = new Scanner(System.in);
        System.out.println("Input the type you are interested in: ");
        Byte userInput = input.nextByte();
        Double cheapestPrice = goods4.getPrice();
        input.close();

        for (ListOfGoods2 goods : goods2List) {
            if (goods.getSort().equals(userInput)) {
                if (goods.getPrice() < cheapestPrice) {
                    cheapestPrice = goods.getPrice();
                }
            }
        }
        for (ListOfGoods2 goods : goods2List) {
            if (goods.getPrice().equals(cheapestPrice)) {
                System.out.println(goods.getName() + " ");
            }
        }
    }
}




