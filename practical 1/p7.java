import java.util.Scanner;

public class p7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number till you print fibonacci sequence ::");
        int n = scanner.nextInt();

        int[] fibonacci = new int[n];
        fibonacci[0]=0;
        fibonacci[1]=1;


        for( int i=2;i<n;i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}

// import java.util.Scanner;

// public class FibonacciSeries {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of terms in Fibonacci series: ");
//         int n = scanner.nextInt();

//         int a = 0, b = 1;

//         System.out.println("Fibonacci series:");
//         System.out.print(a + " " + b + " ");

//         for (int i = 2; i < n; i++) {
//             int c = a + b;
//             System.out.print(c + " ");
//             a = b;
//             b = c;
//         }

//         scanner.close();
//     }
// }
