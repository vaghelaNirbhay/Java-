public class p7 {

    // Method with two integer parameters
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method with two double parameters
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method with a string parameter
    public static String concatenate(String str1, String str2) {
        return str1 + " "+ str2;
    }

    public static void main(String[] args) {
        // Calling overloaded methods
        int result1 = add(5, 7);
        double result2 = add(2.5, 3.7);
        String result3 = concatenate("Hello", "World");

        // Displaying results
        System.out.println("Sum (int): " + result1);
        System.out.println("Sum (int): " + result2);
        System.out.println("Sum (double): " + result3);
    }
}
