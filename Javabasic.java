import java.util.Scanner;

public class Javabasic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = sum();
        System.out.println("The sum is: " + ans);
        in.close(); // Close the Scanner to avoid resource leaks
    }

    static int sum(Scanner in) {
        System.out.println("Enter 1st number:");
        int num1 = in.nextInt();
        System.out.println("Enter another number:");
        int num2 = in.nextInt();
        int total = num1 + num2;
        return total;
    }
}
