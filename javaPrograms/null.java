import java.util.*;
class chaitanya{
  public static void main(String args[]){
    String a="bhimireddy.chaitanyakumarreddy@gmail.com";
    String b="chaitanya kumar reddy";
    if(b.equals("chaitanya kumar reddy")){
     if(b.startsWith("c"))
    System.out.println(b.toString());
     }
    else{
     System.out.println("not currect value");
    }
    String[] split = b.split(" ");
    System.out.println(split);
    
  }
}