public class Merge_array {
    public static void main(String[] args) {

        int[] arr1= {12,14,16,18,20,22};
        int[] arr2= {13,15,17,19,21,24,32,36};
        int[] ans = Merge_twoarray(arr1,arr2);
        for(int val : ans){
            System.out.print(val + " ");
        }
    }
    
    public static int[] Merge_twoarray(int [] arr1, int[] arr2){

        int [] Merged = new int[arr1.length+arr2.length];
        int i=0;
        int j= 0;
        int k=0;
         
        while(i < arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]) {
                Merged[k]= arr1[i];
                i++;
                k++;
            }
            else {
                Merged[k] = arr2[j];
                j++;
                k++;
            }
            if(i==arr1.length){
                while(j<arr2.length){
                Merged[k] = arr2[j];
                j++;
                k++;}
            }
            if(j==arr2.length){
                while(i<arr1.length){
                Merged[k] = arr1[i];
                i++;
                k++;}
        }
    }
    return Merged  ;
}
}
