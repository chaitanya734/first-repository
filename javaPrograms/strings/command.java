import java.lang.*;
import java.io.FileReader;
 class ErrorExample {
    public static void main(String[] args) {
       try{
        FileReader reader = new FileReader("test");  // This can throw a checked exception
       }
     catch(Exception e){
        System.out.println(e);
           throw e;
      }
    }
}
