import java.lang.*;
import java.util.*;
class array {
     void array(int a[]) {
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
      }
}
	
class bharath{
	public static void main(String args[])
	{
		int p[]= {1,3,6,8,9};
		array obj = new array();
		obj.array(p);
    }
}
