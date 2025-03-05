interface test {
    int q = 100; // Constant variable in interface

    void add(int a); // Method declaration

  static  void sum() {
        
        System.out.println(q);
    }
}
interface test1{
    int q =1100; // Constant variable in interface

    void add(int a); // Method declaration

  static  void sum() {
        
        System.out.println(q);
    }
}
interface test2 extends test,test1{
    int q = 10; // Constant variable in interface

    void add(int a); // Method declaration

  static  void sum() {
        
        System.out.println(q);
    }
}


class gopi  implements test2{
    public void add(int a) {
        System.out.println("gopi");
    }
}
 class hai{
  void ad()
{
  System.out.println("hai");
}
}
 class bye{
  void and()
{
  System.out.println("bye");
}
}


class bharath extends hai  implements test {
    public void add(int a) {
      super.ad();

        System.out.println("bharath");
    }

    public static void main(String[] args) {
        bharath obj = new bharath();
        gopi obj1 = new gopi();
        obj.add(5);
        obj1.add(5);
        String s = "chaitanya";
        String b = "chaitanya kumar reddy";
        test.sum();
      
    }
}
