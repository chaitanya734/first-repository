interface Sim
{
}
class sim1 implements Sim
{
          sim1(){
System.out.println("this is sim1 method");
         }
}
class sim2 implements Sim
{
      sim2(){
System.out.println("this is sim2 method");
         }

}
class sim3 implements Sim
{
       sim3(){
System.out.println("this is sim3 method");
         }

}
class sim4 implements Sim
{
sim4(){
System.out.println("this is sim4 method");
         }
}
 class main{
   Sim s=null;
     main(Sim s1){
       s=s1;
  }
    public static void main(String args[]){
       main obj = new main(new sim1());
       main obj1 = new main(new sim2());
      main obj2 = new main(new sim3());
       main obj3 = new main(new sim4());

   
}
}
