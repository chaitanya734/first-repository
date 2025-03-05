class threadex extends Thread
{
   int a;
   int b;
  public String name;
  threadex(String name)
{
   this.name=name;
   }
   public  void run()
   {
    synchronized(this){
     System.out.println(name+" ");
       class inner{
        void add(int a,int b)
       {
                 System.out.println(name+" "+a+b);         
       }
  }
   inner obj1= new inner();
    obj1.add(20,30);
}
    }
}
class mainclass{
public static void main(String args[])
{
  Thread obj = Thread.currentThread();
   System.out.println("current thread and parent thread "+obj);
  threadex obj2 = new threadex("first");
  Thread obj3 = new Thread(obj2);
   obj3.start();
 obj3.setPriority(Thread.MAX_PRIORITY);
System.out.println("current thread and child thread "+obj3);
  
    threadex obj5 = new threadex("second");
   Thread obj4 = new Thread(obj5);
   obj4.start();
   obj4.setPriority(9);

}
}
  