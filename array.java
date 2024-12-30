public class array {
    public static void main(String[] args) {
        //declare an array
        int [] arr = null;
        System.out.println(arr);
        //allocate space in memory
        arr = new int[5];  //arrays length is 5 (5 element can be stored)
        System.out.println(arr);
        //now set the values in array
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        //Now get the values in array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        //100 element honge to 100 baaar thordi karoge to now *print*
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        //enhanced for loop
        for(int val: arr){
            System.out.println(val);
        }
    }
    
}
