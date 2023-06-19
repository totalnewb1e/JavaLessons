package Lessons.less3.HW3.Task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ListOfGoods {
    private Float price;
    private String name;
    private Byte sort;
}
