package en.codegym.task.pro.task10.task1010;

import java.util.Objects;

/* 
Two iPhones
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //write your code here
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Iphone iphone = (Iphone) obj;
        return price == iphone.price &&
                Objects.equals(model, iphone.model) &&
                Objects.equals(color, iphone.color);
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
