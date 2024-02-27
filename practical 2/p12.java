class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        }
        return a / b;
    }

}
public class p12 {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        
        System.out.println("Addition: " + c.add(5, 3));
        System.out.println("Subtraction: " + c.subtract(8, 3));
        System.out.println("Multiplication: " + c.multiply(4, 6));
        System.out.println("Division: " + c.divide(10,5));
    }
}