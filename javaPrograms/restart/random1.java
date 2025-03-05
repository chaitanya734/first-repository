import java.util.*;

class random {
    public static void main(String args[]) {
        Random obj = new Random();

        // Strings for characters
        String cap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sma = "abcdefghijklmnopqrstuvwxyz";
        String num = "1234567890";
        String sym = "!@#$%Z^Z&*";

        // Arrays for storing characters
        char arr[] = new char[cap.length()];
   
        // Fill the `arr` and `arr1` arrays with characters from `cap` and `sma`
        for (int i = 0; i < cap.length()-1; i++) {
            arr[i] = cap.charAt(i);  // Fill uppercase array
        }

          

        // Generate random indices
        int A = obj.nextInt(arr.length);
        System.out.println(arr[A]);
        
           }
}
