public class TwoDarray_waveprint_ {
    public static void main(String[] args) {
        int[][] arr = {{11, 12, 13}, {21, 22, 23}, {31, 32, 33}};
        printRowWise(arr);
    }

    public static void printRowWise(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                // Print left to right
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // Print right to left
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println(); // Move to the next line
        }
        System.out.println("END");
    }
}
