package en.codegym.task.pro.task10.task1016;

/* 
Weather forecast
*/

public class Solution {

    public static void showWeather(City city) {
        System.out.printf("Today's temperature in %s is %d", city.getName(), city.getTemperature());
    }

    public static void main(String[] args) {
        City city = new City("Dubai", 71);
        showWeather(city);
    }
}
