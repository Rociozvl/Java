package collections;

import java.util.ArrayList;

public class clase1Arraylist {

	 public static void main(String[] args) {
		 
	String variable1 = "Ejemplo 1";
	String variable2 = "Ejemplo 2";
	String variable3 = "Ejemplo 3";
    String variable4 = "Ejemplo 4";
    
    ArrayList<String> listaString = new ArrayList<>();
    
    
    listaString.add(variable1);
    listaString.add(variable2);
    listaString.add(variable3);
    listaString.add(variable4);
    
    System.out.println(listaString);
    
}
}