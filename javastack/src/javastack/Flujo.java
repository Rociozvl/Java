package javastack;

public class Flujo {
	 public static void main(String[] args) {
         System.out.println("Inicio del main");
         try {
             metodo1();
     } catch(ArithmeticException | NullPointerException ex) {
             String msg = ex.getMessage();
             System.out.println("ArithmeticException " + msg);
             ex.printStackTrace();
     }
         System.out.println("Fin del main");
     }

     private static void metodo1() {
         System.out.println("Inicio del metodo1");
         try {
             metodo2();
     } catch(ArithmeticException  ex) {
             System.out.println("ArithmeticException");
     }
         System.out.println("Fin del metodo1");
     }

     private static void metodo2() {
         System.out.println("Inicio del metodo2");
         for(int i = 1; i <= 5; i++) {
             System.out.println(i);
             
     }
         Cuenta c = null;
         c.depositar(); 
         
        
         }
        
}

     
