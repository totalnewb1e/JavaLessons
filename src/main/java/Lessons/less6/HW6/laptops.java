package Lessons.less6.HW6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class laptops {
    private Integer ram;
    private Integer hdd;
    private String os;
    private String color;
    private String country;
}
