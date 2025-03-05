package family;
  class father{
      father(){
         System.out.println("father is hero ");
              }
}
 class mother extends father{
   mother(){
    super();
     System.out.println("mother is queen");
}
}
public class brother extends mother{
    brother()
{
   super();
  System.out.println("brother is second hero");
}
}
   