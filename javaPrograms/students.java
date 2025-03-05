package management;
class teacher{
   public teacher(){
         System.out.println("hai i am teacher");
}
    public void add(){
     System.out.println("result="+ 10+20);
}
}
public class students extends teacher{
public  static void adds(){
     System.out.println("result="+ 10+20);
}
  public students(){
      super();
        super.add();
    System.out.println("student class");
}
}