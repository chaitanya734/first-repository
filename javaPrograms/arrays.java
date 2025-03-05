import java.util.Arrays;
import java.lang.Math;
class chaitanya{
    public static void main(String args[])
{
    int arr[] ={1,9,6,4,8,9,0,3,2};
    int key=9;
   Arrays.sort(arr);
  for(int i=0;i<arr.length;i++)
{
   System.out.println(arr[i]);
}
   int ew[] = Arrays.copyOf(arr,10);
   int arr1[]=Arrays.copyOfRange(ew,3,6);
  System.out.println();

    for(int j=0;j<arr1.length;j++)
{
   System.out.println("new array ="+arr1[j]);
}

  int index = Arrays.binarySearch(ew,key);
    System.out.println("index of array="+index);
   int a= Math.cbrt(4);
    System.out.println("cuberoot= "+a);
}
}