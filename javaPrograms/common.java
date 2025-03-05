import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
import java.util.*;
class number{
public static List<Boolean> add()
{

   Scanner s = new Scanner(System.in);
 List<Boolean>  bo = new ArrayList<Boolean>();
  System.out.println("enter the size of array");
   int n =s.nextInt();
 System.out.println("enter the extra candata number");
  int ext = s.nextInt();
   int arr[] = new int[n];
int temp=0;
int result=0;
 System.out.println("enter the array values ");
  for(int i=0;i<arr.length;i++)
    {
     arr[i] = s.nextInt();
    }
 
  int arr3[]=Arrays.copyOf(arr,n);
   Arrays.sort(arr3);
  temp=arr3[n-1];
 System.out.println("grates= "+temp);

     for(int j=0;j<arr.length;j++)
{
      result=arr[j]+ext;
            if(temp<=result)
             {
                bo.add(temp<=result); 
             }
           else{
                   bo.add(result>temp);
            }
 }
return bo;

}

 public static void main(String args[])
{
   number obj = new number();
     List<Boolean> booleanList = add();
   for(Boolean value:booleanList)
{
   System.out.print(value);
}
}
}

      