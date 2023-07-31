package java05_exception;

public class ExceptionTest3 {

   public ExceptionTest3() {

   }
   public void start() throws ClassNotFoundException {
      Class cls = Class.forName("Java.lang.String2");
   }

   public static void main(String[] args) {
      ExceptionTest3 et3 = new ExceptionTest3();
      try {
      et3.start();
   }catch(ClassNotFoundException c) {
	   System.out.println(c.getMessage());
   }
   }
}