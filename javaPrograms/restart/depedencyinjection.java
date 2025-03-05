interface sim{
    void selectslot();
  }
class arital implements sim{
     public void selectslot(){
     System.out.println("i need artial sim");
    }
   }
 class jio implements sim{
   public void selectslot(){
  System.out.println("i need jio sim");
   }
}
 class idea implements sim{
    public void selectslot(){
  System.out.println("i need idea sim");
    }
}
 class main{
    sim s;
    main(sim s){
    this.s = s;
     s.selectslot();
   }
  public static void main(String args[]){
    main m1 = new main(new arital());
}
}
 