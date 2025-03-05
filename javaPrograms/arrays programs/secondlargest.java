import java.util.*;
class chaitanya{
 public static void main(String args[])
{
   Scanner s = new Scanner(System.in);
   System.out.println("enter the array size");
  int size=s.nextInt();
       System.out.println("enter the array values");
  int arr[]= new int[size];
  for(int i=0;i<arr.length;i++)
   arr[i]=s.nextInt();
Arrays.sort(arr);
  System.out.println(arr[arr.length-2]);
}
}