public class Selection {
    public static void main(String[] args) {
        int[] array={22,15,24,55,44};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);}
        Selection(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);}
    }
    public static void Selection(int[] array){
        for (int counter=0 ;counter < array.length;counter++){
            int min = counter;
            for (int i=counter+1;i<array.length-1;i++){
                if(array[i]<array[min]){
                    min=i;
                }
                int temp = array[min];
                array[min]=array[counter];
                array[counter]=temp;
            }
        }
    }
}
