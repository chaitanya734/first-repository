abstract class A{
  int a=1;
    int b=2;
    int add(){
     
     System.out.println(a+b);
      return (a+b);
         }
  abstract void display();
}
 abstract class C extends A{
  int a=3;
    int b=2;
   void display(){
   super.add();
   System.out.println("sirisha");
}
    int add(){
     
     System.out.println(a+b);
      return (a+b);
         }
  abstract void displays();
}
 class B extends C{
  void displays(){
   super.display();
   super.add();
   System.out.println("bharath kumar reddy");
}
    public static void main(String args[])
{
  B obj = new B();
    obj.display();
    obj.displays();
}
}