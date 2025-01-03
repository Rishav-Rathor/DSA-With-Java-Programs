public class Bubble {
    public static void main(String[] args) {
        int[] array={99,88,77,66,55};
        bubble(array);
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
        }
        public static void bubble(int[] array){
            for(int counter = 0; counter< array.length-1; counter++){
                for(int i = 0 ; i<array.length-1-counter;i++){
                    if(array[i]>array[i+1]) {
                        int temp = array[i];
                         array[i]= array[i+1];
                         array[i+1]=temp;
                    }
                }
            }
        }
    
}
