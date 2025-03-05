import java.lang.*;
class thread extends Thread
{
   String name;
    thread(String name)
{
   this.name=name;
}
  public void run(){
     for(int i=0;i<10;i++)
       System.out.println(name+" "+i);
  
}
}
class mainclass extends Thread
{                                                                       
  public static void main(String args[])
{
   Thread t = Thread.currentThread();

        System.out.println(t);
   thread t1 = new thread("first");
   Thread obj = new Thread(t1);
   obj.start();

try{
     obj.join();
   obj.sleep(1000);
}
catch(Exception e)
{}
  thread t2= new thread("second");
   Thread obj1= new Thread(t2);
   obj1.start();
   thread t3= new thread("third");
   Thread obj2= new Thread(t3);
   obj2.start();
   thread t4= new thread("fouth");
   Thread obj3= new Thread(t4);
    obj3.start();
   System.out.println("main thread will ends ");

}
}