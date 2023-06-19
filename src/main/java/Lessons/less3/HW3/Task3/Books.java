package Lessons.less3.HW3.Task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    private String name;
    private String author;
    private Double price;
    private Short year;
    private Integer pages;
}
