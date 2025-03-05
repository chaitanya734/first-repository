interface Sim{

}
class artile implements Sim{
  void add(){
   System.out.println("this is artile sim");
}
}
class jio implements Sim{
    void  add(){
   System.out.println("this is  jio sim");
}

}
class idea implements Sim{
  void add(){
   System.out.println("this is idea sim");
}
}
class mobile 
{
     Sim ar=null;
     mobile(Sim s){
        ar=s;
     }
    public static void main(String args[]){
     mobile obj = new mobile(new artile());
     mobile obj1 = new mobile(new idea());
     mobile obj2 = new mobile(new  jio());
       
}  
} 
