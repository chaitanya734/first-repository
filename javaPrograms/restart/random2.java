import java.util.*;
import java.lang.*;
class random{
  public static void main(String args[]){
 
    Random obj = new Random();
     String cap="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     String sma="abcdefghijklmnopqrstuvwxyz";
     String num="1234567890";
     String sym="!@#$%Z^Z&*";

    char arr[]=new char[cap.length()];
    char arr1[]=new char[sma.length()];
    int arr2[]=new int[num.length()];
    char arr3[]=new char[sym.length()];
    
       for(int i=0;i<cap.length();i++)
       {
              arr[i] =cap.charAt(i);
              arr1[i] =sma.charAt(i);                      
       }

       for(int i=0;i<num.length();i++) {
          arr2[i]=Character.getNumericValue(num.charAt(i));
       }
         for(int i=0;i<sym.length();i++) {
                 arr3[i]=sym.charAt(i);
                 }


      int A= obj.nextInt(arr.length);
      int B= obj.nextInt(arr.length);
       int a= obj.nextInt(arr1.length);
       int b= obj.nextInt(arr1.length);
       int c= obj.nextInt(arr1.length);
       int d= obj.nextInt(arr1.length);
         int n= obj.nextInt(arr2.length);
       int s= obj.nextInt(arr3.length);

       StringBuffer  sb= new StringBuffer();
         sb.append(arr[A]);
          sb.append(arr[B]);
           sb.append(arr1[a]);
         sb.append(arr1[b]);
       sb.append(arr1[c]);
      sb.append(arr1[d]);
      sb.append(arr2[n]);
       sb.append(arr3[s]);
     System.out.println(sb);
        
 }
}
