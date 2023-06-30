package Lessons.less6.HW6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class finalTask {
    public static void main(String[] args) {
        laptops laptop1 = new laptops(32, 1024, "Windows 11", "White", "PH");
        laptops laptop2 = new laptops(16, 512, "Windows 11", "Red", "PH");
        laptops laptop3 = new laptops(32, 512, "Linux", "Grey", "CN");
        laptops laptop4 = new laptops(8, 256, "MacOS", "Silver", "US");
        laptops laptop5 = new laptops(64, 2048, "Windows 11", "Black", "CN");

        List<laptops> laptopsList = new ArrayList<>(List.of(laptop1, laptop2, laptop3, laptop4, laptop5));

        Scanner input = new Scanner(System.in);
        System.out.print("Input RAM capacity (8, 16, 32 or 64): ");
        int ram = input.nextInt();
        System.out.print("Input HDD capacity (256, 512, 1024 or 2048): ");
        int hdd = input.nextInt();
        System.out.print("Input OS (MacOS, Linux or Windows 11): ");
        String os1 = input.next().toLowerCase();
        System.out.print("Input Color (Black, Silver, Grey, White or Red): ");
        String color1 = input.next().toLowerCase();
        System.out.print("Input manufacturer country (CN, US or PH): ");
        String country = input.next().toLowerCase();
        input.close();

        System.out.println("--------------------------------------------");

        List<laptops> laptopsOut = new ArrayList<>();

        for (laptops laptop : laptopsList) {
            if (laptop.getRam() == ram | laptop.getHdd() == hdd) {
                laptopsOut.add(laptop);
            } else if (laptop.getOs().equals(os1) | laptop.getColor().equals(color1) |
                    laptop.getCountry().equals(country))  {
                laptopsOut.add(laptop);
            }
        }
        for (laptops laptop : laptopsOut) {
            System.out.println(laptop.getRam() + " " + laptop.getHdd() + " " + laptop.getOs() + " " +
                    laptop.getColor() + " " + laptop.getCountry());
        }
    }
}

