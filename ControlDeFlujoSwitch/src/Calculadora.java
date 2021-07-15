import java.util.Scanner;

public class Calculadora {

	private static int operaciones;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*Crear una calculadora que pueda sumar , multiplicar, restar, y dividri 2numeros.
   * Lacalculadora debe pedir los dos numeros y porterior a eso preguntar que operacion se quiere realizar , el menu es el siguiente :
   * 1.Suma
   * 2.Resta
   * 3.Multiplicacion
   * 4.Division 
   * 
   *Al fuinalizar debe mostar lso resultadosde la operacion y la operacion que se rearizo .
   *
   * Suma=10;
   * 
   * Nota :se ddebe usar el switch
   * 
   * 
   * /Switch(condition){
		 * case valor:
		 * codigo 
		 * codigo
		 * codigo
		 * break;
		 * 
		 * case valor2:
		 * codigo 
		 * codigo
		 * codigo
		 * break;
		 * default:
		 * codigo por defecto 	 
	     }
	     */
		/*
		{  

	           Scanner sc = new Scanner(System.in); 
	           String nombre;
	           
	           System.out.print("Introduzca su nombre:  ");       
	           nombre = sc.nextLine();  
	           System.out.println("Hola " + nombre + "Esta es una calculadora te pedira dos numeros y hara las operaciones");
	           
	     }*/
		
		
		      Scanner sc = new Scanner(System.in);
		      
		       
		       System.out.print("Intodusca un numero ");
		       int a = sc.nextInt();
		       
		       System.out.print("Introdusca otro numero");
		       int b = sc.nextInt();		
		       
		       
		       
		       int resultado =0;
			switch (operaciones) {
				case 1:
					int Suma = a +b ;
				    break;		    
				case 2:
					int Resta = a-b ;
					break;
				case 3:
					int Multiplicacion =a*b;
					break;
				case 4:
					 int division = a/b;
					break;
		      
	       
	}
}
}

	      
	      