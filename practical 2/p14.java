class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }


    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    
}

public class p14 {
    public static void main(String[] args) {
        TemperatureConverter t = new TemperatureConverter();
        
    
        double fahrenheitTemp = 68.0;
        double celsiusEquivalent = t.fahrenheitToCelsius(fahrenheitTemp);
        System.out.println(fahrenheitTemp + " Fahrenheit is equal to " + celsiusEquivalent + " Celsius.");
        
    
        double celsiusTemp = 20.0;
        double fahrenheitEquivalent = t.celsiusToFahrenheit(celsiusTemp);
        System.out.println(celsiusTemp + " Celsius is equal to " + fahrenheitEquivalent + " Fahrenheit.");
    }
    
}