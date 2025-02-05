package app;

public class Main {
    public static void main(String[] args) {

        double fahrenh = 100.0;
        double cels = 37.0;

        double celsius = fahrenheitToCelsius(fahrenh);
        double fahrenheit = celsiusToFahrenheit(cels);

        System.out.println("Фаренгейтів: " + fahrenheit + " = Цельсій: " + celsius);
    }
    public static double fahrenheitToCelsius(double fahrenh){
        return (fahrenh - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double cels){
        return (cels * 9 / 5) + 32;
    }
}
