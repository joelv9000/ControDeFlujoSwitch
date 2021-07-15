
public class FlujoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
        /*
		/Switch(condition){
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
		
  
		int dia = 7;
		String mensaje = "";
				
		switch (dia) {
		case 1:
			mensaje="Lunes";
		    break;		    
		case 2:
			mensaje:"Martes";
			break;
		case 3:
			mensaje:"Miercoles";
			break;
		case 4:
			mensaje:"Jueves";
			break;
		case 5:
			mensaje:"viernes";
			break;
		case 6:
			mensaje: "Sabado";
		   break;
		case 7:
			mensaje: "Domingo";
		   break;
		   default:
		    mensaje="Dia invalido";
		  break;
		  
			   
		
		}
			System.out.println(mensaje);
	}
 
}
