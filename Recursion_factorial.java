import java.util.Scanner;

public class Recursion_factorial {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the value of which u want to find factorial:");
        int n = in.nextInt();

        int factn= factorial(n);
        System.out.println(factn);
    }
    public static int factorial(int n){
        if (n==1){
            return n;
        }
        int factn = factorial(n-1);
        int f =factn*n;
        return f;

    }
    
}
