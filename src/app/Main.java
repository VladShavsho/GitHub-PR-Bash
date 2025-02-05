package app;

public class Main {
    public static void main(String[] args) {

        double fahrenheit = 100.0;

        double celsius = fahrenheitToCelsius(fahrenheit);

        System.out.println("Фаренгейти: " + fahrenheit + " = Цельсії: " + celsius);
    }
    public static double fahrenheitToCelsius(double fahrenheit ){
        return (fahrenheit - 32) * 5 / 9;
    }
}
