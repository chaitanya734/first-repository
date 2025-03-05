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
 System.out.println("enter the key value");
  int key = s.nextInt();
   for(int i=0;i<arr.length;i++)
     {
            System.out.println(arr[i]==key); 
           
            
      }
}
}