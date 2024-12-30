import java.util.Scanner;

public class function {
    public static void main(String args[]){
        // addition();

     int total =  addparams(10,30);
     System.out.println(total);

    }
     static void addition (){
        Scanner in = new Scanner(System.in);
    System.out.println("Enter an number");
   int num1 = in.nextInt();
   System.out.println("Enter another number");
   int num2 = in.nextInt();
   System.out.println(num1+num2);
    }
    static int addparams(int a,int b){
        int num1 =a; int num2 = b;
   int total = num1+num2;
   return total;

        
    }

}
