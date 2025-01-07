public class String_builder {
    public static void main(String[] args) {
         StringBuilder sb =new StringBuilder("Hello");
         System.out.println(sb);
         System.out.println(sb.length());

         //append
         sb.append("abc");
         System.out.println(sb);
        
         // insert 
         sb.insert(2, "def");
         System.out.println(sb);

         //delete
         sb.deleteCharAt(3);
         System.out.println(sb);

         //update
        // sb.setCharAt(sb.length(), 'k');  // isne error diya kyuki update function will not work on bilkul last element jese sb.length 5 hi dega pr ye sb.length-1 pe chal lega
        sb.insert(sb.length(), 'i');
        System.out.println(sb);  //point is only this ki range of set and delete is length-1 and range of insert is length
         
    }
    
}
