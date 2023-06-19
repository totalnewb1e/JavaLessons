package Lessons.less3.HW3.Task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListOfGoods2 {
    private String name;
    private String country;
    private Double weight;
    private Double price;
    private Byte sort;
}
