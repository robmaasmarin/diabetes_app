package diabetes_app;
import java.util.Scanner;

public class Alimentos {
	
	public void menu(String [] seleccion, double[] hidratos) {
		
		Scanner foodScanner = new Scanner(System.in);
	
		System.out.println("\nSelecciona un tipo de alimento:"
				+ "\n(1) ALBÓNDIGAS"
				+ "\n(2) LASAÑA DE CARNE"
				+ "\n(3) LASAÑA DE VERDURA"
				+ "\n(4) PAELLA"
				+ "\n(5) LENTEJAS"
				+ "\n(6) ENSALADA"
				+ "\n(7) TORTILLA DE PATATA"
				+ "\n(8) PIZZA"
				+ "\n(9) CEREALES"
				+ "\n(10) LACTEOS"
				
				);
		
		
		int optionmenu = Integer.parseInt(foodScanner.nextLine());
		SeleccionAlimentos miseleccion = new SeleccionAlimentos();
		
		switch(optionmenu) {
		  case 1:
			seleccion [0] = "Albóndigas";  
			miseleccion.albondigas(hidratos);
			break;
			
		  case 2:
			 seleccion [0] = "Lasaña de carne";
		    miseleccion.mylasanacarne(hidratos);
		    break;
		  case 3:
			  seleccion [0] = "Lasaña de verduras";
			  miseleccion.lasverduras(hidratos);
			  break;
		  case 4: 
			  seleccion[0] = "Paella";
			  miseleccion.miPaella(hidratos);
			  break;
		  case 5: 
			  seleccion[0] = "Lentejas";
			  miseleccion.laslentejas(hidratos);
			  break;
		  case 6:
			  seleccion[0] = "Ensalada";
			  miseleccion.laensalada(hidratos);
			  break;
			case 7:
			seleccion[0] = "Tortilla";
			miseleccion.latortilla(hidratos);
			break;

			case 8:
			seleccion[0] = "Pizza";
			miseleccion.lapizza(hidratos);
			break;
			
			case 9:
				seleccion[0] = "Cereales";
				miseleccion.cereales(hidratos);
				break;
				
			case 10:
				seleccion[0] = "Lácteos";
				
				miseleccion.lacteos(hidratos);
				break;


		
		    
		    
		    
		  default:
		    System.out.println("Invalid option.");
		}
	
	
	
	
	}

}
