public class Binary {
    public static void main(String[] args) {
        int [] array = {1,12,15,20,25,29,34,64,98};
        int item = 60;
        System.out.println(binary(array, item));
    }
    public static int binary(int[] array, int item){
        int lo=0;
        int hi=array.length-1;
        while (hi>lo) {
            int mid = (hi+lo)/2;
            if(array[mid]<item) lo=mid;
            else if(array[mid]>item) hi=mid;
            else return mid;
        }
        return -1;
    }
    
}
