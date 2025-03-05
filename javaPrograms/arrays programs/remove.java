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
System.out.println("enter the remove  value");
  int rem = s.nextInt();
  for(int i=rem;i<arr.length;i++)
{
   arr[rem]=arr[rem+1];
 }
for(int j=0;j<arr.length-1;j++)
  System.out.print("  "+ arr[j]);
}
}