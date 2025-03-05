import java.lang.*;
 class threads implements Runnable{
   private String name;
     public threads(String name){
         this.name=name;
       }
    public void run(){
        for(int i=0;i<4;i++){
              
         System.out.println("running  "+name);
      try{
      Thread.sleep(1000);
        }
        catch(Exception e){
       }
}
     }
}
class main{
public static void main(String args[]){
threads obj = new threads("thread1");
threads obj1 = new threads("thread2");
 Thread th = new Thread(obj);
 Thread th1 = new Thread(obj1);
  th.start();
 
  
    try{
    th.join();
     
    }
  catch(Exception e){
}
 th1.start();
}
}