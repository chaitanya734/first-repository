interface car{
   void add();
   static void sub(){
   System.out.println("this is sub method ");
}
   default void mul(){
  System.out.println("this is multication ");
}
} 
 class main implements car{
  public void add(){
    System.out.println("this is adding method");

}
      public static void main(String args[]){
    main obj = new main();
  obj.mul();
    car.sub();
  obj.add();
    
    
}
}