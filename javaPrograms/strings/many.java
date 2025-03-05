package kumar;
import  java.lang.*;
import static java.util.Arrays.*;
import  java.util.*;
interface nothing{
  public void mullt();
 public default void addition(){
  System.out.println(1+2);
  }
 public static void substraction(){
   System.out.println(10-20);
 }
}
abstract class math{
public abstract  int[] maximum();
public  abstract  int[] min();
public static int add(){
   int a=10;
   int b=20;
  return a+b;
 }
public int sub(){
   int a=10;
   int b=20;
  return b-a;

 }
}
public class kumar extends math implements nothing{
   public void mullt(){
     nothing.substraction();
    System.out.println(1*3);
}
 public int[] maximum(){
    int arr[] ={1,3,4,5,6,8,4};
     sort(arr); 
    return arr;
   }
 public int[] min(){
    int arr[] ={1,3,4,5,6,8,4};
     parallelSort(arr); 
    return arr;
   }
   }