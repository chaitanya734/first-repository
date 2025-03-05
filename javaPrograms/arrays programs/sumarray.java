import java.util.*;
class chaitanya{
public static void main(String args[])
{
 Scanner s = new Scanner(System.in);
  System.out.println("enter the size of the array");
    int size= s.nextInt();
  System.out.println("enter the array values");
 int arr[]= new int[size];
 int temp=0;
 for(int i=0;i<arr.length;i++)
  {
   arr[i]=s.nextInt();      
    temp = temp+arr[i];  
  }
System.out.println(temp);
}
}