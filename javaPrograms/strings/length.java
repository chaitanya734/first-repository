abstract class chaitanya{
    abstract void add();
  }
 class bharath extends chaitanya{
   void add(){
     System.out.println("hai this is chaitanya");
   }
 public static void main(String args[]){
   bharath obj = new bharath();
    obj.add();
 }
  }