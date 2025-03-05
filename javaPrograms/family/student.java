package management;
class teacher{
   public teacher(){
         System.out.println("hai i am teacher");
}
    public void add(){
     System.out.println("result="+ 10+20);
}
}
public student extends teacher{
  public student(){
      super();
        super.add();
  System.out.println("student class");
}
}