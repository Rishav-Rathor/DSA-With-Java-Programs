import java.util.Scanner;

public class arrayops {
   static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
      // int[] array = takeInput();        // this is comment because agr khud se nhi lena to inhe use krlo wrna khud bnao
      // printinput(array);
      int[] array = {10,20,40,30,32};
      System.out.println(max(array));
        
    }
  public static int[] takeInput() {       // int ke baad // isiliye h kyuki array return krenge int ka
    System.out.println("Enter the size of the array:");
    int n = in.nextInt();
    int arr[] =new int[n];

    for (int i = 0; i < arr.length; i++){
      System.out.println("Enter the value for " + i + " index ? ");
      arr[i] = in.nextInt();
    }
    return arr;
  }
  public static void printinput(int[] array){
    for (int i = 0 ;i< array.length; i++){
      System.out.println(array[i]);
    }
  }
  public static int max(int [] arr){   //this is give max in the array..
    int max = Integer.MIN_VALUE;
    for (int i = 0; i< arr.length; i++){
      if(arr[i] > max){
        max=arr[i];
      }
    }
    return max;
  }
}
