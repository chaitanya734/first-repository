import java.lang.*;
class thread extends Thread implements Runnable{
   private String name;
  public thread(String name){
       this.name = name;
}
  public void run(){
    for(int i=0;i<5;i++)
      {

         System.out.println("thread is running"+name);
     
      }
       try{
        Thread.yield();
          }
      catch(Exception e){
       }
       System.out.println(Thread.currentThread());

  }
}
class main{
  public static void main(String args[]){
   System.out.println(Thread.currentThread());
 thread obj = new thread("thread 1");
     obj.start();
       System.out.println(obj.isAlive());

    obj.setPriority(2);
    obj.setName("chaitanya");
   try{
   obj.sleep(1000);
    }
  catch(Exception e){
 }
  System.out.println("thread priority "+ obj.getPriority()+"  "+obj.getId());
 
  }
}