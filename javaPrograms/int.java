import java.util.*;
import java.lang.*;
class chaitanya{
public static void main(String args[]){
  int res=0;
  int a =678;
  String s= String.valueOf(a);
  char arr[] = new char[3];
  for(int i=0;i<3;i++){
     arr[i]=s.charAt(i);
    

}
    
      for(char q:arr){ 
    System.out.println("befor = "+q);
   int  result=(int)q;
     System.out.println("after = "+result);
     res =res+result;

  }
     System.out.println(res);
}
}
