
interface test {
	public void add(int x,int y);
        public void sub(int x,int y);

}
 class Lambdaex 
{
	 public static void main(String args[]) {
	test t1 = (int x,int y)->{int r = x+y; System.out.println("result=  "+r);};
	t1.add(40, 50);
        t1.sub(4, 50);
	 }
	
}
