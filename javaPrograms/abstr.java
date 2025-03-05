abstract class gov{
  abstract void lockdown();
  void add(){
 System.out.println("this is main class");}
}
class ap extends gov{
  void lockdown()
{
  System.out.println("not lock down");
}
}
class ts extends gov{
  void lockdown()
{
  System.out.println("yes lock down");
}
}
class mainclass{
  public static void main(String args[]){
   ap obj = new ap();
   obj.add();
   obj.lockdown();
    ts bj = new ts();
   bj.add();
   bj.lockdown();

}
}
