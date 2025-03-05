import java.util.Scanner;
import java.lang.Arrays;
class Chaitanya
{
  public static void main(String args[])
{
 Scanner s = new Scanner(System.in);
  System.out.println("enter the size of array");
 int size=s.nextInt();
   int arr[] = new int[size];
  System.out.println("enter the array vaLues");
  for(int i=0;i<arr.length;i++)
{
   arr[i]=s.nextInt();
}

Arrays.sort(arr);
  System.out.print(arr.length-1);
}
}