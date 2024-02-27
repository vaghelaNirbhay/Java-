import java.util.Scanner;

class p16 {
    public static void main(String[] args) {
        
        Scanner get = new Scanner(System.in);

        
        System.out.print("Enter your name, Age and Favorite color respectively : ");
        String name = get.nextLine();
        int age = get.nextInt();
        get.nextLine(); 
        String favoriteColor = get.nextLine();

        String message = String.format("Hello, %s! You are %d years old and your favorite color is %s.", name, age, favoriteColor);
        System.out.println(message);
    }
}