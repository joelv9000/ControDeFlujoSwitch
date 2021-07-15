import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Crear un programa donde se introduzcan los tres ángulos internos 
		de un triángulo y se determine si el triángulo es válido o no.
        */
		
	      System.out.println("Escriba los angulos de un triangulo");
	        Scanner angulos= new Scanner(System.in);
	        int angulo1 =angulos.nextInt();
	        int angulo2 =angulos.nextInt();
	        int angulo3 =angulos.nextInt();
	        int sumaangulos = (angulo1 +angulo2 + angulo3);     
	       
	        
	      if (sumaangulos ==180) {
	    	  System.out.println("Es un triangulo");
	    	  
	      } else { System.out.println("No es un triangulo");
	    	  
	      }
	        	       
	}      
	   
}

