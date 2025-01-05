
public class Two_D_Array {
    
    public static void main(String[] args) {
        two_d();
    }
    public static void two_d(){
        int [][] arr= new int [3][];
         arr[0]=new int [4]; // pehle wale array ke 0 index pe new array bna diya
         // ab arr[0 ] address store krega 1st ka or new array me 0
         arr [2]= new int [3];  // abe pehle wale ke 2nd index pe bya bna diya 3 size ka
         System.out.println(arr[0]);
         System.out.println(arr[1]);
         System.out.println(arr[2]);
        //  System.out.println(arr[3]); // ye nhi chalega kyuki its a (index out bound exception)
         System.out.println(arr[0][2]);
        //  System.out.println(arr[1][2]); // ye v ni chalega kyuki its also a null pointer exception.
         arr[1]=new int[2];
         //display krenge loop lgake to chalega sara line se hi
    }
    
}
