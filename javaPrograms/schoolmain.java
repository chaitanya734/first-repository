import school.school;
import java.util.*;
  class sub{
  sub(){
 System.out.println("this is sub class");
}
  final void add(){
   System.out.println("this is final method");
}
 final void add(int a){
  System.out.println("this second final method ");
}
}
class main extends sub{
  public static void main(String args[]){
  void add(){
  System.out.println("this main class");
}
   final int a = Integer.parseInt(args[0]);
  int b = Integer.parseInt(args[1]);
  int c = Integer.parseInt(args[2]);
  
    System.out.println(a+b);
    System.out.println(c+b);
  school obj = new school();
 sub obj1 = new sub();
  obj1.add();
   obj1.add(1);
  main obj2 = new main();
  obj2.add();
}
}