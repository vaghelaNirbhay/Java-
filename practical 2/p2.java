public class p2 {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Calling the static method without creating an instance of the class
        int result = add(5, 7);
        System.out.println("Sum: " + result);
    }
}
