public class Recursion_PW {
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
    public static int power(int val, int pow){
        if(pow==0) return 1;

        int valMone= power(val, pow-1);
        int ans= val*valMone;
        return ans;

    }
    
}
