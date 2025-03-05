import student.datatype.datatypes;
import student.inout.outin;
import student.words.concat.cocat;
import student.abstraction.abst;
class chaitanya extends abst {
   int mul=1;
datatypes obj;
outin obj1;
cocat obj3;
   chaitanya(){
 obj = new datatypes();
 obj1 = new outin();
 obj3=new cocat();

    }
  
    void mul(){
   int arr1[] = new int[obj1.size];
   System.out.println(" size="+obj1.size);
   for(int i=0;i<obj1.arr.length;i++)
    {
   arr1[i]=obj1.arr[i];
    mul *= arr1[i];
     }
System.out.println("multiplication ="+mul);
  }
void chaitu()
{
    add();
    int a=10;
    int b=20;
System.out.println(a-b);
}


     
public static void main(String args[]){
chaitanya obj2 = new chaitanya();
obj2.mul();
obj2.chaitu();

}
}