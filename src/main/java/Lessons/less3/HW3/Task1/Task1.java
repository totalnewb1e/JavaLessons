package Lessons.less3.HW3.Task1;

import java.util.ArrayList;
import java.util.List;

/**
 * @apiNote Дан массив записей: наименование товара, цена, сорт.
 *   Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
 */
public class Task1 {
    public static void main(String[] args) {
        ListOfGoods goods1 = new ListOfGoods(59.99f, "высший milk", (byte) 1);
        ListOfGoods goods2 = new ListOfGoods(43.99f, "eggs", (byte) 2);
        ListOfGoods goods3 = new ListOfGoods(99.99f, "высший sour cream", (byte) 2);
        ListOfGoods goods4 = new ListOfGoods(12.84f, "onion", (byte) 3);
        List<ListOfGoods> goodsList = new ArrayList<>();
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        goodsList.add(goods4);
        System.out.println("goodsList = " + goodsList);

        float highestPrice = 0.0f;
        for (ListOfGoods goods : goodsList) {
            if (goods.getSort() <= 2 && goods.getName().contains("Высший")) {
                if (goods.getPrice() > highestPrice) {
                    highestPrice = goods.getPrice();
                }
            }
        }
        System.out.println("highestPrice = " + highestPrice);
    }
}