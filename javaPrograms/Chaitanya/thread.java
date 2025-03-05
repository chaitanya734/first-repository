import java.lang.*;
class mythread extends Thread implements Runnable {
    private String name;
     public mythread(String name){
      this.name=name;
 }
  public void run(){
   for(int i=0;i<5;i++){
    System.out.println("this is chaitanya" + name);
    }
  }
}
 class main{
 public static void main(String args[]){
 mythread  thread = new mythread("thread 1");
    thread.start();
               thread.join();
           Thread th = new Thread(new mythread("thread 2"));
     th.start();
     Thread th1 = new Thread(new mythread("thread 3"));
     th1.start();
            
      
   
}
}