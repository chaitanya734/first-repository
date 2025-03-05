import java.io.*;
class filewrite{
 public static void main(String args[])throws Exception
{
 FileWriter fw = new FileWriter("chaitanya143.txt");
  fw.write('h');
  fw.write('e');
 fw.write('l');
fw.write('l');
fw.write('o');
fw.write('.');
fw.close();
}
}